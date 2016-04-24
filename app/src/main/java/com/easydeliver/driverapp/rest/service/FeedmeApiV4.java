package com.easydeliver.driverapp.rest.service;

import com.easydeliver.driverapp.rest.model.DeliverOrder;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by tomlee on 1/3/16.
 */
public interface FeedmeApiV4 {


    @GET("/delivery/")
    public void getOrder(
            Callback<List<DeliverOrder>> orderList
    );
//    @POST("/users/login_facebook/access_by_facebook")
//    public void facebookAuth(
//            @Body FacebookAuthWrapper loginWrapper,
//            Callback<UserResponse> responseCallback);
//
//    @POST("/users/login_general/signup")
//    public void emailSignUp(
//            @Body SignUpEmailRequestWrapper requestWrapper,
//            Callback<UserResponse> responseCallback);
//
//    @POST("/users/login_general/login")
//    public void emailSignIn(
//            @Body SignInEmailRequestWrapper requestWrapper,
//            Callback<UserResponse> responseCallback);
}
