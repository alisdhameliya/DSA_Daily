@echo off
title ⚡ Laptop Speed Boost by Alis ⚡
color 0a

echo Deleting Temp Files...
del /s /f /q %temp%\*

echo Deleting Windows Temp...
del /s /f /q C:\Windows\Temp\*

echo Deleting Prefetch...
del /s /f /q C:\Windows\Prefetch\*

echo Flushing DNS...
ipconfig /flushdns

echo Clearing Software Distribution Cache...
net stop wuauserv
net stop bits
del /s /f /q C:\Windows\SoftwareDistribution\Download\*
net start wuauserv
net start bits

echo Launching Disk Cleanup...
cleanmgr

echo All done! 🚀 Please restart your PC for maximum effect.
pause
