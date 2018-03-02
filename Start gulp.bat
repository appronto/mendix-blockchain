@ECHO OFF
cd /d %~dp0
%SystemRoot%\System32\cmd.exe /k "C:\Program Files\nodejs\nodevars.bat"

REM Typ in npm install + npm install -g gulp of als je dat al een keer gedaan hebt: gulp