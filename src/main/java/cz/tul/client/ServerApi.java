package cz.tul.client;


public interface ServerApi {

    public static final String UPLOAD_PATH = "/api/upload/{name}";



    public static final String COMMENT_PATH = COMMENTS_PATH + "/{id}";

    public static final String COMMENT_LIKE_PATH = COMMENT_PATH + "/like";
    public static final String COMMENT_DISLIKE_PATH = COMMENT_PATH + "/dislike";


    public static final String PICTURES_PATH = "/api/pictures";

    public static final String PICTURE_PATH = PICTURES_PATH + "/{id}";
    public static final String PICTURE_LIKE_PATH = PICTURE_PATH + "/like";
    public static final String PICTURE_DISLIKE_PATH = PICTURE_PATH + "/dislike";

    public static final String PICTURES_BY_NAME_PATH = PICTURES_PATH + "/name/{name}";
    public static final String PICTURES_BY_AUTHOR_PATH = PICTURES_PATH + "/author/{id}";
    public static final String PICTURES_BY_TAG_PATH = PICTURES_PATH + "/tag/{name}";

}
