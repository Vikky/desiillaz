package com.learningv.desiilaaz.utils;


import com.learningv.desiilaaz.utils.Constants.StringConstants;

import java.util.List;


/**
 * Created by vikky.agrawal on 4/5/15.
 */


public enum Ailments {


    ACIDITY(StringConstants.ACIDITY, RemediesArray.acidRemedies),

    ACNE(StringConstants.ACNE,RemediesArray.acneRemedies),

    BLACKHEADS(StringConstants.BLACKHEADS,RemediesArray.blackheadsRemedies),

    COMMON_COLD(StringConstants.COMMON_COLD,RemediesArray.coldRemedies),
    CONSTIPATION(StringConstants.CONSTIPATION, RemediesArray.constipationRemedies),
    COUGH(StringConstants.COUGH, RemediesArray.coughRemedies),

    DANDRUFF(StringConstants.DANDRUFF, RemediesArray.dandruffRemedies),
    DIARRHOEA(StringConstants.DIARRHOEA, RemediesArray.diarrhoeaRemedies),
    DEHYDRATION(StringConstants.DEHYDRATION , RemediesArray.dehydrationRemedies),

    FEVER(StringConstants.FEVER , RemediesArray.feverRemedies),
    FLU(StringConstants.FLU , RemediesArray.fluRemedies),

    HAIR_LOSS(StringConstants.HAIR_LOSS , RemediesArray.hairLossRemedies),

    MIGRAINE(StringConstants.MIGRAINE , RemediesArray.migraineRemedies),

    NAUSEA(StringConstants.NAUSEA , RemediesArray.nauseaRemedies),

    TIRED_EYES(StringConstants.TIRED_EYES , RemediesArray.tiredEyesRemedies),

    VOMITING(StringConstants.VOMITING , RemediesArray.vomitingRemedies);

    String description;

    List<String> remedies;


    Ailments(String description, List<String> remedies) {
        this.description = description;
        this.remedies = remedies;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getRemedies() {
        return remedies;
    }




}
