set -x
/Users/iem/Library/Android/sdk/platform-tools/adb -s emulator-5554 reboot
/Users/iem/Library/Android/sdk/platform-tools/adb -s emulator-5554 wait-for-device root
/Users/iem/Library/Android/sdk/platform-tools/adb -s emulator-5554 wait-for-device remount
/Users/iem/Library/Android/sdk/platform-tools/adb -s emulator-5554 wait-for-device push ./hosts /system/etc/

