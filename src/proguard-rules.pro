# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.aemo.morsecode.MorseCode {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/aemo/morsecode/repack'
-flattenpackagehierarchy
-dontpreverify
