package com.nowcoder.community.service;

import com.nowcoder.community.entity.DiscussPost;

import java.util.List;

public interface DiscussPostService {

    public List<DiscussPost> findDiscussPosts(int userId,int offesr,int limit);

    public int findDiscussPostRows(int userId);
}
