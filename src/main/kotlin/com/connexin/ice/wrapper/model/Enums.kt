package com.connexin.ice.wrapper.model

enum class Gender{
    M,
    F,
    U
}

enum class CodeSystem{
    ICD_9,
    ICD_10,
    SNOMED,
    CVX,
    VACCINE_GROUP,
    ICE_VACCINE_VALIDITY
}

enum class Interpretation{
    IS_IMMUNE,
    REFUSED,
    DISEASE,
    DEFERRED,
    PREGNANCY_VACCINATED,
}

enum class ObservationConcept{
    DISEASE_DOCUMENTED,
    PROOF_OF_IMMUNITY
}