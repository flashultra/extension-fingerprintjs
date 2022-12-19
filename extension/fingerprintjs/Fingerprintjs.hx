package extension.fingerprintjs;

import lime.system.CFFI;
import lime.system.JNI;


class Fingerprintjs {
	
   public static function getFingerPrintJS():String 
   {
	  #if android
	  var resultJNI = fingerprintjs_jni();
	  return resultJNI;
	  #end
	  return "";
	}
	
   public static function getDeviceId():String 
   {
	  #if android
	  var resultJNI = deviceid_jni();
	  return resultJNI;
	  #end
	  return "";
	}
	
   public static function getGsfId():String 
   {
	  #if android
	  var resultJNI = gsfid_jni();
	  return resultJNI;
	  #end
	  return "";
	}
	
   public static function getMediaDrmId():String 
   {
	  #if android
	  var resultJNI = mediadrmid_jni();
	  return resultJNI;
	  #end
	  return "";
	}
	
   public static function getAndroidId():String 
   {
	  #if android
	  var resultJNI = androidid_jni();
	  return resultJNI;
	  #end
	  return "";
	}
	
	#if android
	private static var fingerprintjs_jni = JNI.createStaticMethod("org.haxe.extension.Fingerprintjs", "getFingerPrintJS", "()Ljava/lang/String;");
	private static var deviceid_jni = JNI.createStaticMethod("org.haxe.extension.Fingerprintjs", "getDeviceId", "()Ljava/lang/String;");
	private static var gsfid_jni = JNI.createStaticMethod("org.haxe.extension.Fingerprintjs", "getGsfId", "()Ljava/lang/String;");
	private static var mediadrmid_jni = JNI.createStaticMethod("org.haxe.extension.Fingerprintjs", "getMediaDrmId", "()Ljava/lang/String;");
	private static var androidid_jni = JNI.createStaticMethod("org.haxe.extension.Fingerprintjs", "getAndroidId", "()Ljava/lang/String;");
	#end
	
}