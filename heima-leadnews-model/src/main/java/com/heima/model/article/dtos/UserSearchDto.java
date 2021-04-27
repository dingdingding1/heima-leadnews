package com.heima.model.article.dtos;

import com.heima.model.common.annotation.IdEncrypt;
import lombok.Data;


@Data
public class UserSearchDto {

    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    String searchWords;
    //查询tag: all, article, login, author
   /* String tag;
    List<ApUserSearch> hisList;
    String hotDate;*/
    int pageNum;
    int pageSize;

    public int getFromIndex(){
        if(this.pageNum<1)return 0;
        if(this.pageSize<1) this.pageSize = 10;
        return this.pageSize * (pageNum-1);
    }
}