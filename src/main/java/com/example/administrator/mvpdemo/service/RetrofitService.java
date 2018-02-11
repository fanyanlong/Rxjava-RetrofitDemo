package com.example.administrator.mvpdemo.service;



import com.example.administrator.mvpdemo.service.entity.Book;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by win764-1 on 2016/12/12.
 */

public interface RetrofitService {
    //请求方式
    @GET("?key=71e58b5b2f930eaf1f937407acde08fe&num")
    //Observable
    //@Query() ?后面用它去拼接
    //@QueryMap ?后面拼接数组用的
   /* @Path：所有在网址中的参数（URL的问号前面），如：
    http://102.10.10.132/api/Accounts/{accountId}
    @Query：URL问号后面的参数，如：
    http://102.10.10.132/api/Comments?access_token={access_token}
    @QueryMap：相当于多个@Query
    @Field：用于POST请求，提交单个数据
    @Body：相当于多个@Field，以对象的形式提交
*/

    Observable<Book> getSearchBooks(@Query("num") int num);
}
