package com.example.SportLeaderboard.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Setter
@Getter
public class UpdateGames {
    Integer id;
        Integer score;
        String payerName;
}
