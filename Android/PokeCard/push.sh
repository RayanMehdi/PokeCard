set -x
/Users/alexandre/Library/Android/sdk/platform-tools/adb -s emulator-5554 reboot
/Users/alexandre/Library/Android/sdk/platform-tools/adb -s emulator-5554 wait-for-device root
/Users/alexandre/Library/Android/sdk/platform-tools/adb -s emulator-5554 wait-for-device remount
/Users/alexandre/Library/Android/sdk/platform-tools/adb -s emulator-5554 wait-for-device push ./hosts /system/etc/
