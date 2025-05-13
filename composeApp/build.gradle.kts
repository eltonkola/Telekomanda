import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    jvm("desktop")
    
    sourceSets {
        val desktopMain by getting
        
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)




        }
        desktopMain.dependencies {
            implementation(libs.kotlinx.coroutines.swing)
            implementation(compose.desktop.currentOs)

        }
    }
}


compose.desktop {
    application {
        mainClass = "com.eltonkola.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Telekomanda"
            packageVersion = "1.0.0"
            description = "A cool ADB TV Remote application."
            copyright = "© 2024 Elton Kola"
            vendor = "No Vendor"
            windows.iconFile.set(project.file("src/commonMain/composeResources/drawable/icon.ico"))
            macOS.iconFile.set(project.file("src/commonMain/composeResources/drawable/icon.icns"))
            linux.iconFile.set(project.file("src/commonMain/composeResources/drawable/icon.png"))

        }
    }
}
