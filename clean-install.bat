@echo off

:: Configuramos Java jdk-21
set JAVA_HOME=C:\dev\Java\jdk-21.0.6

:: Habilitar UTF 8 
chcp 65001 >nul

:: Situar la consola en la ruta actual del .bat
cd /d "%~dp0"

:: Mostrar encabezado con estilo
echo.
echo  #########################################################################
echo  #                     🚀 PROYECTO: Educlass                             #
echo  #                     🤖 Compilando con Maven...                        #
echo  #########################################################################
echo.
echo.

echo =============================
echo ====== INICIANDO CLEAN ======
echo =============================
echo.
:: Clean con Maven
call C:\dev\Maven\apache-maven-3.9.3\bin\mvn -gs C:\dev\Maven\apache-maven-3.9.3\conf\settings.xml clean

if errorlevel 1 (
    echo.
	echo  ########################################################################
	echo.
    echo   ❌❌❌❌❌❌❌ 😩 ERROR: Falló el Clean ❌❌❌❌❌❌❌ 
	echo.
	echo  ########################################################################
	echo.
    pause
    goto :EOF
)
echo  ########################################################################
echo.
echo  ✅✅✅✅✅✅ 😎 ¡ EXITO: Clean realizado con exito ! 😎 ✅✅✅✅✅✅
echo.
echo  ########################################################################
echo.

echo ===============================
echo ====== INICIANDO INSTALL ======
echo ===============================
echo.
:: Install con Maven
call C:\dev\Maven\apache-maven-3.9.3\bin\mvn -gs C:\dev\Maven\apache-maven-3.9.3\conf\settings.xml install -DskipTests

if errorlevel 1 (
    echo.
	echo  ########################################################################
	echo.
    echo   ❌❌❌❌❌❌❌ 😩 ERROR: Falló el Install. ❌❌❌❌❌❌❌ 
	echo.
	echo  ########################################################################
	echo.
    pause
    goto :EOF
)

echo  ########################################################################
echo.
echo  ✅✅✅✅✅✅ 😎 ¡ EXITO: Install realizado con exito ! 😎 ✅✅✅✅✅✅
echo.
echo  ########################################################################
pause
