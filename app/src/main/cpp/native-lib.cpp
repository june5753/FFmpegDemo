#include <jni.h>
#include <string>

extern "C" {
#include "include/libavutil/avutil.h"
}
extern "C" JNIEXPORT jstring JNICALL
Java_com_juneyang_cdemo_MainActivity_ffmpegInfo(JNIEnv *env, jobject thiz) {
  // 返回 ffmpeg 配置信息
  return env->NewStringUTF(avutil_configuration());
}
