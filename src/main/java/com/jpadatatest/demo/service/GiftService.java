package com.jpadatatest.demo.service;

import com.jpadatatest.demo.entity.GiftBase;
import com.jpadatatest.demo.repository.GiftRepository;
import org.springframework.stereotype.Service;

@Service
public class GiftService {
    private final GiftRepository giftRepository;

    public GiftService(GiftRepository giftRepository) {
        this.giftRepository = giftRepository;
    }
    public void addGift(GiftBase giftBase){
        giftRepository.save(giftBase);
    }
}
