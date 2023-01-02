(ns net.wikipunk.rdf.lcc-m49
  "This ontology represents the United Nations publication 'Standard Country or Area Codes for Statistical Use' originally published as Series M, No. 49 and now commonly referred to as the M49 standard. The assignment of countries or areas to specific groupings is for statistical convenience and does not imply any assumption regarding political or other affiliation of countries or territories by the United Nations. The codes included herein are current as of the version IRI for this ontology."
  {:cmns-av/copyright ["Copyright (c) 2015-2017 Unisys"
                       "Copyright (c) 2015-2022 Object Management Group, Inc."
                       "Copyright (c) 2019-2022 agnos.ai UK Ltd."
                       "Copyright (c) 2015-2022 Thematix Partners LLC"
                       "Copyright (c) 2015-2019 Adaptive, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/UN-M49-RegionCodes.rdf",
   :dcterms/abstract
   "This ontology represents the United Nations publication 'Standard Country or Area Codes for Statistical Use' originally published as Series M, No. 49 and now commonly referred to as the M49 standard. The assignment of countries or areas to specific groupings is for statistical convenience and does not imply any assumption regarding political or other affiliation of countries or territories by the United Nations. The codes included herein are current as of the version IRI for this ontology.",
   :dcterms/contributor ["Pete Rivett, agnos.ai U.K. Ltd"
                         "Elisa Kendall, Thematix Partners LLC"],
   :dcterms/issued #inst "2021-11-07T23:48:51.125-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references ["http://purl.org/dc/terms/"
                        "http://www.w3.org/2004/02/skos/core#"],
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20221101/Countries/UN-M49-RegionCodes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-m49" "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfa/prefix "lcc-m49",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label
   "United Nations Standard Country or Area Codes for Statistical Use (M49 Geographic Region Codes) Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/Countries/AboutCountries/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"]})

(def Africa
  "individual representing the continent Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Continent,
   :db/ident :lcc-m49/Africa,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Africa"},
   :lcc-cr/hasNumericRegionCode "002",
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Africa",
   :skos/definition "individual representing the continent Africa"})

(def Americas
  "individual representing the continent Americas"
  {:cmns-cls/isClassifiedBy :lcc-m49/Continent,
   :db/ident :lcc-m49/Americas,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Americas"},
   :lcc-cr/hasNumericRegionCode "019",
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Americas",
   :skos/definition "individual representing the continent Americas"})

(def Asia
  "individual representing the continent Asia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Continent,
   :db/ident :lcc-m49/Asia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Asia"},
   :lcc-cr/hasNumericRegionCode "142",
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Asia",
   :skos/definition "individual representing the continent Asia"})

(def AustraliaAndNewZealand
  "individual representing the region Australia and New Zealand"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/AustraliaAndNewZealand,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Australia and New Zealand"},
   :lcc-cr/hasNumericRegionCode "053",
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Australia and New Zealand",
   :skos/definition
   "individual representing the region Australia and New Zealand"})

(def Caribbean
  "individual representing the subregion Caribbean"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/Caribbean,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Caribbean"},
   :lcc-cr/hasNumericRegionCode "029",
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Caribbean",
   :skos/definition "individual representing the subregion Caribbean"})

(def CentralAmerica
  "individual representing the subregion Central America"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/CentralAmerica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Central America"},
   :lcc-cr/hasNumericRegionCode "013",
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Central America",
   :skos/definition "individual representing the subregion Central America"})

(def CentralAsia
  "individual representing the region Central Asia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/CentralAsia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Central Asia"},
   :lcc-cr/hasNumericRegionCode "143",
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Central Asia",
   :skos/definition "individual representing the region Central Asia"})

(def ChannelIslands
  "individual representing the subregion Channel Islands"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/ChannelIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Channel Islands"},
   :lcc-cr/hasNumericRegionCode "830",
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Channel Islands",
   :skos/definition "individual representing the subregion Channel Islands"})

(def Continent
  "the kind of region that is a continent"
  {:db/ident :lcc-m49/Continent,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "continent",
   :skos/definition "the kind of region that is a continent"})

(def EasternAfrica
  "individual representing the subregion Eastern Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/EasternAfrica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eastern Africa"},
   :lcc-cr/hasNumericRegionCode "014",
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Eastern Africa",
   :skos/definition "individual representing the subregion Eastern Africa"})

(def EasternAsia
  "individual representing the region Eastern Asia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/EasternAsia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eastern Asia"},
   :lcc-cr/hasNumericRegionCode "030",
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Eastern Asia",
   :skos/definition "individual representing the region Eastern Asia"})

(def EasternEurope
  "individual representing the region Eastern Europe"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/EasternEurope,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eastern Europe"},
   :lcc-cr/hasNumericRegionCode "151",
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Eastern Europe",
   :skos/definition "individual representing the region Eastern Europe"})

(def Europe
  "individual representing the continent Europe"
  {:cmns-cls/isClassifiedBy :lcc-m49/Continent,
   :db/ident :lcc-m49/Europe,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Europe"},
   :lcc-cr/hasNumericRegionCode "150",
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Europe",
   :skos/definition "individual representing the continent Europe"})

(def LatinAmericaAndTheCaribbean
  "individual representing the region Latin America and the Caribbean"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/LatinAmericaAndTheCaribbean,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Latin America and the Caribbean"},
   :lcc-cr/hasNumericRegionCode "419",
   :lcc-cr/isSubregionOf :lcc-m49/Americas,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Latin America and the Caribbean",
   :skos/definition
   "individual representing the region Latin America and the Caribbean"})

(def Melanesia
  "individual representing the region Melanesia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/Melanesia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Melanesia"},
   :lcc-cr/hasNumericRegionCode "054",
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Melanesia",
   :skos/definition "individual representing the region Melanesia"})

(def Micronesia
  "individual representing the region Micronesia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/Micronesia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Micronesia"},
   :lcc-cr/hasNumericRegionCode "057",
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Micronesia",
   :skos/definition "individual representing the region Micronesia"})

(def MiddleAfrica
  "individual representing the subregion Middle Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/MiddleAfrica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Middle Africa"},
   :lcc-cr/hasNumericRegionCode "017",
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Middle Africa",
   :skos/definition "individual representing the subregion Middle Africa"})

(def NorthernAfrica
  "individual representing the region Northern Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/NorthernAfrica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Northern Africa"},
   :lcc-cr/hasNumericRegionCode "015",
   :lcc-cr/isSubregionOf :lcc-m49/Africa,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Northern Africa",
   :skos/definition "individual representing the region Northern Africa"})

(def NorthernAmerica
  "individual representing the region Northern America"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/NorthernAmerica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Northern America"},
   :lcc-cr/hasNumericRegionCode "021",
   :lcc-cr/isSubregionOf :lcc-m49/Americas,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Northern America",
   :skos/definition "individual representing the region Northern America"})

(def NorthernEurope
  "individual representing the region Northern Europe"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/NorthernEurope,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Northern Europe"},
   :lcc-cr/hasNumericRegionCode "154",
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Northern Europe",
   :skos/definition "individual representing the region Northern Europe"})

(def Oceania
  "individual representing the continent Oceania"
  {:cmns-cls/isClassifiedBy :lcc-m49/Continent,
   :db/ident :lcc-m49/Oceania,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Oceania"},
   :lcc-cr/hasNumericRegionCode "009",
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Oceania",
   :skos/definition "individual representing the continent Oceania"})

(def Planet
  "the kind of region that is a planet"
  {:db/ident :lcc-m49/Planet,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "planet",
   :skos/definition "the kind of region that is a planet"})

(def Polynesia
  "individual representing the region Polynesia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/Polynesia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Polynesia"},
   :lcc-cr/hasNumericRegionCode "061",
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Polynesia",
   :skos/definition "individual representing the region Polynesia"})

(def Region
  "the kind of region that is a region within a continent"
  {:db/ident :lcc-m49/Region,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "region",
   :skos/definition "the kind of region that is a region within a continent"})

(def South-easternAsia
  "individual representing the region South-eastern Asia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/South-easternAsia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "South-eastern Asia"},
   :lcc-cr/hasNumericRegionCode "035",
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "South-eastern Asia",
   :skos/definition "individual representing the region South-eastern Asia"})

(def SouthAmerica
  "individual representing the subregion South America"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/SouthAmerica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "South America"},
   :lcc-cr/hasNumericRegionCode "005",
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "South America",
   :skos/definition "individual representing the subregion South America"})

(def SouthernAfrica
  "individual representing the subregion Southern Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/SouthernAfrica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Southern Africa"},
   :lcc-cr/hasNumericRegionCode "018",
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Southern Africa",
   :skos/definition "individual representing the subregion Southern Africa"})

(def SouthernAsia
  "individual representing the region Southern Asia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/SouthernAsia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Southern Asia"},
   :lcc-cr/hasNumericRegionCode "034",
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Southern Asia",
   :skos/definition "individual representing the region Southern Asia"})

(def SouthernEurope
  "individual representing the region Southern Europe"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/SouthernEurope,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Southern Europe"},
   :lcc-cr/hasNumericRegionCode "039",
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Southern Europe",
   :skos/definition "individual representing the region Southern Europe"})

(def Sub-SaharanAfrica
  "individual representing the region Sub-Saharan Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/Sub-SaharanAfrica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sub-Saharan Africa"},
   :lcc-cr/hasNumericRegionCode "202",
   :lcc-cr/isSubregionOf :lcc-m49/Africa,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Sub-Saharan Africa",
   :skos/definition "individual representing the region Sub-Saharan Africa"})

(def Subregion
  "the kind of region that is a subregion"
  {:db/ident :lcc-m49/Subregion,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "subregion",
   :skos/definition "the kind of region that is a subregion"})

(def WesternAfrica
  "individual representing the subregion Western Africa"
  {:cmns-cls/isClassifiedBy :lcc-m49/Subregion,
   :db/ident :lcc-m49/WesternAfrica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Western Africa"},
   :lcc-cr/hasNumericRegionCode "011",
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Western Africa",
   :skos/definition "individual representing the subregion Western Africa"})

(def WesternAsia
  "individual representing the region Western Asia"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/WesternAsia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Western Asia"},
   :lcc-cr/hasNumericRegionCode "145",
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Western Asia",
   :skos/definition "individual representing the region Western Asia"})

(def WesternEurope
  "individual representing the region Western Europe"
  {:cmns-cls/isClassifiedBy :lcc-m49/Region,
   :db/ident :lcc-m49/WesternEurope,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Western Europe"},
   :lcc-cr/hasNumericRegionCode "155",
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "Western Europe",
   :skos/definition "individual representing the region Western Europe"})

(def World
  "individual representing the planet World"
  {:cmns-cls/isClassifiedBy :lcc-m49/Planet,
   :db/ident :lcc-m49/World,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    ""},
   :lcc-cr/hasNumericRegionCode "001",
   :rdf/type [:lcc-cr/GeographicRegion :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label "World",
   :skos/definition "individual representing the planet World"})