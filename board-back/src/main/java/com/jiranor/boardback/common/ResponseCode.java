package com.jiranor.boardback.common;

public interface ResponseCode {

    // HTTP Status 200
    String SUCCESS ="SU";

  // HTTP Status 400
    String VAILDATION_FAILED="VF";
    String DUPLICATE_EMAIL="DE";
    String DUPLICATE_NICKNAME="DN";
    String DUPLICATE_TEL_NUMBER="DT";
    String NOT_EXISTED="NU";
    String NOT_EXISTED_BOARD="NB";

    //HTTP status 401
    String SIGN_IN_FAIL="SF";
    String AUTHORIZATION="AF";

    //HTTP Status 403
    String NO_PERMISSION="NP";

    //HTTP Status 500
    String DATABASE_ERROR="DBE";

    




    
}
