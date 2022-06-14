package com.zack.twitchplus.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zack.twitchplus.entity.db.Item;

public class FavoriteRequestBody {
    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }

}
