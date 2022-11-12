package model;

import com.google.gson.Gson;

public class BuildModelJSON {

    public static String parseJSONString(PostBody postBody){
        if (postBody==null){
            throw new IllegalArgumentException("[ERR] Post Body can't be null");
        }

        return new Gson().toJson(postBody);
    }
}
