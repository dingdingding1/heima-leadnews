package com.heima.apis.search;

import com.heima.model.article.dtos.UserSearchDto;
import com.heima.model.common.dtos.ResponseResult;

public interface ArticleSearchControllerApi {

    /**
     *  搜索文章
     * @param userSearchDto
     * @return
     */
    public ResponseResult esArticleSearch(UserSearchDto userSearchDto);
}