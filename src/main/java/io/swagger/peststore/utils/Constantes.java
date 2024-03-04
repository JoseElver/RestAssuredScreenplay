package io.swagger.peststore.utils;

import org.json.JSONObject;

public class Constantes {

    public static final String URL;
    public static final String ENDPOINT;

    //POST
    public static final String ID_POST;
    public static final String ID_CATEGORY_POST;
    public static final String NAME_CATEGORY_POST;
    public static final String NAME_POST;
    public static final String PHOTO_POST;
    public static final String ID_TAGS_POST;
    public static final String NAME_TAGS_POST;
    public static final String STATUS_POST;

    //PUT
    public static final String ID_PUT;
    public static final String ID_CATEGORY_PUT;
    public static final String NAME_CATEGORY_PUT;
    public static final String NAME_PUT;
    public static final String PHOTO_PUT;
    public static final String ID_TAGS_PUT;
    public static final String NAME_TAGS_PUT;
    public static final String STATUS_PUT;

    static {
        LeerJson.on("src/test/resources/datadriven/data.json");
        JSONObject url = LeerJson.getGlobalJSONObject().getJSONObject("Environments");
        JSONObject bodyPost = LeerJson.getGlobalJSONObject().getJSONObject("BodyPost");
        JSONObject bodyPut = LeerJson.getGlobalJSONObject().getJSONObject("BodyPut");

        URL = url.getString("UrlBase");
        ENDPOINT = url.getString("Endpoint");

        ID_POST = bodyPost.getString("id");
        ID_CATEGORY_POST = bodyPost.getString("id_category");
        NAME_CATEGORY_POST = bodyPost.getString("name_category");
        NAME_POST = bodyPost.getString("name");
        PHOTO_POST = bodyPost.getString("photoUrls");
        ID_TAGS_POST = bodyPost.getString("id_tags");
        NAME_TAGS_POST = bodyPost.getString("name_tags");
        STATUS_POST = bodyPost.getString("status");

        ID_PUT = bodyPut.getString("id");
        ID_CATEGORY_PUT = bodyPut.getString("id_category");
        NAME_CATEGORY_PUT = bodyPut.getString("name_category");
        NAME_PUT = bodyPut.getString("name");
        PHOTO_PUT = bodyPut.getString("photoUrls");
        ID_TAGS_PUT = bodyPut.getString("id_tags");
        NAME_TAGS_PUT = bodyPut.getString("name_tags");
        STATUS_PUT = bodyPut.getString("status");
    }

    public static final String BODY_POST = "{\n" +
            "  \"id\": "+ID_POST+",\n" +
            "  \"category\": {\n" +
            "    \"id\": "+ID_CATEGORY_POST+",\n" +
            "    \"name\": \""+NAME_CATEGORY_POST+"\"\n" +
            "  },\n" +
            "  \"name\": \""+NAME_POST+"\",\n" +
            "  \"photoUrls\": [\n" +
            "    \""+PHOTO_POST+"\"\n" +
            "  ],\n" +
            "  \"tags\": [\n" +
            "    {\n" +
            "      \"id\": "+ID_TAGS_POST+",\n" +
            "      \"name\": \""+NAME_TAGS_POST+"\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": \""+STATUS_POST+"\"\n" +
            "}";

    public static final String BODY_PUT = "{\n" +
            "  \"id\": "+ID_PUT+",\n" +
            "  \"category\": {\n" +
            "    \"id\": "+ID_CATEGORY_PUT+",\n" +
            "    \"name\": \""+NAME_CATEGORY_PUT+"\"\n" +
            "  },\n" +
            "  \"name\": \""+NAME_PUT+"\",\n" +
            "  \"photoUrls\": [\n" +
            "    \""+PHOTO_PUT+"\"\n" +
            "  ],\n" +
            "  \"tags\": [\n" +
            "    {\n" +
            "      \"id\": "+ID_TAGS_PUT+",\n" +
            "      \"name\": \""+NAME_TAGS_PUT+"\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": \""+STATUS_PUT+"\"\n" +
            "}";
}
