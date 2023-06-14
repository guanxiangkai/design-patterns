buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

    dependencies {
        classpath(libs.plugins.spring.boot.gradle.plugin.get().toString())
    }

}

plugins {
    id(libs.plugins.lombok.plugin.get().pluginId) version "${libs.plugins.lombok.plugin.get().version}"
}


subprojects {
    repositories {
        google()
        mavenCentral()
    }
    apply {
        plugin("java")
        plugin("io.freefair.lombok")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    // 配置项目信息
    group = "com.rbtxm"
    version = "1.0"

    // jdk版本
    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    // utf-8编码
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    // 测试
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
