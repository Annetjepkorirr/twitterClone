package com.example.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.twitterclone.databinding.ActivityMainBinding
import com.example.twitterclone.databinding.TweetListItemBinding

class TweetRvAdapter(var tweetsList: List<TweetsData>): RecyclerView.Adapter<TweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        val binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context))
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet = tweetsList.get(position)
        val binding = holder.binding
        binding.tvTweeet.text = currentTweet.tweet
        binding.tvRtcount.text = currentTweet.rtCount.toString()
        binding.tvHandle.text = currentTweet.handle
        binding.tvDisplayName.text = currentTweet.displayName
        binding.tvRtcount.text = currentTweet.rtCount.toString()



    }

    override fun getItemCount(): Int {
        return  tweetsList.size

    }
}
class  TweetsViewHolder(binding: TweetListItemBinding): ViewHolder(binding.root)