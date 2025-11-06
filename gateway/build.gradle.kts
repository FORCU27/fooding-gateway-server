description = "gateway"

dependencies {
	implementation("org.springframework.cloud:spring-cloud-starter-gateway-server-webflux")
	testImplementation("io.projectreactor:reactor-test")
}

val springCloudVersion by extra("2025.0.0")

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion")
	}
}
