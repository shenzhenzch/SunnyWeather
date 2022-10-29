package com.dingtuanyun.playaudiotest

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.VideoView
import com.dingtuanyun.playaudiotest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val mediaPlayer=MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initMediaPlayer()
        binding.play.setOnClickListener {
            if (!mediaPlayer.isPlaying){
                mediaPlayer.start()  //开始播放
            }
        }

        binding.pause.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.pause()  //暂停播放
            }
        }

        binding.stop.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.reset()  //停止播放
                initMediaPlayer()
            }
        }

        val uri= Uri.parse("android.resource://$packageName/${R.raw.video}")
        binding.videoView.setVideoURI(uri)
        binding.videoPlay.setOnClickListener {
            if (!binding.videoView.isPlaying){
                binding.videoView.start()  //开始播放
            }
            Log.d("MainActitity","正在播放视频...")
        }

        binding.videoPause.setOnClickListener {
            if (binding.videoView.isPlaying){
                binding.videoView.pause()  //暂停播放
            }
        }

        binding.videoReplay.setOnClickListener {
            if (binding.videoView.isPlaying){
                binding.videoView.resume()  //重新播放
            }
        }
    }

    private fun initMediaPlayer(){
        val assetMannager=assets
        val fd=assetMannager.openFd("music.mp3")
        mediaPlayer.setDataSource(fd.fileDescriptor,fd.startOffset,fd.length)
        mediaPlayer.prepare()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()

        binding.videoView.suspend()
    }




}