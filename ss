warning: LF will be replaced by CRLF in app/src/main/java/com/dingtuanyun/playaudiotest/MainActivity.kt.
The file will have its original line endings in your working directory
[1mdiff --git a/app/src/main/java/com/dingtuanyun/playaudiotest/MainActivity.kt b/app/src/main/java/com/dingtuanyun/playaudiotest/MainActivity.kt[m
[1mindex a464bf5..8eda040 100644[m
[1m--- a/app/src/main/java/com/dingtuanyun/playaudiotest/MainActivity.kt[m
[1m+++ b/app/src/main/java/com/dingtuanyun/playaudiotest/MainActivity.kt[m
[36m@@ -4,6 +4,7 @@[m [mimport android.media.MediaPlayer[m
 import android.net.Uri[m
 import androidx.appcompat.app.AppCompatActivity[m
 import android.os.Bundle[m
[32m+[m[32mimport android.util.Log[m
 import android.widget.VideoView[m
 import com.dingtuanyun.playaudiotest.databinding.ActivityMainBinding[m
 [m
[36m@@ -43,6 +44,7 @@[m [mclass MainActivity : AppCompatActivity() {[m
             if (!binding.videoView.isPlaying){[m
                 binding.videoView.start()  //开始播放[m
             }[m
[32m+[m[32m            Log.d("MainActivity","video is playing")[m
         }[m
 [m
         binding.videoPause.setOnClickListener {[m
