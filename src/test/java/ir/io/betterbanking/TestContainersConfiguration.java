package ir.io.betterbanking;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class TestContainersConfiguration {

    private static final String DATABASE_USER = "betterbankingadm";
    private static final String DATABASE_PASS = "changeme";
    private static final String DATABASE_NAME = "better_banking";

    @Container
    public static GenericContainer<?> postgreSQLContainer = new GenericContainer<>("postgres:12.2")
            .withEnv("POSTGRES_DB", DATABASE_NAME)
            .withEnv("POSTGRES_USER", DATABASE_USER)
            .withEnv("POSTGRES_PASSWORD", DATABASE_PASS)
            .withExposedPorts(5432)
            .withClasspathResourceMapping("/postgres/scripts.d", "/docker-entrypoint-initdb.d", BindMode.READ_ONLY);

    @DynamicPropertySource
    public static void properties(DynamicPropertyRegistry registry){
        registry.add("spring.datasource.url", () -> String.format("jdbc:postgresql://%s:%s/%s",
                postgreSQLContainer.getHost(), postgreSQLContainer.getMappedPort(5432), DATABASE_NAME));
        registry.add("spring.datasource.username", () -> DATABASE_USER);
        registry.add("spring.datasource.password", () -> DATABASE_PASS);
    }
}
