package com.trainee.mylol.resource;

import com.trainee.mylol.model.MatchItem;
import com.trainee.mylol.service.MatchService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "match")
public class MatchResource {

    @Autowired
    private MatchService matchService;

    @RequestMapping(method = RequestMethod.GET, path = "{accountId}")
    public List<MatchItem> getMatchList(
            @PathVariable("accountId") Long accountId,
            @RequestParam("beginIndex") Integer beginIndex,
            @RequestParam("endIndex") Integer endIndex) {
        return matchService.getMatchList(accountId, beginIndex, endIndex);
    }
}
