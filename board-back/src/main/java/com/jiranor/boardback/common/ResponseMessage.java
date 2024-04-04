package com.jiranor.boardback.common;

public interface ResponseMessage {

        // HTTP Status 200
        String SUCCESS ="Success";

        // HTTP Status 400
          String VAILDATION_FAILED="Vaildation failed";
          String DUPLICATE_EMAIL="Duplicate email";
          String DUPLICATE_NICKNAME="Duplicate nickname";
          String DUPLICATE_TEL_NUMBER="Duplicate tel number";
          String NOT_EXISTED_USER="This user does not exist.";
          String NOT_EXISTED_BOARD="This board does not exist";
      
          //HTTP status 401
          String SIGN_IN_FAIL="Login informaiton mismatch";
          String AUTHORIZATION="Authorization Failed";
      
          //HTTP Status 403
          String NO_PERMISSION="Do not have permission";
      
          //HTTP Status 500
          String DATABASE_ERROR="Database error";
      
    
}
