package com.liema.game.sign.mongo;

import com.liema.game.card.entity.Card;
import com.liema.game.sign.entity.SignReward;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SignRewardDao {

    @Resource
    @Qualifier("gameMongoTemplate")
    private MongoTemplate gameMongoTemplate;

    public Card getCardById(Long rid) {
        return null;
    }

    public SignReward getSignHistoryByRole(Long rid){
        return null;
    }

    public void insertActorReward(SignReward sign){

    }

    public void updateActorSignHistory(SignReward signReward){

    }
}