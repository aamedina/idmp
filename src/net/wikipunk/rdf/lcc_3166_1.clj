(ns net.wikipunk.rdf.lcc-3166-1
  "This ontology represents the subset of the ISO 3166 standard that include the actual ISO 3166-1 country codes, with the codes for the other parts of the standard represented in dependent models."
  {:cmns-av/copyright ["Copyright (c) 2019-2022 agnos.ai UK Ltd."
                       "Copyright (c) 2015-2017 Unisys"
                       "Copyright (c) 2015-2022 Thematix Partners LLC"
                       "Copyright (c) 2015-2019 Adaptive, Inc."
                       "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/ISO3166-1-CountryCodes.rdf",
   :dcterms/abstract
   "This ontology represents the subset of the ISO 3166 standard that include the actual ISO 3166-1 country codes, with the codes for the other parts of the standard represented in dependent models.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai U.K. Ltd"],
   :dcterms/issued #inst "2021-10-29T23:57:18.465-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references ["http://www.w3.org/2004/02/skos/core#"
                        "http://purl.org/dc/terms/"],
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20221101/Countries/ISO3166-1-CountryCodes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-639-2"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfa/prefix "lcc-3166-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 Country Codes Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/Countries/AboutCountries/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"]})

(def ABW
  "Alpha-3 country code for Aruba"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Aruba,
   :db/ident :lcc-3166-1/ABW,
   :lcc-lr/hasTag "ABW",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ABW",
   :skos/definition "Alpha-3 country code for Aruba"})

(def AD
  "Alpha-2 country code for Andorra"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Andorra,
   :db/ident :lcc-3166-1/AD,
   :lcc-lr/hasTag "AD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AD",
   :skos/definition "Alpha-2 country code for Andorra"})

(def AE
  "Alpha-2 country code for United Arab Emirates (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/UnitedArabEmirates,
   :db/ident :lcc-3166-1/AE,
   :lcc-lr/hasTag "AE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AE",
   :skos/definition "Alpha-2 country code for United Arab Emirates (the)"})

(def AF
  "Alpha-2 country code for Afghanistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Afghanistan,
   :db/ident :lcc-3166-1/AF,
   :lcc-lr/hasTag "AF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AF",
   :skos/definition "Alpha-2 country code for Afghanistan"})

(def AFG
  "Alpha-3 country code for Afghanistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Afghanistan,
   :db/ident :lcc-3166-1/AFG,
   :lcc-lr/hasTag "AFG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AFG",
   :skos/definition "Alpha-3 country code for Afghanistan"})

(def AG
  "Alpha-2 country code for Antigua and Barbuda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/AntiguaAndBarbuda,
   :db/ident :lcc-3166-1/AG,
   :lcc-lr/hasTag "AG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AG",
   :skos/definition "Alpha-2 country code for Antigua and Barbuda"})

(def AGO
  "Alpha-3 country code for Angola"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Angola,
   :db/ident :lcc-3166-1/AGO,
   :lcc-lr/hasTag "AGO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AGO",
   :skos/definition "Alpha-3 country code for Angola"})

(def AI
  "Alpha-2 country code for Anguilla"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Anguilla,
   :db/ident :lcc-3166-1/AI,
   :lcc-lr/hasTag "AI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AI",
   :skos/definition "Alpha-2 country code for Anguilla"})

(def AIA
  "Alpha-3 country code for Anguilla"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Anguilla,
   :db/ident :lcc-3166-1/AIA,
   :lcc-lr/hasTag "AIA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AIA",
   :skos/definition "Alpha-3 country code for Anguilla"})

(def AL
  "Alpha-2 country code for Albania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Albania,
   :db/ident :lcc-3166-1/AL,
   :lcc-lr/hasTag "AL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AL",
   :skos/definition "Alpha-2 country code for Albania"})

(def ALA
  "Alpha-3 country code for Aland Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/AlandIslands,
   :db/ident :lcc-3166-1/ALA,
   :lcc-lr/hasTag "ALA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ALA",
   :skos/definition "Alpha-3 country code for Aland Islands"})

(def ALB
  "Alpha-3 country code for Albania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Albania,
   :db/ident :lcc-3166-1/ALB,
   :lcc-lr/hasTag "ALB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ALB",
   :skos/definition "Alpha-3 country code for Albania"})

(def AM
  "Alpha-2 country code for Armenia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Armenia,
   :db/ident :lcc-3166-1/AM,
   :lcc-lr/hasTag "AM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AM",
   :skos/definition "Alpha-2 country code for Armenia"})

(def AND
  "Alpha-3 country code for Andorra"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Andorra,
   :db/ident :lcc-3166-1/AND,
   :lcc-lr/hasTag "AND",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AND",
   :skos/definition "Alpha-3 country code for Andorra"})

(def AO
  "Alpha-2 country code for Angola"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Angola,
   :db/ident :lcc-3166-1/AO,
   :lcc-lr/hasTag "AO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AO",
   :skos/definition "Alpha-2 country code for Angola"})

(def AQ
  "Alpha-2 country code for Antarctica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Antarctica,
   :db/ident :lcc-3166-1/AQ,
   :lcc-lr/hasTag "AQ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AQ",
   :skos/definition "Alpha-2 country code for Antarctica"})

(def AR
  "Alpha-2 country code for Argentina"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Argentina,
   :db/ident :lcc-3166-1/AR,
   :lcc-lr/hasTag "AR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AR",
   :skos/definition "Alpha-2 country code for Argentina"})

(def ARE
  "Alpha-3 country code for United Arab Emirates (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/UnitedArabEmirates,
   :db/ident :lcc-3166-1/ARE,
   :lcc-lr/hasTag "ARE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ARE",
   :skos/definition "Alpha-3 country code for United Arab Emirates (the)"})

(def ARG
  "Alpha-3 country code for Argentina"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Argentina,
   :db/ident :lcc-3166-1/ARG,
   :lcc-lr/hasTag "ARG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ARG",
   :skos/definition "Alpha-3 country code for Argentina"})

(def ARM
  "Alpha-3 country code for Armenia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Armenia,
   :db/ident :lcc-3166-1/ARM,
   :lcc-lr/hasTag "ARM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ARM",
   :skos/definition "Alpha-3 country code for Armenia"})

(def AS
  "Alpha-2 country code for American Samoa"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/AmericanSamoa,
   :db/ident :lcc-3166-1/AS,
   :lcc-lr/hasTag "AS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AS",
   :skos/definition "Alpha-2 country code for American Samoa"})

(def ASM
  "Alpha-3 country code for American Samoa"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/AmericanSamoa,
   :db/ident :lcc-3166-1/ASM,
   :lcc-lr/hasTag "ASM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ASM",
   :skos/definition "Alpha-3 country code for American Samoa"})

(def AT
  "Alpha-2 country code for Austria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Austria,
   :db/ident :lcc-3166-1/AT,
   :lcc-lr/hasTag "AT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AT",
   :skos/definition "Alpha-2 country code for Austria"})

(def ATA
  "Alpha-3 country code for Antarctica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Antarctica,
   :db/ident :lcc-3166-1/ATA,
   :lcc-lr/hasTag "ATA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ATA",
   :skos/definition "Alpha-3 country code for Antarctica"})

(def ATF
  "Alpha-3 country code for French Southern Territories (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FrenchSouthernTerritories,
   :db/ident :lcc-3166-1/ATF,
   :lcc-lr/hasTag "ATF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ATF",
   :skos/definition
   "Alpha-3 country code for French Southern Territories (the)"})

(def ATG
  "Alpha-3 country code for Antigua and Barbuda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/AntiguaAndBarbuda,
   :db/ident :lcc-3166-1/ATG,
   :lcc-lr/hasTag "ATG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ATG",
   :skos/definition "Alpha-3 country code for Antigua and Barbuda"})

(def AU
  "Alpha-2 country code for Australia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Australia,
   :db/ident :lcc-3166-1/AU,
   :lcc-lr/hasTag "AU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AU",
   :skos/definition "Alpha-2 country code for Australia"})

(def AUS
  "Alpha-3 country code for Australia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Australia,
   :db/ident :lcc-3166-1/AUS,
   :lcc-lr/hasTag "AUS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AUS",
   :skos/definition "Alpha-3 country code for Australia"})

(def AUT
  "Alpha-3 country code for Austria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Austria,
   :db/ident :lcc-3166-1/AUT,
   :lcc-lr/hasTag "AUT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AUT",
   :skos/definition "Alpha-3 country code for Austria"})

(def AW
  "Alpha-2 country code for Aruba"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Aruba,
   :db/ident :lcc-3166-1/AW,
   :lcc-lr/hasTag "AW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AW",
   :skos/definition "Alpha-2 country code for Aruba"})

(def AX
  "Alpha-2 country code for Aland Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/AlandIslands,
   :db/ident :lcc-3166-1/AX,
   :lcc-lr/hasTag "AX",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AX",
   :skos/definition "Alpha-2 country code for Aland Islands"})

(def AZ
  "Alpha-2 country code for Azerbaijan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Azerbaijan,
   :db/ident :lcc-3166-1/AZ,
   :lcc-lr/hasTag "AZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AZ",
   :skos/definition "Alpha-2 country code for Azerbaijan"})

(def AZE
  "Alpha-3 country code for Azerbaijan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Azerbaijan,
   :db/ident :lcc-3166-1/AZE,
   :lcc-lr/hasTag "AZE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AZE",
   :skos/definition "Alpha-3 country code for Azerbaijan"})

(def Afghanistan
  "the country of Afghanistan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Afghanistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Islamic Republic of Afghanistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Afghanistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AFGHANISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République islamique d'Afghanistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Afghanistan (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AFGHANISTAN"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ps",
                               :rdf/value    "Afghānistān"}
                              {:rdf/language "fa",
                               :rdf/value    "Afghānistān"}],
   :lcc-cr/hasNumericRegionCode "004",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Persian :lcc-639-1/Pushto],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ps",
                 :rdf/value    "Afghānistān"}
                {:rdf/language "fa",
                 :rdf/value    "Afghānistān"}],
   :skos/definition "the country of Afghanistan"})

(def AlandIslands
  "the country of Aland Islands"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/AlandIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Aland Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ALAND ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Åland(les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÅLAND, ÎLES"},
   :lcc-cr/hasLocalShortName {:rdf/language "sv",
                              :rdf/value    "Åland"},
   :lcc-cr/hasNumericRegionCode "248",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Swedish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "sv",
                :rdf/value    "Åland"},
   :skos/definition "the country of Aland Islands"})

(def Albania
  "the country of Albania"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Albania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Albania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Albania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ALBANIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Albanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Albanie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ALBANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sq",
                              :rdf/value    "Shqipëria; Shqipëri"},
   :lcc-cr/hasNumericRegionCode "008",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Albanian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "sq",
                :rdf/value    "Shqipëria; Shqipëri"},
   :skos/definition "the country of Albania"})

(def Algeria
  "the country of Algeria"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Algeria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the People's Democratic Republic of Algeria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Algeria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ALGERIA"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "la République algérienne démocratique et populaire"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Algérie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ALGÉRIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Jazā'ir"},
   :lcc-cr/hasNumericRegionCode "012",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Jazā'ir"},
   :skos/definition "the country of Algeria"})

(def AmericanSamoa
  "the country of American Samoa"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/AmericanSamoa,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "American Samoa"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AMERICAN SAMOA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Samoa américaines (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAMOA AMÉRICAINES"},
   :lcc-cr/hasNumericRegionCode "016",
   :lcc-cr/hasRemarks
   ["Principal island:Tutuila. Includes: Swain's Island"
    "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-AS)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American Samoa"},
   :skos/definition "the country of American Samoa"})

(def Andorra
  "the country of Andorra"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Andorra,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Principality of Andorra"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Andorra"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANDORRA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Principauté d'Andorre"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Andorre (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANDORRE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ca",
                              :rdf/value    "Andorra"},
   :lcc-cr/hasNumericRegionCode "020",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Catalan,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ca",
                :rdf/value    "Andorra"},
   :skos/definition "the country of Andorra"})

(def Angola
  "the country of Angola"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Angola,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Angola"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Angola"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANGOLA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Angola"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Angola (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANGOLA"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Angola"},
   :lcc-cr/hasNumericRegionCode "024",
   :lcc-cr/hasRemarks "Includes: Cabinda.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Angola"},
   :skos/definition "the country of Angola"})

(def Anguilla
  "the country of Anguilla"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Anguilla,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Anguilla"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANGUILLA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Anguilla"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANGUILLA"},
   :lcc-cr/hasNumericRegionCode "660",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anguilla"},
   :skos/definition "the country of Anguilla"})

(def Antarctica
  "the country of Antarctica"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Antarctica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Antarctica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANTARCTICA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Antarctique (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANTARCTIQUE"},
   :lcc-cr/hasNumericRegionCode "010",
   :lcc-cr/hasRemarks ["No subdivisions relevant for this standard."
                       "Territories south of 60° south latitude."],
   :lcc-cr/isIndependent false,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/definition "the country of Antarctica"})

(def AntiguaAndBarbuda
  "the country of Antigua and Barbuda"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Antigua and Barbuda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANTIGUA AND BARBUDA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Antigua-et-Barbuda"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANTIGUA-ET-BARBUDA"},
   :lcc-cr/hasNumericRegionCode "028",
   :lcc-cr/hasRemarks "Includes: Redonda Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Antigua and Barbuda"},
   :skos/definition "the country of Antigua and Barbuda"})

(def Argentina
  "the country of Argentina"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Argentina,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Argentine Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Argentina"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ARGENTINA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République argentine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Argentine (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARGENTINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Argentina (la)"},
   :lcc-cr/hasNumericRegionCode "032",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Argentina (la)"},
   :skos/definition "the country of Argentina"})

(def Armenia
  "the country of Armenia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Armenia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Armenia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Armenia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ARMENIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Arménie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Arménie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARMÉNIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hy",
                              :rdf/value    "Hayastan"},
   :lcc-cr/hasNumericRegionCode "051",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Armenian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "hy",
                :rdf/value    "Hayastan"},
   :skos/definition "the country of Armenia"})

(def Aruba
  "the country of Aruba"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Aruba,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Aruba"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ARUBA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Aruba"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARUBA"},
   :lcc-cr/hasLocalShortName ["Aruba"
                              {:rdf/language "nl",
                               :rdf/value    "Aruba"}],
   :lcc-cr/hasNumericRegionCode "533",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-AW).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Dutch :lcc-639-2/Papiamento],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "nl",
                :rdf/value    "Aruba"},
   :skos/definition "the country of Aruba"})

(def Australia
  "the country of Australia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Australia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Australia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AUSTRALIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Australie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AUSTRALIE"},
   :lcc-cr/hasNumericRegionCode "036",
   :lcc-cr/hasRemarks
   "Often referred to as the Commonwealth of Australia. Includes: Lord Howe Island, Macquarie Island; and also Ashmore and Cartier \nIslands, and Coral Sea Islands which are Australian external territories.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Australia"},
   :skos/definition "the country of Australia"})

(def Austria
  "the country of Austria"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Austria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Austria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Austria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AUSTRIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Autriche"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Autriche (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AUTRICHE"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Österreich"},
   :lcc-cr/hasNumericRegionCode "040",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Österreich"},
   :skos/definition "the country of Austria"})

(def Azerbaijan
  "the country of Azerbaijan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Azerbaijan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Azerbaijan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Azerbaijan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AZERBAIJAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Azerbaïdjan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Azerbaïdjan (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AZERBAÏDJAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "az",
                              :rdf/value    "Azərbaycan"},
   :lcc-cr/hasNumericRegionCode "031",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Azerbaijani,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "az",
                :rdf/value    "Azərbaycan"},
   :skos/definition "the country of Azerbaijan"})

(def BA
  "Alpha-2 country code for Bosnia and Herzegovina"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BosniaAndHerzegovina,
   :db/ident :lcc-3166-1/BA,
   :lcc-lr/hasTag "BA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BA",
   :skos/definition "Alpha-2 country code for Bosnia and Herzegovina"})

(def BB
  "Alpha-2 country code for Barbados"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Barbados,
   :db/ident :lcc-3166-1/BB,
   :lcc-lr/hasTag "BB",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BB",
   :skos/definition "Alpha-2 country code for Barbados"})

(def BD
  "Alpha-2 country code for Bangladesh"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bangladesh,
   :db/ident :lcc-3166-1/BD,
   :lcc-lr/hasTag "BD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BD",
   :skos/definition "Alpha-2 country code for Bangladesh"})

(def BDI
  "Alpha-3 country code for Burundi"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Burundi,
   :db/ident :lcc-3166-1/BDI,
   :lcc-lr/hasTag "BDI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BDI",
   :skos/definition "Alpha-3 country code for Burundi"})

(def BE
  "Alpha-2 country code for Belgium"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Belgium,
   :db/ident :lcc-3166-1/BE,
   :lcc-lr/hasTag "BE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BE",
   :skos/definition "Alpha-2 country code for Belgium"})

(def BEL
  "Alpha-3 country code for Belgium"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Belgium,
   :db/ident :lcc-3166-1/BEL,
   :lcc-lr/hasTag "BEL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BEL",
   :skos/definition "Alpha-3 country code for Belgium"})

(def BEN
  "Alpha-3 country code for Benin"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Benin,
   :db/ident :lcc-3166-1/BEN,
   :lcc-lr/hasTag "BEN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BEN",
   :skos/definition "Alpha-3 country code for Benin"})

(def BES
  "Alpha-3 country code for Bonaire, Sint Eustatius and Saba"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bonaire,
   :db/ident :lcc-3166-1/BES,
   :lcc-lr/hasTag "BES",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BES",
   :skos/definition
   "Alpha-3 country code for Bonaire, Sint Eustatius and Saba"})

(def BF
  "Alpha-2 country code for Burkina Faso"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BurkinaFaso,
   :db/ident :lcc-3166-1/BF,
   :lcc-lr/hasTag "BF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BF",
   :skos/definition "Alpha-2 country code for Burkina Faso"})

(def BFA
  "Alpha-3 country code for Burkina Faso"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BurkinaFaso,
   :db/ident :lcc-3166-1/BFA,
   :lcc-lr/hasTag "BFA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BFA",
   :skos/definition "Alpha-3 country code for Burkina Faso"})

(def BG
  "Alpha-2 country code for Bulgaria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bulgaria,
   :db/ident :lcc-3166-1/BG,
   :lcc-lr/hasTag "BG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BG",
   :skos/definition "Alpha-2 country code for Bulgaria"})

(def BGD
  "Alpha-3 country code for Bangladesh"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bangladesh,
   :db/ident :lcc-3166-1/BGD,
   :lcc-lr/hasTag "BGD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BGD",
   :skos/definition "Alpha-3 country code for Bangladesh"})

(def BGR
  "Alpha-3 country code for Bulgaria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bulgaria,
   :db/ident :lcc-3166-1/BGR,
   :lcc-lr/hasTag "BGR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BGR",
   :skos/definition "Alpha-3 country code for Bulgaria"})

(def BH
  "Alpha-2 country code for Bahrain"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bahrain,
   :db/ident :lcc-3166-1/BH,
   :lcc-lr/hasTag "BH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BH",
   :skos/definition "Alpha-2 country code for Bahrain"})

(def BHR
  "Alpha-3 country code for Bahrain"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bahrain,
   :db/ident :lcc-3166-1/BHR,
   :lcc-lr/hasTag "BHR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BHR",
   :skos/definition "Alpha-3 country code for Bahrain"})

(def BHS
  "Alpha-3 country code for Bahamas (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bahamas,
   :db/ident :lcc-3166-1/BHS,
   :lcc-lr/hasTag "BHS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BHS",
   :skos/definition "Alpha-3 country code for Bahamas (the)"})

(def BI
  "Alpha-2 country code for Burundi"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Burundi,
   :db/ident :lcc-3166-1/BI,
   :lcc-lr/hasTag "BI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BI",
   :skos/definition "Alpha-2 country code for Burundi"})

(def BIH
  "Alpha-3 country code for Bosnia and Herzegovina"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BosniaAndHerzegovina,
   :db/ident :lcc-3166-1/BIH,
   :lcc-lr/hasTag "BIH",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BIH",
   :skos/definition "Alpha-3 country code for Bosnia and Herzegovina"})

(def BJ
  "Alpha-2 country code for Benin"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Benin,
   :db/ident :lcc-3166-1/BJ,
   :lcc-lr/hasTag "BJ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BJ",
   :skos/definition "Alpha-2 country code for Benin"})

(def BL
  "Alpha-2 country code for Saint Barthélemy"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintBarthelemy,
   :db/ident :lcc-3166-1/BL,
   :lcc-lr/hasTag "BL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BL",
   :skos/definition "Alpha-2 country code for Saint Barthélemy"})

(def BLM
  "Alpha-3 country code for Saint Barthélemy"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintBarthelemy,
   :db/ident :lcc-3166-1/BLM,
   :lcc-lr/hasTag "BLM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BLM",
   :skos/definition "Alpha-3 country code for Saint Barthélemy"})

(def BLR
  "Alpha-3 country code for Belarus"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Belarus,
   :db/ident :lcc-3166-1/BLR,
   :lcc-lr/hasTag "BLR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BLR",
   :skos/definition "Alpha-3 country code for Belarus"})

(def BLZ
  "Alpha-3 country code for Belize"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Belize,
   :db/ident :lcc-3166-1/BLZ,
   :lcc-lr/hasTag "BLZ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BLZ",
   :skos/definition "Alpha-3 country code for Belize"})

(def BM
  "Alpha-2 country code for Bermuda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bermuda,
   :db/ident :lcc-3166-1/BM,
   :lcc-lr/hasTag "BM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BM",
   :skos/definition "Alpha-2 country code for Bermuda"})

(def BMU
  "Alpha-3 country code for Bermuda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bermuda,
   :db/ident :lcc-3166-1/BMU,
   :lcc-lr/hasTag "BMU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BMU",
   :skos/definition "Alpha-3 country code for Bermuda"})

(def BN
  "Alpha-2 country code for Brunei Darussalam"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BruneiDarussalam,
   :db/ident :lcc-3166-1/BN,
   :lcc-lr/hasTag "BN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BN",
   :skos/definition "Alpha-2 country code for Brunei Darussalam"})

(def BO
  "Alpha-2 country code for Bolivia (Plurinational State of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bolivia,
   :db/ident :lcc-3166-1/BO,
   :lcc-lr/hasTag "BO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BO",
   :skos/definition
   "Alpha-2 country code for Bolivia (Plurinational State of)"})

(def BOL
  "Alpha-3 country code for Bolivia (Plurinational State of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bolivia,
   :db/ident :lcc-3166-1/BOL,
   :lcc-lr/hasTag "BOL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BOL",
   :skos/definition
   "Alpha-3 country code for Bolivia (Plurinational State of)"})

(def BQ
  "Alpha-2 country code for Bonaire, Sint Eustatius and Saba"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bonaire,
   :db/ident :lcc-3166-1/BQ,
   :lcc-lr/hasTag "BQ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BQ",
   :skos/definition
   "Alpha-2 country code for Bonaire, Sint Eustatius and Saba"})

(def BR
  "Alpha-2 country code for Brazil"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Brazil,
   :db/ident :lcc-3166-1/BR,
   :lcc-lr/hasTag "BR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BR",
   :skos/definition "Alpha-2 country code for Brazil"})

(def BRA
  "Alpha-3 country code for Brazil"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Brazil,
   :db/ident :lcc-3166-1/BRA,
   :lcc-lr/hasTag "BRA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BRA",
   :skos/definition "Alpha-3 country code for Brazil"})

(def BRB
  "Alpha-3 country code for Barbados"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Barbados,
   :db/ident :lcc-3166-1/BRB,
   :lcc-lr/hasTag "BRB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BRB",
   :skos/definition "Alpha-3 country code for Barbados"})

(def BRN
  "Alpha-3 country code for Brunei Darussalam"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BruneiDarussalam,
   :db/ident :lcc-3166-1/BRN,
   :lcc-lr/hasTag "BRN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BRN",
   :skos/definition "Alpha-3 country code for Brunei Darussalam"})

(def BS
  "Alpha-2 country code for Bahamas (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bahamas,
   :db/ident :lcc-3166-1/BS,
   :lcc-lr/hasTag "BS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BS",
   :skos/definition "Alpha-2 country code for Bahamas (the)"})

(def BT
  "Alpha-2 country code for Bhutan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bhutan,
   :db/ident :lcc-3166-1/BT,
   :lcc-lr/hasTag "BT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BT",
   :skos/definition "Alpha-2 country code for Bhutan"})

(def BTN
  "Alpha-3 country code for Bhutan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Bhutan,
   :db/ident :lcc-3166-1/BTN,
   :lcc-lr/hasTag "BTN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BTN",
   :skos/definition "Alpha-3 country code for Bhutan"})

(def BV
  "Alpha-2 country code for Bouvet Island"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BouvetIsland,
   :db/ident :lcc-3166-1/BV,
   :lcc-lr/hasTag "BV",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BV",
   :skos/definition "Alpha-2 country code for Bouvet Island"})

(def BVT
  "Alpha-3 country code for Bouvet Island"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BouvetIsland,
   :db/ident :lcc-3166-1/BVT,
   :lcc-lr/hasTag "BVT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BVT",
   :skos/definition "Alpha-3 country code for Bouvet Island"})

(def BW
  "Alpha-2 country code for Botswana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Botswana,
   :db/ident :lcc-3166-1/BW,
   :lcc-lr/hasTag "BW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BW",
   :skos/definition "Alpha-2 country code for Botswana"})

(def BWA
  "Alpha-3 country code for Botswana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Botswana,
   :db/ident :lcc-3166-1/BWA,
   :lcc-lr/hasTag "BWA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BWA",
   :skos/definition "Alpha-3 country code for Botswana"})

(def BY
  "Alpha-2 country code for Belarus"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Belarus,
   :db/ident :lcc-3166-1/BY,
   :lcc-lr/hasTag "BY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BY",
   :skos/definition "Alpha-2 country code for Belarus"})

(def BZ
  "Alpha-2 country code for Belize"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Belize,
   :db/ident :lcc-3166-1/BZ,
   :lcc-lr/hasTag "BZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BZ",
   :skos/definition "Alpha-2 country code for Belize"})

(def Bahamas
  "the country of Bahamas (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bahamas,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Commonwealth of the Bahamas"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bahamas (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BAHAMAS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Commonwealth des Bahamas"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bahamas (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BAHAMAS"},
   :lcc-cr/hasNumericRegionCode "044",
   :lcc-cr/hasRemarks
   "The island of New Providence, where the capital Nassau is located, is administered directly by the national government.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bahamas (the)"},
   :skos/definition "the country of Bahamas (the)"})

(def Bahrain
  "the country of Bahrain"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bahrain,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Bahrain"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bahrain"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BAHRAIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Bahreïn"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bahreïn"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BAHREÏN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Baḩrayn"},
   :lcc-cr/hasNumericRegionCode "048",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Baḩrayn"},
   :skos/definition "the country of Bahrain"})

(def Bangladesh
  "the country of Bangladesh"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bangladesh,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the People's Republic of Bangladesh"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bangladesh"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BANGLADESH"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République populaire du Bangladesh"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bangladesh (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BANGLADESH"},
   :lcc-cr/hasLocalShortName {:rdf/language "bn",
                              :rdf/value    "Bāṁlādesh"},
   :lcc-cr/hasNumericRegionCode "050",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Bengali,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "bn",
                :rdf/value    "Bāṁlādesh"},
   :skos/definition "the country of Bangladesh"})

(def Barbados
  "the country of Barbados"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Barbados,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Barbados"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BARBADOS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Barbade (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BARBADE"},
   :lcc-cr/hasNumericRegionCode "052",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Barbados"},
   :skos/definition "the country of Barbados"})

(def Belarus
  "the country of Belarus"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Belarus,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Belarus"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Belarus"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BELARUS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Bélarus"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bélarus (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BÉLARUS"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ru",
                               :rdf/value    "Belarus'"}
                              {:rdf/language "be",
                               :rdf/value    "Bielaruś"}],
   :lcc-cr/hasNumericRegionCode "112",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Belarusian
                                       :lcc-639-1/Russian],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "Belarus'"}
                {:rdf/language "be",
                 :rdf/value    "Bielaruś"}],
   :skos/definition "the country of Belarus"})

(def Belgium
  "the country of Belgium"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Belgium,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Belgium"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Belgium"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BELGIUM"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Belgique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Belgique (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BELGIQUE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "de",
                               :rdf/value    "Belgien"}
                              {:rdf/language "nl",
                               :rdf/value    "België"}],
   :lcc-cr/hasNumericRegionCode "056",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/German :lcc-639-1/French :lcc-639-1/Dutch],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Belgien"}
                {:rdf/language "nl",
                 :rdf/value    "België"}
                {:rdf/language "fr",
                 :rdf/value    "Belgique (la)"}],
   :skos/definition "the country of Belgium"})

(def Belize
  "the country of Belize"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Belize,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Belize"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BELIZE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Belize (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BELIZE"},
   :lcc-cr/hasNumericRegionCode "084",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Belize"},
   :skos/definition "the country of Belize"})

(def Benin
  "the country of Benin"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Benin,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Benin"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Benin"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BENIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Bénin"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bénin (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BÉNIN"},
   :lcc-cr/hasNumericRegionCode "204",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Bénin (le)"},
   :skos/definition "the country of Benin"})

(def Bermuda
  "the country of Bermuda"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bermuda,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bermuda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BERMUDA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bermudes (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BERMUDES"},
   :lcc-cr/hasNumericRegionCode "060",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bermuda"},
   :skos/definition "the country of Bermuda"})

(def Bhutan
  "the country of Bhutan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bhutan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Bhutan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bhutan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BHUTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Bhoutan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bhoutan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BHOUTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "dz",
                              :rdf/value    "Druk-Yul"},
   :lcc-cr/hasNumericRegionCode "064",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dzongkha,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "dz",
                :rdf/value    "Druk-Yul"},
   :skos/definition "the country of Bhutan"})

(def Bolivia
  "the country of Bolivia (Plurinational State of)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bolivia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Plurinational State of Bolivia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Bolivia (Plurinational State of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "BOLIVIA (PLURINATIONAL STATE OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État plurinational de Bolivie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bolivie (État plurinational de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "BOLIVIE (ÉTAT PLURINATIONAL DE)"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Bolivia, Estado Plurinacional de"},
   :lcc-cr/hasNumericRegionCode "068",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Bolivia, Estado Plurinacional de"},
   :skos/definition "the country of Bolivia (Plurinational State of)"})

(def Bonaire
  "the country of Bonaire, Sint Eustatius and Saba"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bonaire,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Bonaire, Sint Eustatius and Saba"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "BONAIRE, SINT EUSTATIUS AND SABA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bonaire, Saint-Eustache et Saba"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "BONAIRE, SAINT-EUSTACHE ET SABA"},
   :lcc-cr/hasLocalShortName ["Boneiru, Sint Eustatius y Saba"
                              {:rdf/language "nl",
                               :rdf/value "Bonaire, Sint Eustatius en Saba"}],
   :lcc-cr/hasNumericRegionCode "535",
   :lcc-cr/hasRemarks ["Often referred to as Caribbean Netherlands."
                       "Included as a subdivision of the Netherlands (NL-BQ)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/English :lcc-639-2/Papiamento :lcc-639-1/Dutch],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Bonaire, Sint Eustatius and Saba"}
                {:rdf/language "nl",
                 :rdf/value    "Bonaire, Sint Eustatius en Saba"}],
   :skos/definition "the country of Bonaire, Sint Eustatius and Saba"})

(def BosniaAndHerzegovina
  "the country of Bosnia and Herzegovina"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bosnia and Herzegovina"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "BOSNIA AND HERZEGOVINA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bosnie-Herzégovine (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BOSNIE-HERZÉGOVINE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "sr",
                               :rdf/value    "Bosna i Hercegovina"}
                              {:rdf/language "hr",
                               :rdf/value    "Bosna i Hercegovina"}
                              {:rdf/language "bs",
                               :rdf/value    "Bosna i Hercegovina"}],
   :lcc-cr/hasNumericRegionCode "070",
   :lcc-cr/hasRemarks
   "Herzegovina * is the second significant part of composite country name.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Bosnian :lcc-639-1/Croatian :lcc-639-1/Serbian],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "sr",
                 :rdf/value    "Bosna i Hercegovina"}
                {:rdf/language "hr",
                 :rdf/value    "Bosna i Hercegovina"}
                {:rdf/language "bs",
                 :rdf/value    "Bosna i Hercegovina"}],
   :skos/definition "the country of Bosnia and Herzegovina"})

(def Botswana
  "the country of Botswana"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Botswana,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Botswana"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Botswana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BOTSWANA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Botswana"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Botswana (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BOTSWANA"},
   :lcc-cr/hasNumericRegionCode "072",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Botswana"},
   :skos/definition "the country of Botswana"})

(def BouvetIsland
  "the country of Bouvet Island"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/BouvetIsland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bouvet Island"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BOUVET ISLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bouvet (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BOUVET, ÎLE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "nn",
                               :rdf/value    "Bouvetøya"}
                              {:rdf/language "nb",
                               :rdf/value    "Bouvetøya"}],
   :lcc-cr/hasNumericRegionCode "074",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/NorwegianBokmal
                                       :lcc-639-1/NorwegianNynorsk],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "nn",
                 :rdf/value    "Bouvetøya"}
                {:rdf/language "nb",
                 :rdf/value    "Bouvetøya"}],
   :skos/definition "the country of Bouvet Island"})

(def Brazil
  "the country of Brazil"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Brazil,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Federative Republic of Brazil"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Brazil"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BRAZIL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérative du Brésil"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Brésil (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BRÉSIL"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Brasil (o)"},
   :lcc-cr/hasNumericRegionCode "076",
   :lcc-cr/hasRemarks
   "Includes: Fernando de Noronha Island, Martim Vaz Islands, Trindade Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Brasil (o)"},
   :skos/definition "the country of Brazil"})

(def BritishIndianOceanTerritory
  "the country of British Indian Ocean Territory (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "British Indian Ocean Territory (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "BRITISH INDIAN OCEAN TERRITORY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "le Territoire britannique de l'océan Indien"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Indien (le Territoire britannique de l'océan)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "OCÉAN INDIEN, TERRITOIRE BRITANNIQUE DE L'"},
   :lcc-cr/hasNumericRegionCode "086",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard."
    "Comprises: Chagos Archipelago (Principal island: Diego Garcia).\nNo subdivision reported"],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "British Indian Ocean Territory (the)"},
   :skos/definition "the country of British Indian Ocean Territory (the)"})

(def BruneiDarussalam
  "the country of Brunei Darussalam"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/BruneiDarussalam,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Brunei Darussalam"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BRUNEI DARUSSALAM"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Brunéi Darussalam (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BRUNEI DARUSSALAM"},
   :lcc-cr/hasLocalShortName {:rdf/language "ms",
                              :rdf/value    "Negara Brunei Darussalam"},
   :lcc-cr/hasNumericRegionCode "096",
   :lcc-cr/hasRemarks "Variant: Negara Brunei Darussalam.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Malay],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Brunei Darussalam"}
                {:rdf/language "ms",
                 :rdf/value    "Negara Brunei Darussalam"}],
   :skos/definition "the country of Brunei Darussalam"})

(def Bulgaria
  "the country of Bulgaria"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Bulgaria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Bulgaria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bulgaria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BULGARIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Bulgarie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bulgarie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BULGARIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "bg",
                              :rdf/value    "Bulgaria"},
   :lcc-cr/hasNumericRegionCode "100",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Bulgarian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "bg",
                :rdf/value    "Bulgaria"},
   :skos/definition "the country of Bulgaria"})

(def BurkinaFaso
  "the country of Burkina Faso"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/BurkinaFaso,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Burkina Faso"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BURKINA FASO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Burkina Faso"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Burkina Faso (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BURKINA FASO"},
   :lcc-cr/hasNumericRegionCode "854",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Burkina Faso (le)"},
   :skos/definition "the country of Burkina Faso"})

(def Burundi
  "the country of Burundi"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Burundi,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Burundi"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Burundi"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BURUNDI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Burundi"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Burundi (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BURUNDI"},
   :lcc-cr/hasLocalShortName {:rdf/language "rn",
                              :rdf/value    "Burundi"},
   :lcc-cr/hasNumericRegionCode "108",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/Rundi],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Burundi (le)"}
                {:rdf/language "rn",
                 :rdf/value    "Burundi"}],
   :skos/definition "the country of Burundi"})

(def CA
  "Alpha-2 country code for Canada"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Canada,
   :db/ident :lcc-3166-1/CA,
   :lcc-lr/hasTag "CA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CA",
   :skos/definition "Alpha-2 country code for Canada"})

(def CAF
  "Alpha-3 country code for Central African Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CentralAfricanRepublic,
   :db/ident :lcc-3166-1/CAF,
   :lcc-lr/hasTag "CAF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CAF",
   :skos/definition "Alpha-3 country code for Central African Republic (the)"})

(def CAN
  "Alpha-3 country code for Canada"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Canada,
   :db/ident :lcc-3166-1/CAN,
   :lcc-lr/hasTag "CAN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CAN",
   :skos/definition "Alpha-3 country code for Canada"})

(def CC
  "Alpha-2 country code for Cocos Keeling Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CocosKeelingIslands,
   :db/ident :lcc-3166-1/CC,
   :lcc-lr/hasTag "CC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CC",
   :skos/definition "Alpha-2 country code for Cocos Keeling Islands"})

(def CCK
  "Alpha-3 country code for Cocos Keeling Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CocosKeelingIslands,
   :db/ident :lcc-3166-1/CCK,
   :lcc-lr/hasTag "CCK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CCK",
   :skos/definition "Alpha-3 country code for Cocos Keeling Islands"})

(def CD
  "Alpha-2 country code for Congo Democratic Republic Of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CongoDemocraticRepublicOf,
   :db/ident :lcc-3166-1/CD,
   :lcc-lr/hasTag "CD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CD",
   :skos/definition "Alpha-2 country code for Congo Democratic Republic Of"})

(def CF
  "Alpha-2 country code for Central African Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CentralAfricanRepublic,
   :db/ident :lcc-3166-1/CF,
   :lcc-lr/hasTag "CF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CF",
   :skos/definition "Alpha-2 country code for Central African Republic (the)"})

(def CG
  "Alpha-2 country code for Congo (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Congo,
   :db/ident :lcc-3166-1/CG,
   :lcc-lr/hasTag "CG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CG",
   :skos/definition "Alpha-2 country code for Congo (the)"})

(def CH
  "Alpha-2 country code for Switzerland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Switzerland,
   :db/ident :lcc-3166-1/CH,
   :lcc-lr/hasTag "CH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CH",
   :skos/definition "Alpha-2 country code for Switzerland"})

(def CHE
  "Alpha-3 country code for Switzerland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Switzerland,
   :db/ident :lcc-3166-1/CHE,
   :lcc-lr/hasTag "CHE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CHE",
   :skos/definition "Alpha-3 country code for Switzerland"})

(def CHL
  "Alpha-3 country code for Chile"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Chile,
   :db/ident :lcc-3166-1/CHL,
   :lcc-lr/hasTag "CHL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CHL",
   :skos/definition "Alpha-3 country code for Chile"})

(def CHN
  "Alpha-3 country code for China"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/China,
   :db/ident :lcc-3166-1/CHN,
   :lcc-lr/hasTag "CHN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CHN",
   :skos/definition "Alpha-3 country code for China"})

(def CI
  "Alpha-2 country code for Cote d'Ivoire"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CoteDIvoire,
   :db/ident :lcc-3166-1/CI,
   :lcc-lr/hasTag "CI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CI",
   :skos/definition "Alpha-2 country code for Cote d'Ivoire"})

(def CIV
  "Alpha-3 country code for Cote d'Ivoire"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CoteDIvoire,
   :db/ident :lcc-3166-1/CIV,
   :lcc-lr/hasTag "CIV",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CIV",
   :skos/definition "Alpha-3 country code for Cote d'Ivoire"})

(def CK
  "Alpha-2 country code for Cook Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CookIslands,
   :db/ident :lcc-3166-1/CK,
   :lcc-lr/hasTag "CK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CK",
   :skos/definition "Alpha-2 country code for Cook Islands (the)"})

(def CL
  "Alpha-2 country code for Chile"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Chile,
   :db/ident :lcc-3166-1/CL,
   :lcc-lr/hasTag "CL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CL",
   :skos/definition "Alpha-2 country code for Chile"})

(def CM
  "Alpha-2 country code for Cameroon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cameroon,
   :db/ident :lcc-3166-1/CM,
   :lcc-lr/hasTag "CM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CM",
   :skos/definition "Alpha-2 country code for Cameroon"})

(def CMR
  "Alpha-3 country code for Cameroon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cameroon,
   :db/ident :lcc-3166-1/CMR,
   :lcc-lr/hasTag "CMR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CMR",
   :skos/definition "Alpha-3 country code for Cameroon"})

(def CN
  "Alpha-2 country code for China"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/China,
   :db/ident :lcc-3166-1/CN,
   :lcc-lr/hasTag "CN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CN",
   :skos/definition "Alpha-2 country code for China"})

(def CO
  "Alpha-2 country code for Colombia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Colombia,
   :db/ident :lcc-3166-1/CO,
   :lcc-lr/hasTag "CO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CO",
   :skos/definition "Alpha-2 country code for Colombia"})

(def COD
  "Alpha-3 country code for Congo Democratic Republic Of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CongoDemocraticRepublicOf,
   :db/ident :lcc-3166-1/COD,
   :lcc-lr/hasTag "COD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COD",
   :skos/definition "Alpha-3 country code for Congo Democratic Republic Of"})

(def COG
  "Alpha-3 country code for Congo (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Congo,
   :db/ident :lcc-3166-1/COG,
   :lcc-lr/hasTag "COG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COG",
   :skos/definition "Alpha-3 country code for Congo (the)"})

(def COK
  "Alpha-3 country code for Cook Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CookIslands,
   :db/ident :lcc-3166-1/COK,
   :lcc-lr/hasTag "COK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COK",
   :skos/definition "Alpha-3 country code for Cook Islands (the)"})

(def COL
  "Alpha-3 country code for Colombia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Colombia,
   :db/ident :lcc-3166-1/COL,
   :lcc-lr/hasTag "COL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COL",
   :skos/definition "Alpha-3 country code for Colombia"})

(def COM
  "Alpha-3 country code for Comoros (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Comoros,
   :db/ident :lcc-3166-1/COM,
   :lcc-lr/hasTag "COM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COM",
   :skos/definition "Alpha-3 country code for Comoros (the)"})

(def CPV
  "Alpha-3 country code for Cabo Verde"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CaboVerde,
   :db/ident :lcc-3166-1/CPV,
   :lcc-lr/hasTag "CPV",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CPV",
   :skos/definition "Alpha-3 country code for Cabo Verde"})

(def CR
  "Alpha-2 country code for Costa Rica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CostaRica,
   :db/ident :lcc-3166-1/CR,
   :lcc-lr/hasTag "CR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CR",
   :skos/definition "Alpha-2 country code for Costa Rica"})

(def CRI
  "Alpha-3 country code for Costa Rica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CostaRica,
   :db/ident :lcc-3166-1/CRI,
   :lcc-lr/hasTag "CRI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CRI",
   :skos/definition "Alpha-3 country code for Costa Rica"})

(def CU
  "Alpha-2 country code for Cuba"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cuba,
   :db/ident :lcc-3166-1/CU,
   :lcc-lr/hasTag "CU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CU",
   :skos/definition "Alpha-2 country code for Cuba"})

(def CUB
  "Alpha-3 country code for Cuba"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cuba,
   :db/ident :lcc-3166-1/CUB,
   :lcc-lr/hasTag "CUB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CUB",
   :skos/definition "Alpha-3 country code for Cuba"})

(def CUW
  "Alpha-3 country code for Curaçao"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Curacao,
   :db/ident :lcc-3166-1/CUW,
   :lcc-lr/hasTag "CUW",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CUW",
   :skos/definition "Alpha-3 country code for Curaçao"})

(def CV
  "Alpha-2 country code for Cabo Verde"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CaboVerde,
   :db/ident :lcc-3166-1/CV,
   :lcc-lr/hasTag "CV",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CV",
   :skos/definition "Alpha-2 country code for Cabo Verde"})

(def CW
  "Alpha-2 country code for Curaçao"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Curacao,
   :db/ident :lcc-3166-1/CW,
   :lcc-lr/hasTag "CW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CW",
   :skos/definition "Alpha-2 country code for Curaçao"})

(def CX
  "Alpha-2 country code for Christmas Island"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/ChristmasIsland,
   :db/ident :lcc-3166-1/CX,
   :lcc-lr/hasTag "CX",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CX",
   :skos/definition "Alpha-2 country code for Christmas Island"})

(def CXR
  "Alpha-3 country code for Christmas Island"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/ChristmasIsland,
   :db/ident :lcc-3166-1/CXR,
   :lcc-lr/hasTag "CXR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CXR",
   :skos/definition "Alpha-3 country code for Christmas Island"})

(def CY
  "Alpha-2 country code for Cyprus"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cyprus,
   :db/ident :lcc-3166-1/CY,
   :lcc-lr/hasTag "CY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CY",
   :skos/definition "Alpha-2 country code for Cyprus"})

(def CYM
  "Alpha-3 country code for Cayman Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CaymanIslands,
   :db/ident :lcc-3166-1/CYM,
   :lcc-lr/hasTag "CYM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CYM",
   :skos/definition "Alpha-3 country code for Cayman Islands (the)"})

(def CYP
  "Alpha-3 country code for Cyprus"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cyprus,
   :db/ident :lcc-3166-1/CYP,
   :lcc-lr/hasTag "CYP",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CYP",
   :skos/definition "Alpha-3 country code for Cyprus"})

(def CZ
  "Alpha-2 country code for Czechia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Czechia,
   :db/ident :lcc-3166-1/CZ,
   :lcc-lr/hasTag "CZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CZ",
   :skos/definition "Alpha-2 country code for Czechia"})

(def CZE
  "Alpha-3 country code for Czechia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Czechia,
   :db/ident :lcc-3166-1/CZE,
   :lcc-lr/hasTag "CZE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CZE",
   :skos/definition "Alpha-3 country code for Czechia"})

(def CaboVerde
  "the country of Cabo Verde"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CaboVerde,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cabo Verde"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cabo Verde"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CABO VERDE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Cabo Verde"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cabo Verde"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CABO VERDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Cabo Verde"},
   :lcc-cr/hasNumericRegionCode "132",
   :lcc-cr/hasRemarks "Principal islands: São Tiago, São Vicente.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Cabo Verde"},
   :skos/definition "the country of Cabo Verde"})

(def Cambodia
  "the country of Cambodia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Cambodia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Cambodia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cambodia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CAMBODIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Cambodge"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cambodge (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CAMBODGE"},
   :lcc-cr/hasLocalShortName {:rdf/language "km",
                              :rdf/value    "Kâmpŭchéa"},
   :lcc-cr/hasNumericRegionCode "116",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/CentralKhmer,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "km",
                :rdf/value    "Kâmpŭchéa"},
   :skos/definition "the country of Cambodia"})

(def Cameroon
  "the country of Cameroon"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Cameroon,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cameroon"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cameroon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CAMEROON"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Cameroun"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cameroun (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CAMEROUN"},
   :lcc-cr/hasNumericRegionCode "120",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Cameroon"}
                {:rdf/language "fr",
                 :rdf/value    "Cameroun (le)"}],
   :skos/definition "the country of Cameroon"})

(def Canada
  "the country of Canada"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Canada,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Canada"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CANADA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Canada (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CANADA"},
   :lcc-cr/hasNumericRegionCode "124",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/French],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Canada"}
                {:rdf/language "fr",
                 :rdf/value    "Canada (le)"}],
   :skos/definition "the country of Canada"})

(def CaymanIslands
  "the country of Cayman Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CaymanIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cayman Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CAYMAN ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Caïmans (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CAÏMANS, ÎLES"},
   :lcc-cr/hasNumericRegionCode "136",
   :lcc-cr/hasRemarks ["No subdivisions relevant for this standard."
                       "Principal island: Grand Cayman."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cayman Islands (the)"},
   :skos/definition "the country of Cayman Islands (the)"})

(def CentralAfricanRepublic
  "the country of Central African Republic (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CentralAfricanRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Central African Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Central African Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "CENTRAL AFRICAN REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République centrafricaine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "République centrafricaine (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "CENTRAFRICAINE, RÉPUBLIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sg",
                              :rdf/value    "Ködörösêse tî Bêafrîka"},
   :lcc-cr/hasNumericRegionCode "140",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/Sango],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "République centrafricaine (la)"}
                {:rdf/language "sg",
                 :rdf/value    "Ködörösêse tî Bêafrîka"}],
   :skos/definition "the country of Central African Republic (the)"})

(def Chad
  "the country of Chad"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Chad,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Chad"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Chad"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHAD"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Tchad"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tchad (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TCHAD"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Tshād"},
   :lcc-cr/hasNumericRegionCode "148",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Arabic :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Tchad (le)"}
                {:rdf/language "ar",
                 :rdf/value    "Tshād"}],
   :skos/definition "the country of Chad"})

(def Chile
  "the country of Chile"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Chile,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Chile"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Chile"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHILE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Chili"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Chili (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHILI"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Chile"},
   :lcc-cr/hasNumericRegionCode "152",
   :lcc-cr/hasRemarks
   "Includes: Easter Island, Juan Fernández Islands, Sala y Gómez Island, San Ambrosio Island, San Félix Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Chile"},
   :skos/definition "the country of Chile"})

(def China
  "the country of China"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/China,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the People's Republic of China"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "China"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHINA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République populaire de Chine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Chine (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "zh",
                              :rdf/value    "Zhongguo"},
   :lcc-cr/hasNumericRegionCode "156",
   :lcc-cr/hasRemarks "See also TAIWAN, PROVINCE OF CHINA.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Chinese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "zh",
                :rdf/value    "Zhongguo"},
   :skos/definition "the country of China"})

(def ChristmasIsland
  "the country of Christmas Island"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/ChristmasIsland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Christmas Island"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHRISTMAS ISLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Christmas (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHRISTMAS, ÎLE"},
   :lcc-cr/hasNumericRegionCode "162",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Christmas Island"},
   :skos/definition "the country of Christmas Island"})

(def CocosKeelingIslands
  "the country of Cocos Keeling Islands"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CocosKeelingIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cocos (Keeling) Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "COCOS (KEELING) ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Cocos (les Îles)/ Keeling (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COCOS (KEELING), ÎLES"},
   :lcc-cr/hasNumericRegionCode "166",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cocos (Keeling) Islands (the)"},
   :skos/definition "the country of Cocos Keeling Islands"})

(def Colombia
  "the country of Colombia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Colombia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Colombia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Colombia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COLOMBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Colombie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Colombie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COLOMBIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Colombia"},
   :lcc-cr/hasNumericRegionCode "170",
   :lcc-cr/hasRemarks
   "Includes: Malpelo Island, San Andrés y Providencia Islands.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Colombia"},
   :skos/definition "the country of Colombia"})

(def Comoros
  "the country of Comoros (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Comoros,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Union of the Comoros"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Comoros (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COMOROS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'Union des Comores"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Comores (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COMORES"},
   :lcc-cr/hasLocalShortName ["Komori"
                              {:rdf/language "ar",
                               :rdf/value    "Al Qamar"}],
   :lcc-cr/hasNumericRegionCode "174",
   :lcc-cr/hasRemarks
   ["Comprises: Anjouan, Grande Comore, Mohéli. \nThe language code \"002\" refers to the administrative language \"Shikomor\" that has not been assigned an ISO 639 language code."
    "The language code \"002\" refers to the administrative language \"Shikomor\" that has not been assigned an ISO 639 language code."],
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-3166-1/Shikomor :lcc-639-1/French :lcc-639-1/Arabic],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Comores (les)"}
                {:rdf/language "ar",
                 :rdf/value    "Al Qamar"}],
   :skos/definition "the country of Comoros (the)"})

(def Congo
  "the country of Congo (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Congo,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Congo"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Congo (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CONGO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Congo"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Congo (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CONGO"},
   :lcc-cr/hasNumericRegionCode "178",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Congo (le)"},
   :skos/definition "the country of Congo (the)"})

(def CongoDemocraticRepublicOf
  "the country of Congo Democratic Republic Of"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Democratic Republic of the Congo"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Congo (the Democratic Republic of the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "CONGO, DEMOCRATIC REPUBLIC OF THE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République démocratique du Congo"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Congo (la République démocratique du)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "CONGO, RÉPUBLIQUE DÉMOCRATIQUE DU"},
   :lcc-cr/hasNumericRegionCode "180",
   :lcc-cr/hasRemarks ["Remark: Ex Zaire/Zaïre, change of name 1997-05-17"
                       "Previous entry: ZAIRE."],
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Congo (la République démocratique du)"},
   :skos/definition "the country of Congo Democratic Republic Of"})

(def CookIslands
  "the country of Cook Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CookIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cook Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COOK ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cook (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COOK, ÎLES"},
   :lcc-cr/hasNumericRegionCode "184",
   :lcc-cr/hasRemarks ["No subdivisions relevant for this standard."
                       "Principal island: Rarotonga."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cook Islands (the)"},
   :skos/definition "the country of Cook Islands (the)"})

(def CostaRica
  "the country of Costa Rica"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CostaRica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Costa Rica"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Costa Rica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COSTA RICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Costa Rica"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Costa Rica (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COSTA RICA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Costa Rica"},
   :lcc-cr/hasNumericRegionCode "188",
   :lcc-cr/hasRemarks "Includes: Coco Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Costa Rica"},
   :skos/definition "the country of Costa Rica"})

(def CoteDIvoire
  "the country of Cote d'Ivoire"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/CoteDIvoire,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cote d'Ivoire"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cote d'Ivoire"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COTE D'IVOIRE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Republic de Côte d'Ivoire"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Côte d'Ivoire (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CÔTE D'IVOIRE"},
   :lcc-cr/hasNumericRegionCode "384",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Côte d'Ivoire (la)"},
   :skos/definition "the country of Cote d'Ivoire"})

(def Country
  "the kind of region that is a country"
  {:db/ident :lcc-3166-1/Country,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "Country",
   :skos/definition "the kind of region that is a country"})

(def Croatia
  "the country of Croatia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Croatia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Croatia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Croatia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CROATIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Croatie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Croatie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CROATIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hr",
                              :rdf/value    "Hrvatska"},
   :lcc-cr/hasNumericRegionCode "191",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Croatian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "hr",
                :rdf/value    "Hrvatska"},
   :skos/definition "the country of Croatia"})

(def Cuba
  "the country of Cuba"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Cuba,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cuba"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cuba"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CUBA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Cuba"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cuba"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CUBA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Cuba"},
   :lcc-cr/hasNumericRegionCode "192",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Cuba"},
   :skos/definition "the country of Cuba"})

(def Curacao
  "the country of Curaçao"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Curacao,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Curaçao"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CURAÇAO"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Curaçao"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CURAÇAO"},
   :lcc-cr/hasLocalShortName [{:rdf/language "pap",
                               :rdf/value    "Kòrsou"}
                              {:rdf/language "nl",
                               :rdf/value    "Curaçao"}],
   :lcc-cr/hasNumericRegionCode "531",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-CW).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Dutch :lcc-639-2/Papiamento :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "Curaçao"}
                {:rdf/language "en",
                 :rdf/value    "Curaçao"}],
   :skos/definition "the country of Curaçao"})

(def Cyprus
  "the country of Cyprus"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Cyprus,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cyprus"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cyprus"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CYPRUS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Chypre"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Chypre"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHYPRE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "el",
                               :rdf/value    "Kýpros"}
                              {:rdf/language "tr",
                               :rdf/value    "Kıbrıs"}],
   :lcc-cr/hasNumericRegionCode "196",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/ModernGreek
                                       :lcc-639-1/Turkish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "el",
                 :rdf/value    "Kýpros"}
                {:rdf/language "tr",
                 :rdf/value    "Kıbrıs"}],
   :skos/definition "the country of Cyprus"})

(def CzechRepublic
  {:db/ident :lcc-3166-1/CzechRepublic,
   :owl/sameAs :lcc-3166-1/Czechia,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/note "CzechRepublic is supported as legacy identifier for Czechia"})

(def Czechia
  "the country of Czechia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Czechia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Czech Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Czechia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CZECHIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République tchèque"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tchéquie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TCHÉQUIE (LA)"},
   :lcc-cr/hasLocalShortName {:rdf/language "cs",
                              :rdf/value    "Česko"},
   :lcc-cr/hasNumericRegionCode "203",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Czech,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "cs",
                :rdf/value    "Česko"},
   :skos/definition "the country of Czechia"})

(def DE
  "Alpha-2 country code for Germany"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Germany,
   :db/ident :lcc-3166-1/DE,
   :lcc-lr/hasTag "DE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DE",
   :skos/definition "Alpha-2 country code for Germany"})

(def DEU
  "Alpha-3 country code for Germany"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Germany,
   :db/ident :lcc-3166-1/DEU,
   :lcc-lr/hasTag "DEU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DEU",
   :skos/definition "Alpha-3 country code for Germany"})

(def DJ
  "Alpha-2 country code for Djibouti"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Djibouti,
   :db/ident :lcc-3166-1/DJ,
   :lcc-lr/hasTag "DJ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DJ",
   :skos/definition "Alpha-2 country code for Djibouti"})

(def DJI
  "Alpha-3 country code for Djibouti"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Djibouti,
   :db/ident :lcc-3166-1/DJI,
   :lcc-lr/hasTag "DJI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DJI",
   :skos/definition "Alpha-3 country code for Djibouti"})

(def DK
  "Alpha-2 country code for Denmark"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Denmark,
   :db/ident :lcc-3166-1/DK,
   :lcc-lr/hasTag "DK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DK",
   :skos/definition "Alpha-2 country code for Denmark"})

(def DM
  "Alpha-2 country code for Dominica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Dominica,
   :db/ident :lcc-3166-1/DM,
   :lcc-lr/hasTag "DM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DM",
   :skos/definition "Alpha-2 country code for Dominica"})

(def DMA
  "Alpha-3 country code for Dominica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Dominica,
   :db/ident :lcc-3166-1/DMA,
   :lcc-lr/hasTag "DMA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DMA",
   :skos/definition "Alpha-3 country code for Dominica"})

(def DNK
  "Alpha-3 country code for Denmark"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Denmark,
   :db/ident :lcc-3166-1/DNK,
   :lcc-lr/hasTag "DNK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DNK",
   :skos/definition "Alpha-3 country code for Denmark"})

(def DO
  "Alpha-2 country code for Dominican Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/DominicanRepublic,
   :db/ident :lcc-3166-1/DO,
   :lcc-lr/hasTag "DO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DO",
   :skos/definition "Alpha-2 country code for Dominican Republic (the)"})

(def DOM
  "Alpha-3 country code for Dominican Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/DominicanRepublic,
   :db/ident :lcc-3166-1/DOM,
   :lcc-lr/hasTag "DOM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DOM",
   :skos/definition "Alpha-3 country code for Dominican Republic (the)"})

(def DZ
  "Alpha-2 country code for Algeria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Algeria,
   :db/ident :lcc-3166-1/DZ,
   :lcc-lr/hasTag "DZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DZ",
   :skos/definition "Alpha-2 country code for Algeria"})

(def DZA
  "Alpha-3 country code for Algeria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Algeria,
   :db/ident :lcc-3166-1/DZA,
   :lcc-lr/hasTag "DZA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DZA",
   :skos/definition "Alpha-3 country code for Algeria"})

(def Denmark
  "the country of Denmark"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Denmark,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Denmark"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Denmark"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DENMARK"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Danemark"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Danemark (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "DANEMARK"},
   :lcc-cr/hasLocalShortName {:rdf/language "da",
                              :rdf/value    "Danmark"},
   :lcc-cr/hasNumericRegionCode "208",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Danish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "da",
                :rdf/value    "Danmark"},
   :skos/definition "the country of Denmark"})

(def Djibouti
  "the country of Djibouti"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Djibouti,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Djibouti"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Djibouti"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DJIBOUTI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Djibouti"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Djibouti"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "DJIBOUTI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Jībūtī"},
   :lcc-cr/hasNumericRegionCode "262",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Arabic :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Djibouti"}
                {:rdf/language "ar",
                 :rdf/value    "Jībūtī"}],
   :skos/definition "the country of Djibouti"})

(def Dominica
  "the country of Dominica"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Dominica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Commonwealth of Dominica"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Dominica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DOMINICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Commonwealth de Dominique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Dominique (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "DOMINIQUE"},
   :lcc-cr/hasNumericRegionCode "212",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dominica"},
   :skos/definition "the country of Dominica"})

(def DominicanRepublic
  "the country of Dominican Republic (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/DominicanRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Dominican Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Dominican Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DOMINICAN REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République dominicaine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "dominicaine (la République)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "DOMINICAINE, RÉPUBLIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "República Dominicana (la)"},
   :lcc-cr/hasNumericRegionCode "214",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "República Dominicana (la)"},
   :skos/definition "the country of Dominican Republic (the)"})

(def EC
  "Alpha-2 country code for Ecuador"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ecuador,
   :db/ident :lcc-3166-1/EC,
   :lcc-lr/hasTag "EC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EC",
   :skos/definition "Alpha-2 country code for Ecuador"})

(def ECU
  "Alpha-3 country code for Ecuador"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ecuador,
   :db/ident :lcc-3166-1/ECU,
   :lcc-lr/hasTag "ECU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ECU",
   :skos/definition "Alpha-3 country code for Ecuador"})

(def EE
  "Alpha-2 country code for Estonia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Estonia,
   :db/ident :lcc-3166-1/EE,
   :lcc-lr/hasTag "EE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EE",
   :skos/definition "Alpha-2 country code for Estonia"})

(def EG
  "Alpha-2 country code for Egypt"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Egypt,
   :db/ident :lcc-3166-1/EG,
   :lcc-lr/hasTag "EG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EG",
   :skos/definition "Alpha-2 country code for Egypt"})

(def EGY
  "Alpha-3 country code for Egypt"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Egypt,
   :db/ident :lcc-3166-1/EGY,
   :lcc-lr/hasTag "EGY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EGY",
   :skos/definition "Alpha-3 country code for Egypt"})

(def EH
  "Alpha-2 country code for Western Sahara*"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/WesternSahara,
   :db/ident :lcc-3166-1/EH,
   :lcc-lr/hasTag "EH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EH",
   :skos/definition "Alpha-2 country code for Western Sahara*"})

(def ER
  "Alpha-2 country code for Eritrea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Eritrea,
   :db/ident :lcc-3166-1/ER,
   :lcc-lr/hasTag "ER",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ER",
   :skos/definition "Alpha-2 country code for Eritrea"})

(def ERI
  "Alpha-3 country code for Eritrea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Eritrea,
   :db/ident :lcc-3166-1/ERI,
   :lcc-lr/hasTag "ERI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ERI",
   :skos/definition "Alpha-3 country code for Eritrea"})

(def ES
  "Alpha-2 country code for Spain"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Spain,
   :db/ident :lcc-3166-1/ES,
   :lcc-lr/hasTag "ES",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ES",
   :skos/definition "Alpha-2 country code for Spain"})

(def ESH
  "Alpha-3 country code for Western Sahara*"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/WesternSahara,
   :db/ident :lcc-3166-1/ESH,
   :lcc-lr/hasTag "ESH",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ESH",
   :skos/definition "Alpha-3 country code for Western Sahara*"})

(def ESP
  "Alpha-3 country code for Spain"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Spain,
   :db/ident :lcc-3166-1/ESP,
   :lcc-lr/hasTag "ESP",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ESP",
   :skos/definition "Alpha-3 country code for Spain"})

(def EST
  "Alpha-3 country code for Estonia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Estonia,
   :db/ident :lcc-3166-1/EST,
   :lcc-lr/hasTag "EST",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EST",
   :skos/definition "Alpha-3 country code for Estonia"})

(def ET
  "Alpha-2 country code for Ethiopia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ethiopia,
   :db/ident :lcc-3166-1/ET,
   :lcc-lr/hasTag "ET",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ET",
   :skos/definition "Alpha-2 country code for Ethiopia"})

(def ETH
  "Alpha-3 country code for Ethiopia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ethiopia,
   :db/ident :lcc-3166-1/ETH,
   :lcc-lr/hasTag "ETH",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ETH",
   :skos/definition "Alpha-3 country code for Ethiopia"})

(def Ecuador
  "the country of Ecuador"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Ecuador,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Ecuador"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ecuador"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ECUADOR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Équateur"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Équateur (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉQUATEUR"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Ecuador (el)"},
   :lcc-cr/hasNumericRegionCode "218",
   :lcc-cr/hasRemarks "Includes: Galápagos Islands.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Ecuador (el)"},
   :skos/definition "the country of Ecuador"})

(def Egypt
  "the country of Egypt"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Egypt,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Arab Republic of Egypt"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Egypt"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "EGYPT"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République arabe d'Égypte"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Égypte (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉGYPTE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Mişr"},
   :lcc-cr/hasNumericRegionCode "818",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Mişr"},
   :skos/definition "the country of Egypt"})

(def ElSalvador
  "the country of El Salvador"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/ElSalvador,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of El Salvador"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "El Salvador"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "EL SALVADOR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'El Salvador"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "El Salvador"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "EL SALVADOR"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "El Salvador"},
   :lcc-cr/hasNumericRegionCode "222",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "El Salvador"},
   :skos/definition "the country of El Salvador"})

(def EquatorialGuinea
  "the country of Equatorial Guinea"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/EquatorialGuinea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Republic of Equatorial Guinea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Equatorial Guinea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "EQUATORIAL GUINEA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de Guinée équatoriale"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guinée équatoriale (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUINÉE ÉQUATORIALE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "pt",
                               :rdf/value    "Guiné Equatorial (a)"}
                              {:rdf/language "es",
                               :rdf/value    "Guinea Ecuatorial"}],
   :lcc-cr/hasNumericRegionCode "226",
   :lcc-cr/hasRemarks
   "Comprises: Annobón Island, Bioko Island, the Continental Region (Rio Muni).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Spanish :lcc-639-1/Portuguese :lcc-639-1/French],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Guinea Ecuatorial"}
                {:rdf/language "fr",
                 :rdf/value    "Guinée équatoriale (la)"}
                {:rdf/language "pt",
                 :rdf/value    "Guiné Equatorial (a)"}],
   :skos/definition "the country of Equatorial Guinea"})

(def Eritrea
  "the country of Eritrea"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Eritrea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Eritrea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eritrea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ERITREA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État d'Érythrée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Érythrée (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉRYTHRÉE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ar",
                               :rdf/value    "Irītrīyā"}
                              {:rdf/language "ti",
                               :rdf/value    "Iertra"}],
   :lcc-cr/hasNumericRegionCode "232",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Tigrinya :lcc-639-1/English :lcc-639-1/Arabic],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ti",
                 :rdf/value    "Iertra"}
                {:rdf/language "ar",
                 :rdf/value    "Irītrīyā"}
                {:rdf/language "en",
                 :rdf/value    "Eritrea"}],
   :skos/definition "the country of Eritrea"})

(def Estonia
  "the country of Estonia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Estonia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Estonia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Estonia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ESTONIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Estonie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Estonie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ESTONIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "et",
                              :rdf/value    "Eesti"},
   :lcc-cr/hasNumericRegionCode "233",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Estonian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "et",
                :rdf/value    "Eesti"},
   :skos/definition "the country of Estonia"})

(def Eswatini
  "the country of Eswatini"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Eswatini,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Eswatini"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eswatini"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ESWATINI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume d’Eswatini"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Eswatini (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ESWATINI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ss",
                              :rdf/value    "eSwatini"},
   :lcc-cr/hasNumericRegionCode "748",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Swati :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ss",
                 :rdf/value    "eSwatini"}
                {:rdf/language "en",
                 :rdf/value    "Eswatini"}],
   :skos/definition "the country of Eswatini"})

(def Ethiopia
  "the country of Ethiopia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Ethiopia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Federal Democratic Republic of Ethiopia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ethiopia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ETHIOPIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République fédérale démocratique d'Éthiopie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Éthiopie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉTHIOPIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "am",
                              :rdf/value    "Ītyop'iya"},
   :lcc-cr/hasNumericRegionCode "231",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Amharic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "am",
                :rdf/value    "Ītyop'iya"},
   :skos/definition "the country of Ethiopia"})

(def FI
  "Alpha-2 country code for Finland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Finland,
   :db/ident :lcc-3166-1/FI,
   :lcc-lr/hasTag "FI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FI",
   :skos/definition "Alpha-2 country code for Finland"})

(def FIN
  "Alpha-3 country code for Finland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Finland,
   :db/ident :lcc-3166-1/FIN,
   :lcc-lr/hasTag "FIN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FIN",
   :skos/definition "Alpha-3 country code for Finland"})

(def FJ
  "Alpha-2 country code for Fiji"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Fiji,
   :db/ident :lcc-3166-1/FJ,
   :lcc-lr/hasTag "FJ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FJ",
   :skos/definition "Alpha-2 country code for Fiji"})

(def FJI
  "Alpha-3 country code for Fiji"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Fiji,
   :db/ident :lcc-3166-1/FJI,
   :lcc-lr/hasTag "FJI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FJI",
   :skos/definition "Alpha-3 country code for Fiji"})

(def FK
  "Alpha-2 country code for Falkland Islands (the) [Malvinas]"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FalklandIslands,
   :db/ident :lcc-3166-1/FK,
   :lcc-lr/hasTag "FK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FK",
   :skos/definition
   "Alpha-2 country code for Falkland Islands (the) [Malvinas]"})

(def FLK
  "Alpha-3 country code for Falkland Islands (the) [Malvinas]"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FalklandIslands,
   :db/ident :lcc-3166-1/FLK,
   :lcc-lr/hasTag "FLK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FLK",
   :skos/definition
   "Alpha-3 country code for Falkland Islands (the) [Malvinas]"})

(def FM
  "Alpha-2 country code for Micronesia (Federated States of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Micronesia,
   :db/ident :lcc-3166-1/FM,
   :lcc-lr/hasTag "FM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FM",
   :skos/definition
   "Alpha-2 country code for Micronesia (Federated States of)"})

(def FO
  "Alpha-2 country code for Faroe Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FaroeIslands,
   :db/ident :lcc-3166-1/FO,
   :lcc-lr/hasTag "FO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FO",
   :skos/definition "Alpha-2 country code for Faroe Islands (the)"})

(def FR
  "Alpha-2 country code for France"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/France,
   :db/ident :lcc-3166-1/FR,
   :lcc-lr/hasTag "FR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FR",
   :skos/definition "Alpha-2 country code for France"})

(def FRA
  "Alpha-3 country code for France"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/France,
   :db/ident :lcc-3166-1/FRA,
   :lcc-lr/hasTag "FRA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FRA",
   :skos/definition "Alpha-3 country code for France"})

(def FRO
  "Alpha-3 country code for Faroe Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FaroeIslands,
   :db/ident :lcc-3166-1/FRO,
   :lcc-lr/hasTag "FRO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FRO",
   :skos/definition "Alpha-3 country code for Faroe Islands (the)"})

(def FSM
  "Alpha-3 country code for Micronesia (Federated States of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Micronesia,
   :db/ident :lcc-3166-1/FSM,
   :lcc-lr/hasTag "FSM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FSM",
   :skos/definition
   "Alpha-3 country code for Micronesia (Federated States of)"})

(def FalklandIslands
  "the country of Falkland Islands (the) [Malvinas]"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/FalklandIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Falkland Islands (the) [Malvinas]"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "FALKLAND ISLANDS (MALVINAS)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Falkland (les Îles)/Malouines (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "FALKLAND, ÎLES (MALVINAS)"},
   :lcc-cr/hasNumericRegionCode "238",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Falkland Islands (the) [Malvinas]"},
   :skos/definition "the country of Falkland Islands (the) [Malvinas]"})

(def FaroeIslands
  "the country of Faroe Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/FaroeIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Faroe Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FAROE ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Féroé (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FÉROÉ, ÎLES"},
   :lcc-cr/hasLocalShortName [{:rdf/language "fo",
                               :rdf/value    "Føroyar"}
                              {:rdf/language "da",
                               :rdf/value    "Færøerne"}],
   :lcc-cr/hasNumericRegionCode "234",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Faroese :lcc-639-1/Danish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fo",
                 :rdf/value    "Føroyar"}
                {:rdf/language "da",
                 :rdf/value    "Færøerne"}],
   :skos/definition "the country of Faroe Islands (the)"})

(def Fiji
  "the country of Fiji"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Fiji,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Fiji"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Fiji"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FIJI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Fidji"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Fidji (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FIDJI"},
   :lcc-cr/hasLocalShortName {:rdf/language "fj",
                              :rdf/value    "Viti"},
   :lcc-cr/hasNumericRegionCode "242",
   :lcc-cr/hasRemarks
   "Principal islands: Vanua Levu, Viti Levu. Includes Rotuma Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Fijian],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fj",
                 :rdf/value    "Viti"}
                {:rdf/language "en",
                 :rdf/value    "Fiji"}],
   :skos/definition "the country of Fiji"})

(def Finland
  "the country of Finland"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Finland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Finland"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Finland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FINLAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Finlande"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Finlande (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FINLANDE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "sv",
                               :rdf/value    "Finland"}
                              {:rdf/language "fi",
                               :rdf/value    "Suomi"}],
   :lcc-cr/hasNumericRegionCode "246",
   :lcc-cr/hasRemarks "Includes: Åland Islands.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Finnish :lcc-639-1/Swedish],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fi",
                 :rdf/value    "Suomi"}
                {:rdf/language "sv",
                 :rdf/value    "Finland"}],
   :skos/definition "the country of Finland"})

(def France
  "the country of France"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/France,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the French Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "France"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FRANCE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République française"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "France (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FRANCE"},
   :lcc-cr/hasNumericRegionCode "250",
   :lcc-cr/hasRemarks
   "Comprises: Metropolitan France, French Guiana, Guadeloupe, Martinique, La Réunion, Mayotte, Saint Barthélemy, Saint Martin, Saint Pierre and Miquelon, French Polynesia, French Southern Territories, New Caledonia, Wallis and Futuna. Includes: Clipperton Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "France (la)"},
   :skos/definition "the country of France"})

(def FrenchGuiana
  "the country of French Guiana"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/FrenchGuiana,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "French Guiana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FRENCH GUIANA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guyane française (la )"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUYANE FRANÇAISE"},
   :lcc-cr/hasNumericRegionCode "254",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of France (FR-GF).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Guyane française (la )"},
   :skos/definition "the country of French Guiana"})

(def FrenchPolynesia
  "the country of French Polynesia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/FrenchPolynesia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "French Polynesia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FRENCH POLYNESIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Polynésie française (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "POLYNÉSIE FRANÇAISE"},
   :lcc-cr/hasNumericRegionCode "258",
   :lcc-cr/hasRemarks
   ["Comprises: Austral Islands, Gambier Islands, Marquesas Islands, Society Archipelago (Principal island: Tahiti), Tuamotu Islands."
    "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-PF)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Polynésie française (la)"},
   :skos/definition "the country of French Polynesia"})

(def FrenchSouthernTerritories
  "the country of French Southern Territories (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "French Southern Territories (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "FRENCH SOUTHERN TERRITORIES"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Terres australes françaises (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "TERRES AUSTRALES FRANÇAISES"},
   :lcc-cr/hasNumericRegionCode "260",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of France (FR-TF)."
    "Comprises: Amsterdam Island, Crozet Archipelago, Kerguelen Islands, Saint Paul Island and French scattered Indian Ocean Islands formed by Bassas da India, Europa Island, Glorioso Islands, Juan de Nova Island and Tromelin Island."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Terres australes françaises (les)"},
   :skos/definition "the country of French Southern Territories (the)"})

(def GA
  "Alpha-2 country code for Gabon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Gabon,
   :db/ident :lcc-3166-1/GA,
   :lcc-lr/hasTag "GA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GA",
   :skos/definition "Alpha-2 country code for Gabon"})

(def GAB
  "Alpha-3 country code for Gabon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Gabon,
   :db/ident :lcc-3166-1/GAB,
   :lcc-lr/hasTag "GAB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GAB",
   :skos/definition "Alpha-3 country code for Gabon"})

(def GB
  "Alpha-2 country code for United Kingdom of Great Britain and Northern Ireland (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :lcc-3166-1/GB,
   :lcc-lr/hasTag "GB",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GB",
   :skos/definition
   "Alpha-2 country code for United Kingdom of Great Britain and Northern Ireland (the)"})

(def GBR
  "Alpha-3 country code for United Kingdom of Great Britain and Northern Ireland (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :db/ident :lcc-3166-1/GBR,
   :lcc-lr/hasTag "GBR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GBR",
   :skos/definition
   "Alpha-3 country code for United Kingdom of Great Britain and Northern Ireland (the)"})

(def GD
  "Alpha-2 country code for Grenada"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Grenada,
   :db/ident :lcc-3166-1/GD,
   :lcc-lr/hasTag "GD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GD",
   :skos/definition "Alpha-2 country code for Grenada"})

(def GE
  "Alpha-2 country code for Georgia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Georgia,
   :db/ident :lcc-3166-1/GE,
   :lcc-lr/hasTag "GE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GE",
   :skos/definition "Alpha-2 country code for Georgia"})

(def GEO
  "Alpha-3 country code for Georgia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Georgia,
   :db/ident :lcc-3166-1/GEO,
   :lcc-lr/hasTag "GEO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GEO",
   :skos/definition "Alpha-3 country code for Georgia"})

(def GF
  "Alpha-2 country code for French Guiana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FrenchGuiana,
   :db/ident :lcc-3166-1/GF,
   :lcc-lr/hasTag "GF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GF",
   :skos/definition "Alpha-2 country code for French Guiana"})

(def GG
  "Alpha-2 country code for Guernsey"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guernsey,
   :db/ident :lcc-3166-1/GG,
   :lcc-lr/hasTag "GG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GG",
   :skos/definition "Alpha-2 country code for Guernsey"})

(def GGY
  "Alpha-3 country code for Guernsey"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guernsey,
   :db/ident :lcc-3166-1/GGY,
   :lcc-lr/hasTag "GGY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GGY",
   :skos/definition "Alpha-3 country code for Guernsey"})

(def GH
  "Alpha-2 country code for Ghana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ghana,
   :db/ident :lcc-3166-1/GH,
   :lcc-lr/hasTag "GH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GH",
   :skos/definition "Alpha-2 country code for Ghana"})

(def GHA
  "Alpha-3 country code for Ghana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ghana,
   :db/ident :lcc-3166-1/GHA,
   :lcc-lr/hasTag "GHA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GHA",
   :skos/definition "Alpha-3 country code for Ghana"})

(def GI
  "Alpha-2 country code for Gibraltar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Gibraltar,
   :db/ident :lcc-3166-1/GI,
   :lcc-lr/hasTag "GI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GI",
   :skos/definition "Alpha-2 country code for Gibraltar"})

(def GIB
  "Alpha-3 country code for Gibraltar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Gibraltar,
   :db/ident :lcc-3166-1/GIB,
   :lcc-lr/hasTag "GIB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GIB",
   :skos/definition "Alpha-3 country code for Gibraltar"})

(def GIN
  "Alpha-3 country code for Guinea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guinea,
   :db/ident :lcc-3166-1/GIN,
   :lcc-lr/hasTag "GIN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GIN",
   :skos/definition "Alpha-3 country code for Guinea"})

(def GL
  "Alpha-2 country code for Greenland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Greenland,
   :db/ident :lcc-3166-1/GL,
   :lcc-lr/hasTag "GL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GL",
   :skos/definition "Alpha-2 country code for Greenland"})

(def GLP
  "Alpha-3 country code for Guadeloupe"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guadeloupe,
   :db/ident :lcc-3166-1/GLP,
   :lcc-lr/hasTag "GLP",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GLP",
   :skos/definition "Alpha-3 country code for Guadeloupe"})

(def GM
  "Alpha-2 country code for Gambia (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Gambia,
   :db/ident :lcc-3166-1/GM,
   :lcc-lr/hasTag "GM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GM",
   :skos/definition "Alpha-2 country code for Gambia (the)"})

(def GMB
  "Alpha-3 country code for Gambia (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Gambia,
   :db/ident :lcc-3166-1/GMB,
   :lcc-lr/hasTag "GMB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GMB",
   :skos/definition "Alpha-3 country code for Gambia (the)"})

(def GN
  "Alpha-2 country code for Guinea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guinea,
   :db/ident :lcc-3166-1/GN,
   :lcc-lr/hasTag "GN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GN",
   :skos/definition "Alpha-2 country code for Guinea"})

(def GNB
  "Alpha-3 country code for Guinea-Bissau"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guinea-Bissau,
   :db/ident :lcc-3166-1/GNB,
   :lcc-lr/hasTag "GNB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GNB",
   :skos/definition "Alpha-3 country code for Guinea-Bissau"})

(def GNQ
  "Alpha-3 country code for Equatorial Guinea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/EquatorialGuinea,
   :db/ident :lcc-3166-1/GNQ,
   :lcc-lr/hasTag "GNQ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GNQ",
   :skos/definition "Alpha-3 country code for Equatorial Guinea"})

(def GP
  "Alpha-2 country code for Guadeloupe"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guadeloupe,
   :db/ident :lcc-3166-1/GP,
   :lcc-lr/hasTag "GP",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GP",
   :skos/definition "Alpha-2 country code for Guadeloupe"})

(def GQ
  "Alpha-2 country code for Equatorial Guinea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/EquatorialGuinea,
   :db/ident :lcc-3166-1/GQ,
   :lcc-lr/hasTag "GQ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GQ",
   :skos/definition "Alpha-2 country code for Equatorial Guinea"})

(def GR
  "Alpha-2 country code for Greece"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Greece,
   :db/ident :lcc-3166-1/GR,
   :lcc-lr/hasTag "GR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GR",
   :skos/definition "Alpha-2 country code for Greece"})

(def GRC
  "Alpha-3 country code for Greece"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Greece,
   :db/ident :lcc-3166-1/GRC,
   :lcc-lr/hasTag "GRC",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GRC",
   :skos/definition "Alpha-3 country code for Greece"})

(def GRD
  "Alpha-3 country code for Grenada"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Grenada,
   :db/ident :lcc-3166-1/GRD,
   :lcc-lr/hasTag "GRD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GRD",
   :skos/definition "Alpha-3 country code for Grenada"})

(def GRL
  "Alpha-3 country code for Greenland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Greenland,
   :db/ident :lcc-3166-1/GRL,
   :lcc-lr/hasTag "GRL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GRL",
   :skos/definition "Alpha-3 country code for Greenland"})

(def GS
  "Alpha-2 country code for South Georgia and the South Sandwich Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :db/ident :lcc-3166-1/GS,
   :lcc-lr/hasTag "GS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GS",
   :skos/definition
   "Alpha-2 country code for South Georgia and the South Sandwich Islands"})

(def GT
  "Alpha-2 country code for Guatemala"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guatemala,
   :db/ident :lcc-3166-1/GT,
   :lcc-lr/hasTag "GT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GT",
   :skos/definition "Alpha-2 country code for Guatemala"})

(def GTM
  "Alpha-3 country code for Guatemala"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guatemala,
   :db/ident :lcc-3166-1/GTM,
   :lcc-lr/hasTag "GTM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GTM",
   :skos/definition "Alpha-3 country code for Guatemala"})

(def GU
  "Alpha-2 country code for Guam"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guam,
   :db/ident :lcc-3166-1/GU,
   :lcc-lr/hasTag "GU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GU",
   :skos/definition "Alpha-2 country code for Guam"})

(def GUF
  "Alpha-3 country code for French Guiana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FrenchGuiana,
   :db/ident :lcc-3166-1/GUF,
   :lcc-lr/hasTag "GUF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GUF",
   :skos/definition "Alpha-3 country code for French Guiana"})

(def GUM
  "Alpha-3 country code for Guam"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guam,
   :db/ident :lcc-3166-1/GUM,
   :lcc-lr/hasTag "GUM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GUM",
   :skos/definition "Alpha-3 country code for Guam"})

(def GUY
  "Alpha-3 country code for Guyana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guyana,
   :db/ident :lcc-3166-1/GUY,
   :lcc-lr/hasTag "GUY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GUY",
   :skos/definition "Alpha-3 country code for Guyana"})

(def GW
  "Alpha-2 country code for Guinea-Bissau"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guinea-Bissau,
   :db/ident :lcc-3166-1/GW,
   :lcc-lr/hasTag "GW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GW",
   :skos/definition "Alpha-2 country code for Guinea-Bissau"})

(def GY
  "Alpha-2 country code for Guyana"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Guyana,
   :db/ident :lcc-3166-1/GY,
   :lcc-lr/hasTag "GY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GY",
   :skos/definition "Alpha-2 country code for Guyana"})

(def Gabon
  "the country of Gabon"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Gabon,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Gabonese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Gabon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GABON"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République gabonaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Gabon (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GABON"},
   :lcc-cr/hasNumericRegionCode "266",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Gabon (le)"},
   :skos/definition "the country of Gabon"})

(def Gambia
  "the country of Gambia (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Gambia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Gambia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Gambia (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GAMBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Gambie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Gambie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GAMBIE"},
   :lcc-cr/hasNumericRegionCode "270",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gambia (the)"},
   :skos/definition "the country of Gambia (the)"})

(def Georgia
  "the country of Georgia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Georgia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Georgia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GEORGIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Géorgie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GÉORGIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ka",
                              :rdf/value    "Sakartvelo"},
   :lcc-cr/hasNumericRegionCode "268",
   :lcc-cr/hasRemarks
   "The code GE was formerly used for the Gilbert and Ellice Islands (GE, GEL, --) and has been reused and reassigned to Georgia. See also code element GEKI.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Georgian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ka",
                :rdf/value    "Sakartvelo"},
   :skos/definition "the country of Georgia"})

(def Germany
  "the country of Germany"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Germany,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Federal Republic of Germany"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Germany"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GERMANY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérale d'Allemagne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Allemagne (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ALLEMAGNE"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Deutschland"},
   :lcc-cr/hasNumericRegionCode "276",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Deutschland"},
   :skos/definition "the country of Germany"})

(def Ghana
  "the country of Ghana"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Ghana,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Ghana"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ghana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GHANA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Ghana"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ghana (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GHANA"},
   :lcc-cr/hasNumericRegionCode "288",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ghana"},
   :skos/definition "the country of Ghana"})

(def Gibraltar
  "the country of Gibraltar"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Gibraltar,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Gibraltar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GIBRALTAR"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Gibraltar"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GIBRALTAR"},
   :lcc-cr/hasNumericRegionCode "292",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gibraltar"},
   :skos/definition "the country of Gibraltar"})

(def Greece
  "the country of Greece"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Greece,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Hellenic Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Greece"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GREECE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République hellénique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Grèce (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GRÈCE"},
   :lcc-cr/hasLocalShortName {:rdf/language "el",
                              :rdf/value    "Elláda"},
   :lcc-cr/hasNumericRegionCode "300",
   :lcc-cr/hasRemarks "Includes: Mount Athos autonomous area.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/ModernGreek,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "el",
                :rdf/value    "Elláda"},
   :skos/definition "the country of Greece"})

(def Greenland
  "the country of Greenland"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Greenland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Greenland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GREENLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Groenland (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GROENLAND"},
   :lcc-cr/hasLocalShortName [{:rdf/language "da",
                               :rdf/value    "Grønland"}
                              {:rdf/language "kl",
                               :rdf/value    "Kalaallit Nunaat"}],
   :lcc-cr/hasNumericRegionCode "304",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Danish
                                       :lcc-639-1/Kalaallisut],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "kl",
                 :rdf/value    "Kalaallit Nunaat"}
                {:rdf/language "da",
                 :rdf/value    "Grønland"}],
   :skos/definition "the country of Greenland"})

(def Grenada
  "the country of Grenada"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Grenada,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Grenada"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GRENADA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Grenade (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GRENADE"},
   :lcc-cr/hasNumericRegionCode "308",
   :lcc-cr/hasRemarks
   "Includes: Southern Grenadine Islands (Principal island: Carriacou).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Grenada"},
   :skos/definition "the country of Grenada"})

(def Guadeloupe
  "the country of Guadeloupe"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guadeloupe,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guadeloupe"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUADELOUPE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guadeloupe (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUADELOUPE"},
   :lcc-cr/hasNumericRegionCode "312",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of France (FR-GP)."
    "Includes: la Désirade, Marie-Galante, les Saintes."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Guadeloupe (la)"},
   :skos/definition "the country of Guadeloupe"})

(def Guam
  "the country of Guam"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guam,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guam"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUAM"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guam"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUAM"},
   :lcc-cr/hasNumericRegionCode "316",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of the United States (US-GU).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Guam"},
   :skos/definition "the country of Guam"})

(def Guatemala
  "the country of Guatemala"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guatemala,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Guatemala"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guatemala"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUATEMALA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Guatemala"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guatemala (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUATEMALA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Guatemala"},
   :lcc-cr/hasNumericRegionCode "320",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Guatemala"},
   :skos/definition "the country of Guatemala"})

(def Guernsey
  "the country of Guernsey"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guernsey,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guernsey"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUERNSEY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guernesey"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUERNESEY"},
   :lcc-cr/hasNumericRegionCode "831",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard."
    "The Bailiwick of Guernsey also includes the islands of Alderney, Brecqhou, Burhou, Herm, Jethou, Lihou, Little Sark, and Sark."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Guernsey"}
                {:rdf/language "fr",
                 :rdf/value    "Guernesey"}],
   :skos/definition "the country of Guernsey"})

(def Guinea
  "the country of Guinea"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guinea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Guinea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guinea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUINEA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Guinée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guinée (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUINÉE"},
   :lcc-cr/hasNumericRegionCode "324",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Guinée (la)"},
   :skos/definition "the country of Guinea"})

(def Guinea-Bissau
  "the country of Guinea-Bissau"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guinea-Bissau,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Guinea-Bissau"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guinea-Bissau"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUINEA-BISSAU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Guinée-Bissau"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guinée-Bissau (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUINÉE-BISSAU"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Guiné-Bissau (a)"},
   :lcc-cr/hasNumericRegionCode "624",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Guiné-Bissau (a)"},
   :skos/definition "the country of Guinea-Bissau"})

(def Guyana
  "the country of Guyana"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Guyana,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Co-operative Republic of Guyana"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guyana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUYANA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République coopérative du Guyana"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guyana (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUYANA"},
   :lcc-cr/hasNumericRegionCode "328",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Guyana"},
   :skos/definition "the country of Guyana"})

(def HK
  "Alpha-2 country code for Hong Kong"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/HongKong,
   :db/ident :lcc-3166-1/HK,
   :lcc-lr/hasTag "HK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HK",
   :skos/definition "Alpha-2 country code for Hong Kong"})

(def HKG
  "Alpha-3 country code for Hong Kong"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/HongKong,
   :db/ident :lcc-3166-1/HKG,
   :lcc-lr/hasTag "HKG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HKG",
   :skos/definition "Alpha-3 country code for Hong Kong"})

(def HM
  "Alpha-2 country code for Heard Island and McDonald Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :db/ident :lcc-3166-1/HM,
   :lcc-lr/hasTag "HM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HM",
   :skos/definition
   "Alpha-2 country code for Heard Island and McDonald Islands"})

(def HMD
  "Alpha-3 country code for Heard Island and McDonald Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :db/ident :lcc-3166-1/HMD,
   :lcc-lr/hasTag "HMD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HMD",
   :skos/definition
   "Alpha-3 country code for Heard Island and McDonald Islands"})

(def HN
  "Alpha-2 country code for Honduras"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Honduras,
   :db/ident :lcc-3166-1/HN,
   :lcc-lr/hasTag "HN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HN",
   :skos/definition "Alpha-2 country code for Honduras"})

(def HND
  "Alpha-3 country code for Honduras"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Honduras,
   :db/ident :lcc-3166-1/HND,
   :lcc-lr/hasTag "HND",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HND",
   :skos/definition "Alpha-3 country code for Honduras"})

(def HR
  "Alpha-2 country code for Croatia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Croatia,
   :db/ident :lcc-3166-1/HR,
   :lcc-lr/hasTag "HR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HR",
   :skos/definition "Alpha-2 country code for Croatia"})

(def HRV
  "Alpha-3 country code for Croatia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Croatia,
   :db/ident :lcc-3166-1/HRV,
   :lcc-lr/hasTag "HRV",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HRV",
   :skos/definition "Alpha-3 country code for Croatia"})

(def HT
  "Alpha-2 country code for Haiti"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Haiti,
   :db/ident :lcc-3166-1/HT,
   :lcc-lr/hasTag "HT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HT",
   :skos/definition "Alpha-2 country code for Haiti"})

(def HTI
  "Alpha-3 country code for Haiti"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Haiti,
   :db/ident :lcc-3166-1/HTI,
   :lcc-lr/hasTag "HTI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HTI",
   :skos/definition "Alpha-3 country code for Haiti"})

(def HU
  "Alpha-2 country code for Hungary"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Hungary,
   :db/ident :lcc-3166-1/HU,
   :lcc-lr/hasTag "HU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HU",
   :skos/definition "Alpha-2 country code for Hungary"})

(def HUN
  "Alpha-3 country code for Hungary"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Hungary,
   :db/ident :lcc-3166-1/HUN,
   :lcc-lr/hasTag "HUN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HUN",
   :skos/definition "Alpha-3 country code for Hungary"})

(def Haiti
  "the country of Haiti"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Haiti,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Haiti"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Haiti"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HAITI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Haïti"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Haïti"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HAÏTI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ht",
                              :rdf/value    "Ayiti"},
   :lcc-cr/hasNumericRegionCode "332",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Haitian :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ht",
                 :rdf/value    "Ayiti"}
                {:rdf/language "fr",
                 :rdf/value    "Haïti"}],
   :skos/definition "the country of Haiti"})

(def HeardIslandAndMcDonaldIslands
  "the country of Heard Island and McDonald Islands"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Heard Island and McDonald Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "HEARD ISLAND AND MCDONALD ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "ll'Île Heard-et-Îles MacDonald"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Heard-et-Îles MacDonald (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "HEARD-ET-ÎLES MACDONALD, ÎLE"},
   :lcc-cr/hasNumericRegionCode "334",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Heard Island and McDonald Islands"},
   :skos/definition "the country of Heard Island and McDonald Islands"})

(def HolySee
  "the country of Holy See (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/HolySee,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Holy See (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HOLY SEE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Siège (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-SIÈGE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "it",
                               :rdf/value    "Santa Sede (la)"}
                              {:rdf/language "la",
                               :rdf/value    "Sancta Sedes"}],
   :lcc-cr/hasNumericRegionCode "336",
   :lcc-cr/hasRemarks ["Previous entry: VATICAN CITY STATE (HOLY SEE)."
                       "No subdivisions relevant for this standard."],
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Latin :lcc-639-1/Italian],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "la",
                 :rdf/value    "Sancta Sedes"}
                {:rdf/language "it",
                 :rdf/value    "Santa Sede (la)"}],
   :skos/definition "the country of Holy See (the)"})

(def Honduras
  "the country of Honduras"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Honduras,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Honduras"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Honduras"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HONDURAS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Honduras"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Honduras (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HONDURAS"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Honduras"},
   :lcc-cr/hasNumericRegionCode "340",
   :lcc-cr/hasRemarks "Includes: Swan Islands.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Honduras"},
   :skos/definition "the country of Honduras"})

(def HongKong
  "the country of Hong Kong"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/HongKong,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Hong Kong Special Administrative Region of China"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Hong Kong"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HONG KONG"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "Hong Kong, Région administrative spéciale de Chine (la)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Hong Kong"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HONG KONG"},
   :lcc-cr/hasLocalShortName {:rdf/language "zh",
                              :rdf/value    "Xianggang"},
   :lcc-cr/hasNumericRegionCode "344",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of China (CN-HK).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Chinese],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "zh",
                 :rdf/value    "Xianggang"}
                {:rdf/language "en",
                 :rdf/value    "Hong Kong"}],
   :skos/definition "the country of Hong Kong"})

(def Hungary
  "the country of Hungary"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Hungary,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Hungary"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HUNGARY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Hongrie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HONGRIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hu",
                              :rdf/value    "Magyarország"},
   :lcc-cr/hasNumericRegionCode "348",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Hungarian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "hu",
                :rdf/value    "Magyarország"},
   :skos/definition "the country of Hungary"})

(def ID
  "Alpha-2 country code for Indonesia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Indonesia,
   :db/ident :lcc-3166-1/ID,
   :lcc-lr/hasTag "ID",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ID",
   :skos/definition "Alpha-2 country code for Indonesia"})

(def IDN
  "Alpha-3 country code for Indonesia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Indonesia,
   :db/ident :lcc-3166-1/IDN,
   :lcc-lr/hasTag "IDN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IDN",
   :skos/definition "Alpha-3 country code for Indonesia"})

(def IE
  "Alpha-2 country code for Ireland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ireland,
   :db/ident :lcc-3166-1/IE,
   :lcc-lr/hasTag "IE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IE",
   :skos/definition "Alpha-2 country code for Ireland"})

(def IL
  "Alpha-2 country code for Israel"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Israel,
   :db/ident :lcc-3166-1/IL,
   :lcc-lr/hasTag "IL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IL",
   :skos/definition "Alpha-2 country code for Israel"})

(def IM
  "Alpha-2 country code for Isle of Man"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/IsleOfMan,
   :db/ident :lcc-3166-1/IM,
   :lcc-lr/hasTag "IM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IM",
   :skos/definition "Alpha-2 country code for Isle of Man"})

(def IMN
  "Alpha-3 country code for Isle of Man"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/IsleOfMan,
   :db/ident :lcc-3166-1/IMN,
   :lcc-lr/hasTag "IMN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IMN",
   :skos/definition "Alpha-3 country code for Isle of Man"})

(def IN
  "Alpha-2 country code for India"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/India,
   :db/ident :lcc-3166-1/IN,
   :lcc-lr/hasTag "IN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IN",
   :skos/definition "Alpha-2 country code for India"})

(def IND
  "Alpha-3 country code for India"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/India,
   :db/ident :lcc-3166-1/IND,
   :lcc-lr/hasTag "IND",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IND",
   :skos/definition "Alpha-3 country code for India"})

(def IO
  "Alpha-2 country code for British Indian Ocean Territory (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BritishIndianOceanTerritory,
   :db/ident :lcc-3166-1/IO,
   :lcc-lr/hasTag "IO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IO",
   :skos/definition
   "Alpha-2 country code for British Indian Ocean Territory (the)"})

(def IOT
  "Alpha-3 country code for British Indian Ocean Territory (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/BritishIndianOceanTerritory,
   :db/ident :lcc-3166-1/IOT,
   :lcc-lr/hasTag "IOT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IOT",
   :skos/definition
   "Alpha-3 country code for British Indian Ocean Territory (the)"})

(def IQ
  "Alpha-2 country code for Iraq"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Iraq,
   :db/ident :lcc-3166-1/IQ,
   :lcc-lr/hasTag "IQ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IQ",
   :skos/definition "Alpha-2 country code for Iraq"})

(def IR
  "Alpha-2 country code for Iran (Islamic Republic of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Iran,
   :db/ident :lcc-3166-1/IR,
   :lcc-lr/hasTag "IR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IR",
   :skos/definition "Alpha-2 country code for Iran (Islamic Republic of)"})

(def IRL
  "Alpha-3 country code for Ireland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ireland,
   :db/ident :lcc-3166-1/IRL,
   :lcc-lr/hasTag "IRL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IRL",
   :skos/definition "Alpha-3 country code for Ireland"})

(def IRN
  "Alpha-3 country code for Iran (Islamic Republic of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Iran,
   :db/ident :lcc-3166-1/IRN,
   :lcc-lr/hasTag "IRN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IRN",
   :skos/definition "Alpha-3 country code for Iran (Islamic Republic of)"})

(def IRQ
  "Alpha-3 country code for Iraq"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Iraq,
   :db/ident :lcc-3166-1/IRQ,
   :lcc-lr/hasTag "IRQ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IRQ",
   :skos/definition "Alpha-3 country code for Iraq"})

(def IS
  "Alpha-2 country code for Iceland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Iceland,
   :db/ident :lcc-3166-1/IS,
   :lcc-lr/hasTag "IS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IS",
   :skos/definition "Alpha-2 country code for Iceland"})

(def ISL
  "Alpha-3 country code for Iceland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Iceland,
   :db/ident :lcc-3166-1/ISL,
   :lcc-lr/hasTag "ISL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISL",
   :skos/definition "Alpha-3 country code for Iceland"})

(def ISO3166-1-Alpha2-CodeSet
  "the set of country identifiers that comprise the 2 character codes in the ISO 3166-1 specification"
  {:db/ident :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 alpha 2 code set",
   :skos/definition
   "the set of country identifiers that comprise the 2 character codes in the ISO 3166-1 specification"})

(def ISO3166-1-Alpha3-CodeSet
  "the set of country identifiers that comprise the 3 character codes in the ISO 3166-1 specification"
  {:db/ident :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 alpha 3 code set",
   :skos/definition
   "the set of country identifiers that comprise the 3 character codes in the ISO 3166-1 specification"})

(def ISO639-3-CodeSet
  "the set of language identifiers that comprise the ISO 639-3 specification"
  {:db/ident :lcc-3166-1/ISO639-3-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 639-3 code set",
   :rdfs/seeAlso "https://iso639-3.sil.org/code_tables/639/data/",
   :skos/definition
   "the set of language identifiers that comprise the ISO 639-3 specification"})

(def ISR
  "Alpha-3 country code for Israel"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Israel,
   :db/ident :lcc-3166-1/ISR,
   :lcc-lr/hasTag "ISR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISR",
   :skos/definition "Alpha-3 country code for Israel"})

(def IT
  "Alpha-2 country code for Italy"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Italy,
   :db/ident :lcc-3166-1/IT,
   :lcc-lr/hasTag "IT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IT",
   :skos/definition "Alpha-2 country code for Italy"})

(def ITA
  "Alpha-3 country code for Italy"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Italy,
   :db/ident :lcc-3166-1/ITA,
   :lcc-lr/hasTag "ITA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ITA",
   :skos/definition "Alpha-3 country code for Italy"})

(def Iceland
  "the country of Iceland"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Iceland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Iceland"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Iceland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ICELAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Islande"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Islande (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ISLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "is",
                              :rdf/value    "Ísland"},
   :lcc-cr/hasNumericRegionCode "352",
   :lcc-cr/hasRemarks
   "Remark: The Icelandic characters ð (eze) and þ (thorn) may be written as “dh” and “th”.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Icelandic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "is",
                :rdf/value    "Ísland"},
   :skos/definition "the country of Iceland"})

(def India
  "the country of India"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/India,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of India"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "India"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "INDIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de l'Inde"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Inde (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "INDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hi",
                              :rdf/value    "Bhārat"},
   :lcc-cr/hasNumericRegionCode "356",
   :lcc-cr/hasRemarks
   ["Remark: the forms used in the list are English-language forms provided by India."
    "Includes: Amindivi Islands, Andaman Islands, Laccadive Islands, Minicoy Island, Nicobar Islands."],
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Hindi :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "hi",
                 :rdf/value    "Bhārat"}
                {:rdf/language "en",
                 :rdf/value    "India"}],
   :skos/definition "the country of India"})

(def Indonesia
  "the country of Indonesia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Indonesia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Indonesia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Indonesia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "INDONESIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Indonésie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Indonésie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "INDONÉSIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "id",
                              :rdf/value    "Indonesia"},
   :lcc-cr/hasNumericRegionCode "360",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Indonesian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "id",
                :rdf/value    "Indonesia"},
   :skos/definition "the country of Indonesia"})

(def Iran
  "the country of Iran (Islamic Republic of)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Iran,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Islamic Republic of Iran"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Iran (Islamic Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "IRAN (ISLAMIC REPUBLIC OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République islamique d'Iran"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Iran (République Islamique d')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "IRAN (RÉPUBLIQUE ISLAMIQUE D')"},
   :lcc-cr/hasLocalShortName {:rdf/language "fa",
                              :rdf/value    "Jomhūrī-ye Eslāmī-ye Īrān"},
   :lcc-cr/hasNumericRegionCode "364",
   :lcc-cr/hasRemarks "Also referred to as Iran.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Persian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fa",
                :rdf/value    "Jomhūrī-ye Eslāmī-ye Īrān"},
   :skos/definition "the country of Iran (Islamic Republic of)"})

(def Iraq
  "the country of Iraq"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Iraq,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Iraq"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Iraq"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "IRAQ"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Iraq"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Iraq (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "IRAQ"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ku",
                               :rdf/value    "‘Êraq"}
                              {:rdf/language "ar",
                               :rdf/value    "Al ‘Irāq"}],
   :lcc-cr/hasNumericRegionCode "368",
   :lcc-cr/hasRemarks
   "Kurdish and Arabic are both official languages according to the Iraqi constitution, which states “The federal and official institutions and agencies in the Kurdistan region shall use both languages.”",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Arabic :lcc-639-1/Kurdish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ku",
                 :rdf/value    "‘Êraq"}
                {:rdf/language "ar",
                 :rdf/value    "Al ‘Irāq"}],
   :skos/definition "the country of Iraq"})

(def Ireland
  "the country of Ireland"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Ireland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ireland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "IRELAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Irlande (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "IRLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ga",
                              :rdf/value    "Éire"},
   :lcc-cr/hasNumericRegionCode "372",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Irish],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ga",
                 :rdf/value    "Éire"}
                {:rdf/language "en",
                 :rdf/value    "Ireland"}],
   :skos/definition "the country of Ireland"})

(def IsleOfMan
  "the country of Isle of Man"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/IsleOfMan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Isle of Man"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ISLE OF MAN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Île de Man"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÎLE DE MAN"},
   :lcc-cr/hasNumericRegionCode "833",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Isle of Man"},
   :skos/definition "the country of Isle of Man"})

(def Israel
  "the country of Israel"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Israel,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Israel"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Israel"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ISRAEL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État d'Israël"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Israël"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ISRAËL"},
   :lcc-cr/hasLocalShortName [{:rdf/language "he",
                               :rdf/value    "Yisra'el"}
                              {:rdf/language "ar",
                               :rdf/value    "Isrā'īl"}],
   :lcc-cr/hasNumericRegionCode "376",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Hebrew :lcc-639-1/Arabic],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "Isrā'īl"}
                {:rdf/language "he",
                 :rdf/value    "Yisra'el"}],
   :skos/definition "the country of Israel"})

(def Italy
  "the country of Italy"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Italy,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Italy"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Italy"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ITALY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République italienne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Italie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ITALIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "it",
                              :rdf/value    "Italia (l')"},
   :lcc-cr/hasNumericRegionCode "380",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Italian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "it",
                :rdf/value    "Italia (l')"},
   :skos/definition "the country of Italy"})

(def JAM
  "Alpha-3 country code for Jamaica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Jamaica,
   :db/ident :lcc-3166-1/JAM,
   :lcc-lr/hasTag "JAM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JAM",
   :skos/definition "Alpha-3 country code for Jamaica"})

(def JE
  "Alpha-2 country code for Jersey"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Jersey,
   :db/ident :lcc-3166-1/JE,
   :lcc-lr/hasTag "JE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JE",
   :skos/definition "Alpha-2 country code for Jersey"})

(def JEY
  "Alpha-3 country code for Jersey"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Jersey,
   :db/ident :lcc-3166-1/JEY,
   :lcc-lr/hasTag "JEY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JEY",
   :skos/definition "Alpha-3 country code for Jersey"})

(def JM
  "Alpha-2 country code for Jamaica"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Jamaica,
   :db/ident :lcc-3166-1/JM,
   :lcc-lr/hasTag "JM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JM",
   :skos/definition "Alpha-2 country code for Jamaica"})

(def JO
  "Alpha-2 country code for Jordan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Jordan,
   :db/ident :lcc-3166-1/JO,
   :lcc-lr/hasTag "JO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JO",
   :skos/definition "Alpha-2 country code for Jordan"})

(def JOR
  "Alpha-3 country code for Jordan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Jordan,
   :db/ident :lcc-3166-1/JOR,
   :lcc-lr/hasTag "JOR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JOR",
   :skos/definition "Alpha-3 country code for Jordan"})

(def JP
  "Alpha-2 country code for Japan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Japan,
   :db/ident :lcc-3166-1/JP,
   :lcc-lr/hasTag "JP",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JP",
   :skos/definition "Alpha-2 country code for Japan"})

(def JPN
  "Alpha-3 country code for Japan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Japan,
   :db/ident :lcc-3166-1/JPN,
   :lcc-lr/hasTag "JPN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JPN",
   :skos/definition "Alpha-3 country code for Japan"})

(def Jamaica
  "the country of Jamaica"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Jamaica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Jamaica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JAMAICA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jamaïque (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JAMAÏQUE"},
   :lcc-cr/hasNumericRegionCode "388",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Jamaica"},
   :skos/definition "the country of Jamaica"})

(def Japan
  "the country of Japan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Japan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Japan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JAPAN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Japon (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JAPON"},
   :lcc-cr/hasLocalShortName {:rdf/language "ja",
                              :rdf/value    "Nihon/Nippon"},
   :lcc-cr/hasNumericRegionCode "392",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Japanese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ja",
                :rdf/value    "Nihon/Nippon"},
   :skos/definition "the country of Japan"})

(def Jersey
  "the country of Jersey"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Jersey,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Jersey"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JERSEY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jersey"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JERSEY"},
   :lcc-cr/hasNumericRegionCode "832",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Jersey"}
                {:rdf/language "en",
                 :rdf/value    "Jersey"}],
   :skos/definition "the country of Jersey"})

(def Jordan
  "the country of Jordan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Jordan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Hashemite Kingdom of Jordan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Jordan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JORDAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume hachémite de Jordanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jordanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JORDANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Urdun"},
   :lcc-cr/hasNumericRegionCode "400",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Urdun"},
   :skos/definition "the country of Jordan"})

(def KAZ
  "Alpha-3 country code for Kazakhstan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kazakhstan,
   :db/ident :lcc-3166-1/KAZ,
   :lcc-lr/hasTag "KAZ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KAZ",
   :skos/definition "Alpha-3 country code for Kazakhstan"})

(def KE
  "Alpha-2 country code for Kenya"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kenya,
   :db/ident :lcc-3166-1/KE,
   :lcc-lr/hasTag "KE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KE",
   :skos/definition "Alpha-2 country code for Kenya"})

(def KEN
  "Alpha-3 country code for Kenya"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kenya,
   :db/ident :lcc-3166-1/KEN,
   :lcc-lr/hasTag "KEN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KEN",
   :skos/definition "Alpha-3 country code for Kenya"})

(def KG
  "Alpha-2 country code for Kyrgyzstan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kyrgyzstan,
   :db/ident :lcc-3166-1/KG,
   :lcc-lr/hasTag "KG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KG",
   :skos/definition "Alpha-2 country code for Kyrgyzstan"})

(def KGZ
  "Alpha-3 country code for Kyrgyzstan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kyrgyzstan,
   :db/ident :lcc-3166-1/KGZ,
   :lcc-lr/hasTag "KGZ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KGZ",
   :skos/definition "Alpha-3 country code for Kyrgyzstan"})

(def KH
  "Alpha-2 country code for Cambodia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cambodia,
   :db/ident :lcc-3166-1/KH,
   :lcc-lr/hasTag "KH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KH",
   :skos/definition "Alpha-2 country code for Cambodia"})

(def KHM
  "Alpha-3 country code for Cambodia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Cambodia,
   :db/ident :lcc-3166-1/KHM,
   :lcc-lr/hasTag "KHM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KHM",
   :skos/definition "Alpha-3 country code for Cambodia"})

(def KI
  "Alpha-2 country code for Kiribati"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kiribati,
   :db/ident :lcc-3166-1/KI,
   :lcc-lr/hasTag "KI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KI",
   :skos/definition "Alpha-2 country code for Kiribati"})

(def KIR
  "Alpha-3 country code for Kiribati"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kiribati,
   :db/ident :lcc-3166-1/KIR,
   :lcc-lr/hasTag "KIR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KIR",
   :skos/definition "Alpha-3 country code for Kiribati"})

(def KM
  "Alpha-2 country code for Comoros (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Comoros,
   :db/ident :lcc-3166-1/KM,
   :lcc-lr/hasTag "KM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KM",
   :skos/definition "Alpha-2 country code for Comoros (the)"})

(def KN
  "Alpha-2 country code for Saint Kitts and Nevis"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintKittsAndNevis,
   :db/ident :lcc-3166-1/KN,
   :lcc-lr/hasTag "KN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KN",
   :skos/definition "Alpha-2 country code for Saint Kitts and Nevis"})

(def KNA
  "Alpha-3 country code for Saint Kitts and Nevis"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintKittsAndNevis,
   :db/ident :lcc-3166-1/KNA,
   :lcc-lr/hasTag "KNA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KNA",
   :skos/definition "Alpha-3 country code for Saint Kitts and Nevis"})

(def KOR
  "Alpha-3 country code for Korea Republic Of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/KoreaRepublicOf,
   :db/ident :lcc-3166-1/KOR,
   :lcc-lr/hasTag "KOR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KOR",
   :skos/definition "Alpha-3 country code for Korea Republic Of"})

(def KP
  "Alpha-2 country code for Korea Democratic Peoples Republic Of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :db/ident :lcc-3166-1/KP,
   :lcc-lr/hasTag "KP",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KP",
   :skos/definition
   "Alpha-2 country code for Korea Democratic Peoples Republic Of"})

(def KR
  "Alpha-2 country code for Korea Republic Of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/KoreaRepublicOf,
   :db/ident :lcc-3166-1/KR,
   :lcc-lr/hasTag "KR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KR",
   :skos/definition "Alpha-2 country code for Korea Republic Of"})

(def KW
  "Alpha-2 country code for Kuwait"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kuwait,
   :db/ident :lcc-3166-1/KW,
   :lcc-lr/hasTag "KW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KW",
   :skos/definition "Alpha-2 country code for Kuwait"})

(def KWT
  "Alpha-3 country code for Kuwait"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kuwait,
   :db/ident :lcc-3166-1/KWT,
   :lcc-lr/hasTag "KWT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KWT",
   :skos/definition "Alpha-3 country code for Kuwait"})

(def KY
  "Alpha-2 country code for Cayman Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/CaymanIslands,
   :db/ident :lcc-3166-1/KY,
   :lcc-lr/hasTag "KY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KY",
   :skos/definition "Alpha-2 country code for Cayman Islands (the)"})

(def KZ
  "Alpha-2 country code for Kazakhstan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Kazakhstan,
   :db/ident :lcc-3166-1/KZ,
   :lcc-lr/hasTag "KZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KZ",
   :skos/definition "Alpha-2 country code for Kazakhstan"})

(def Kazakhstan
  "the country of Kazakhstan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Kazakhstan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Kazakhstan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kazakhstan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KAZAKHSTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Kazakhstan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kazakhstan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KAZAKHSTAN"},
   :lcc-cr/hasLocalShortName [{:rdf/language "kk",
                               :rdf/value    "Qazaqstan"}
                              {:rdf/language "ru",
                               :rdf/value    "Kazahstan"}],
   :lcc-cr/hasNumericRegionCode "398",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Kazakh :lcc-639-1/Russian],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "kk",
                 :rdf/value    "Qazaqstan"}
                {:rdf/language "ru",
                 :rdf/value    "Kazahstan"}],
   :skos/definition "the country of Kazakhstan"})

(def Kenya
  "the country of Kenya"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Kenya,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Kenya"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kenya"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KENYA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Kenya"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kenya (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KENYA"},
   :lcc-cr/hasLocalShortName {:rdf/language "sw",
                              :rdf/value    "Kenya"},
   :lcc-cr/hasNumericRegionCode "404",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Swahili],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Kenya"}
                {:rdf/language "sw",
                 :rdf/value    "Kenya"}],
   :skos/definition "the country of Kenya"})

(def Kiribati
  "the country of Kiribati"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Kiribati,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Kiribati"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kiribati"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KIRIBATI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Kiribati"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kiribati"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KIRIBATI"},
   :lcc-cr/hasLocalShortName "Kiribati",
   :lcc-cr/hasNumericRegionCode "296",
   :lcc-cr/hasRemarks
   "Comprises: Gilbert Islands (Principal atoll: Tarawa, including Banaba), part of Line Islands (including Kiritimati), Phoenix Islands (including Abariringa, Enderbury Island).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Gilbertese
                                       :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Kiribati"},
   :skos/definition "the country of Kiribati"})

(def KoreaDemocraticPeoplesRepublicOf
  "the country of Korea Democratic Peoples Republic Of"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Democratic People's Republic of Korea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Korea (the Democratic People's Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "KOREA (DEMOCRATIC PEOPLE'S REPUBLIC OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République populaire démocratique de Corée"},
   :lcc-cr/hasFrenchShortName
   {:rdf/language "fr",
    :rdf/value    "Corée (la République populaire démocratique de)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "CORÉE, RÉPUBLIQUE POPULAIRE DÉMOCRATIQUE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ko",
                              :rdf/value    "Chosŏn"},
   :lcc-cr/hasNumericRegionCode "408",
   :lcc-cr/hasRemarks "Often referred to as North Korea.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Korean,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ko",
                :rdf/value    "Chosŏn"},
   :skos/definition "the country of Korea Democratic Peoples Republic Of"})

(def KoreaRepublicOf
  "the country of Korea Republic Of"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/KoreaRepublicOf,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Korea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Korea (the Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KOREA, REPUBLIC OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Corée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Corée (la République de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CORÉE, RÉPUBLIQUE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ko",
                              :rdf/value    "Hanguk"},
   :lcc-cr/hasNumericRegionCode "410",
   :lcc-cr/hasRemarks "Often referred to as South Korea.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Korean,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ko",
                :rdf/value    "Hanguk"},
   :skos/definition "the country of Korea Republic Of"})

(def Kuwait
  "the country of Kuwait"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Kuwait,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Kuwait"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kuwait"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KUWAIT"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État du Koweït"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Koweït (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KOWEÏT"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Kuwayt"},
   :lcc-cr/hasNumericRegionCode "414",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Kuwayt"},
   :skos/definition "the country of Kuwait"})

(def Kyrgyzstan
  "the country of Kyrgyzstan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Kyrgyzstan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kyrgyz Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kyrgyzstan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KYRGYZSTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République kirghize"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kirghizistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KIRGHIZISTAN"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ru",
                               :rdf/value    "Kyrgyzstan"}
                              {:rdf/language "ky",
                               :rdf/value    "Kyrgyzstan"}],
   :lcc-cr/hasNumericRegionCode "417",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Russian :lcc-639-1/Kirghiz],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "Kyrgyzstan"}
                {:rdf/language "ky",
                 :rdf/value    "Kyrgyzstan"}],
   :skos/definition "the country of Kyrgyzstan"})

(def L001
  {:db/ident       :lcc-3166-1/L001,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-2/cnr,
   :rdf/type       [:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual]})

(def L002
  "Alpha-3 language code for Shikomor"
  {:cmns-id/identifies :lcc-3166-1/Shikomor,
   :db/ident :lcc-3166-1/L002,
   :lcc-lr/hasTag "002",
   :rdf/type [:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "002",
   :skos/definition "Alpha-3 language code for Shikomor"})

(def LA
  "Alpha-2 country code for Lao People's Democratic Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :db/ident :lcc-3166-1/LA,
   :lcc-lr/hasTag "LA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LA",
   :skos/definition
   "Alpha-2 country code for Lao People's Democratic Republic (the)"})

(def LAO
  "Alpha-3 country code for Lao People's Democratic Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :db/ident :lcc-3166-1/LAO,
   :lcc-lr/hasTag "LAO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LAO",
   :skos/definition
   "Alpha-3 country code for Lao People's Democratic Republic (the)"})

(def LB
  "Alpha-2 country code for Lebanon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Lebanon,
   :db/ident :lcc-3166-1/LB,
   :lcc-lr/hasTag "LB",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LB",
   :skos/definition "Alpha-2 country code for Lebanon"})

(def LBN
  "Alpha-3 country code for Lebanon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Lebanon,
   :db/ident :lcc-3166-1/LBN,
   :lcc-lr/hasTag "LBN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LBN",
   :skos/definition "Alpha-3 country code for Lebanon"})

(def LBR
  "Alpha-3 country code for Liberia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Liberia,
   :db/ident :lcc-3166-1/LBR,
   :lcc-lr/hasTag "LBR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LBR",
   :skos/definition "Alpha-3 country code for Liberia"})

(def LBY
  "Alpha-3 country code for Libya"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Libya,
   :db/ident :lcc-3166-1/LBY,
   :lcc-lr/hasTag "LBY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LBY",
   :skos/definition "Alpha-3 country code for Libya"})

(def LC
  "Alpha-2 country code for Saint Lucia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintLucia,
   :db/ident :lcc-3166-1/LC,
   :lcc-lr/hasTag "LC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LC",
   :skos/definition "Alpha-2 country code for Saint Lucia"})

(def LCA
  "Alpha-3 country code for Saint Lucia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintLucia,
   :db/ident :lcc-3166-1/LCA,
   :lcc-lr/hasTag "LCA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LCA",
   :skos/definition "Alpha-3 country code for Saint Lucia"})

(def LI
  "Alpha-2 country code for Liechtenstein"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Liechtenstein,
   :db/ident :lcc-3166-1/LI,
   :lcc-lr/hasTag "LI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LI",
   :skos/definition "Alpha-2 country code for Liechtenstein"})

(def LIE
  "Alpha-3 country code for Liechtenstein"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Liechtenstein,
   :db/ident :lcc-3166-1/LIE,
   :lcc-lr/hasTag "LIE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LIE",
   :skos/definition "Alpha-3 country code for Liechtenstein"})

(def LK
  "Alpha-2 country code for Sri Lanka"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SriLanka,
   :db/ident :lcc-3166-1/LK,
   :lcc-lr/hasTag "LK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LK",
   :skos/definition "Alpha-2 country code for Sri Lanka"})

(def LKA
  "Alpha-3 country code for Sri Lanka"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SriLanka,
   :db/ident :lcc-3166-1/LKA,
   :lcc-lr/hasTag "LKA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LKA",
   :skos/definition "Alpha-3 country code for Sri Lanka"})

(def LR
  "Alpha-2 country code for Liberia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Liberia,
   :db/ident :lcc-3166-1/LR,
   :lcc-lr/hasTag "LR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LR",
   :skos/definition "Alpha-2 country code for Liberia"})

(def LS
  "Alpha-2 country code for Lesotho"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Lesotho,
   :db/ident :lcc-3166-1/LS,
   :lcc-lr/hasTag "LS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LS",
   :skos/definition "Alpha-2 country code for Lesotho"})

(def LSO
  "Alpha-3 country code for Lesotho"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Lesotho,
   :db/ident :lcc-3166-1/LSO,
   :lcc-lr/hasTag "LSO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LSO",
   :skos/definition "Alpha-3 country code for Lesotho"})

(def LT
  "Alpha-2 country code for Lithuania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Lithuania,
   :db/ident :lcc-3166-1/LT,
   :lcc-lr/hasTag "LT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LT",
   :skos/definition "Alpha-2 country code for Lithuania"})

(def LTU
  "Alpha-3 country code for Lithuania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Lithuania,
   :db/ident :lcc-3166-1/LTU,
   :lcc-lr/hasTag "LTU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LTU",
   :skos/definition "Alpha-3 country code for Lithuania"})

(def LU
  "Alpha-2 country code for Luxembourg"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Luxembourg,
   :db/ident :lcc-3166-1/LU,
   :lcc-lr/hasTag "LU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LU",
   :skos/definition "Alpha-2 country code for Luxembourg"})

(def LUX
  "Alpha-3 country code for Luxembourg"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Luxembourg,
   :db/ident :lcc-3166-1/LUX,
   :lcc-lr/hasTag "LUX",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LUX",
   :skos/definition "Alpha-3 country code for Luxembourg"})

(def LV
  "Alpha-2 country code for Latvia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Latvia,
   :db/ident :lcc-3166-1/LV,
   :lcc-lr/hasTag "LV",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LV",
   :skos/definition "Alpha-2 country code for Latvia"})

(def LVA
  "Alpha-3 country code for Latvia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Latvia,
   :db/ident :lcc-3166-1/LVA,
   :lcc-lr/hasTag "LVA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LVA",
   :skos/definition "Alpha-3 country code for Latvia"})

(def LY
  "Alpha-2 country code for Libya"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Libya,
   :db/ident :lcc-3166-1/LY,
   :lcc-lr/hasTag "LY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LY",
   :skos/definition "Alpha-2 country code for Libya"})

(def LaoPeoplesDemocraticRepublic
  "the country of Lao People's Democratic Republic (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Lao People's Democratic Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Lao People's Democratic Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "LAO PEOPLE'S DEMOCRATIC REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République démocratique populaire lao"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Lao (la République démocratique populaire)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "LAO, RÉPUBLIQUE DÉMOCRATIQUE POPULAIRE"},
   :lcc-cr/hasLocalShortName {:rdf/language "lo",
                              :rdf/value
                              "Sathalanalat Paxathipatai Paxaxôn Lao"},
   :lcc-cr/hasNumericRegionCode "418",
   :lcc-cr/hasRemarks "Also referred to as Laos.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Lao,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "lo",
                :rdf/value    "Sathalanalat Paxathipatai Paxaxôn Lao"},
   :skos/definition "the country of Lao People's Democratic Republic (the)"})

(def Latvia
  "the country of Latvia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Latvia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Latvia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Latvia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LATVIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Lettonie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Lettonie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LETTONIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "lv",
                              :rdf/value    "Latvija"},
   :lcc-cr/hasNumericRegionCode "428",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Latvian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "lv",
                :rdf/value    "Latvija"},
   :skos/definition "the country of Latvia"})

(def Lebanon
  "the country of Lebanon"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Lebanon,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Lebanese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Lebanon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LEBANON"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République libanaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Liban (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIBAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Lubnān"},
   :lcc-cr/hasNumericRegionCode "422",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Lubnān"},
   :skos/definition "the country of Lebanon"})

(def Lesotho
  "the country of Lesotho"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Lesotho,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Lesotho"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Lesotho"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LESOTHO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Lesotho"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Lesotho (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LESOTHO"},
   :lcc-cr/hasLocalShortName {:rdf/language "st",
                              :rdf/value    "Lesotho"},
   :lcc-cr/hasNumericRegionCode "426",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/SouthernSotho
                                       :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "st",
                 :rdf/value    "Lesotho"}
                {:rdf/language "en",
                 :rdf/value    "Lesotho"}],
   :skos/definition "the country of Lesotho"})

(def Liberia
  "the country of Liberia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Liberia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Liberia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Liberia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LIBERIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Libéria"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Libéria (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIBÉRIA"},
   :lcc-cr/hasNumericRegionCode "430",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Liberia"},
   :skos/definition "the country of Liberia"})

(def Libya
  "the country of Libya"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Libya,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Libya"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Libya"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LIBYA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État de Libye"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Libye (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIBYE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Lībiyā"},
   :lcc-cr/hasNumericRegionCode "434",
   :lcc-cr/hasRemarks
   "The subdivision category sha‘bīyah (popularate) is no longer used since the fall of Gaddafi. The word Muḩāfaz̧ah governorate is now sometimes used instead for these subdivisions of Libya, which are those pre-2011. The unrest in Libya means that there is no recognised current administrative structure.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Lībiyā"},
   :skos/definition "the country of Libya"})

(def Liechtenstein
  "the country of Liechtenstein"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Liechtenstein,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Principality of Liechtenstein"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Liechtenstein"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LIECHTENSTEIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Principauté du Liechtenstein"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Liechtenstein (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIECHTENSTEIN"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Liechtenstein"},
   :lcc-cr/hasNumericRegionCode "438",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Liechtenstein"},
   :skos/definition "the country of Liechtenstein"})

(def Lithuania
  "the country of Lithuania"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Lithuania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Lithuania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Lithuania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LITHUANIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Lituanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Lituanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LITUANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "lt",
                              :rdf/value    "Lietuva"},
   :lcc-cr/hasNumericRegionCode "440",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Lithuanian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "lt",
                :rdf/value    "Lietuva"},
   :skos/definition "the country of Lithuania"})

(def Luxembourg
  "the country of Luxembourg"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Luxembourg,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Grand Duchy of Luxembourg"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Luxembourg"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LUXEMBOURG"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Grand-Duché de Luxembourg"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Luxembourg (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LUXEMBOURG"},
   :lcc-cr/hasLocalShortName [{:rdf/language "de",
                               :rdf/value    "Luxemburg"}
                              {:rdf/language "lb",
                               :rdf/value    "Lëtzebuerg"}],
   :lcc-cr/hasNumericRegionCode "442",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/German :lcc-639-1/French :lcc-639-1/Luxembourgish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Luxembourg (le)"}
                {:rdf/language "lb",
                 :rdf/value    "Lëtzebuerg"}
                {:rdf/language "de",
                 :rdf/value    "Luxemburg"}],
   :skos/definition "the country of Luxembourg"})

(def MA
  "Alpha-2 country code for Morocco"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Morocco,
   :db/ident :lcc-3166-1/MA,
   :lcc-lr/hasTag "MA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MA",
   :skos/definition "Alpha-2 country code for Morocco"})

(def MAC
  "Alpha-3 country code for Macao"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Macao,
   :db/ident :lcc-3166-1/MAC,
   :lcc-lr/hasTag "MAC",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MAC",
   :skos/definition "Alpha-3 country code for Macao"})

(def MAF
  "Alpha-3 country code for Saint Martin (French part)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintMartin,
   :db/ident :lcc-3166-1/MAF,
   :lcc-lr/hasTag "MAF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MAF",
   :skos/definition "Alpha-3 country code for Saint Martin (French part)"})

(def MAR
  "Alpha-3 country code for Morocco"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Morocco,
   :db/ident :lcc-3166-1/MAR,
   :lcc-lr/hasTag "MAR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MAR",
   :skos/definition "Alpha-3 country code for Morocco"})

(def MC
  "Alpha-2 country code for Monaco"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Monaco,
   :db/ident :lcc-3166-1/MC,
   :lcc-lr/hasTag "MC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MC",
   :skos/definition "Alpha-2 country code for Monaco"})

(def MCO
  "Alpha-3 country code for Monaco"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Monaco,
   :db/ident :lcc-3166-1/MCO,
   :lcc-lr/hasTag "MCO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MCO",
   :skos/definition "Alpha-3 country code for Monaco"})

(def MD
  "Alpha-2 country code for Moldova (the Republic of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Moldova,
   :db/ident :lcc-3166-1/MD,
   :lcc-lr/hasTag "MD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MD",
   :skos/definition "Alpha-2 country code for Moldova (the Republic of)"})

(def MDA
  "Alpha-3 country code for Moldova (the Republic of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Moldova,
   :db/ident :lcc-3166-1/MDA,
   :lcc-lr/hasTag "MDA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MDA",
   :skos/definition "Alpha-3 country code for Moldova (the Republic of)"})

(def MDG
  "Alpha-3 country code for Madagascar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Madagascar,
   :db/ident :lcc-3166-1/MDG,
   :lcc-lr/hasTag "MDG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MDG",
   :skos/definition "Alpha-3 country code for Madagascar"})

(def MDV
  "Alpha-3 country code for Maldives"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Maldives,
   :db/ident :lcc-3166-1/MDV,
   :lcc-lr/hasTag "MDV",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MDV",
   :skos/definition "Alpha-3 country code for Maldives"})

(def ME
  "Alpha-2 country code for Montenegro"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Montenegro,
   :db/ident :lcc-3166-1/ME,
   :lcc-lr/hasTag "ME",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ME",
   :skos/definition "Alpha-2 country code for Montenegro"})

(def MEX
  "Alpha-3 country code for Mexico"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mexico,
   :db/ident :lcc-3166-1/MEX,
   :lcc-lr/hasTag "MEX",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MEX",
   :skos/definition "Alpha-3 country code for Mexico"})

(def MF
  "Alpha-2 country code for Saint Martin (French part)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintMartin,
   :db/ident :lcc-3166-1/MF,
   :lcc-lr/hasTag "MF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MF",
   :skos/definition "Alpha-2 country code for Saint Martin (French part)"})

(def MG
  "Alpha-2 country code for Madagascar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Madagascar,
   :db/ident :lcc-3166-1/MG,
   :lcc-lr/hasTag "MG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MG",
   :skos/definition "Alpha-2 country code for Madagascar"})

(def MH
  "Alpha-2 country code for Marshall Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/MarshallIslands,
   :db/ident :lcc-3166-1/MH,
   :lcc-lr/hasTag "MH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MH",
   :skos/definition "Alpha-2 country code for Marshall Islands (the)"})

(def MHL
  "Alpha-3 country code for Marshall Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/MarshallIslands,
   :db/ident :lcc-3166-1/MHL,
   :lcc-lr/hasTag "MHL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MHL",
   :skos/definition "Alpha-3 country code for Marshall Islands (the)"})

(def MK
  "Alpha-2 country code for North Macedonia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NorthMacedonia,
   :db/ident :lcc-3166-1/MK,
   :lcc-lr/hasTag "MK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MK",
   :skos/definition "Alpha-2 country code for North Macedonia"})

(def MKD
  "Alpha-3 country code for North Macedonia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NorthMacedonia,
   :db/ident :lcc-3166-1/MKD,
   :lcc-lr/hasTag "MKD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MKD",
   :skos/definition "Alpha-3 country code for North Macedonia"})

(def ML
  "Alpha-2 country code for Mali"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mali,
   :db/ident :lcc-3166-1/ML,
   :lcc-lr/hasTag "ML",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ML",
   :skos/definition "Alpha-2 country code for Mali"})

(def MLI
  "Alpha-3 country code for Mali"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mali,
   :db/ident :lcc-3166-1/MLI,
   :lcc-lr/hasTag "MLI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MLI",
   :skos/definition "Alpha-3 country code for Mali"})

(def MLT
  "Alpha-3 country code for Malta"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Malta,
   :db/ident :lcc-3166-1/MLT,
   :lcc-lr/hasTag "MLT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MLT",
   :skos/definition "Alpha-3 country code for Malta"})

(def MM
  "Alpha-2 country code for Myanmar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Myanmar,
   :db/ident :lcc-3166-1/MM,
   :lcc-lr/hasTag "MM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MM",
   :skos/definition "Alpha-2 country code for Myanmar"})

(def MMR
  "Alpha-3 country code for Myanmar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Myanmar,
   :db/ident :lcc-3166-1/MMR,
   :lcc-lr/hasTag "MMR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MMR",
   :skos/definition "Alpha-3 country code for Myanmar"})

(def MN
  "Alpha-2 country code for Mongolia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mongolia,
   :db/ident :lcc-3166-1/MN,
   :lcc-lr/hasTag "MN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MN",
   :skos/definition "Alpha-2 country code for Mongolia"})

(def MNE
  "Alpha-3 country code for Montenegro"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Montenegro,
   :db/ident :lcc-3166-1/MNE,
   :lcc-lr/hasTag "MNE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MNE",
   :skos/definition "Alpha-3 country code for Montenegro"})

(def MNG
  "Alpha-3 country code for Mongolia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mongolia,
   :db/ident :lcc-3166-1/MNG,
   :lcc-lr/hasTag "MNG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MNG",
   :skos/definition "Alpha-3 country code for Mongolia"})

(def MNP
  "Alpha-3 country code for Northern Mariana Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NorthernMarianaIslands,
   :db/ident :lcc-3166-1/MNP,
   :lcc-lr/hasTag "MNP",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MNP",
   :skos/definition "Alpha-3 country code for Northern Mariana Islands (the)"})

(def MO
  "Alpha-2 country code for Macao"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Macao,
   :db/ident :lcc-3166-1/MO,
   :lcc-lr/hasTag "MO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MO",
   :skos/definition "Alpha-2 country code for Macao"})

(def MOZ
  "Alpha-3 country code for Mozambique"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mozambique,
   :db/ident :lcc-3166-1/MOZ,
   :lcc-lr/hasTag "MOZ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MOZ",
   :skos/definition "Alpha-3 country code for Mozambique"})

(def MP
  "Alpha-2 country code for Northern Mariana Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NorthernMarianaIslands,
   :db/ident :lcc-3166-1/MP,
   :lcc-lr/hasTag "MP",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MP",
   :skos/definition "Alpha-2 country code for Northern Mariana Islands (the)"})

(def MQ
  "Alpha-2 country code for Martinique"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Martinique,
   :db/ident :lcc-3166-1/MQ,
   :lcc-lr/hasTag "MQ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MQ",
   :skos/definition "Alpha-2 country code for Martinique"})

(def MR
  "Alpha-2 country code for Mauritania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mauritania,
   :db/ident :lcc-3166-1/MR,
   :lcc-lr/hasTag "MR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MR",
   :skos/definition "Alpha-2 country code for Mauritania"})

(def MRT
  "Alpha-3 country code for Mauritania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mauritania,
   :db/ident :lcc-3166-1/MRT,
   :lcc-lr/hasTag "MRT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MRT",
   :skos/definition "Alpha-3 country code for Mauritania"})

(def MS
  "Alpha-2 country code for Montserrat"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Montserrat,
   :db/ident :lcc-3166-1/MS,
   :lcc-lr/hasTag "MS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MS",
   :skos/definition "Alpha-2 country code for Montserrat"})

(def MSR
  "Alpha-3 country code for Montserrat"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Montserrat,
   :db/ident :lcc-3166-1/MSR,
   :lcc-lr/hasTag "MSR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MSR",
   :skos/definition "Alpha-3 country code for Montserrat"})

(def MT
  "Alpha-2 country code for Malta"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Malta,
   :db/ident :lcc-3166-1/MT,
   :lcc-lr/hasTag "MT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MT",
   :skos/definition "Alpha-2 country code for Malta"})

(def MTQ
  "Alpha-3 country code for Martinique"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Martinique,
   :db/ident :lcc-3166-1/MTQ,
   :lcc-lr/hasTag "MTQ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MTQ",
   :skos/definition "Alpha-3 country code for Martinique"})

(def MU
  "Alpha-2 country code for Mauritius"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mauritius,
   :db/ident :lcc-3166-1/MU,
   :lcc-lr/hasTag "MU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MU",
   :skos/definition "Alpha-2 country code for Mauritius"})

(def MUS
  "Alpha-3 country code for Mauritius"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mauritius,
   :db/ident :lcc-3166-1/MUS,
   :lcc-lr/hasTag "MUS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MUS",
   :skos/definition "Alpha-3 country code for Mauritius"})

(def MV
  "Alpha-2 country code for Maldives"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Maldives,
   :db/ident :lcc-3166-1/MV,
   :lcc-lr/hasTag "MV",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MV",
   :skos/definition "Alpha-2 country code for Maldives"})

(def MW
  "Alpha-2 country code for Malawi"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Malawi,
   :db/ident :lcc-3166-1/MW,
   :lcc-lr/hasTag "MW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MW",
   :skos/definition "Alpha-2 country code for Malawi"})

(def MWI
  "Alpha-3 country code for Malawi"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Malawi,
   :db/ident :lcc-3166-1/MWI,
   :lcc-lr/hasTag "MWI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MWI",
   :skos/definition "Alpha-3 country code for Malawi"})

(def MX
  "Alpha-2 country code for Mexico"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mexico,
   :db/ident :lcc-3166-1/MX,
   :lcc-lr/hasTag "MX",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MX",
   :skos/definition "Alpha-2 country code for Mexico"})

(def MY
  "Alpha-2 country code for Malaysia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Malaysia,
   :db/ident :lcc-3166-1/MY,
   :lcc-lr/hasTag "MY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MY",
   :skos/definition "Alpha-2 country code for Malaysia"})

(def MYS
  "Alpha-3 country code for Malaysia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Malaysia,
   :db/ident :lcc-3166-1/MYS,
   :lcc-lr/hasTag "MYS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MYS",
   :skos/definition "Alpha-3 country code for Malaysia"})

(def MYT
  "Alpha-3 country code for Mayotte"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mayotte,
   :db/ident :lcc-3166-1/MYT,
   :lcc-lr/hasTag "MYT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MYT",
   :skos/definition "Alpha-3 country code for Mayotte"})

(def MZ
  "Alpha-2 country code for Mozambique"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mozambique,
   :db/ident :lcc-3166-1/MZ,
   :lcc-lr/hasTag "MZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MZ",
   :skos/definition "Alpha-2 country code for Mozambique"})

(def Macao
  "the country of Macao"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Macao,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "Macao Special Administrative Region of China"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Macao"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MACAO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "Macao, Région administrative spéciale de Chine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Macao"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MACAO"},
   :lcc-cr/hasLocalShortName [{:rdf/language "zh",
                               :rdf/value    "Aomen"}
                              {:rdf/language "pt",
                               :rdf/value    "Macau"}],
   :lcc-cr/hasNumericRegionCode "446",
   :lcc-cr/hasRemarks
   "Subdivision in 2 districts, distrito (pt), which is not relevant for this part of ISO 3166. Included also as a subdivision of China (CN-MO).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Chinese
                                       :lcc-639-1/Portuguese],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "zh",
                 :rdf/value    "Aomen"}
                {:rdf/language "pt",
                 :rdf/value    "Macau"}],
   :skos/definition "the country of Macao"})

(def Madagascar
  "the country of Madagascar"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Madagascar,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Madagascar"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Madagascar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MADAGASCAR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Madagascar"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Madagascar"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MADAGASCAR"},
   :lcc-cr/hasLocalShortName {:rdf/language "mg",
                              :rdf/value    "Madagasikara"},
   :lcc-cr/hasNumericRegionCode "450",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Malagasy :lcc-639-1/English :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Madagascar"}
                {:rdf/language "en",
                 :rdf/value    "Madagascar"}
                {:rdf/language "mg",
                 :rdf/value    "Madagasikara"}],
   :skos/definition "the country of Madagascar"})

(def Malawi
  "the country of Malawi"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Malawi,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Malawi"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Malawi"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALAWI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Malawi"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Malawi (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALAWI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ny",
                              :rdf/value    "Malaŵi"},
   :lcc-cr/hasNumericRegionCode "454",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Chichewa],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ny",
                 :rdf/value    "Malaŵi"}
                {:rdf/language "en",
                 :rdf/value    "Malawi"}],
   :skos/definition "the country of Malawi"})

(def Malaysia
  "the country of Malaysia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Malaysia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Malaysia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALAYSIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Malaisie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALAISIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ms",
                              :rdf/value    "Malaysia"},
   :lcc-cr/hasNumericRegionCode "458",
   :lcc-cr/hasRemarks "Comprises: Peninsular Malaysia, Sabah, Sarawak.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Malay,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ms",
                :rdf/value    "Malaysia"},
   :skos/definition "the country of Malaysia"})

(def Maldives
  "the country of Maldives"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Maldives,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Maldives"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Maldives"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALDIVES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Maldives"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Maldives (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALDIVES"},
   :lcc-cr/hasLocalShortName {:rdf/language "dv",
                              :rdf/value    "Dhivehi Raajje"},
   :lcc-cr/hasNumericRegionCode "462",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dhivehi,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "dv",
                :rdf/value    "Dhivehi Raajje"},
   :skos/definition "the country of Maldives"})

(def Mali
  "the country of Mali"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mali,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Mali"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mali"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Mali"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mali (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALI"},
   :lcc-cr/hasNumericRegionCode "466",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Mali (le)"},
   :skos/definition "the country of Mali"})

(def Malta
  "the country of Malta"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Malta,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Malta"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Malta"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALTA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Malte"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Malte"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALTE"},
   :lcc-cr/hasLocalShortName {:rdf/language "mt",
                              :rdf/value    "Malta"},
   :lcc-cr/hasNumericRegionCode "470",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Maltese :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "mt",
                 :rdf/value    "Malta"}
                {:rdf/language "en",
                 :rdf/value    "Malta"}],
   :skos/definition "the country of Malta"})

(def MarshallIslands
  "the country of Marshall Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/MarshallIslands,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Republic of the Marshall Islands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Marshall Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MARSHALL ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Îles Marshall"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Marshall (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MARSHALL, ÎLES"},
   :lcc-cr/hasLocalShortName {:rdf/language "mh",
                              :rdf/value    "Aelōn̄ in M̧ajeļ"},
   :lcc-cr/hasNumericRegionCode "584",
   :lcc-cr/hasRemarks "Principal atolls: Jaluit, Kwajalein, Majuro.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English
                                       :lcc-639-1/Marshallese],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Marshall Islands (the)"}
                {:rdf/language "mh",
                 :rdf/value    "Aelōn̄ in M̧ajeļ"}],
   :skos/definition "the country of Marshall Islands (the)"})

(def Martinique
  "the country of Martinique"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Martinique,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Martinique"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MARTINIQUE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Martinique (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MARTINIQUE"},
   :lcc-cr/hasNumericRegionCode "474",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-MQ).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Martinique (la)"},
   :skos/definition "the country of Martinique"})

(def Mauritania
  "the country of Mauritania"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mauritania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Islamic Republic of Mauritania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mauritania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MAURITANIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République islamique de Mauritanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mauritanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAURITANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Mūrītāniyā"},
   :lcc-cr/hasNumericRegionCode "478",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Mūrītāniyā"},
   :skos/definition "the country of Mauritania"})

(def Mauritius
  "the country of Mauritius"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mauritius,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Mauritius"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mauritius"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MAURITIUS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Maurice"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Maurice"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAURICE"},
   :lcc-cr/hasNumericRegionCode "480",
   :lcc-cr/hasRemarks
   "Includes: Agalega Islands, Cargados Carajos Shoals, Rodrigues Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mauritius"},
   :skos/definition "the country of Mauritius"})

(def Mayotte
  "the country of Mayotte"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mayotte,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mayotte"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MAYOTTE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mayotte"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAYOTTE"},
   :lcc-cr/hasNumericRegionCode "175",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-YT).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Mayotte"},
   :skos/definition "the country of Mayotte"})

(def Mexico
  "the country of Mexico"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mexico,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United Mexican States"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mexico"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MEXICO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les États-Unis du Mexique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mexique (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MEXIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "México"},
   :lcc-cr/hasNumericRegionCode "484",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "México"},
   :skos/definition "the country of Mexico"})

(def Micronesia
  "the country of Micronesia (Federated States of)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Micronesia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Federated States of Micronesia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Micronesia (Federated States of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "MICRONESIA (FEDERATED STATES OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les États fédérés de Micronésie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Micronésie (États fédérés de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "MICRONÉSIE (ÉTATS FÉDÉRÉS DE)"},
   :lcc-cr/hasNumericRegionCode "583",
   :lcc-cr/hasRemarks
   "Comprises: Caroline Islands (except PALAU, see separate entry). Principal islands: Chuuk, Kosrae, Pohnpei, YapChuuk, Kosrae, Pohnpei, Yap.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Micronesia (Federated States of)"},
   :skos/definition "the country of Micronesia (Federated States of)"})

(def Moldova
  "the country of Moldova (the Republic of)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Moldova,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Moldova"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Moldova (the Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MOLDOVA, REPUBLIC OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Moldova"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Moldova (la République de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "MOLDOVA, RÉPUBLIQUE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ro",
                              :rdf/value    "Republica Moldova"},
   :lcc-cr/hasNumericRegionCode "498",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Romanian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ro",
                :rdf/value    "Republica Moldova"},
   :skos/definition "the country of Moldova (the Republic of)"})

(def Monaco
  "the country of Monaco"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Monaco,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Principality of Monaco"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Monaco"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONACO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Principauté de Monaco"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Monaco"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONACO"},
   :lcc-cr/hasNumericRegionCode "492",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Monaco"},
   :skos/definition "the country of Monaco"})

(def Mongolia
  "the country of Mongolia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mongolia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mongolia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONGOLIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mongolie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONGOLIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "mn",
                              :rdf/value    "Mongol"},
   :lcc-cr/hasNumericRegionCode "496",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Mongolian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "mn",
                :rdf/value    "Mongol"},
   :skos/definition "the country of Mongolia"})

(def Montenegrin
  {:db/ident       :lcc-3166-1/Montenegrin,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-2/Montenegrin,
   :rdf/type       [:lcc-lr/IndividualLanguage :owl/NamedIndividual]})

(def Montenegro
  "the country of Montenegro"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Montenegro,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Montenegro"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONTENEGRO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "Monténégro (le)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Monténégro (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONTÉNÉGRO"},
   :lcc-cr/hasLocalShortName "Crna Gora",
   :lcc-cr/hasNumericRegionCode "499",
   :lcc-cr/hasRemarks
   "Montenegro was formerly part of former entries: YUGOSLAVIA (YU, YUG, 891) then SERBIA AND MONTENEGRO (CS, SCG, 891).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-2/Montenegrin,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/definition "the country of Montenegro"})

(def Montserrat
  "the country of Montserrat"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Montserrat,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Montserrat"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONTSERRAT"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Montserrat"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONTSERRAT"},
   :lcc-cr/hasNumericRegionCode "500",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Montserrat"},
   :skos/definition "the country of Montserrat"})

(def Morocco
  "the country of Morocco"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Morocco,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Morocco"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Morocco"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MOROCCO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Maroc"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Maroc (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAROC"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Maghrib"},
   :lcc-cr/hasNumericRegionCode "504",
   :lcc-cr/hasRemarks
   "Remark: Entries followed by \"(EH)\" are located partially or fully in the territory of Western Sahara (ISO 3166 alpha-2 code element EH).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Maghrib"},
   :skos/definition "the country of Morocco"})

(def Mozambique
  "the country of Mozambique"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Mozambique,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Mozambique"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mozambique"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MOZAMBIQUE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Mozambique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mozambique (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MOZAMBIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Moçambique"},
   :lcc-cr/hasNumericRegionCode "508",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Moçambique"},
   :skos/definition "the country of Mozambique"})

(def Myanmar
  "the country of Myanmar"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Myanmar,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Republic of the Union of Myanmar"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Myanmar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MYANMAR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de l'Union du Myanmar"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Myanmar (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MYANMAR"},
   :lcc-cr/hasLocalShortName {:rdf/language "my",
                              :rdf/value    "Myanma"},
   :lcc-cr/hasNumericRegionCode "104",
   :lcc-cr/hasRemarks
   "Remark: the forms used in the list are English-language forms provided by Myanmar.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Burmese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "my",
                :rdf/value    "Myanma"},
   :skos/definition "the country of Myanmar"})

(def NA
  "Alpha-2 country code for Namibia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Namibia,
   :db/ident :lcc-3166-1/NA,
   :lcc-lr/hasTag "NA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NA",
   :skos/definition "Alpha-2 country code for Namibia"})

(def NAM
  "Alpha-3 country code for Namibia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Namibia,
   :db/ident :lcc-3166-1/NAM,
   :lcc-lr/hasTag "NAM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NAM",
   :skos/definition "Alpha-3 country code for Namibia"})

(def NC
  "Alpha-2 country code for New Caledonia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NewCaledonia,
   :db/ident :lcc-3166-1/NC,
   :lcc-lr/hasTag "NC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NC",
   :skos/definition "Alpha-2 country code for New Caledonia"})

(def NCL
  "Alpha-3 country code for New Caledonia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NewCaledonia,
   :db/ident :lcc-3166-1/NCL,
   :lcc-lr/hasTag "NCL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NCL",
   :skos/definition "Alpha-3 country code for New Caledonia"})

(def NE
  "Alpha-2 country code for Niger (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Niger,
   :db/ident :lcc-3166-1/NE,
   :lcc-lr/hasTag "NE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NE",
   :skos/definition "Alpha-2 country code for Niger (the)"})

(def NER
  "Alpha-3 country code for Niger (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Niger,
   :db/ident :lcc-3166-1/NER,
   :lcc-lr/hasTag "NER",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NER",
   :skos/definition "Alpha-3 country code for Niger (the)"})

(def NF
  "Alpha-2 country code for Norfolk Island"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NorfolkIsland,
   :db/ident :lcc-3166-1/NF,
   :lcc-lr/hasTag "NF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NF",
   :skos/definition "Alpha-2 country code for Norfolk Island"})

(def NFK
  "Alpha-3 country code for Norfolk Island"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NorfolkIsland,
   :db/ident :lcc-3166-1/NFK,
   :lcc-lr/hasTag "NFK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NFK",
   :skos/definition "Alpha-3 country code for Norfolk Island"})

(def NG
  "Alpha-2 country code for Nigeria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nigeria,
   :db/ident :lcc-3166-1/NG,
   :lcc-lr/hasTag "NG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NG",
   :skos/definition "Alpha-2 country code for Nigeria"})

(def NGA
  "Alpha-3 country code for Nigeria"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nigeria,
   :db/ident :lcc-3166-1/NGA,
   :lcc-lr/hasTag "NGA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NGA",
   :skos/definition "Alpha-3 country code for Nigeria"})

(def NI
  "Alpha-2 country code for Nicaragua"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nicaragua,
   :db/ident :lcc-3166-1/NI,
   :lcc-lr/hasTag "NI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NI",
   :skos/definition "Alpha-2 country code for Nicaragua"})

(def NIC
  "Alpha-3 country code for Nicaragua"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nicaragua,
   :db/ident :lcc-3166-1/NIC,
   :lcc-lr/hasTag "NIC",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NIC",
   :skos/definition "Alpha-3 country code for Nicaragua"})

(def NIU
  "Alpha-3 country code for Niue"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Niue,
   :db/ident :lcc-3166-1/NIU,
   :lcc-lr/hasTag "NIU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NIU",
   :skos/definition "Alpha-3 country code for Niue"})

(def NL
  "Alpha-2 country code for Netherlands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Netherlands,
   :db/ident :lcc-3166-1/NL,
   :lcc-lr/hasTag "NL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NL",
   :skos/definition "Alpha-2 country code for Netherlands (the)"})

(def NLD
  "Alpha-3 country code for Netherlands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Netherlands,
   :db/ident :lcc-3166-1/NLD,
   :lcc-lr/hasTag "NLD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NLD",
   :skos/definition "Alpha-3 country code for Netherlands (the)"})

(def NO
  "Alpha-2 country code for Norway"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Norway,
   :db/ident :lcc-3166-1/NO,
   :lcc-lr/hasTag "NO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NO",
   :skos/definition "Alpha-2 country code for Norway"})

(def NOR
  "Alpha-3 country code for Norway"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Norway,
   :db/ident :lcc-3166-1/NOR,
   :lcc-lr/hasTag "NOR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NOR",
   :skos/definition "Alpha-3 country code for Norway"})

(def NP
  "Alpha-2 country code for Nepal"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nepal,
   :db/ident :lcc-3166-1/NP,
   :lcc-lr/hasTag "NP",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NP",
   :skos/definition "Alpha-2 country code for Nepal"})

(def NPL
  "Alpha-3 country code for Nepal"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nepal,
   :db/ident :lcc-3166-1/NPL,
   :lcc-lr/hasTag "NPL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NPL",
   :skos/definition "Alpha-3 country code for Nepal"})

(def NR
  "Alpha-2 country code for Nauru"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nauru,
   :db/ident :lcc-3166-1/NR,
   :lcc-lr/hasTag "NR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NR",
   :skos/definition "Alpha-2 country code for Nauru"})

(def NRU
  "Alpha-3 country code for Nauru"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Nauru,
   :db/ident :lcc-3166-1/NRU,
   :lcc-lr/hasTag "NRU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NRU",
   :skos/definition "Alpha-3 country code for Nauru"})

(def NU
  "Alpha-2 country code for Niue"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Niue,
   :db/ident :lcc-3166-1/NU,
   :lcc-lr/hasTag "NU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NU",
   :skos/definition "Alpha-2 country code for Niue"})

(def NZ
  "Alpha-2 country code for New Zealand"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NewZealand,
   :db/ident :lcc-3166-1/NZ,
   :lcc-lr/hasTag "NZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NZ",
   :skos/definition "Alpha-2 country code for New Zealand"})

(def NZL
  "Alpha-3 country code for New Zealand"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/NewZealand,
   :db/ident :lcc-3166-1/NZL,
   :lcc-lr/hasTag "NZL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NZL",
   :skos/definition "Alpha-3 country code for New Zealand"})

(def Namibia
  "the country of Namibia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Namibia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Namibia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Namibia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NAMIBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Namibie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Namibie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NAMIBIE"},
   :lcc-cr/hasNumericRegionCode "516",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Namibia"},
   :skos/definition "the country of Namibia"})

(def Nauru
  "the country of Nauru"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Nauru,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Nauru"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nauru"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NAURU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Nauru"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nauru"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NAURU"},
   :lcc-cr/hasLocalShortName {:rdf/language "na",
                              :rdf/value    "Naoero"},
   :lcc-cr/hasNumericRegionCode "520",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Nauru],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "na",
                 :rdf/value    "Naoero"}
                {:rdf/language "en",
                 :rdf/value    "Nauru"}],
   :skos/definition "the country of Nauru"})

(def Nepal
  "the country of Nepal"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Nepal,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nepal"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NEPAL"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Népal (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NÉPAL"},
   :lcc-cr/hasLocalShortName {:rdf/language "ne",
                              :rdf/value    "Nepāl"},
   :lcc-cr/hasNumericRegionCode "524",
   :lcc-cr/hasRemarks
   "In September 2015 Nepal created a new federal structure consisting of 7 provinces. Until now only two of these provinces have names. The rest are identified by numbers only. These provinces should replace the zones and development regions but this has not yet been fully implemented.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Nepali,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ne",
                :rdf/value    "Nepāl"},
   :skos/definition "the country of Nepal"})

(def Netherlands
  "the country of Netherlands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Netherlands,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of the Netherlands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Netherlands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NETHERLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume des Pays-Bas"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pays-Bas (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PAYS-BAS"},
   :lcc-cr/hasLocalShortName {:rdf/language "nl",
                              :rdf/value    "Nederland"},
   :lcc-cr/hasNumericRegionCode "528",
   :lcc-cr/hasRemarks "Includes: the islands Bonaire, Sint Eustatius and Saba.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dutch,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "nl",
                :rdf/value    "Nederland"},
   :skos/definition "the country of Netherlands (the)"})

(def NewCaledonia
  "the country of New Caledonia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/NewCaledonia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "New Caledonia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NEW CALEDONIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nouvelle-Calédonie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NOUVELLE-CALÉDONIE"},
   :lcc-cr/hasNumericRegionCode "540",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as a subdivision of France (FR-NC)."
    "Includes: Loyalty Islands."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Nouvelle-Calédonie (la)"},
   :skos/definition "the country of New Caledonia"})

(def NewZealand
  "the country of New Zealand"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/NewZealand,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "New Zealand"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NEW ZEALAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nouvelle-Zélande (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NOUVELLE-ZÉLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "mi",
                              :rdf/value    "Aotearoa"},
   :lcc-cr/hasNumericRegionCode "554",
   :lcc-cr/hasRemarks
   "Includes: Antipodes Islands, Auckland Islands, Campbell Island, Chatham Islands, Kermadec Islands.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Maori :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "mi",
                 :rdf/value    "Aotearoa"}
                {:rdf/language "en",
                 :rdf/value    "New Zealand"}],
   :skos/definition "the country of New Zealand"})

(def Nicaragua
  "the country of Nicaragua"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Nicaragua,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Nicaragua"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nicaragua"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NICARAGUA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Nicaragua"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nicaragua (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NICARAGUA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Nicaragua"},
   :lcc-cr/hasNumericRegionCode "558",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Nicaragua"},
   :skos/definition "the country of Nicaragua"})

(def Niger
  "the country of Niger (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Niger,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Niger"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Niger (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NIGER"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Niger"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Niger (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NIGER"},
   :lcc-cr/hasNumericRegionCode "562",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Niger (le)"},
   :skos/definition "the country of Niger (the)"})

(def Nigeria
  "the country of Nigeria"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Nigeria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Federal Republic of Nigeria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nigeria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NIGERIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérale du Nigéria"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nigéria (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NIGÉRIA"},
   :lcc-cr/hasNumericRegionCode "566",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nigeria"},
   :skos/definition "the country of Nigeria"})

(def Niue
  "the country of Niue"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Niue,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Niue"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NIUE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Niue"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NIUE"},
   :lcc-cr/hasLocalShortName "Niue",
   :lcc-cr/hasNumericRegionCode "570",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-2/Niuean],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Niue"},
   :skos/definition "the country of Niue"})

(def NorfolkIsland
  "the country of Norfolk Island"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/NorfolkIsland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Norfolk Island"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NORFOLK ISLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Norfolk (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NORFOLK, ÎLE"},
   :lcc-cr/hasNumericRegionCode "574",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Norfolk Island"},
   :skos/definition "the country of Norfolk Island"})

(def NorthMacedonia
  "the country of North Macedonia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/NorthMacedonia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of North Macedonia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "North Macedonia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NORTH MACEDONIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de Macédoine du Nord"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Macédoine du Nord (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MACÉDOINE DU NORD"},
   :lcc-cr/hasLocalShortName {:rdf/language "mk",
                              :rdf/value    "Severna Makedonija"},
   :lcc-cr/hasNumericRegionCode "807",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Macedonian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "mk",
                :rdf/value    "Severna Makedonija"},
   :skos/definition "the country of North Macedonia"})

(def NorthernMarianaIslands
  "the country of Northern Mariana Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/NorthernMarianaIslands,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Commonwealth of the Northern Mariana Islands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Northern Mariana Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "NORTHERN MARIANA ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Îles Mariannes du Nord"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mariannes du Nord (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "MARIANNES DU NORD, ÎLES"},
   :lcc-cr/hasNumericRegionCode "580",
   :lcc-cr/hasRemarks
   ["Comprises: Mariana Islands (except GUAM, see separate entry). (Principal island: Saipan)."
    "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-MP)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Northern Mariana Islands (the)"},
   :skos/definition "the country of Northern Mariana Islands (the)"})

(def Norway
  "the country of Norway"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Norway,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Norway"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Norway"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NORWAY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Norvège"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Norvège (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NORVÈGE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "nb",
                               :rdf/value    "Norge"}
                              {:rdf/language "nn",
                               :rdf/value    "Noreg"}],
   :lcc-cr/hasNumericRegionCode "578",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/NorwegianBokmal
                                       :lcc-639-1/NorwegianNynorsk],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "nb",
                 :rdf/value    "Norge"}
                {:rdf/language "nn",
                 :rdf/value    "Noreg"}],
   :skos/definition "the country of Norway"})

(def OM
  "Alpha-2 country code for Oman"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Oman,
   :db/ident :lcc-3166-1/OM,
   :lcc-lr/hasTag "OM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "OM",
   :skos/definition "Alpha-2 country code for Oman"})

(def OMN
  "Alpha-3 country code for Oman"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Oman,
   :db/ident :lcc-3166-1/OMN,
   :lcc-lr/hasTag "OMN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "OMN",
   :skos/definition "Alpha-3 country code for Oman"})

(def Oman
  "the country of Oman"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Oman,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Sultanate of Oman"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Oman"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "OMAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Sultanat d'Oman"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Oman"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "OMAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "‘Umān"},
   :lcc-cr/hasNumericRegionCode "512",
   :lcc-cr/hasRemarks "Includes: part of the Musandam Peninsula.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "‘Umān"},
   :skos/definition "the country of Oman"})

(def PA
  "Alpha-2 country code for Panama"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Panama,
   :db/ident :lcc-3166-1/PA,
   :lcc-lr/hasTag "PA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PA",
   :skos/definition "Alpha-2 country code for Panama"})

(def PAK
  "Alpha-3 country code for Pakistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Pakistan,
   :db/ident :lcc-3166-1/PAK,
   :lcc-lr/hasTag "PAK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PAK",
   :skos/definition "Alpha-3 country code for Pakistan"})

(def PAN
  "Alpha-3 country code for Panama"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Panama,
   :db/ident :lcc-3166-1/PAN,
   :lcc-lr/hasTag "PAN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PAN",
   :skos/definition "Alpha-3 country code for Panama"})

(def PCN
  "Alpha-3 country code for Pitcairn"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Pitcairn,
   :db/ident :lcc-3166-1/PCN,
   :lcc-lr/hasTag "PCN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PCN",
   :skos/definition "Alpha-3 country code for Pitcairn"})

(def PE
  "Alpha-2 country code for Peru"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Peru,
   :db/ident :lcc-3166-1/PE,
   :lcc-lr/hasTag "PE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PE",
   :skos/definition "Alpha-2 country code for Peru"})

(def PER
  "Alpha-3 country code for Peru"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Peru,
   :db/ident :lcc-3166-1/PER,
   :lcc-lr/hasTag "PER",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PER",
   :skos/definition "Alpha-3 country code for Peru"})

(def PF
  "Alpha-2 country code for French Polynesia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FrenchPolynesia,
   :db/ident :lcc-3166-1/PF,
   :lcc-lr/hasTag "PF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PF",
   :skos/definition "Alpha-2 country code for French Polynesia"})

(def PG
  "Alpha-2 country code for Papua New Guinea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/PapuaNewGuinea,
   :db/ident :lcc-3166-1/PG,
   :lcc-lr/hasTag "PG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PG",
   :skos/definition "Alpha-2 country code for Papua New Guinea"})

(def PH
  "Alpha-2 country code for Philippines (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Philippines,
   :db/ident :lcc-3166-1/PH,
   :lcc-lr/hasTag "PH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PH",
   :skos/definition "Alpha-2 country code for Philippines (the)"})

(def PHL
  "Alpha-3 country code for Philippines (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Philippines,
   :db/ident :lcc-3166-1/PHL,
   :lcc-lr/hasTag "PHL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PHL",
   :skos/definition "Alpha-3 country code for Philippines (the)"})

(def PK
  "Alpha-2 country code for Pakistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Pakistan,
   :db/ident :lcc-3166-1/PK,
   :lcc-lr/hasTag "PK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PK",
   :skos/definition "Alpha-2 country code for Pakistan"})

(def PL
  "Alpha-2 country code for Poland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Poland,
   :db/ident :lcc-3166-1/PL,
   :lcc-lr/hasTag "PL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PL",
   :skos/definition "Alpha-2 country code for Poland"})

(def PLW
  "Alpha-3 country code for Palau"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Palau,
   :db/ident :lcc-3166-1/PLW,
   :lcc-lr/hasTag "PLW",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PLW",
   :skos/definition "Alpha-3 country code for Palau"})

(def PM
  "Alpha-2 country code for Saint Pierre and Miquelon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintPierreAndMiquelon,
   :db/ident :lcc-3166-1/PM,
   :lcc-lr/hasTag "PM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PM",
   :skos/definition "Alpha-2 country code for Saint Pierre and Miquelon"})

(def PN
  "Alpha-2 country code for Pitcairn"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Pitcairn,
   :db/ident :lcc-3166-1/PN,
   :lcc-lr/hasTag "PN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PN",
   :skos/definition "Alpha-2 country code for Pitcairn"})

(def PNG
  "Alpha-3 country code for Papua New Guinea"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/PapuaNewGuinea,
   :db/ident :lcc-3166-1/PNG,
   :lcc-lr/hasTag "PNG",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PNG",
   :skos/definition "Alpha-3 country code for Papua New Guinea"})

(def POL
  "Alpha-3 country code for Poland"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Poland,
   :db/ident :lcc-3166-1/POL,
   :lcc-lr/hasTag "POL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "POL",
   :skos/definition "Alpha-3 country code for Poland"})

(def PR
  "Alpha-2 country code for Puerto Rico"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/PuertoRico,
   :db/ident :lcc-3166-1/PR,
   :lcc-lr/hasTag "PR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PR",
   :skos/definition "Alpha-2 country code for Puerto Rico"})

(def PRI
  "Alpha-3 country code for Puerto Rico"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/PuertoRico,
   :db/ident :lcc-3166-1/PRI,
   :lcc-lr/hasTag "PRI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRI",
   :skos/definition "Alpha-3 country code for Puerto Rico"})

(def PRK
  "Alpha-3 country code for Korea Democratic Peoples Republic Of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :db/ident :lcc-3166-1/PRK,
   :lcc-lr/hasTag "PRK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRK",
   :skos/definition
   "Alpha-3 country code for Korea Democratic Peoples Republic Of"})

(def PRT
  "Alpha-3 country code for Portugal"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Portugal,
   :db/ident :lcc-3166-1/PRT,
   :lcc-lr/hasTag "PRT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRT",
   :skos/definition "Alpha-3 country code for Portugal"})

(def PRY
  "Alpha-3 country code for Paraguay"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Paraguay,
   :db/ident :lcc-3166-1/PRY,
   :lcc-lr/hasTag "PRY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRY",
   :skos/definition "Alpha-3 country code for Paraguay"})

(def PS
  "Alpha-2 country code for Palestine, State of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Palestine,
   :db/ident :lcc-3166-1/PS,
   :lcc-lr/hasTag "PS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PS",
   :skos/definition "Alpha-2 country code for Palestine, State of"})

(def PSE
  "Alpha-3 country code for Palestine, State of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Palestine,
   :db/ident :lcc-3166-1/PSE,
   :lcc-lr/hasTag "PSE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PSE",
   :skos/definition "Alpha-3 country code for Palestine, State of"})

(def PT
  "Alpha-2 country code for Portugal"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Portugal,
   :db/ident :lcc-3166-1/PT,
   :lcc-lr/hasTag "PT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PT",
   :skos/definition "Alpha-2 country code for Portugal"})

(def PW
  "Alpha-2 country code for Palau"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Palau,
   :db/ident :lcc-3166-1/PW,
   :lcc-lr/hasTag "PW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PW",
   :skos/definition "Alpha-2 country code for Palau"})

(def PY
  "Alpha-2 country code for Paraguay"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Paraguay,
   :db/ident :lcc-3166-1/PY,
   :lcc-lr/hasTag "PY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PY",
   :skos/definition "Alpha-2 country code for Paraguay"})

(def PYF
  "Alpha-3 country code for French Polynesia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FrenchPolynesia,
   :db/ident :lcc-3166-1/PYF,
   :lcc-lr/hasTag "PYF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PYF",
   :skos/definition "Alpha-3 country code for French Polynesia"})

(def Pakistan
  "the country of Pakistan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Pakistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Islamic Republic of Pakistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Pakistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PAKISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République islamique du Pakistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pakistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PAKISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ur",
                              :rdf/value    "Pākistān"},
   :lcc-cr/hasNumericRegionCode "586",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Urdu :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ur",
                 :rdf/value    "Pākistān"}
                {:rdf/language "en",
                 :rdf/value    "Pakistan"}],
   :skos/definition "the country of Pakistan"})

(def Palau
  "the country of Palau"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Palau,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Palau"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Palau"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PALAU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Palaos"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Palaos (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PALAOS"},
   :lcc-cr/hasLocalShortName "Belau",
   :lcc-cr/hasNumericRegionCode "585",
   :lcc-cr/hasRemarks
   "Comprises: the west part of the Caroline Islands (Principal island: Babelthuap).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-2/Palauan],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Palau"},
   :skos/definition "the country of Palau"})

(def Palestine
  "the country of Palestine, State of"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Palestine,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Palestine"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Palestine, State of"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PALESTINE, STATE OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État de Palestine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Palestine, État de"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PALESTINE, ÉTAT DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Dawlat Filasţīn"},
   :lcc-cr/hasNumericRegionCode "275",
   :lcc-cr/hasRemarks "Remark: Conventional names.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Dawlat Filasţīn"},
   :skos/definition "the country of Palestine, State of"})

(def Panama
  "the country of Panama"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Panama,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Panama"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Panama"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PANAMA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Panama"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Panama (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PANAMA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Panamá"},
   :lcc-cr/hasNumericRegionCode "591",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Panamá"},
   :skos/definition "the country of Panama"})

(def PapuaNewGuinea
  "the country of Papua New Guinea"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/PapuaNewGuinea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Independent State of Papua New Guinea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Papua New Guinea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PAPUA NEW GUINEA"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "l'État indépendant de Papouasie-Nouvelle-Guinée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Papouasie-Nouvelle-Guinée (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "PAPOUASIE-NOUVELLE-GUINÉE"},
   :lcc-cr/hasLocalShortName ["Papuaniugini"
                              {:rdf/language "ho",
                               :rdf/value    "Papuaniugini"}],
   :lcc-cr/hasNumericRegionCode "598",
   :lcc-cr/hasRemarks
   "Includes: Bismarck Archipelago, Northern Solomon Islands (Principal island: Bougainville).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/HiriMotu :lcc-639-1/English :lcc-639-2/TokPisin],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ho",
                 :rdf/value    "Papuaniugini"}
                {:rdf/language "en",
                 :rdf/value    "Papua New Guinea"}],
   :skos/definition "the country of Papua New Guinea"})

(def Paraguay
  "the country of Paraguay"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Paraguay,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Paraguay"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Paraguay"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PARAGUAY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Paraguay"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Paraguay (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PARAGUAY"},
   :lcc-cr/hasLocalShortName [{:rdf/language "gn",
                               :rdf/value    "Paraguay"}
                              {:rdf/language "es",
                               :rdf/value    "Paraguay (el)"}],
   :lcc-cr/hasNumericRegionCode "600",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Guarani :lcc-639-1/Spanish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Paraguay (el)"}
                {:rdf/language "gn",
                 :rdf/value    "Paraguay"}],
   :skos/definition "the country of Paraguay"})

(def Peru
  "the country of Peru"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Peru,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Peru"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Peru"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PERU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Pérou"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pérou (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PÉROU"},
   :lcc-cr/hasLocalShortName [{:rdf/language "es",
                               :rdf/value    "Perú (el)"}
                              {:rdf/language "qu",
                               :rdf/value    "Perú"}
                              {:rdf/language "ay",
                               :rdf/value    "Perú"}],
   :lcc-cr/hasNumericRegionCode "604",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Spanish :lcc-639-1/Quechua :lcc-639-1/Aymara],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "qu",
                 :rdf/value    "Perú"}
                {:rdf/language "ay",
                 :rdf/value    "Perú"}
                {:rdf/language "es",
                 :rdf/value    "Perú (el)"}],
   :skos/definition "the country of Peru"})

(def Philippines
  "the country of Philippines (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Philippines,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Philippines"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Philippines (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PHILIPPINES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Philippines"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Philippines (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PHILIPPINES"},
   :lcc-cr/hasLocalShortName {:rdf/language "tl",
                              :rdf/value    "Pilipinas"},
   :lcc-cr/hasNumericRegionCode "608",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Tagalog :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "tl",
                 :rdf/value    "Pilipinas"}
                {:rdf/language "en",
                 :rdf/value    "Philippines (the)"}],
   :skos/definition "the country of Philippines (the)"})

(def Pitcairn
  "the country of Pitcairn"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Pitcairn,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Pitcairn"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PITCAIRN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pitcairn"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PITCAIRN"},
   :lcc-cr/hasNumericRegionCode "612",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard."
    "Includes: Ducie Island, Henderson Island, Oeno Island."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pitcairn"},
   :skos/definition "the country of Pitcairn"})

(def Poland
  "the country of Poland"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Poland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Poland"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Poland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "POLAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Pologne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pologne (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "POLOGNE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pl",
                              :rdf/value    "Polska"},
   :lcc-cr/hasNumericRegionCode "616",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Polish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pl",
                :rdf/value    "Polska"},
   :skos/definition "the country of Poland"})

(def Portugal
  "the country of Portugal"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Portugal,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Portuguese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Portugal"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PORTUGAL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République portugaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Portugal (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PORTUGAL"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Portugal"},
   :lcc-cr/hasNumericRegionCode "620",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Portugal"},
   :skos/definition "the country of Portugal"})

(def PuertoRico
  "the country of Puerto Rico"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/PuertoRico,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Puerto Rico"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PUERTO RICO"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Porto Rico"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PORTO RICO"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Puerto Rico"},
   :lcc-cr/hasNumericRegionCode "630",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-PR).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Spanish :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Puerto Rico"}
                {:rdf/language "en",
                 :rdf/value    "Puerto Rico"}],
   :skos/definition "the country of Puerto Rico"})

(def QA
  "Alpha-2 country code for Qatar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Qatar,
   :db/ident :lcc-3166-1/QA,
   :lcc-lr/hasTag "QA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "QA",
   :skos/definition "Alpha-2 country code for Qatar"})

(def QAT
  "Alpha-3 country code for Qatar"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Qatar,
   :db/ident :lcc-3166-1/QAT,
   :lcc-lr/hasTag "QAT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "QAT",
   :skos/definition "Alpha-3 country code for Qatar"})

(def Qatar
  "the country of Qatar"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Qatar,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Qatar"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Qatar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "QATAR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État du Qatar"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Qatar (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "QATAR"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Qaţar"},
   :lcc-cr/hasNumericRegionCode "634",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Qaţar"},
   :skos/definition "the country of Qatar"})

(def RE
  "Alpha-2 country code for Réunion"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Reunion,
   :db/ident :lcc-3166-1/RE,
   :lcc-lr/hasTag "RE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RE",
   :skos/definition "Alpha-2 country code for Réunion"})

(def REU
  "Alpha-3 country code for Réunion"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Reunion,
   :db/ident :lcc-3166-1/REU,
   :lcc-lr/hasTag "REU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "REU",
   :skos/definition "Alpha-3 country code for Réunion"})

(def RO
  "Alpha-2 country code for Romania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Romania,
   :db/ident :lcc-3166-1/RO,
   :lcc-lr/hasTag "RO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RO",
   :skos/definition "Alpha-2 country code for Romania"})

(def ROU
  "Alpha-3 country code for Romania"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Romania,
   :db/ident :lcc-3166-1/ROU,
   :lcc-lr/hasTag "ROU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ROU",
   :skos/definition "Alpha-3 country code for Romania"})

(def RS
  "Alpha-2 country code for Serbia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Serbia,
   :db/ident :lcc-3166-1/RS,
   :lcc-lr/hasTag "RS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RS",
   :skos/definition "Alpha-2 country code for Serbia"})

(def RU
  "Alpha-2 country code for Russian Federation (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/RussianFederation,
   :db/ident :lcc-3166-1/RU,
   :lcc-lr/hasTag "RU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RU",
   :skos/definition "Alpha-2 country code for Russian Federation (the)"})

(def RUS
  "Alpha-3 country code for Russian Federation (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/RussianFederation,
   :db/ident :lcc-3166-1/RUS,
   :lcc-lr/hasTag "RUS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RUS",
   :skos/definition "Alpha-3 country code for Russian Federation (the)"})

(def RW
  "Alpha-2 country code for Rwanda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Rwanda,
   :db/ident :lcc-3166-1/RW,
   :lcc-lr/hasTag "RW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RW",
   :skos/definition "Alpha-2 country code for Rwanda"})

(def RWA
  "Alpha-3 country code for Rwanda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Rwanda,
   :db/ident :lcc-3166-1/RWA,
   :lcc-lr/hasTag "RWA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RWA",
   :skos/definition "Alpha-3 country code for Rwanda"})

(def Reunion
  "the country of Réunion"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Reunion,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Réunion"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "RÉUNION"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Réunion (La)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "RÉUNION"},
   :lcc-cr/hasNumericRegionCode "638",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-RE).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Réunion (La)"},
   :skos/definition "the country of Réunion"})

(def Romania
  "the country of Romania"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Romania,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Romania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ROMANIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Roumanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ROUMANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ro",
                              :rdf/value    "România"},
   :lcc-cr/hasNumericRegionCode "642",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Romanian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ro",
                :rdf/value    "România"},
   :skos/definition "the country of Romania"})

(def RussianFederation
  "the country of Russian Federation (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/RussianFederation,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Russian Federation"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Russian Federation (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "RUSSIAN FEDERATION"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Fédération de Russie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Russie (la Fédération de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "RUSSIE, FÉDÉRATION DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ru",
                              :rdf/value    "Rossijskaja Federacija"},
   :lcc-cr/hasNumericRegionCode "643",
   :lcc-cr/hasRemarks "Includes: the Kaliningrad Region.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Russian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ru",
                :rdf/value    "Rossijskaja Federacija"},
   :skos/definition "the country of Russian Federation (the)"})

(def Rwanda
  "the country of Rwanda"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Rwanda,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Rwanda"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Rwanda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "RWANDA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Rwanda"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Rwanda (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "RWANDA"},
   :lcc-cr/hasLocalShortName {:rdf/language "rw",
                              :rdf/value    "Rwanda"},
   :lcc-cr/hasNumericRegionCode "646",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/French :lcc-639-1/English :lcc-639-1/Kinyarwanda],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Rwanda (le)"}
                {:rdf/language "en",
                 :rdf/value    "Rwanda"}
                {:rdf/language "rw",
                 :rdf/value    "Rwanda"}],
   :skos/definition "the country of Rwanda"})

(def SA
  "Alpha-2 country code for Saudi Arabia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaudiArabia,
   :db/ident :lcc-3166-1/SA,
   :lcc-lr/hasTag "SA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SA",
   :skos/definition "Alpha-2 country code for Saudi Arabia"})

(def SAU
  "Alpha-3 country code for Saudi Arabia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaudiArabia,
   :db/ident :lcc-3166-1/SAU,
   :lcc-lr/hasTag "SAU",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SAU",
   :skos/definition "Alpha-3 country code for Saudi Arabia"})

(def SB
  "Alpha-2 country code for Solomon Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SolomonIslands,
   :db/ident :lcc-3166-1/SB,
   :lcc-lr/hasTag "SB",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SB",
   :skos/definition "Alpha-2 country code for Solomon Islands"})

(def SC
  "Alpha-2 country code for Seychelles"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Seychelles,
   :db/ident :lcc-3166-1/SC,
   :lcc-lr/hasTag "SC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SC",
   :skos/definition "Alpha-2 country code for Seychelles"})

(def SD
  "Alpha-2 country code for Sudan (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Sudan,
   :db/ident :lcc-3166-1/SD,
   :lcc-lr/hasTag "SD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SD",
   :skos/definition "Alpha-2 country code for Sudan (the)"})

(def SDN
  "Alpha-3 country code for Sudan (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Sudan,
   :db/ident :lcc-3166-1/SDN,
   :lcc-lr/hasTag "SDN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SDN",
   :skos/definition "Alpha-3 country code for Sudan (the)"})

(def SE
  "Alpha-2 country code for Sweden"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Sweden,
   :db/ident :lcc-3166-1/SE,
   :lcc-lr/hasTag "SE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SE",
   :skos/definition "Alpha-2 country code for Sweden"})

(def SEN
  "Alpha-3 country code for Senegal"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Senegal,
   :db/ident :lcc-3166-1/SEN,
   :lcc-lr/hasTag "SEN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SEN",
   :skos/definition "Alpha-3 country code for Senegal"})

(def SG
  "Alpha-2 country code for Singapore"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Singapore,
   :db/ident :lcc-3166-1/SG,
   :lcc-lr/hasTag "SG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SG",
   :skos/definition "Alpha-2 country code for Singapore"})

(def SGP
  "Alpha-3 country code for Singapore"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Singapore,
   :db/ident :lcc-3166-1/SGP,
   :lcc-lr/hasTag "SGP",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SGP",
   :skos/definition "Alpha-3 country code for Singapore"})

(def SGS
  "Alpha-3 country code for South Georgia and the South Sandwich Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :db/ident :lcc-3166-1/SGS,
   :lcc-lr/hasTag "SGS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SGS",
   :skos/definition
   "Alpha-3 country code for South Georgia and the South Sandwich Islands"})

(def SH
  "Alpha-2 country code for Saint Helena, Ascension and Tristan da Cunha"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintHelena,
   :db/ident :lcc-3166-1/SH,
   :lcc-lr/hasTag "SH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SH",
   :skos/definition
   "Alpha-2 country code for Saint Helena, Ascension and Tristan da Cunha"})

(def SHN
  "Alpha-3 country code for Saint Helena, Ascension and Tristan da Cunha"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintHelena,
   :db/ident :lcc-3166-1/SHN,
   :lcc-lr/hasTag "SHN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SHN",
   :skos/definition
   "Alpha-3 country code for Saint Helena, Ascension and Tristan da Cunha"})

(def SI
  "Alpha-2 country code for Slovenia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Slovenia,
   :db/ident :lcc-3166-1/SI,
   :lcc-lr/hasTag "SI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SI",
   :skos/definition "Alpha-2 country code for Slovenia"})

(def SJ
  "Alpha-2 country code for Svalbard and Jan Mayen"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SvalbardAndJanMayen,
   :db/ident :lcc-3166-1/SJ,
   :lcc-lr/hasTag "SJ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SJ",
   :skos/definition "Alpha-2 country code for Svalbard and Jan Mayen"})

(def SJM
  "Alpha-3 country code for Svalbard and Jan Mayen"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SvalbardAndJanMayen,
   :db/ident :lcc-3166-1/SJM,
   :lcc-lr/hasTag "SJM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SJM",
   :skos/definition "Alpha-3 country code for Svalbard and Jan Mayen"})

(def SK
  "Alpha-2 country code for Slovakia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Slovakia,
   :db/ident :lcc-3166-1/SK,
   :lcc-lr/hasTag "SK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SK",
   :skos/definition "Alpha-2 country code for Slovakia"})

(def SL
  "Alpha-2 country code for Sierra Leone"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SierraLeone,
   :db/ident :lcc-3166-1/SL,
   :lcc-lr/hasTag "SL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SL",
   :skos/definition "Alpha-2 country code for Sierra Leone"})

(def SLB
  "Alpha-3 country code for Solomon Islands"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SolomonIslands,
   :db/ident :lcc-3166-1/SLB,
   :lcc-lr/hasTag "SLB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SLB",
   :skos/definition "Alpha-3 country code for Solomon Islands"})

(def SLE
  "Alpha-3 country code for Sierra Leone"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SierraLeone,
   :db/ident :lcc-3166-1/SLE,
   :lcc-lr/hasTag "SLE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SLE",
   :skos/definition "Alpha-3 country code for Sierra Leone"})

(def SLV
  "Alpha-3 country code for El Salvador"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/ElSalvador,
   :db/ident :lcc-3166-1/SLV,
   :lcc-lr/hasTag "SLV",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SLV",
   :skos/definition "Alpha-3 country code for El Salvador"})

(def SM
  "Alpha-2 country code for San Marino"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SanMarino,
   :db/ident :lcc-3166-1/SM,
   :lcc-lr/hasTag "SM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SM",
   :skos/definition "Alpha-2 country code for San Marino"})

(def SMR
  "Alpha-3 country code for San Marino"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SanMarino,
   :db/ident :lcc-3166-1/SMR,
   :lcc-lr/hasTag "SMR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SMR",
   :skos/definition "Alpha-3 country code for San Marino"})

(def SN
  "Alpha-2 country code for Senegal"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Senegal,
   :db/ident :lcc-3166-1/SN,
   :lcc-lr/hasTag "SN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SN",
   :skos/definition "Alpha-2 country code for Senegal"})

(def SO
  "Alpha-2 country code for Somalia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Somalia,
   :db/ident :lcc-3166-1/SO,
   :lcc-lr/hasTag "SO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SO",
   :skos/definition "Alpha-2 country code for Somalia"})

(def SOM
  "Alpha-3 country code for Somalia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Somalia,
   :db/ident :lcc-3166-1/SOM,
   :lcc-lr/hasTag "SOM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SOM",
   :skos/definition "Alpha-3 country code for Somalia"})

(def SPM
  "Alpha-3 country code for Saint Pierre and Miquelon"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintPierreAndMiquelon,
   :db/ident :lcc-3166-1/SPM,
   :lcc-lr/hasTag "SPM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SPM",
   :skos/definition "Alpha-3 country code for Saint Pierre and Miquelon"})

(def SR
  "Alpha-2 country code for Suriname"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Suriname,
   :db/ident :lcc-3166-1/SR,
   :lcc-lr/hasTag "SR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SR",
   :skos/definition "Alpha-2 country code for Suriname"})

(def SRB
  "Alpha-3 country code for Serbia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Serbia,
   :db/ident :lcc-3166-1/SRB,
   :lcc-lr/hasTag "SRB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SRB",
   :skos/definition "Alpha-3 country code for Serbia"})

(def SS
  "Alpha-2 country code for South Sudan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SouthSudan,
   :db/ident :lcc-3166-1/SS,
   :lcc-lr/hasTag "SS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SS",
   :skos/definition "Alpha-2 country code for South Sudan"})

(def SSD
  "Alpha-3 country code for South Sudan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SouthSudan,
   :db/ident :lcc-3166-1/SSD,
   :lcc-lr/hasTag "SSD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SSD",
   :skos/definition "Alpha-3 country code for South Sudan"})

(def ST
  "Alpha-2 country code for Sao Tome and Principe"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaoTomeAndPrincipe,
   :db/ident :lcc-3166-1/ST,
   :lcc-lr/hasTag "ST",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ST",
   :skos/definition "Alpha-2 country code for Sao Tome and Principe"})

(def STP
  "Alpha-3 country code for Sao Tome and Principe"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaoTomeAndPrincipe,
   :db/ident :lcc-3166-1/STP,
   :lcc-lr/hasTag "STP",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "STP",
   :skos/definition "Alpha-3 country code for Sao Tome and Principe"})

(def SUR
  "Alpha-3 country code for Suriname"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Suriname,
   :db/ident :lcc-3166-1/SUR,
   :lcc-lr/hasTag "SUR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SUR",
   :skos/definition "Alpha-3 country code for Suriname"})

(def SV
  "Alpha-2 country code for El Salvador"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/ElSalvador,
   :db/ident :lcc-3166-1/SV,
   :lcc-lr/hasTag "SV",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SV",
   :skos/definition "Alpha-2 country code for El Salvador"})

(def SVK
  "Alpha-3 country code for Slovakia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Slovakia,
   :db/ident :lcc-3166-1/SVK,
   :lcc-lr/hasTag "SVK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SVK",
   :skos/definition "Alpha-3 country code for Slovakia"})

(def SVN
  "Alpha-3 country code for Slovenia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Slovenia,
   :db/ident :lcc-3166-1/SVN,
   :lcc-lr/hasTag "SVN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SVN",
   :skos/definition "Alpha-3 country code for Slovenia"})

(def SWE
  "Alpha-3 country code for Sweden"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Sweden,
   :db/ident :lcc-3166-1/SWE,
   :lcc-lr/hasTag "SWE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SWE",
   :skos/definition "Alpha-3 country code for Sweden"})

(def SWZ
  "Alpha-3 country code for Eswatini"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Eswatini,
   :db/ident :lcc-3166-1/SWZ,
   :lcc-lr/hasTag "SWZ",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SWZ",
   :skos/definition "Alpha-3 country code for Eswatini"})

(def SX
  "Alpha-2 country code for Sint Maarten (Dutch part)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SintMaarten,
   :db/ident :lcc-3166-1/SX,
   :lcc-lr/hasTag "SX",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SX",
   :skos/definition "Alpha-2 country code for Sint Maarten (Dutch part)"})

(def SXM
  "Alpha-3 country code for Sint Maarten (Dutch part)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SintMaarten,
   :db/ident :lcc-3166-1/SXM,
   :lcc-lr/hasTag "SXM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SXM",
   :skos/definition "Alpha-3 country code for Sint Maarten (Dutch part)"})

(def SY
  "Alpha-2 country code for Syrian Arab Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SyrianArabRepublic,
   :db/ident :lcc-3166-1/SY,
   :lcc-lr/hasTag "SY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SY",
   :skos/definition "Alpha-2 country code for Syrian Arab Republic (the)"})

(def SYC
  "Alpha-3 country code for Seychelles"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Seychelles,
   :db/ident :lcc-3166-1/SYC,
   :lcc-lr/hasTag "SYC",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SYC",
   :skos/definition "Alpha-3 country code for Seychelles"})

(def SYR
  "Alpha-3 country code for Syrian Arab Republic (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SyrianArabRepublic,
   :db/ident :lcc-3166-1/SYR,
   :lcc-lr/hasTag "SYR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SYR",
   :skos/definition "Alpha-3 country code for Syrian Arab Republic (the)"})

(def SZ
  "Alpha-2 country code for Eswatini"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Eswatini,
   :db/ident :lcc-3166-1/SZ,
   :lcc-lr/hasTag "SZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SZ",
   :skos/definition "Alpha-2 country code for Eswatini"})

(def SaintBarthelemy
  "the country of Saint Barthélemy"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintBarthelemy,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Barthélemy"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAINT BARTHÉLEMY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Barthélemy"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-BARTHÉLEMY"},
   :lcc-cr/hasNumericRegionCode "652",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of France (FR-BL).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Saint-Barthélemy"},
   :skos/definition "the country of Saint Barthélemy"})

(def SaintHelena
  "the country of Saint Helena, Ascension and Tristan da Cunha"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintHelena,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Saint Helena, Ascension and Tristan da Cunha"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Sainte-Hélène, Ascension et Tristan da Cunha"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "SAINTE-HÉLÈNE, ASCENSION ET TRISTAN DA CUNHA"},
   :lcc-cr/hasNumericRegionCode "654",
   :lcc-cr/hasRemarks
   "Comprises: Saint Helena Island, Ascension Island, Tristan da Cunha Archipelago (Gough Island, Inaccessible Island, Nightingale Island and Stoltenhoff Island).",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Helena, Ascension and Tristan da Cunha"},
   :skos/definition
   "the country of Saint Helena, Ascension and Tristan da Cunha"})

(def SaintKittsAndNevis
  "the country of Saint Kitts and Nevis"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintKittsAndNevis,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Kitts and Nevis"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "SAINT KITTS AND NEVIS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Kitts-et-Nevis"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-KITTS-ET-NEVIS"},
   :lcc-cr/hasNumericRegionCode "659",
   :lcc-cr/hasRemarks "the Federation of Saint Kitts and Nevis",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Kitts and Nevis"},
   :skos/definition "the country of Saint Kitts and Nevis"})

(def SaintLucia
  "the country of Saint Lucia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintLucia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Lucia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAINT LUCIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sainte-Lucie"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINTE-LUCIE"},
   :lcc-cr/hasNumericRegionCode "662",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Lucia"},
   :skos/definition "the country of Saint Lucia"})

(def SaintMartin
  "the country of Saint Martin (French part)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintMartin,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Martin (French part)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SAINT MARTIN (FRENCH PART)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Martin (partie française)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SAINT-MARTIN (PARTIE FRANÇAISE)"},
   :lcc-cr/hasNumericRegionCode "663",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of France (FR-MF)."
    "The island of Saint Martin is divided into the northern French part and the southern Dutch part."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Saint-Martin (partie française)"},
   :skos/definition "the country of Saint Martin (French part)"})

(def SaintPierreAndMiquelon
  "the country of Saint Pierre and Miquelon"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Pierre and Miquelon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SAINT PIERRE AND MIQUELON"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Pierre-et-Miquelon"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "SAINT-PIERRE-ET-MIQUELON"},
   :lcc-cr/hasNumericRegionCode "666",
   :lcc-cr/hasRemarks
   ["Miquelon * is the second significant part of composite country name."
    "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-PM)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Saint-Pierre-et-Miquelon"},
   :skos/definition "the country of Saint Pierre and Miquelon"})

(def SaintVincentAndTheGrenadines
  "the country of Saint Vincent and the Grenadines"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Saint Vincent and the Grenadines"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SAINT VINCENT AND THE GRENADINES"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Vincent-et-les Grenadines"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SAINT-VINCENT-ET-LES GRENADINES"},
   :lcc-cr/hasNumericRegionCode "670",
   :lcc-cr/hasRemarks
   "Comprises: Northern Grenadine Islands (Principal island: Bequia), Saint Vincent Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Vincent and the Grenadines"},
   :skos/definition "the country of Saint Vincent and the Grenadines"})

(def Samoa
  "the country of Samoa"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Samoa,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Independent State of Samoa"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Samoa"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAMOA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État indépendant du Samoa"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Samoa (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAMOA"},
   :lcc-cr/hasLocalShortName {:rdf/language "sm",
                              :rdf/value    "Samoa"},
   :lcc-cr/hasNumericRegionCode "882",
   :lcc-cr/hasRemarks "Principal islands: Savai'i, Upolu.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Samoan :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "sm",
                 :rdf/value    "Samoa"}
                {:rdf/language "en",
                 :rdf/value    "Samoa"}],
   :skos/definition "the country of Samoa"})

(def SanMarino
  "the country of San Marino"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SanMarino,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of San Marino"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "San Marino"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAN MARINO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Saint-Marin"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Marin"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-MARIN"},
   :lcc-cr/hasLocalShortName {:rdf/language "it",
                              :rdf/value    "San Marino"},
   :lcc-cr/hasNumericRegionCode "674",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Italian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "it",
                :rdf/value    "San Marino"},
   :skos/definition "the country of San Marino"})

(def SaoTomeAndPrincipe
  "the country of Sao Tome and Principe"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Democratic Republic of Sao Tome and Principe"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sao Tome and Principe"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "SAO TOME AND PRINCIPE"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "la République démocratique de Sao Tomé-et-Principe"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sao Tomé-et-Principe"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAO TOMÉ-ET-PRINCIPE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "São Tomé e Príncipe"},
   :lcc-cr/hasNumericRegionCode "678",
   :lcc-cr/hasRemarks
   "Príncipe* is the second significant part of composite country name.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "São Tomé e Príncipe"},
   :skos/definition "the country of Sao Tome and Principe"})

(def SaudiArabia
  "the country of Saudi Arabia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SaudiArabia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Saudi Arabia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saudi Arabia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAUDI ARABIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume d'Arabie saoudite"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Arabie saoudite (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARABIE SAOUDITE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "As Su‘ūdīyah"},
   :lcc-cr/hasNumericRegionCode "682",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "As Su‘ūdīyah"},
   :skos/definition "the country of Saudi Arabia"})

(def Senegal
  "the country of Senegal"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Senegal,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Senegal"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Senegal"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SENEGAL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Sénégal"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sénégal (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SÉNÉGAL"},
   :lcc-cr/hasNumericRegionCode "686",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Sénégal (le)"},
   :skos/definition "the country of Senegal"})

(def Serbia
  "the country of Serbia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Serbia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Serbia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Serbia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SERBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Serbie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Serbie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SERBIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sr",
                              :rdf/value    "Srbija"},
   :lcc-cr/hasNumericRegionCode "688",
   :lcc-cr/hasRemarks
   "Serbia was formerly part of former entries: YUGOSLAVIA (YU, YUG, 891) then SERBIA AND MONTENEGRO (CS, SCG, 891).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Serbian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "sr",
                :rdf/value    "Srbija"},
   :skos/definition "the country of Serbia"})

(def SeselwaCreoleFrench
  "Seselwa Creole French language"
  {:db/ident :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Seselwa Creole French"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "créole seselwa"},
   :lcc-lr/hasIndigenousName "kreol",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "Seselwa Creole French",
   :skos/definition "Seselwa Creole French language",
   :skos/note "Part of ISO 639-3, not otherwise represented in OMG ontologies"})

(def Seychelles
  "the country of Seychelles"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Seychelles,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Seychelles"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Seychelles"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SEYCHELLES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Seychelles"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Seychelles (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SEYCHELLES"},
   :lcc-cr/hasLocalShortName "Sesel",
   :lcc-cr/hasNumericRegionCode "690",
   :lcc-cr/hasRemarks
   "Principal island: Mahé; includes Aldabra Islands, Amirante Islands, Cosmoledo Islands, Farquhar Islands.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/English :lcc-639-1/French :lcc-3166-1/SeselwaCreoleFrench],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Seychelles (les)"}
                {:rdf/language "en",
                 :rdf/value    "Seychelles"}],
   :skos/definition "the country of Seychelles"})

(def Shikomor
  "Shikomor language"
  {:db/ident :lcc-3166-1/Shikomor,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shikomor"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "comorien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "Shikomor",
   :skos/definition "Shikomor language",
   :skos/note "Not yet allocated a code in ISO 639"})

(def SierraLeone
  "the country of Sierra Leone"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SierraLeone,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Sierra Leone"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sierra Leone"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SIERRA LEONE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Sierra Leone"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sierra Leone (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SIERRA LEONE"},
   :lcc-cr/hasNumericRegionCode "694",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sierra Leone"},
   :skos/definition "the country of Sierra Leone"})

(def Singapore
  "the country of Singapore"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Singapore,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Singapore"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Singapore"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SINGAPORE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Singapour"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Singapour"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SINGAPOUR"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ta",
                               :rdf/value    "Chiṅkappūr"}
                              {:rdf/language "zh",
                               :rdf/value    "Xinjiapo"}
                              {:rdf/language "ms",
                               :rdf/value    "Singapura"}],
   :lcc-cr/hasNumericRegionCode "702",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Tamil :lcc-639-1/Malay :lcc-639-1/Chinese :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ms",
                 :rdf/value    "Singapura"}
                {:rdf/language "ta",
                 :rdf/value    "Chiṅkappūr"}
                {:rdf/language "en",
                 :rdf/value    "Singapore"}
                {:rdf/language "zh",
                 :rdf/value    "Xinjiapo"}],
   :skos/definition "the country of Singapore"})

(def SintMaarten
  "the country of Sint Maarten (Dutch part)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SintMaarten,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sint Maarten (Dutch part)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SINT MAARTEN (DUTCH PART)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Saint-Martin (partie néerlandaise)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SAINT-MARTIN (PARTIE NÉERLANDAISE)"},
   :lcc-cr/hasLocalShortName {:rdf/language "nl",
                              :rdf/value    "Sint Maarten"},
   :lcc-cr/hasNumericRegionCode "534",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-SX)."
    "The island of Saint Martin is divided into the northern French part and the southern Dutch part."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Dutch :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Sint Maarten (Dutch part)"}
                {:rdf/language "nl",
                 :rdf/value    "Sint Maarten"}],
   :skos/definition "the country of Sint Maarten (Dutch part)"})

(def Slovakia
  "the country of Slovakia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Slovakia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Slovak Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Slovakia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SLOVAKIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République slovaque"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Slovaquie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SLOVAQUIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sk",
                              :rdf/value    "Slovensko"},
   :lcc-cr/hasNumericRegionCode "703",
   :lcc-cr/hasRemarks
   "Code element SK was formerly used for Sikkim (SK, SKM, --), now part of the entry for India (IN, IND, 356), was reused for Slovakia. See aslo code element SKIN.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Slovak,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "sk",
                :rdf/value    "Slovensko"},
   :skos/definition "the country of Slovakia"})

(def Slovenia
  "the country of Slovenia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Slovenia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Slovenia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Slovenia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SLOVENIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Slovénie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Slovénie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SLOVÉNIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sl",
                              :rdf/value    "Slovenija"},
   :lcc-cr/hasNumericRegionCode "705",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Slovenian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "sl",
                :rdf/value    "Slovenija"},
   :skos/definition "the country of Slovenia"})

(def SolomonIslands
  "the country of Solomon Islands"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SolomonIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Solomon Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOLOMON ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Îles Salomon"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Salomon (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SALOMON, ÎLES"},
   :lcc-cr/hasNumericRegionCode "090",
   :lcc-cr/hasRemarks
   "Comprises: Santa Cruz Islands, Southern Solomon Islands (Principal island: Guadalcanal).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Solomon Islands"},
   :skos/definition "the country of Solomon Islands"})

(def Somalia
  "the country of Somalia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Somalia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Federal Republic of Somalia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Somalia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOMALIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérale de Somalie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Somalie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SOMALIE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "so",
                               :rdf/value    "Soomaaliya"}
                              {:rdf/language "ar",
                               :rdf/value    "Aş Şūmāl"}],
   :lcc-cr/hasNumericRegionCode "706",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Somali :lcc-639-1/Arabic],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "ar",
                 :rdf/value    "Aş Şūmāl"}
                {:rdf/language "so",
                 :rdf/value    "Soomaaliya"}],
   :skos/definition "the country of Somalia"})

(def SouthAfrica
  "the country of South Africa"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SouthAfrica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of South Africa"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "South Africa"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOUTH AFRICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République sud-africaine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Afrique du Sud (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AFRIQUE DU SUD"},
   :lcc-cr/hasLocalShortName [{:rdf/language "ts",
                               :rdf/value    "Afrika-Dzonga"}
                              {:rdf/language "ss",
                               :rdf/value    "Ningizimu Afrika"}
                              {:rdf/language "zu",
                               :rdf/value    "Ningizimu Afrika"}
                              {:rdf/language "ve",
                               :rdf/value    "Afrika Tshipembe"}
                              {:rdf/language "xh",
                               :rdf/value    "Mzantsi Afrika"}
                              {:rdf/language "st",
                               :rdf/value    "Afrika-Borwa"}
                              {:rdf/language "tn",
                               :rdf/value    "Afrika-Borwa"}
                              "Afrika-Borwa"
                              {:rdf/language "nr",
                               :rdf/value    "Sewula Afrika"}
                              {:rdf/language "af",
                               :rdf/value    "Suid-Afrika"}],
   :lcc-cr/hasNumericRegionCode "710",
   :lcc-cr/hasRemarks "Includes: Marion Island, Prince Edward Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/SouthNdebele
                                       :lcc-639-1/Zulu
                                       :lcc-639-1/Swati
                                       :lcc-639-1/Xhosa
                                       :lcc-639-1/Venda
                                       :lcc-639-1/English
                                       :lcc-639-1/Tswana
                                       :lcc-639-1/SouthernSotho
                                       :lcc-639-2/Pedi
                                       :lcc-639-1/Tsonga
                                       :lcc-639-1/Afrikaans],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "nr",
                 :rdf/value    "Sewula Afrika"}
                {:rdf/language "en",
                 :rdf/value    "South Africa"}
                {:rdf/language "af",
                 :rdf/value    "Suid-Afrika"}
                {:rdf/language "xh",
                 :rdf/value    "Mzantsi Afrika"}
                {:rdf/language "ve",
                 :rdf/value    "Afrika Tshipembe"}
                {:rdf/language "ts",
                 :rdf/value    "Afrika-Dzonga"}
                {:rdf/language "st",
                 :rdf/value    "Afrika-Borwa"}
                {:rdf/language "tn",
                 :rdf/value    "Afrika-Borwa"}
                {:rdf/language "ss",
                 :rdf/value    "Ningizimu Afrika"}
                {:rdf/language "zu",
                 :rdf/value    "Ningizimu Afrika"}],
   :skos/definition "the country of South Africa"})

(def SouthGeorgiaAndTheSouthSandwichIslands
  "the country of South Georgia and the South Sandwich Islands"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "South Georgia and the South Sandwich Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"},
   :lcc-cr/hasFrenchShortName
   {:rdf/language "fr",
    :rdf/value    "Géorgie du Sud-et-les Îles Sandwich du Sud (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "GÉORGIE DU SUD-ET-LES ÎLES SANDWICH DU SUD"},
   :lcc-cr/hasNumericRegionCode "239",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "South Georgia and the South Sandwich Islands"},
   :skos/definition
   "the country of South Georgia and the South Sandwich Islands"})

(def SouthSudan
  "the country of South Sudan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SouthSudan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of South Sudan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "South Sudan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOUTH SUDAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Soudan du Sud"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Soudan du Sud (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SOUDAN DU SUD"},
   :lcc-cr/hasNumericRegionCode "728",
   :lcc-cr/hasRemarks
   "Split of Sudan into Sudan (north part) and South Sudan (south part).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "South Sudan"},
   :skos/definition "the country of South Sudan"})

(def Spain
  "the country of Spain"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Spain,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Spain"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Spain"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SPAIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume d'Espagne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Espagne (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ESPAGNE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "España"},
   :lcc-cr/hasNumericRegionCode "724",
   :lcc-cr/hasRemarks
   "Remark: In the autonomous communities of Galicia, Catalonia and the Balearics, the respective regional languages are the sole official languages of toponymy. Castilian language forms are given in square brackets for information. For the autonomous communities of Navarra, Valencia and the Basque Country, with the exception of the province names Bizkaia and Gipuzkoa, the regional language has co-official status with Castilian (regional language forms are marked with an asterisk).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "España"},
   :skos/definition "the country of Spain"})

(def SriLanka
  "the country of Sri Lanka"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SriLanka,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Democratic Socialist Republic of Sri Lanka"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sri Lanka"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SRI LANKA"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "la République socialiste démocratique du Sri Lanka"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sri Lanka"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SRI LANKA"},
   :lcc-cr/hasLocalShortName [{:rdf/language "si",
                               :rdf/value    "Shrī Laṁkā"}
                              {:rdf/language "ta",
                               :rdf/value    "Ilaṅkai"}],
   :lcc-cr/hasNumericRegionCode "144",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Sinhala :lcc-639-1/Tamil :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "si",
                 :rdf/value    "Shrī Laṁkā"}
                {:rdf/language "en",
                 :rdf/value    "Sri Lanka"}
                {:rdf/language "ta",
                 :rdf/value    "Ilaṅkai"}],
   :skos/definition "the country of Sri Lanka"})

(def Sudan
  "the country of Sudan (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Sudan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Sudan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sudan (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SUDAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Soudan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Soudan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SOUDAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "As Sūdān"},
   :lcc-cr/hasNumericRegionCode "729",
   :lcc-cr/hasRemarks
   "Split of Sudan into Sudan (north part) and South Sudan (south part).",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "As Sūdān"},
   :skos/definition "the country of Sudan (the)"})

(def Suriname
  "the country of Suriname"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Suriname,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Suriname"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Suriname"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SURINAME"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Suriname"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Suriname (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SURINAME"},
   :lcc-cr/hasLocalShortName {:rdf/language "nl",
                              :rdf/value    "Suriname"},
   :lcc-cr/hasNumericRegionCode "740",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dutch,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "nl",
                :rdf/value    "Suriname"},
   :skos/definition "the country of Suriname"})

(def SvalbardAndJanMayen
  "the country of Svalbard and Jan Mayen"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Svalbard and Jan Mayen"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "SVALBARD AND JAN MAYEN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Svalbard et l'Île Jan Mayen (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SVALBARD ET ÎLE JAN MAYEN"},
   :lcc-cr/hasLocalShortName [{:rdf/language "nn",
                               :rdf/value    "Svalbard og Jan Mayen"}
                              {:rdf/language "nb",
                               :rdf/value    "Svalbard og Jan Mayen"}],
   :lcc-cr/hasNumericRegionCode "744",
   :lcc-cr/hasRemarks
   ["Includes: Bear Island."
    "No subdivisions relevant for this standard. Included also as a subdivision of Norway (NO-21, NO-22)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/NorwegianNynorsk
                                       :lcc-639-1/NorwegianBokmal],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "nn",
                 :rdf/value    "Svalbard og Jan Mayen"}
                {:rdf/language "nb",
                 :rdf/value    "Svalbard og Jan Mayen"}],
   :skos/definition "the country of Svalbard and Jan Mayen"})

(def Sweden
  "the country of Sweden"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Sweden,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Sweden"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sweden"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SWEDEN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Suède"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Suède (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SUÈDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sv",
                              :rdf/value    "Sverige"},
   :lcc-cr/hasNumericRegionCode "752",
   :lcc-cr/hasRemarks
   "Remark: Alphabetic and numeric codes co-exist. The alphabetic code is traditionally well known to the general public, whereas the numeric code (placed after the name within square brackets) is used mainly within national administration; it may in the longer term supersede the alphabetic code.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Swedish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "sv",
                :rdf/value    "Sverige"},
   :skos/definition "the country of Sweden"})

(def Switzerland
  "the country of Switzerland"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Switzerland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Swiss Confederation"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Switzerland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SWITZERLAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Confédération suisse"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Suisse (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SUISSE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "de",
                               :rdf/value    "Schweiz (die)"}
                              {:rdf/language "it",
                               :rdf/value    "Svizzera (la)"}
                              {:rdf/language "rm",
                               :rdf/value    "Svizra (la)"}],
   :lcc-cr/hasNumericRegionCode "756",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/French :lcc-639-1/Romansh :lcc-639-1/Italian :lcc-639-1/German],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Schweiz (die)"}
                {:rdf/language "it",
                 :rdf/value    "Svizzera (la)"}
                {:rdf/language "rm",
                 :rdf/value    "Svizra (la)"}
                {:rdf/language "fr",
                 :rdf/value    "Suisse (la)"}],
   :skos/definition "the country of Switzerland"})

(def SyrianArabRepublic
  "the country of Syrian Arab Republic (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/SyrianArabRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Syrian Arab Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Syrian Arab Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SYRIAN ARAB REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République arabe syrienne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "République arabe syrienne (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SYRIENNE, RÉPUBLIQUE ARABE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value
                              "Al Jumhūrīyah al ‘Arabīyah as Sūrīyah"},
   :lcc-cr/hasNumericRegionCode "760",
   :lcc-cr/hasRemarks "Often referred to as Syria.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Jumhūrīyah al ‘Arabīyah as Sūrīyah"},
   :skos/definition "the country of Syrian Arab Republic (the)"})

(def TC
  "Alpha-2 country code for Turks and Caicos Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/TurksAndCaicosIslands,
   :db/ident :lcc-3166-1/TC,
   :lcc-lr/hasTag "TC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TC",
   :skos/definition "Alpha-2 country code for Turks and Caicos Islands (the)"})

(def TCA
  "Alpha-3 country code for Turks and Caicos Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/TurksAndCaicosIslands,
   :db/ident :lcc-3166-1/TCA,
   :lcc-lr/hasTag "TCA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TCA",
   :skos/definition "Alpha-3 country code for Turks and Caicos Islands (the)"})

(def TCD
  "Alpha-3 country code for Chad"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Chad,
   :db/ident :lcc-3166-1/TCD,
   :lcc-lr/hasTag "TCD",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TCD",
   :skos/definition "Alpha-3 country code for Chad"})

(def TD
  "Alpha-2 country code for Chad"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Chad,
   :db/ident :lcc-3166-1/TD,
   :lcc-lr/hasTag "TD",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TD",
   :skos/definition "Alpha-2 country code for Chad"})

(def TF
  "Alpha-2 country code for French Southern Territories (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/FrenchSouthernTerritories,
   :db/ident :lcc-3166-1/TF,
   :lcc-lr/hasTag "TF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TF",
   :skos/definition
   "Alpha-2 country code for French Southern Territories (the)"})

(def TG
  "Alpha-2 country code for Togo"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Togo,
   :db/ident :lcc-3166-1/TG,
   :lcc-lr/hasTag "TG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TG",
   :skos/definition "Alpha-2 country code for Togo"})

(def TGO
  "Alpha-3 country code for Togo"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Togo,
   :db/ident :lcc-3166-1/TGO,
   :lcc-lr/hasTag "TGO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TGO",
   :skos/definition "Alpha-3 country code for Togo"})

(def TH
  "Alpha-2 country code for Thailand"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Thailand,
   :db/ident :lcc-3166-1/TH,
   :lcc-lr/hasTag "TH",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TH",
   :skos/definition "Alpha-2 country code for Thailand"})

(def THA
  "Alpha-3 country code for Thailand"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Thailand,
   :db/ident :lcc-3166-1/THA,
   :lcc-lr/hasTag "THA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "THA",
   :skos/definition "Alpha-3 country code for Thailand"})

(def TJ
  "Alpha-2 country code for Tajikistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tajikistan,
   :db/ident :lcc-3166-1/TJ,
   :lcc-lr/hasTag "TJ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TJ",
   :skos/definition "Alpha-2 country code for Tajikistan"})

(def TJK
  "Alpha-3 country code for Tajikistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tajikistan,
   :db/ident :lcc-3166-1/TJK,
   :lcc-lr/hasTag "TJK",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TJK",
   :skos/definition "Alpha-3 country code for Tajikistan"})

(def TK
  "Alpha-2 country code for Tokelau"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tokelau,
   :db/ident :lcc-3166-1/TK,
   :lcc-lr/hasTag "TK",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TK",
   :skos/definition "Alpha-2 country code for Tokelau"})

(def TKL
  "Alpha-3 country code for Tokelau"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tokelau,
   :db/ident :lcc-3166-1/TKL,
   :lcc-lr/hasTag "TKL",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TKL",
   :skos/definition "Alpha-3 country code for Tokelau"})

(def TKM
  "Alpha-3 country code for Turkmenistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Turkmenistan,
   :db/ident :lcc-3166-1/TKM,
   :lcc-lr/hasTag "TKM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TKM",
   :skos/definition "Alpha-3 country code for Turkmenistan"})

(def TL
  "Alpha-2 country code for Timor-Leste"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Timor-Leste,
   :db/ident :lcc-3166-1/TL,
   :lcc-lr/hasTag "TL",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TL",
   :skos/definition "Alpha-2 country code for Timor-Leste"})

(def TLS
  "Alpha-3 country code for Timor-Leste"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Timor-Leste,
   :db/ident :lcc-3166-1/TLS,
   :lcc-lr/hasTag "TLS",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TLS",
   :skos/definition "Alpha-3 country code for Timor-Leste"})

(def TM
  "Alpha-2 country code for Turkmenistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Turkmenistan,
   :db/ident :lcc-3166-1/TM,
   :lcc-lr/hasTag "TM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TM",
   :skos/definition "Alpha-2 country code for Turkmenistan"})

(def TN
  "Alpha-2 country code for Tunisia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tunisia,
   :db/ident :lcc-3166-1/TN,
   :lcc-lr/hasTag "TN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TN",
   :skos/definition "Alpha-2 country code for Tunisia"})

(def TO
  "Alpha-2 country code for Tonga"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tonga,
   :db/ident :lcc-3166-1/TO,
   :lcc-lr/hasTag "TO",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TO",
   :skos/definition "Alpha-2 country code for Tonga"})

(def TON
  "Alpha-3 country code for Tonga"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tonga,
   :db/ident :lcc-3166-1/TON,
   :lcc-lr/hasTag "TON",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TON",
   :skos/definition "Alpha-3 country code for Tonga"})

(def TR
  "Alpha-2 country code for Turkey"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Turkey,
   :db/ident :lcc-3166-1/TR,
   :lcc-lr/hasTag "TR",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TR",
   :skos/definition "Alpha-2 country code for Turkey"})

(def TT
  "Alpha-2 country code for Trinidad and Tobago"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/TrinidadAndTobago,
   :db/ident :lcc-3166-1/TT,
   :lcc-lr/hasTag "TT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TT",
   :skos/definition "Alpha-2 country code for Trinidad and Tobago"})

(def TTO
  "Alpha-3 country code for Trinidad and Tobago"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/TrinidadAndTobago,
   :db/ident :lcc-3166-1/TTO,
   :lcc-lr/hasTag "TTO",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TTO",
   :skos/definition "Alpha-3 country code for Trinidad and Tobago"})

(def TUN
  "Alpha-3 country code for Tunisia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tunisia,
   :db/ident :lcc-3166-1/TUN,
   :lcc-lr/hasTag "TUN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TUN",
   :skos/definition "Alpha-3 country code for Tunisia"})

(def TUR
  "Alpha-3 country code for Turkey"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Turkey,
   :db/ident :lcc-3166-1/TUR,
   :lcc-lr/hasTag "TUR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TUR",
   :skos/definition "Alpha-3 country code for Turkey"})

(def TUV
  "Alpha-3 country code for Tuvalu"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tuvalu,
   :db/ident :lcc-3166-1/TUV,
   :lcc-lr/hasTag "TUV",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TUV",
   :skos/definition "Alpha-3 country code for Tuvalu"})

(def TV
  "Alpha-2 country code for Tuvalu"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tuvalu,
   :db/ident :lcc-3166-1/TV,
   :lcc-lr/hasTag "TV",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TV",
   :skos/definition "Alpha-2 country code for Tuvalu"})

(def TW
  "Alpha-2 country code for Taiwan (Province of China)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Taiwan,
   :db/ident :lcc-3166-1/TW,
   :lcc-lr/hasTag "TW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TW",
   :skos/definition "Alpha-2 country code for Taiwan (Province of China)"})

(def TWN
  "Alpha-3 country code for Taiwan (Province of China)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Taiwan,
   :db/ident :lcc-3166-1/TWN,
   :lcc-lr/hasTag "TWN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TWN",
   :skos/definition "Alpha-3 country code for Taiwan (Province of China)"})

(def TZ
  "Alpha-2 country code for Tanzania, the United Republic of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tanzania,
   :db/ident :lcc-3166-1/TZ,
   :lcc-lr/hasTag "TZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TZ",
   :skos/definition
   "Alpha-2 country code for Tanzania, the United Republic of"})

(def TZA
  "Alpha-3 country code for Tanzania, the United Republic of"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Tanzania,
   :db/ident :lcc-3166-1/TZA,
   :lcc-lr/hasTag "TZA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TZA",
   :skos/definition
   "Alpha-3 country code for Tanzania, the United Republic of"})

(def Taiwan
  "the country of Taiwan (Province of China)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Taiwan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Taiwan (Province of China)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "TAIWAN, PROVINCE OF CHINA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Taïwan (Province de Chine)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "TAÏWAN, PROVINCE DE CHINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "zh",
                              :rdf/value    "Taiwan"},
   :lcc-cr/hasNumericRegionCode "158",
   :lcc-cr/hasRemarks "Includes: Penghu (Pescadores) Islands.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Chinese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "zh",
                :rdf/value    "Taiwan"},
   :skos/definition "the country of Taiwan (Province of China)"})

(def Tajikistan
  "the country of Tajikistan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Tajikistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Tajikistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tajikistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TAJIKISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Tadjikistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tadjikistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TADJIKISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "tg",
                              :rdf/value    "Tojikiston"},
   :lcc-cr/hasNumericRegionCode "762",
   :lcc-cr/hasRemarks
   "Remark: The deletion of the region Karategin left one part of the country without name and without code in this part of ISO 3166. This section of the country is designated districts under republic administration (tgk: nohiyahoi tobei jumhurí) and comprises 13 districts (tgk: nohiya) which are administered directly by the central government at first-order level.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Tajik,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "tg",
                :rdf/value    "Tojikiston"},
   :skos/definition "the country of Tajikistan"})

(def Tanzania
  "the country of Tanzania, the United Republic of"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Tanzania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United Republic of Tanzania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Tanzania, the United Republic of"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "TANZANIA, UNITED REPUBLIC OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République-Unie de Tanzanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Tanzanie (la République-Unie de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "TANZANIE, RÉPUBLIQUE-UNIE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sw",
                              :rdf/value    "Jamhuri ya Muungano wa Tanzania"},
   :lcc-cr/hasNumericRegionCode "834",
   :lcc-cr/hasRemarks "Often referred to as Tanzania.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Swahili],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Tanzania, the United Republic of"}
                {:rdf/language "sw",
                 :rdf/value    "Jamhuri ya Muungano wa Tanzania"}],
   :skos/definition "the country of Tanzania, the United Republic of"})

(def Thailand
  "the country of Thailand"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Thailand,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Thailand"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Thailand"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "THAILAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Thaïlande"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Thaïlande (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "THAÏLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "th",
                              :rdf/value    "Prathet Thai"},
   :lcc-cr/hasNumericRegionCode "764",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Thai,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "th",
                :rdf/value    "Prathet Thai"},
   :skos/definition "the country of Thailand"})

(def Timor-Leste
  "the country of Timor-Leste"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Timor-Leste,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Democratic Republic of Timor-Leste"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Timor-Leste"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TIMOR-LESTE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République démocratique du Timor-Leste"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Timor-Leste (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TIMOR-LESTE"},
   :lcc-cr/hasLocalShortName [{:rdf/language "pt",
                               :rdf/value    "Timor-Leste"}
                              "Timor Lorosa'e"],
   :lcc-cr/hasNumericRegionCode "626",
   :lcc-cr/hasRemarks "Includes the exclave of Oecussi.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Tetum :lcc-639-1/Portuguese],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Timor-Leste"},
   :skos/definition "the country of Timor-Leste"})

(def Togo
  "the country of Togo"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Togo,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Togolese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Togo"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TOGO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République togolaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Togo (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TOGO"},
   :lcc-cr/hasNumericRegionCode "768",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Togo (le)"},
   :skos/definition "the country of Togo"})

(def Tokelau
  "the country of Tokelau"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Tokelau,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tokelau"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TOKELAU"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tokelau (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TOKELAU"},
   :lcc-cr/hasLocalShortName "Tokelau",
   :lcc-cr/hasNumericRegionCode "772",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Tokelau :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tokelau"},
   :skos/definition "the country of Tokelau"})

(def Tonga
  "the country of Tonga"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Tonga,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Tonga"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tonga"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TONGA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume des Tonga"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tonga (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TONGA"},
   :lcc-cr/hasLocalShortName {:rdf/language "to",
                              :rdf/value    "Tonga"},
   :lcc-cr/hasNumericRegionCode "776",
   :lcc-cr/hasRemarks "Principal island: Tongatapu.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Tonga-TongaIslands
                                       :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "to",
                 :rdf/value    "Tonga"}
                {:rdf/language "en",
                 :rdf/value    "Tonga"}],
   :skos/definition "the country of Tonga"})

(def TrinidadAndTobago
  "the country of Trinidad and Tobago"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/TrinidadAndTobago,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Republic of Trinidad and Tobago"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Trinidad and Tobago"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TRINIDAD AND TOBAGO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de Trinité-et-Tobago"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Trinité-et-Tobago (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TRINITÉ-ET-TOBAGO"},
   :lcc-cr/hasNumericRegionCode "780",
   :lcc-cr/hasRemarks
   "Tobago * is the second significant part of composite country name.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trinidad and Tobago"},
   :skos/definition "the country of Trinidad and Tobago"})

(def Tunisia
  "the country of Tunisia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Tunisia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Tunisia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tunisia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TUNISIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République tunisienne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tunisie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TUNISIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Tūnis"},
   :lcc-cr/hasNumericRegionCode "788",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Tūnis"},
   :skos/definition "the country of Tunisia"})

(def Turkey
  "the country of Turkey"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Turkey,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Turkey"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Turkey"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TURKEY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République turque"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Turquie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TURQUIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "tr",
                              :rdf/value    "Türkiye"},
   :lcc-cr/hasNumericRegionCode "792",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Turkish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "tr",
                :rdf/value    "Türkiye"},
   :skos/definition "the country of Turkey"})

(def Turkmenistan
  "the country of Turkmenistan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Turkmenistan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Turkmenistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TURKMENISTAN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Turkménistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TURKMÉNISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "tk",
                              :rdf/value    "Türkmenistan"},
   :lcc-cr/hasNumericRegionCode "795",
   :lcc-cr/hasRemarks
   "Remark: By presidential decree No. 1146, 1993-01-21, the Roman alphabet is officially used for the Turkmen language.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Turkmen,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "tk",
                :rdf/value    "Türkmenistan"},
   :skos/definition "the country of Turkmenistan"})

(def TurksAndCaicosIslands
  "the country of Turks and Caicos Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Turks and Caicos Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "TURKS AND CAICOS ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Turks-et-Caïcos (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TURKS-ET-CAÏCOS, ÎLES"},
   :lcc-cr/hasNumericRegionCode "796",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Turks and Caicos Islands (the)"},
   :skos/definition "the country of Turks and Caicos Islands (the)"})

(def Tuvalu
  "the country of Tuvalu"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Tuvalu,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tuvalu"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TUVALU"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tuvalu (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TUVALU"},
   :lcc-cr/hasLocalShortName "Tuvalu",
   :lcc-cr/hasNumericRegionCode "798",
   :lcc-cr/hasRemarks "Principal atoll: Funafuti.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Tuvalu :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tuvalu"},
   :skos/definition "the country of Tuvalu"})

(def UA
  "Alpha-2 country code for Ukraine"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ukraine,
   :db/ident :lcc-3166-1/UA,
   :lcc-lr/hasTag "UA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UA",
   :skos/definition "Alpha-2 country code for Ukraine"})

(def UG
  "Alpha-2 country code for Uganda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Uganda,
   :db/ident :lcc-3166-1/UG,
   :lcc-lr/hasTag "UG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UG",
   :skos/definition "Alpha-2 country code for Uganda"})

(def UGA
  "Alpha-3 country code for Uganda"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Uganda,
   :db/ident :lcc-3166-1/UGA,
   :lcc-lr/hasTag "UGA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UGA",
   :skos/definition "Alpha-3 country code for Uganda"})

(def UKR
  "Alpha-3 country code for Ukraine"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Ukraine,
   :db/ident :lcc-3166-1/UKR,
   :lcc-lr/hasTag "UKR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UKR",
   :skos/definition "Alpha-3 country code for Ukraine"})

(def UM
  "Alpha-2 country code for United States Minor Outlying Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :db/ident :lcc-3166-1/UM,
   :lcc-lr/hasTag "UM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UM",
   :skos/definition
   "Alpha-2 country code for United States Minor Outlying Islands (the)"})

(def UMI
  "Alpha-3 country code for United States Minor Outlying Islands (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :db/ident :lcc-3166-1/UMI,
   :lcc-lr/hasTag "UMI",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UMI",
   :skos/definition
   "Alpha-3 country code for United States Minor Outlying Islands (the)"})

(def URY
  "Alpha-3 country code for Uruguay"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Uruguay,
   :db/ident :lcc-3166-1/URY,
   :lcc-lr/hasTag "URY",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "URY",
   :skos/definition "Alpha-3 country code for Uruguay"})

(def US
  "Alpha-2 country code for United States of America (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :lcc-3166-1/US,
   :lcc-lr/hasTag "US",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "US",
   :skos/definition "Alpha-2 country code for United States of America (the)"})

(def USA
  "Alpha-3 country code for United States of America (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :lcc-3166-1/USA,
   :lcc-lr/hasTag "USA",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "USA",
   :skos/definition "Alpha-3 country code for United States of America (the)"})

(def UY
  "Alpha-2 country code for Uruguay"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Uruguay,
   :db/ident :lcc-3166-1/UY,
   :lcc-lr/hasTag "UY",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UY",
   :skos/definition "Alpha-2 country code for Uruguay"})

(def UZ
  "Alpha-2 country code for Uzbekistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Uzbekistan,
   :db/ident :lcc-3166-1/UZ,
   :lcc-lr/hasTag "UZ",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UZ",
   :skos/definition "Alpha-2 country code for Uzbekistan"})

(def UZB
  "Alpha-3 country code for Uzbekistan"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Uzbekistan,
   :db/ident :lcc-3166-1/UZB,
   :lcc-lr/hasTag "UZB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UZB",
   :skos/definition "Alpha-3 country code for Uzbekistan"})

(def Uganda
  "the country of Uganda"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Uganda,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Uganda"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Uganda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UGANDA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Ouganda"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ouganda (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "OUGANDA"},
   :lcc-cr/hasNumericRegionCode "800",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Uganda"},
   :skos/definition "the country of Uganda"})

(def Ukraine
  "the country of Ukraine"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Ukraine,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ukraine"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UKRAINE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ukraine (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "UKRAINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "uk",
                              :rdf/value    "Ukraina"},
   :lcc-cr/hasNumericRegionCode "804",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Ukrainian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "uk",
                :rdf/value    "Ukraina"},
   :skos/definition "the country of Ukraine"})

(def UnitedArabEmirates
  "the country of United Arab Emirates (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/UnitedArabEmirates,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United Arab Emirates"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "United Arab Emirates (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UNITED ARAB EMIRATES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Émirats arabes unis"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Émirats arabes unis (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉMIRATS ARABES UNIS"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Imārāt"},
   :lcc-cr/hasNumericRegionCode "784",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Imārāt"},
   :skos/definition "the country of United Arab Emirates (the)"})

(def UnitedKingdom
  {:db/ident :lcc-3166-1/UnitedKingdom,
   :owl/sameAs :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/note
   "UnitedKingdom is supported as legacy identifier for UnitedKingdomOfGreatBritainAndNorthernIreland"})

(def UnitedKingdomOfGreatBritainAndNorthernIreland
  "the country of United Kingdom of Great Britain and Northern Ireland (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the United Kingdom of Great Britain and Northern Ireland"},
   :lcc-cr/hasEnglishShortName
   {:rdf/language "en",
    :rdf/value    "United Kingdom of Great Britain and Northern Ireland (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "le Royaume-Uni de Grande-Bretagne et d'Irlande du Nord"},
   :lcc-cr/hasFrenchShortName
   {:rdf/language "fr",
    :rdf/value    "Royaume-Uni de Grande-Bretagne et d'Irlande du Nord (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "ROYAUME-UNI DE GRANDE-BRETAGNE ET D'IRLANDE DU NORD"},
   :lcc-cr/hasNumericRegionCode "826",
   :lcc-cr/hasRemarks
   "BS 6879 gives alternative name forms in Welsh (cy) for some of the Welsh unitary authorities (together with alternative code elements). Since this part of ISO 3166 does not allow for duplicate coding of identical subdivisions, such alternative names in Welsh and code elements are shown for information purposes only in square brackets after the English name of the subdivision. BS 6879 has been superseded but remains the original source of the codes.\nCountry (en) / pays (fr), Province (en) / province (fr):\nENG England country;\nNIR Northern Ireland province;\nSCT Scotland country;\nWLS Wales [Cymru GB-CYM] country.\nIncluded for completeness:\nEAW England and Wales;\nGBN Great Britain;\nUKM United Kingdom.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "United Kingdom of Great Britain and Northern Ireland (the)"},
   :skos/definition
   "the country of United Kingdom of Great Britain and Northern Ireland (the)"})

(def UnitedStates
  {:db/ident :lcc-3166-1/UnitedStates,
   :owl/sameAs :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/note
   "UnitedStates is supported as legacy identifier for UnitedStatesOfAmerica"})

(def UnitedStatesMinorOutlyingIslands
  "the country of United States Minor Outlying Islands (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "United States Minor Outlying Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "UNITED STATES MINOR OUTLYING ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Îles mineures éloignées des États-Unis (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "ÎLES MINEURES ÉLOIGNÉES DES ÉTATS-UNIS"},
   :lcc-cr/hasNumericRegionCode "581",
   :lcc-cr/hasRemarks
   ["Comprises: In the Pacific Ocean: Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Islands, Palmyra Atoll, Wake Island In the Caribbean Sea: Navassa Island."
    "Remark: Included also as a subdivision of the United States (US-UM)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "United States Minor Outlying Islands (the)"},
   :skos/definition
   "the country of United States Minor Outlying Islands (the)"})

(def UnitedStatesOfAmerica
  "the country of United States of America (the)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United States of America"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "United States of America (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "UNITED STATES OF AMERICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les États-Unis d'Amérique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "États-Unis d'Amérique (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉTATS-UNIS D'AMÉRIQUE"},
   :lcc-cr/hasNumericRegionCode "840",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "United States of America (the)"},
   :skos/definition "the country of United States of America (the)"})

(def Uruguay
  "the country of Uruguay"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Uruguay,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Eastern Republic of Uruguay"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Uruguay"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "URUGUAY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République orientale de l'Uruguay"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Uruguay (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "URUGUAY"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Uruguay (el)"},
   :lcc-cr/hasNumericRegionCode "858",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Uruguay (el)"},
   :skos/definition "the country of Uruguay"})

(def Uzbekistan
  "the country of Uzbekistan"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Uzbekistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Uzbekistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Uzbekistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UZBEKISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Ouzbékistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ouzbékistan (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "OUZBÉKISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "uz",
                              :rdf/value    "O‘zbekiston"},
   :lcc-cr/hasNumericRegionCode "860",
   :lcc-cr/hasRemarks
   "In May 1995 a new Roman alphabet was officially decreed for the Uzbek language",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Uzbek,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "uz",
                :rdf/value    "O‘zbekiston"},
   :skos/definition "the country of Uzbekistan"})

(def VA
  "Alpha-2 country code for Holy See (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/HolySee,
   :db/ident :lcc-3166-1/VA,
   :lcc-lr/hasTag "VA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VA",
   :skos/definition "Alpha-2 country code for Holy See (the)"})

(def VAT
  "Alpha-3 country code for Holy See (the)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/HolySee,
   :db/ident :lcc-3166-1/VAT,
   :lcc-lr/hasTag "VAT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VAT",
   :skos/definition "Alpha-3 country code for Holy See (the)"})

(def VC
  "Alpha-2 country code for Saint Vincent and the Grenadines"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintVincentAndTheGrenadines,
   :db/ident :lcc-3166-1/VC,
   :lcc-lr/hasTag "VC",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VC",
   :skos/definition
   "Alpha-2 country code for Saint Vincent and the Grenadines"})

(def VCT
  "Alpha-3 country code for Saint Vincent and the Grenadines"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SaintVincentAndTheGrenadines,
   :db/ident :lcc-3166-1/VCT,
   :lcc-lr/hasTag "VCT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VCT",
   :skos/definition
   "Alpha-3 country code for Saint Vincent and the Grenadines"})

(def VE
  "Alpha-2 country code for Venezuela (Bolivarian Republic of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Venezuela,
   :db/ident :lcc-3166-1/VE,
   :lcc-lr/hasTag "VE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VE",
   :skos/definition
   "Alpha-2 country code for Venezuela (Bolivarian Republic of)"})

(def VEN
  "Alpha-3 country code for Venezuela (Bolivarian Republic of)"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Venezuela,
   :db/ident :lcc-3166-1/VEN,
   :lcc-lr/hasTag "VEN",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VEN",
   :skos/definition
   "Alpha-3 country code for Venezuela (Bolivarian Republic of)"})

(def VG
  "Alpha-2 country code for Virgin Islands British"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/VirginIslandsBritish,
   :db/ident :lcc-3166-1/VG,
   :lcc-lr/hasTag "VG",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VG",
   :skos/definition "Alpha-2 country code for Virgin Islands British"})

(def VGB
  "Alpha-3 country code for Virgin Islands British"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/VirginIslandsBritish,
   :db/ident :lcc-3166-1/VGB,
   :lcc-lr/hasTag "VGB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VGB",
   :skos/definition "Alpha-3 country code for Virgin Islands British"})

(def VI
  "Alpha-2 country code for Virgin Islands US"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/VirginIslandsUS,
   :db/ident :lcc-3166-1/VI,
   :lcc-lr/hasTag "VI",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VI",
   :skos/definition "Alpha-2 country code for Virgin Islands US"})

(def VIR
  "Alpha-3 country code for Virgin Islands US"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/VirginIslandsUS,
   :db/ident :lcc-3166-1/VIR,
   :lcc-lr/hasTag "VIR",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VIR",
   :skos/definition "Alpha-3 country code for Virgin Islands US"})

(def VN
  "Alpha-2 country code for Viet Nam"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/VietNam,
   :db/ident :lcc-3166-1/VN,
   :lcc-lr/hasTag "VN",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VN",
   :skos/definition "Alpha-2 country code for Viet Nam"})

(def VNM
  "Alpha-3 country code for Viet Nam"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/VietNam,
   :db/ident :lcc-3166-1/VNM,
   :lcc-lr/hasTag "VNM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VNM",
   :skos/definition "Alpha-3 country code for Viet Nam"})

(def VU
  "Alpha-2 country code for Vanuatu"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Vanuatu,
   :db/ident :lcc-3166-1/VU,
   :lcc-lr/hasTag "VU",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VU",
   :skos/definition "Alpha-2 country code for Vanuatu"})

(def VUT
  "Alpha-3 country code for Vanuatu"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Vanuatu,
   :db/ident :lcc-3166-1/VUT,
   :lcc-lr/hasTag "VUT",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VUT",
   :skos/definition "Alpha-3 country code for Vanuatu"})

(def Vanuatu
  "the country of Vanuatu"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Vanuatu,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Vanuatu"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Vanuatu"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "VANUATU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Vanuatu"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Vanuatu (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "VANUATU"},
   :lcc-cr/hasLocalShortName {:rdf/language "bi",
                              :rdf/value    "Vanuatu"},
   :lcc-cr/hasNumericRegionCode "548",
   :lcc-cr/hasRemarks "Principal islands: Efate, Santo.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Bislama :lcc-639-1/English :lcc-639-1/French],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Vanuatu (le)"}
                {:rdf/language "en",
                 :rdf/value    "Vanuatu"}
                {:rdf/language "bi",
                 :rdf/value    "Vanuatu"}],
   :skos/definition "the country of Vanuatu"})

(def Venezuela
  "the country of Venezuela (Bolivarian Republic of)"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Venezuela,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Bolivarian Republic of Venezuela"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Venezuela (Bolivarian Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "VENEZUELA (BOLIVARIAN REPUBLIC OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République bolivarienne du Venezuela"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Venezuela (République bolivarienne du)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "VENEZUELA (RÉPUBLIQUE BOLIVARIENNE DU)"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value "Venezuela, República Bolivariana de"},
   :lcc-cr/hasNumericRegionCode "862",
   :lcc-cr/hasRemarks "Includes: Bird Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Venezuela, República Bolivariana de"},
   :skos/definition "the country of Venezuela (Bolivarian Republic of)"})

(def VietNam
  "the country of Viet Nam"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/VietNam,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Socialist Republic of Viet Nam"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Viet Nam"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "VIET NAM"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République socialiste du Viet Nam"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Viet Nam (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "VIET NAM"},
   :lcc-cr/hasLocalShortName {:rdf/language "vi",
                              :rdf/value    "Việt Nam"},
   :lcc-cr/hasNumericRegionCode "704",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Vietnamese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "vi",
                :rdf/value    "Việt Nam"},
   :skos/definition "the country of Viet Nam"})

(def VirginIslandsBritish
  "the country of Virgin Islands British"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/VirginIslandsBritish,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "British Virgin Islands (the)"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Virgin Islands (British)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "VIRGIN ISLANDS (BRITISH)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Vierges britanniques (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "ÎLES VIERGES BRITANNIQUES"},
   :lcc-cr/hasNumericRegionCode "092",
   :lcc-cr/hasRemarks
   ["Principal islands: Anegada, Jost Van Dyke, Tortola, Virgin Gorda."
    "No subdivisions relevant for this standard."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virgin Islands (British)"},
   :skos/definition "the country of Virgin Islands British"})

(def VirginIslandsUS
  "the country of Virgin Islands US"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/VirginIslandsUS,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Virgin Islands of the United States"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Virgin Islands (U.S.)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "VIRGIN ISLANDS (U.S.)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Vierges des États-Unis (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "ÎLES VIERGES DES ÉTATS-UNIS"},
   :lcc-cr/hasNumericRegionCode "850",
   :lcc-cr/hasRemarks
   ["Principal islands: Saint Croix, Saint John, Saint Thomas."
    "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-VI)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virgin Islands (U.S.)"},
   :skos/definition "the country of Virgin Islands US"})

(def WF
  "Alpha-2 country code for Wallis and Futuna"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/WallisAndFutuna,
   :db/ident :lcc-3166-1/WF,
   :lcc-lr/hasTag "WF",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WF",
   :skos/definition "Alpha-2 country code for Wallis and Futuna"})

(def WLF
  "Alpha-3 country code for Wallis and Futuna"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/WallisAndFutuna,
   :db/ident :lcc-3166-1/WLF,
   :lcc-lr/hasTag "WLF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WLF",
   :skos/definition "Alpha-3 country code for Wallis and Futuna"})

(def WS
  "Alpha-2 country code for Samoa"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Samoa,
   :db/ident :lcc-3166-1/WS,
   :lcc-lr/hasTag "WS",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WS",
   :skos/definition "Alpha-2 country code for Samoa"})

(def WSM
  "Alpha-3 country code for Samoa"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Samoa,
   :db/ident :lcc-3166-1/WSM,
   :lcc-lr/hasTag "WSM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WSM",
   :skos/definition "Alpha-3 country code for Samoa"})

(def WallisAndFutuna
  "the country of Wallis and Futuna"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/WallisAndFutuna,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "Wallis and Futuna Islands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Wallis and Futuna"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "WALLIS AND FUTUNA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Îles Wallis-et-Futuna"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Wallis-et-Futuna"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "WALLIS-ET-FUTUNA"},
   :lcc-cr/hasNumericRegionCode "876",
   :lcc-cr/hasRemarks
   ["Included also as a subdivision of France (FR-WF)."
    "Comprises: Hoorn Islands (Principal island: Futuna), Wallis Islands (Principal island: Uvea)."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Wallis-et-Futuna"},
   :skos/definition "the country of Wallis and Futuna"})

(def WesternSahara
  "the country of Western Sahara*"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/WesternSahara,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Western Sahara*"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "WESTERN SAHARA *"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sahara occidental (le)*"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAHARA OCCIDENTAL*"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Aş Şaḩrā' al Gharbīyah"},
   :lcc-cr/hasNumericRegionCode "732",
   :lcc-cr/hasRemarks ["* Provisional name."
                       "No subdivisions relevant for this standard."],
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Aş Şaḩrā' al Gharbīyah"},
   :skos/definition "the country of Western Sahara*"})

(def YE
  "Alpha-2 country code for Yemen"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Yemen,
   :db/ident :lcc-3166-1/YE,
   :lcc-lr/hasTag "YE",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "YE",
   :skos/definition "Alpha-2 country code for Yemen"})

(def YEM
  "Alpha-3 country code for Yemen"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Yemen,
   :db/ident :lcc-3166-1/YEM,
   :lcc-lr/hasTag "YEM",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "YEM",
   :skos/definition "Alpha-3 country code for Yemen"})

(def YT
  "Alpha-2 country code for Mayotte"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Mayotte,
   :db/ident :lcc-3166-1/YT,
   :lcc-lr/hasTag "YT",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "YT",
   :skos/definition "Alpha-2 country code for Mayotte"})

(def Yemen
  "the country of Yemen"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Yemen,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Yemen"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Yemen"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "YEMEN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Yémen"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Yémen (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "YÉMEN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Yaman"},
   :lcc-cr/hasNumericRegionCode "887",
   :lcc-cr/hasRemarks "Includes: Socotra Island.",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Yaman"},
   :skos/definition "the country of Yemen"})

(def ZA
  "Alpha-2 country code for South Africa"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SouthAfrica,
   :db/ident :lcc-3166-1/ZA,
   :lcc-lr/hasTag "ZA",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZA",
   :skos/definition "Alpha-2 country code for South Africa"})

(def ZAF
  "Alpha-3 country code for South Africa"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SouthAfrica,
   :db/ident :lcc-3166-1/ZAF,
   :lcc-lr/hasTag "ZAF",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZAF",
   :skos/definition "Alpha-3 country code for South Africa"})

(def ZM
  "Alpha-2 country code for Zambia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Zambia,
   :db/ident :lcc-3166-1/ZM,
   :lcc-lr/hasTag "ZM",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZM",
   :skos/definition "Alpha-2 country code for Zambia"})

(def ZMB
  "Alpha-3 country code for Zambia"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Zambia,
   :db/ident :lcc-3166-1/ZMB,
   :lcc-lr/hasTag "ZMB",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZMB",
   :skos/definition "Alpha-3 country code for Zambia"})

(def ZW
  "Alpha-2 country code for Zimbabwe"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Zimbabwe,
   :db/ident :lcc-3166-1/ZW,
   :lcc-lr/hasTag "ZW",
   :rdf/type [:lcc-cr/Alpha2RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZW",
   :skos/definition "Alpha-2 country code for Zimbabwe"})

(def ZWE
  "Alpha-3 country code for Zimbabwe"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/Zimbabwe,
   :db/ident :lcc-3166-1/ZWE,
   :lcc-lr/hasTag "ZWE",
   :rdf/type [:lcc-cr/Alpha3RegionCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZWE",
   :skos/definition "Alpha-3 country code for Zimbabwe"})

(def Zambia
  "the country of Zambia"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Zambia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Zambia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Zambia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ZAMBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Zambie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Zambie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ZAMBIE"},
   :lcc-cr/hasNumericRegionCode "894",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zambia"},
   :skos/definition "the country of Zambia"})

(def Zimbabwe
  "the country of Zimbabwe"
  {:cmns-cls/isClassifiedBy :lcc-3166-1/Country,
   :db/ident :lcc-3166-1/Zimbabwe,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Zimbabwe"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Zimbabwe"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ZIMBABWE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Zimbabwe"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Zimbabwe (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ZIMBABWE"},
   :lcc-cr/hasNumericRegionCode "716",
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zimbabwe"},
   :skos/definition "the country of Zimbabwe"})

(def crs
  "Alpha-3 language code for Seselwa Creole French"
  {:cmns-col/isMemberOf :lcc-3166-1/ISO639-3-CodeSet,
   :cmns-id/identifies :lcc-3166-1/SeselwaCreoleFrench,
   :db/ident :lcc-3166-1/crs,
   :lcc-lr/hasTag "crs",
   :rdf/type [:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "crs",
   :skos/definition "Alpha-3 language code for Seselwa Creole French"})