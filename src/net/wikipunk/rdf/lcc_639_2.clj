(ns net.wikipunk.rdf.lcc-639-2
  "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-2."
  {:cmns-av/copyright ["Copyright (c) 2015-2019 Adaptive, Inc."
                       "Copyright (c) 2019-2022 agnos.ai UK Ltd."
                       "Copyright (c) 2015-2017 Unisys"
                       "Copyright (c) 2015-2022 Thematix Partners LLC"
                       "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Languages/ISO639-2-LanguageCodes.rdf",
   :dcterms/abstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-2.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai U.K. Ltd"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references ["http://www.w3.org/2004/02/skos/core#"
                        "http://purl.org/dc/terms/"],
   :owl/imports
   ["https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20221101/Languages/ISO639-2-LanguageCodes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-639-2"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfa/prefix "lcc-639-2",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "LCC ISO 639-2 Language Codes Ontology",
   :rdfs/seeAlso ["http://www.loc.gov/standards/iso639-2/php/code_list.php/"
                  "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"]}
  (:refer-clojure :exclude [cat inc map min]))

(def Achinese
  "Achinese language"
  {:db/ident :lcc-639-2/Achinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Achinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aceh"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Achinese",
   :skos/definition "Achinese language"})

(def Acoli
  "Acoli language"
  {:db/ident :lcc-639-2/Acoli,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Acoli"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "acoli"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Acoli",
   :skos/definition "Acoli language"})

(def Adangme
  "Adangme language"
  {:db/ident :lcc-639-2/Adangme,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Adangme"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "adangme"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Adangme",
   :skos/definition "Adangme language"})

(def Adyghe
  "Adyghe language"
  {:db/ident :lcc-639-2/Adyghe,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Adyghe"}
                           {:rdf/language "en",
                            :rdf/value    "Adygei"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "adyghé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Adyghe",
   :skos/definition "Adyghe language"})

(def Afrihili
  "Afrihili language"
  {:db/ident :lcc-639-2/Afrihili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afrihili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afrihili"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Afrihili",
   :skos/definition "Afrihili language"})

(def AfroAsiaticLanguages
  "Afro-Asiatic languages remainder group"
  {:db/ident :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afro-Asiatic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afro-asiatiques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Afro-Asiatic languages",
   :skos/definition "Afro-Asiatic languages remainder group"})

(def Ainu
  "Ainu language"
  {:db/ident :lcc-639-2/Ainu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ainu (Japan)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aïnou"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ainu",
   :skos/definition "Ainu language"})

(def Akkadian
  "Akkadian language"
  {:db/ident :lcc-639-2/Akkadian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Akkadian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "akkadien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Akkadian",
   :skos/definition "Akkadian language"})

(def Aleut
  "Aleut language"
  {:db/ident :lcc-639-2/Aleut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aleut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aléoute"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Aleut",
   :skos/definition "Aleut language"})

(def AlgonquianLanguages
  "Algonquian languages family"
  {:db/ident :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Algonquian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "algonquines, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Algonquian languages",
   :skos/definition "Algonquian languages family"})

(def AltaicLanguages
  "Altaic languages remainder group"
  {:db/ident :lcc-639-2/AltaicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Altaic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "altaïques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Altaic languages",
   :skos/definition "Altaic languages remainder group"})

(def AncientEgyptian
  "Ancient Egyptian language"
  {:db/ident :lcc-639-2/AncientEgyptian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Egyptian (Ancient)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "égyptien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ancient Egyptian",
   :skos/definition "Ancient Egyptian language"})

(def AncientGreek
  "Ancient Greek language"
  {:db/ident :lcc-639-2/AncientGreek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Greek, Ancient (to 1453)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grec ancien (jusqu'à 1453)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ancient Greek",
   :skos/definition "Ancient Greek language"})

(def Angika
  "Angika language"
  {:db/ident :lcc-639-2/Angika,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Angika"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "angika"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Angika",
   :skos/definition "Angika language"})

(def ApacheLanguages
  "Apache languages family"
  {:db/ident :lcc-639-2/ApacheLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Apache languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "apaches, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Apache languages",
   :skos/definition "Apache languages family"})

(def Arapaho
  "Arapaho language"
  {:db/ident :lcc-639-2/Arapaho,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arapaho"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arapaho"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Arapaho",
   :skos/definition "Arapaho language"})

(def Arawak
  "Arawak language"
  {:db/ident :lcc-639-2/Arawak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arawak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arawak"},
   :rdf/type [:lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Arawak",
   :skos/definition "Arawak language"})

(def ArtificialLanguages
  "Artificial languages remainder group"
  {:db/ident :lcc-639-2/ArtificialLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Artificial languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "artificielles, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Artificial languages",
   :skos/definition "Artificial languages remainder group"})

(def Asturian
  "Asturian language"
  {:db/ident :lcc-639-2/Asturian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Asturleonese"}
                           {:rdf/language "en",
                            :rdf/value    "Leonese"}
                           {:rdf/language "en",
                            :rdf/value    "Asturian"}
                           {:rdf/language "en",
                            :rdf/value    "Bable"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "asturien"}
                          {:rdf/language "fr",
                           :rdf/value    "bable"}
                          {:rdf/language "fr",
                           :rdf/value    "asturoléonais"}
                          {:rdf/language "fr",
                           :rdf/value    "léonais"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Asturian",
   :skos/definition "Asturian language"})

(def AthapascanLanguages
  "Athapascan languages family"
  {:db/ident :lcc-639-2/AthapascanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Athapascan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "athapascanes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Athapascan languages",
   :skos/definition "Athapascan languages family"})

(def AustralianLanguages
  "Australian languages family"
  {:db/ident :lcc-639-2/AustralianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Australian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "australiennes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Australian languages",
   :skos/definition "Australian languages family"})

(def AustronesianLanguages
  "Austronesian languages remainder group"
  {:db/ident :lcc-639-2/AustronesianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Austronesian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "austronésiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Austronesian languages",
   :skos/definition "Austronesian languages remainder group"})

(def Awadhi
  "Awadhi language"
  {:db/ident :lcc-639-2/Awadhi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Awadhi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "awadhi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Awadhi",
   :skos/definition "Awadhi language"})

(def Balinese
  "Balinese language"
  {:db/ident :lcc-639-2/Balinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Balinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "balinais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Balinese",
   :skos/definition "Balinese language"})

(def BalticLanguages
  "Baltic languages remainder group"
  {:db/ident :lcc-639-2/BalticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Baltic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "baltes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Baltic languages",
   :skos/definition "Baltic languages remainder group"})

(def Baluchi
  "Language code for Baluchi"
  {:db/ident :lcc-639-2/Baluchi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Baluchi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "baloutchi"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Baluchi",
   :skos/definition "Language code for Baluchi"})

(def BamilekeLanguages
  "Bamileke languages family"
  {:db/ident :lcc-639-2/BamilekeLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bamileke languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bamiléké, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bamileke languages",
   :skos/definition "Bamileke languages family"})

(def BandaLanguages
  "Banda languages family"
  {:db/ident :lcc-639-2/BandaLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Banda languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "banda, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Banda languages",
   :skos/definition "Banda languages family"})

(def BantuLanguages
  "Bantu languages remainder group"
  {:db/ident :lcc-639-2/BantuLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bantu languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bantou, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bantu languages",
   :skos/definition "Bantu languages remainder group"})

(def Basa
  "Basa language"
  {:db/ident :lcc-639-2/Basa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Basa (Cameroon)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "basa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Basa",
   :skos/definition "Basa language"})

(def BatakLanguages
  "Batak languages family"
  {:db/ident :lcc-639-2/BatakLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Batak languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "batak, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Batak languages",
   :skos/definition "Batak languages family"})

(def Beja
  "Beja language"
  {:db/ident :lcc-639-2/Beja,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Beja"}
                           {:rdf/language "en",
                            :rdf/value    "Bedawiyet"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bedja"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Beja",
   :skos/definition "Beja language"})

(def Bemba
  "Bemba language"
  {:db/ident :lcc-639-2/Bemba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bemba (Zambia)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bemba"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bemba",
   :skos/definition "Bemba language"})

(def BerberLanguages
  "Berber languages remainder group"
  {:db/ident :lcc-639-2/BerberLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Berber languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "berbères, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Berber languages",
   :skos/definition "Berber languages remainder group"})

(def Bhojpuri
  "Bhojpuri language"
  {:db/ident :lcc-639-2/Bhojpuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bhojpuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bhojpuri"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bhojpuri",
   :skos/definition "Bhojpuri language"})

(def Bikol
  "Language code for Bikol"
  {:db/ident :lcc-639-2/Bikol,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bikol"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bikol"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bikol",
   :skos/definition "Language code for Bikol"})

(def Bilin
  "Bilin language"
  {:db/ident :lcc-639-2/Bilin,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Bilin"}
                           {:rdf/language "en",
                            :rdf/value    "Blin"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "blin"}
                          {:rdf/language "fr",
                           :rdf/value    "bilen"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bilin",
   :skos/definition "Bilin language"})

(def Bini
  "Bini language"
  {:db/ident :lcc-639-2/Bini,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Bini"}
                           {:rdf/language "en",
                            :rdf/value    "Edo"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "edo"}
                          {:rdf/language "fr",
                           :rdf/value    "bini"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bini",
   :skos/definition "Bini language"})

(def Bliss
  "Bliss language"
  {:db/ident :lcc-639-2/Bliss,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Blissymbolics"}
                           {:rdf/language "en",
                            :rdf/value    "Blissymbols"}
                           {:rdf/language "en",
                            :rdf/value    "Bliss"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "Bliss"}
                          {:rdf/language "fr",
                           :rdf/value    "symboles Bliss"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bliss",
   :skos/definition "Bliss language"})

(def Braj
  "Braj language"
  {:db/ident :lcc-639-2/Braj,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Braj"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "braj"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Braj",
   :skos/definition "Braj language"})

(def Buginese
  "Buginese language"
  {:db/ident :lcc-639-2/Buginese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Buginese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bugi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Buginese",
   :skos/definition "Buginese language"})

(def Buriat
  "Language code for Buriat"
  {:db/ident :lcc-639-2/Buriat,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Buriat"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bouriate"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Buriat",
   :skos/definition "Language code for Buriat"})

(def Caddo
  "Caddo language"
  {:db/ident :lcc-639-2/Caddo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Caddo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "caddo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Caddo",
   :skos/definition "Caddo language"})

(def CaucasianLanguages
  "Caucasian languages remainder group"
  {:db/ident :lcc-639-2/CaucasianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Caucasian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "caucasiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Caucasian languages",
   :skos/definition "Caucasian languages remainder group"})

(def Cebuano
  "Cebuano language"
  {:db/ident :lcc-639-2/Cebuano,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cebuano"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cebuano"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cebuano",
   :skos/definition "Cebuano language"})

(def CelticLanguages
  "Celtic languages remainder group"
  {:db/ident :lcc-639-2/CelticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Celtic languages"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "celtiques, langues"}
                          {:rdf/language "fr",
                           :rdf/value    "celtes, langues"}],
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Celtic languages",
   :skos/definition "Celtic languages remainder group"})

(def CentralAmericanIndianLanguages
  "Central American Indian languages remainder group"
  {:db/ident :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Central American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "amérindiennes de l'Amérique centrale, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Central American Indian languages",
   :skos/definition "Central American Indian languages remainder group"})

(def Chagatai
  "Chagatai language"
  {:db/ident :lcc-639-2/Chagatai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chagatai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "djaghataï"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chagatai",
   :skos/definition "Chagatai language"})

(def ChamicLanguages
  "Chamic languages family"
  {:db/ident :lcc-639-2/ChamicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chamic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chames, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chamic languages",
   :skos/definition "Chamic languages family"})

(def Cherokee
  "Cherokee language"
  {:db/ident :lcc-639-2/Cherokee,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cherokee"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cherokee"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cherokee",
   :skos/definition "Cherokee language"})

(def Cheyenne
  "Cheyenne language"
  {:db/ident :lcc-639-2/Cheyenne,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cheyenne"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cheyenne"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cheyenne",
   :skos/definition "Cheyenne language"})

(def Chibcha
  "Chibcha language"
  {:db/ident :lcc-639-2/Chibcha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chibcha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chibcha"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chibcha",
   :skos/definition "Chibcha language"})

(def ChinookJargon
  "Chinook jargon language"
  {:db/ident :lcc-639-2/ChinookJargon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chinook jargon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chinook, jargon"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chinook jargon",
   :skos/definition "Chinook jargon language"})

(def Chipewyan
  "Chipewyan language"
  {:db/ident :lcc-639-2/Chipewyan,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Dene Suline"}
                           {:rdf/language "en",
                            :rdf/value    "Chipewyan"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chipewyan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chipewyan",
   :skos/definition "Chipewyan language"})

(def Choctaw
  "Choctaw language"
  {:db/ident :lcc-639-2/Choctaw,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Choctaw"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "choctaw"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Choctaw",
   :skos/definition "Choctaw language"})

(def Chuukese
  "Chuukese language"
  {:db/ident :lcc-639-2/Chuukese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chuukese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chuuk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chuukese",
   :skos/definition "Chuukese language"})

(def ClassicalNewari
  "Classical Newari language"
  {:db/ident :lcc-639-2/ClassicalNewari,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Old Newari"}
                           {:rdf/language "en",
                            :rdf/value    "Classical Newari"}
                           {:rdf/language "en",
                            :rdf/value    "Classical Nepal Bhasa"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "newari classique"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/HistoricalLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Classical Newari",
   :skos/definition "Classical Newari language"})

(def ClassicalSyriac
  "Classical Syriac family"
  {:db/ident :lcc-639-2/ClassicalSyriac,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Classical Syriac"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "syriaque classique"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Classical Syriac",
   :skos/definition "Classical Syriac family"})

(def Coptic
  "Coptic language"
  {:db/ident :lcc-639-2/Coptic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Coptic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "copte"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Coptic",
   :skos/definition "Coptic language"})

(def Creek
  "Creek language"
  {:db/ident :lcc-639-2/Creek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "muskogee"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creek",
   :skos/definition "Creek language"})

(def CreolesAndPidgins
  "Creoles and pidgins remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "créoles et pidgins"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins",
   :skos/definition "Creoles and pidgins remainder group"})

(def CreolesAndPidginsEnglishBased
  "Creoles and pidgins, English based remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins, English based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value "créoles et pidgins basés sur l'anglais"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins, English based",
   :skos/definition "Creoles and pidgins, English based remainder group"})

(def CreolesAndPidginsFrenchBased
  "Creoles and pidgins, French-based remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins, French-based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "créoles et pidgins basés sur le français"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins, French-based",
   :skos/definition "Creoles and pidgins, French-based remainder group"})

(def CreolesAndPidginsPortugueseBased
  "Creoles and pidgins, Portuguese-based remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value "Creoles and pidgins, Portuguese-based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "créoles et pidgins basés sur le portugais"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins, Portuguese-based",
   :skos/definition "Creoles and pidgins, Portuguese-based remainder group"})

(def CrimeanTatar
  "Crimean Tatar language"
  {:db/ident :lcc-639-2/CrimeanTatar,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Crimean Turkish"}
                           {:rdf/language "en",
                            :rdf/value    "Crimean Tatar"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tatar de Crimé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Crimean Tatar",
   :skos/definition "Crimean Tatar language"})

(def CushiticLanguages
  "Cushitic languages remainder group"
  {:db/ident :lcc-639-2/CushiticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cushitic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "couchitiques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cushitic languages",
   :skos/definition "Cushitic languages remainder group"})

(def Dakota
  "Dakota language"
  {:db/ident :lcc-639-2/Dakota,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dakota"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dakota"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dakota",
   :skos/definition "Dakota language"})

(def Dargwa
  "Dargwa language"
  {:db/ident :lcc-639-2/Dargwa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dargwa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dargwa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dargwa",
   :skos/definition "Dargwa language"})

(def Delaware
  "Language code for Delaware"
  {:db/ident :lcc-639-2/Delaware,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Delaware"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "delaware"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Delaware",
   :skos/definition "Language code for Delaware"})

(def Dinka
  "Language code for Dinka"
  {:db/ident :lcc-639-2/Dinka,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dinka"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dinka"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dinka",
   :skos/definition "Language code for Dinka"})

(def Dogri
  "Language code for Dogri (macrolanguage)"
  {:db/ident :lcc-639-2/Dogri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dogri (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dogri"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dogri",
   :skos/definition "Language code for Dogri (macrolanguage)"})

(def Dogrib
  "Dogrib language"
  {:db/ident :lcc-639-2/Dogrib,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dogrib"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dogrib"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dogrib",
   :skos/definition "Dogrib language"})

(def DravidianLanguages
  "Dravidian languages remainder group"
  {:db/ident :lcc-639-2/DravidianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dravidian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dravidiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dravidian languages",
   :skos/definition "Dravidian languages remainder group"})

(def Duala
  "Duala language"
  {:db/ident :lcc-639-2/Duala,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Duala"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "douala"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Duala",
   :skos/definition "Duala language"})

(def Dyula
  "Dyula language"
  {:db/ident :lcc-639-2/Dyula,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dyula"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dioula"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dyula",
   :skos/definition "Dyula language"})

(def EasternFrisian
  "Eastern Frisian language"
  {:db/ident :lcc-639-2/EasternFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Eastern Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison oriental"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Eastern Frisian",
   :skos/definition "Eastern Frisian language"})

(def Efik
  "Efik language"
  {:db/ident :lcc-639-2/Efik,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Efik"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "efik"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Efik",
   :skos/definition "Efik language"})

(def Ekajuk
  "Ekajuk language"
  {:db/ident :lcc-639-2/Ekajuk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ekajuk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ekajuk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ekajuk",
   :skos/definition "Ekajuk language"})

(def Elamite
  "Elamite language"
  {:db/ident :lcc-639-2/Elamite,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Elamite"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "élamite"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Elamite",
   :skos/definition "Elamite language"})

(def Erzya
  "Erzya language"
  {:db/ident :lcc-639-2/Erzya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Erzya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "erzya"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Erzya",
   :skos/definition "Erzya language"})

(def Ewondo
  "Ewondo language"
  {:db/ident :lcc-639-2/Ewondo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ewondo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "éwondo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ewondo",
   :skos/definition "Ewondo language"})

(def Fang
  "Fang language"
  {:db/ident :lcc-639-2/Fang,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fang (Equatorial Guinea)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fang"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Fang",
   :skos/definition "Fang language"})

(def Fanti
  "Fanti language"
  {:db/ident :lcc-639-2/Fanti,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fanti"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fanti"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Fanti",
   :skos/definition "Fanti language"})

(def Filipino
  "Filipino language"
  {:db/ident :lcc-639-2/Filipino,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Pilipino"}
                           {:rdf/language "en",
                            :rdf/value    "Filipino"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "filipino"}
                          {:rdf/language "fr",
                           :rdf/value    "pilipino"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Filipino",
   :skos/definition "Filipino language"})

(def FinnoUgrianLanguages
  "Finno-Ugrian languages remainder group"
  {:db/ident :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Finno-Ugrian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "finno-ougriennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Finno-Ugrian languages",
   :skos/definition "Finno-Ugrian languages remainder group"})

(def Fon
  "Fon language"
  {:db/ident :lcc-639-2/Fon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fon"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Fon",
   :skos/definition "Fon language"})

(def Friulian
  "Friulian language"
  {:db/ident :lcc-639-2/Friulian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Friulian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frioulan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Friulian",
   :skos/definition "Friulian language"})

(def Ga
  "Ga language"
  {:db/ident :lcc-639-2/Ga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ga"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ga",
   :skos/definition "Ga language"})

(def GalibiCarib
  "Galibi Carib language"
  {:db/ident :lcc-639-2/GalibiCarib,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Galibi Carib"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "karib"}
                          {:rdf/language "fr",
                           :rdf/value    "carib"}
                          {:rdf/language "fr",
                           :rdf/value    "galibi"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Galibi Carib",
   :skos/definition "Galibi Carib language"})

(def Gayo
  "Gayo language"
  {:db/ident :lcc-639-2/Gayo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gayo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gayo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gayo",
   :skos/definition "Gayo language"})

(def Gbaya
  "Language code for Gbaya (Central African Republic)"
  {:db/ident :lcc-639-2/Gbaya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gbaya (Central African Republic)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gbaya"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gbaya",
   :skos/definition "Language code for Gbaya (Central African Republic)"})

(def Geez
  "Geez language"
  {:db/ident :lcc-639-2/Geez,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Geez"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "guèze"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Geez",
   :skos/definition "Geez language"})

(def GermanicLanguages
  "Germanic languages remainder group"
  {:db/ident :lcc-639-2/GermanicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Germanic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "germaniques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Germanic languages",
   :skos/definition "Germanic languages remainder group"})

(def Gilbertese
  "Gilbertese language"
  {:db/ident :lcc-639-2/Gilbertese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gilbertese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kiribati"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gilbertese",
   :skos/definition "Gilbertese language"})

(def Gondi
  "Language code for Gondi"
  {:db/ident :lcc-639-2/Gondi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gondi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gond"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gondi",
   :skos/definition "Language code for Gondi"})

(def Gorontalo
  "Gorontalo language"
  {:db/ident :lcc-639-2/Gorontalo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gorontalo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gorontalo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gorontalo",
   :skos/definition "Gorontalo language"})

(def Gothic
  "Gothic language"
  {:db/ident :lcc-639-2/Gothic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gothic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gothique"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gothic",
   :skos/definition "Gothic language"})

(def Grebo
  "Language code for Grebo"
  {:db/ident :lcc-639-2/Grebo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Grebo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grebo"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Grebo",
   :skos/definition "Language code for Grebo"})

(def Gwichin
  "Gwich'in language"
  {:db/ident :lcc-639-2/Gwichin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gwich'in"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gwich'in"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gwich'in",
   :skos/definition "Gwich'in language"})

(def Haida
  "Language code for Haida"
  {:db/ident :lcc-639-2/Haida,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Haida"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haida"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Haida",
   :skos/definition "Language code for Haida"})

(def Hawaiian
  "Hawaiian language"
  {:db/ident :lcc-639-2/Hawaiian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hawaiian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hawaïen"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hawaiian",
   :skos/definition "Hawaiian language"})

(def Hiligaynon
  "Hiligaynon language"
  {:db/ident :lcc-639-2/Hiligaynon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hiligaynon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hiligaynon"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hiligaynon",
   :skos/definition "Hiligaynon language"})

(def HimachaliLanguages
  "Himachali languages family"
  {:db/ident :lcc-639-2/HimachaliLanguages,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Western Pahari languages"}
                           {:rdf/language "en",
                            :rdf/value    "Himachali languages"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "langues paharis occidentales"}
                          {:rdf/language "fr",
                           :rdf/value    "langues himachalis"}],
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Himachali languages",
   :skos/definition "Himachali languages family"})

(def Hittite
  "Hittite language"
  {:db/ident :lcc-639-2/Hittite,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hittite"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hittite"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hittite",
   :skos/definition "Hittite language"})

(def Hmong
  "Language code for Hmong"
  {:db/ident :lcc-639-2/Hmong,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Mong"}
                           {:rdf/language "en",
                            :rdf/value    "Hmong"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hmong"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hmong",
   :skos/definition "Language code for Hmong"})

(def Hupa
  "Hupa language"
  {:db/ident :lcc-639-2/Hupa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hupa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hupa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hupa",
   :skos/definition "Hupa language"})

(def ISO639-2-CodeSet
  "the set of language identifiers that comprise the ISO 639-2 specification"
  {:db/ident :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ISO 639-2 code set",
   :rdfs/seeAlso "http://www.loc.gov/standards/iso639-2/php/code_list.php/",
   :skos/definition
   "the set of language identifiers that comprise the ISO 639-2 specification"})

(def Iban
  "Iban language"
  {:db/ident :lcc-639-2/Iban,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iban"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iban"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iban",
   :skos/definition "Iban language"})

(def IjoLanguages
  "Ijo languages family"
  {:db/ident :lcc-639-2/IjoLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ijo languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ijo, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ijo languages",
   :skos/definition "Ijo languages family"})

(def Iloko
  "Iloko language"
  {:db/ident :lcc-639-2/Iloko,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iloko"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ilocano"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iloko",
   :skos/definition "Iloko language"})

(def InariSami
  "Inari Sami language"
  {:db/ident :lcc-639-2/InariSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inari Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami d'Inari"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Inari Sami",
   :skos/definition "Inari Sami language"})

(def IndicLanguages
  "Indic languages remainder group"
  {:db/ident :lcc-639-2/IndicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indo-aryennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Indic languages",
   :skos/definition "Indic languages remainder group"})

(def IndoEuropeanLanguages
  "Indo-European languages remainder group"
  {:db/ident :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indo-European languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indo-européennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Indo-European languages",
   :skos/definition "Indo-European languages remainder group"})

(def Ingush
  "Ingush language"
  {:db/ident :lcc-639-2/Ingush,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ingush"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ingouche"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ingush",
   :skos/definition "Ingush language"})

(def IranianLanguages
  "Iranian languages remainder group"
  {:db/ident :lcc-639-2/IranianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iranian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iraniennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iranian languages",
   :skos/definition "Iranian languages remainder group"})

(def IroquoianLanguages
  "Iroquoian languages family"
  {:db/ident :lcc-639-2/IroquoianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iroquoian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iroquoises, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iroquoian languages",
   :skos/definition "Iroquoian languages family"})

(def JudeoArabic
  "Language code for Judeo-Arabic"
  {:db/ident :lcc-639-2/JudeoArabic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Judeo-Arabic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-arabe"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Judeo-Arabic",
   :skos/definition "Language code for Judeo-Arabic"})

(def JudeoPersian
  "Judeo-Persian language"
  {:db/ident :lcc-639-2/JudeoPersian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Judeo-Persian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-persan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Judeo-Persian",
   :skos/definition "Judeo-Persian language"})

(def Kabardian
  "Kabardian language"
  {:db/ident :lcc-639-2/Kabardian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kabardian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kabardien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kabardian",
   :skos/definition "Kabardian language"})

(def Kabyle
  "Kabyle language"
  {:db/ident :lcc-639-2/Kabyle,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kabyle"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kabyle"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kabyle",
   :skos/definition "Kabyle language"})

(def Kachin
  "Kachin language"
  {:db/ident :lcc-639-2/Kachin,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kachin"}
                           {:rdf/language "en",
                            :rdf/value    "Jingpho"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kachin"}
                          {:rdf/language "fr",
                           :rdf/value    "jingpho"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kachin",
   :skos/definition "Kachin language"})

(def Kalmyk
  "Kalmyk language"
  {:db/ident :lcc-639-2/Kalmyk,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Oirat"}
                           {:rdf/language "en",
                            :rdf/value    "Kalmyk"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kalmouk"}
                          {:rdf/language "fr",
                           :rdf/value    "oïrat"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kalmyk",
   :skos/definition "Kalmyk language"})

(def Kamba
  "Kamba language"
  {:db/ident :lcc-639-2/Kamba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kamba (Kenya)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kamba"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kamba",
   :skos/definition "Kamba language"})

(def KaraKalpak
  "Kara-Kalpak language"
  {:db/ident :lcc-639-2/KaraKalpak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kara-Kalpak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karakalpak"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kara-Kalpak",
   :skos/definition "Kara-Kalpak language"})

(def KarachayBalkar
  "Karachay-Balkar language"
  {:db/ident :lcc-639-2/KarachayBalkar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karachay-Balkar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karatchai balkar"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Karachay-Balkar",
   :skos/definition "Karachay-Balkar language"})

(def Karelian
  "Karelian language"
  {:db/ident :lcc-639-2/Karelian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karelian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "carélien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Karelian",
   :skos/definition "Karelian language"})

(def KarenLanguages
  "Karen languages family"
  {:db/ident :lcc-639-2/KarenLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karen languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karen, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Karen languages",
   :skos/definition "Karen languages family"})

(def Kashubian
  "Kashubian language"
  {:db/ident :lcc-639-2/Kashubian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kashubian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kachoube"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kashubian",
   :skos/definition "Kashubian language"})

(def Kawi
  "Kawi language"
  {:db/ident :lcc-639-2/Kawi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kawi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kawi"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kawi",
   :skos/definition "Kawi language"})

(def Khasi
  "Khasi language"
  {:db/ident :lcc-639-2/Khasi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Khasi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khasi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Khasi",
   :skos/definition "Khasi language"})

(def KhoisanLanguages
  "Khoisan languages remainder group"
  {:db/ident :lcc-639-2/KhoisanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Khoisan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khoïsan, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Khoisan languages",
   :skos/definition "Khoisan languages remainder group"})

(def Khotanese
  "Khotanese language"
  {:db/ident :lcc-639-2/Khotanese,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Sakan"}
                           {:rdf/language "en",
                            :rdf/value    "Khotanese"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "sakan"}
                          {:rdf/language "fr",
                           :rdf/value    "khotanais"}],
   :lcc-lr/hasGermanName {:rdf/language "ge",
                          :rdf/value    "Sakisch"},
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Khotanese",
   :skos/definition "Khotanese language"})

(def Kimbundu
  "Kimbundu language"
  {:db/ident :lcc-639-2/Kimbundu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kimbundu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kimbundu"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kimbundu",
   :skos/definition "Kimbundu language"})

(def Klingon
  "Klingon language"
  {:db/ident :lcc-639-2/Klingon,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "tlhIngan-Hol"}
                           {:rdf/language "en",
                            :rdf/value    "Klingon"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "klingon"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Klingon",
   :skos/definition "Klingon language"})

(def Konkani
  "Language code for Konkani (macrolanguage)"
  {:db/ident :lcc-639-2/Konkani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Konkani (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "konkani"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Konkani",
   :skos/definition "Language code for Konkani (macrolanguage)"})

(def Kosraean
  "Kosraean language"
  {:db/ident :lcc-639-2/Kosraean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kosraean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kosrae"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kosraean",
   :skos/definition "Kosraean language"})

(def Kpelle
  "Language code for Kpelle"
  {:db/ident :lcc-639-2/Kpelle,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kpelle"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kpellé"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kpelle",
   :skos/definition "Language code for Kpelle"})

(def KruLanguages
  "Kru languages family"
  {:db/ident :lcc-639-2/KruLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kru languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "krou, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kru languages",
   :skos/definition "Kru languages family"})

(def Kumyk
  "Kumyk language"
  {:db/ident :lcc-639-2/Kumyk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kumyk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "koumyk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kumyk",
   :skos/definition "Kumyk language"})

(def Kurukh
  "Kurukh language"
  {:db/ident :lcc-639-2/Kurukh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kurukh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kurukh"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kurukh",
   :skos/definition "Kurukh language"})

(def Kutenai
  "Kutenai language"
  {:db/ident :lcc-639-2/Kutenai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kutenai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kutenai"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kutenai",
   :skos/definition "Kutenai language"})

(def Ladino
  "Ladino language"
  {:db/ident :lcc-639-2/Ladino,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ladino"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-espagnol"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ladino",
   :skos/definition "Ladino language"})

(def Lahnda
  "Language code for Lahnda"
  {:db/ident :lcc-639-2/Lahnda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lahnda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lahnda"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lahnda",
   :skos/definition "Language code for Lahnda"})

(def Lamba
  "Lamba language"
  {:db/ident :lcc-639-2/Lamba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lamba"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lamba"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lamba",
   :skos/definition "Lamba language"})

(def LandDayakLanguages
  "Land Dayak languages family"
  {:db/ident :lcc-639-2/LandDayakLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Land Dayak languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dayak, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Land Dayak languages",
   :skos/definition "Land Dayak languages family"})

(def Lezghian
  "Lezghian language"
  {:db/ident :lcc-639-2/Lezghian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lezghian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lezghien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lezghian",
   :skos/definition "Lezghian language"})

(def Lojban
  "Lojban language"
  {:db/ident :lcc-639-2/Lojban,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lojban"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lojban"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lojban",
   :skos/definition "Lojban language"})

(def LowGerman
  "Low German language"
  {:db/ident :lcc-639-2/LowGerman,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Low Saxon"}
                           {:rdf/language "en",
                            :rdf/value    "Low German"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "bas allemand"}
                          {:rdf/language "fr",
                           :rdf/value    "bas saxon"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Low German",
   :skos/definition "Low German language"})

(def LowerSorbian
  "Lower Sorbian language"
  {:db/ident :lcc-639-2/LowerSorbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lower Sorbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bas-sorabe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lower Sorbian",
   :skos/definition "Lower Sorbian language"})

(def Lozi
  "Lozi language"
  {:db/ident :lcc-639-2/Lozi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lozi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lozi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lozi",
   :skos/definition "Lozi language"})

(def LubaLulua
  "Luba-Lulua language"
  {:db/ident :lcc-639-2/LubaLulua,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luba-Lulua"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luba-lulua"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Luba-Lulua",
   :skos/definition "Luba-Lulua language"})

(def Luiseno
  "Luiseno language"
  {:db/ident :lcc-639-2/Luiseno,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luiseno"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luiseno"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Luiseno",
   :skos/definition "Luiseno language"})

(def LuleSami
  "Lule Sami language"
  {:db/ident :lcc-639-2/LuleSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lule Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami de Lule"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lule Sami",
   :skos/definition "Lule Sami language"})

(def Lunda
  "Lunda language"
  {:db/ident :lcc-639-2/Lunda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lunda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lunda"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lunda",
   :skos/definition "Lunda language"})

(def LuoKenyaAndTanzania
  "Luo - Kenya and Tanzania language"
  {:db/ident :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luo (Kenya and Tanzania)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luo (Kenya et Tanzanie)"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Luo - Kenya and Tanzania",
   :skos/definition "Luo - Kenya and Tanzania language"})

(def Lushai
  "Lushai language"
  {:db/ident :lcc-639-2/Lushai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lushai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lushai"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lushai",
   :skos/definition "Lushai language"})

(def MacedoRomanian
  "Macedo Romanian language"
  {:db/ident :lcc-639-2/MacedoRomanian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Arumanian"}
                           {:rdf/language "en",
                            :rdf/value    "Aromanian"}
                           {:rdf/language "en",
                            :rdf/value    "Macedo Romanian"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "macédo-roumain"}
                          {:rdf/language "fr",
                           :rdf/value    "aroumain"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Macedo Romanian",
   :skos/definition "Macedo Romanian language"})

(def Madurese
  "Madurese language"
  {:db/ident :lcc-639-2/Madurese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Madurese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "madourais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Madurese",
   :skos/definition "Madurese language"})

(def Magahi
  "Magahi language"
  {:db/ident :lcc-639-2/Magahi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Magahi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "magahi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Magahi",
   :skos/definition "Magahi language"})

(def Maithili
  "Maithili language"
  {:db/ident :lcc-639-2/Maithili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maithili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maithili"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Maithili",
   :skos/definition "Maithili language"})

(def Makasar
  "Makasar language"
  {:db/ident :lcc-639-2/Makasar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Makasar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "makassar"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Makasar",
   :skos/definition "Makasar language"})

(def Manchu
  "Manchu language"
  {:db/ident :lcc-639-2/Manchu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manchu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandchou"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Manchu",
   :skos/definition "Manchu language"})

(def Mandar
  "Mandar language"
  {:db/ident :lcc-639-2/Mandar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mandar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandar"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mandar",
   :skos/definition "Mandar language"})

(def Mandingo
  "Language code for Mandingo"
  {:db/ident :lcc-639-2/Mandingo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mandingo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandingue"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mandingo",
   :skos/definition "Language code for Mandingo"})

(def Manipuri
  "Manipuri language"
  {:db/ident :lcc-639-2/Manipuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manipuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "manipuri"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Manipuri",
   :skos/definition "Manipuri language"})

(def ManoboLanguages
  "Manobo languages family"
  {:db/ident :lcc-639-2/ManoboLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manobo languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "manobo, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Manobo languages",
   :skos/definition "Manobo languages family"})

(def Mapudungun
  "Mapudungun language"
  {:db/ident :lcc-639-2/Mapudungun,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Mapuche"}
                           {:rdf/language "en",
                            :rdf/value    "Mapudungun"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "mapuce"}
                          {:rdf/language "fr",
                           :rdf/value    "mapudungun"}
                          {:rdf/language "fr",
                           :rdf/value    "mapuche"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mapudungun",
   :skos/definition "Mapudungun language"})

(def Mari
  "Language code for Mari (Russian)"
  {:db/ident :lcc-639-2/Mari,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mari (Russian)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mari"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mari",
   :skos/definition "Language code for Mari (Russian)"})

(def Marwari
  "Language code for Marwari"
  {:db/ident :lcc-639-2/Marwari,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marwari"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marvari"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Marwari",
   :skos/definition "Language code for Marwari"})

(def Masai
  "Masai language"
  {:db/ident :lcc-639-2/Masai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Masai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "massaï"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Masai",
   :skos/definition "Masai language"})

(def MayanLanguages
  "Mayan languages family"
  {:db/ident :lcc-639-2/MayanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mayan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maya, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mayan languages",
   :skos/definition "Mayan languages family"})

(def Mende
  "Mende language"
  {:db/ident :lcc-639-2/Mende,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mende (Sierra Leone)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mendé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mende",
   :skos/definition "Mende language"})

(def MiddleDutch
  "Middle Dutch language"
  {:db/ident :lcc-639-2/MiddleDutch,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dutch, Middle (ca. 1050-1350)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "néerlandais moyen (ca. 1050-1350)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle Dutch",
   :skos/definition "Middle Dutch language"})

(def MiddleEnglish
  "Middle English language"
  {:db/ident :lcc-639-2/MiddleEnglish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English, Middle (1100-1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglais moyen (1100-1500)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle English",
   :skos/definition "Middle English language"})

(def MiddleFrench
  "Middle French language"
  {:db/ident :lcc-639-2/MiddleFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French, Middle (ca. 1400-1600)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français moyen (ca. 1400-1600)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle French",
   :skos/definition "Middle French language"})

(def MiddleHighGerman
  "Middle High German language"
  {:db/ident :lcc-639-2/MiddleHighGerman,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German, Middle High (ca. 1050-1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand, moyen haut (ca. 1050-1500)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle High German",
   :skos/definition "Middle High German language"})

(def MiddleIrish
  "Middle Irish language"
  {:db/ident :lcc-639-2/MiddleIrish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish, Middle (900-1200)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais moyen (900-1200)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle Irish",
   :skos/definition "Middle Irish language"})

(def Mikmaq
  "Mi'kmaq language"
  {:db/ident :lcc-639-2/Mikmaq,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Mi'kmaq"}
                           {:rdf/language "en",
                            :rdf/value    "Micmac"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "mi'kmaq"}
                          {:rdf/language "fr",
                           :rdf/value    "micmac"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mi'kmaq",
   :skos/definition "Mi'kmaq language"})

(def Minangkabau
  "Minangkabau language"
  {:db/ident :lcc-639-2/Minangkabau,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Minangkabau"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "minangkabau"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Minangkabau",
   :skos/definition "Minangkabau language"})

(def Mirandese
  "Mirandese language"
  {:db/ident :lcc-639-2/Mirandese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mirandese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mirandais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mirandese",
   :skos/definition "Mirandese language"})

(def Mohawk
  "Mohawk language"
  {:db/ident :lcc-639-2/Mohawk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mohawk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mohawk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mohawk",
   :skos/definition "Mohawk language"})

(def Moksha
  "Moksha language"
  {:db/ident :lcc-639-2/Moksha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Moksha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "moksa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Moksha",
   :skos/definition "Moksha language"})

(def MonKhmerLanguages
  "Mon-Khmer languages remainder group"
  {:db/ident :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mon-Khmer languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "môn-khmer, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mon-Khmer languages",
   :skos/definition "Mon-Khmer languages remainder group"})

(def Mongo
  "Mongo language"
  {:db/ident :lcc-639-2/Mongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mongo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mongo",
   :skos/definition "Mongo language"})

(def Montenegrin
  "Montenegrin language"
  {:db/ident :lcc-639-2/Montenegrin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Montenegrin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "monténégrin"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Montenegrin",
   :skos/definition "Montenegrin language"})

(def Mossi
  "Mossi language"
  {:db/ident :lcc-639-2/Mossi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mossi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "moré"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mossi",
   :skos/definition "Mossi language"})

(def MultipleLanguages
  "Multiple languages special purpose language concept"
  {:db/ident :lcc-639-2/MultipleLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Multiple languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "multilingue"},
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Multiple languages",
   :skos/definition "Multiple languages special purpose language concept"})

(def MundaLanguages
  "Munda languages family"
  {:db/ident :lcc-639-2/MundaLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Munda languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mounda, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Munda languages",
   :skos/definition "Munda languages family"})

(def NKo
  "N'Ko language"
  {:db/ident :lcc-639-2/NKo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "N'Ko"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "n'ko"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "N'Ko",
   :skos/definition "N'Ko language"})

(def NahuatlLanguages
  "Nahuatl languages family"
  {:db/ident :lcc-639-2/NahuatlLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nahuatl languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nahuatl, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nahuatl languages",
   :skos/definition "Nahuatl languages family"})

(def Neapolitan
  "Neapolitan language"
  {:db/ident :lcc-639-2/Neapolitan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Neapolitan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "napolitain"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Neapolitan",
   :skos/definition "Neapolitan language"})

(def Newari
  "Newari language"
  {:db/ident :lcc-639-2/Newari,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Newari"}
                           {:rdf/language "en",
                            :rdf/value    "Nepal Bhasa"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "newari"}
                          {:rdf/language "fr",
                           :rdf/value    "nepal bhasa"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Newari",
   :skos/definition "Newari language"})

(def Nias
  "Nias language"
  {:db/ident :lcc-639-2/Nias,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nias"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nias"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nias",
   :skos/definition "Nias language"})

(def NigerKordofanianLanguages
  "Niger-Kordofanian languages remainder group"
  {:db/ident :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Niger-Kordofanian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nigéro-kordofaniennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Niger-Kordofanian languages",
   :skos/definition "Niger-Kordofanian languages remainder group"})

(def NiloSaharanLanguages
  "Nilo-Saharan languages remainder group"
  {:db/ident :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nilo-Saharan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nilo-sahariennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nilo-Saharan languages",
   :skos/definition "Nilo-Saharan languages remainder group"})

(def Niuean
  "Niuean language"
  {:db/ident :lcc-639-2/Niuean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Niuean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "niué"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Niuean",
   :skos/definition "Niuean language"})

(def NoLinguisticContent
  "No linguistic content special purpose language concept"
  {:db/ident :lcc-639-2/NoLinguisticContent,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Not applicable"}
                           {:rdf/language "en",
                            :rdf/value    "No linguistic content"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "pas de contenu linguistique"}
                          {:rdf/language "fr",
                           :rdf/value    "non applicable"}],
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "No linguistic content",
   :skos/definition "No linguistic content special purpose language concept"})

(def Nogai
  "Nogai language"
  {:db/ident :lcc-639-2/Nogai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nogai"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "nogaï"}
                          {:rdf/language "fr",
                           :rdf/value    "nogay"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nogai",
   :skos/definition "Nogai language"})

(def NorthAmericanIndianLanguages
  "North American Indian languages remainder group"
  {:db/ident :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "North American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nord-amérindiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "North American Indian languages",
   :skos/definition "North American Indian languages remainder group"})

(def NorthernFrisian
  "Northern Frisian language"
  {:db/ident :lcc-639-2/NorthernFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Northern Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison septentrional"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Northern Frisian",
   :skos/definition "Northern Frisian language"})

(def NubianLanguages
  "Nubian languages family"
  {:db/ident :lcc-639-2/NubianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nubian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nubiennes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nubian languages",
   :skos/definition "Nubian languages family"})

(def Nyamwezi
  "Nyamwezi language"
  {:db/ident :lcc-639-2/Nyamwezi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyamwezi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyamwezi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nyamwezi",
   :skos/definition "Nyamwezi language"})

(def Nyankole
  "Nyankole language"
  {:db/ident :lcc-639-2/Nyankole,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyankole"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyankolé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nyankole",
   :skos/definition "Nyankole language"})

(def Nyoro
  "Nyoro language"
  {:db/ident :lcc-639-2/Nyoro,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyoro"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyoro"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nyoro",
   :skos/definition "Nyoro language"})

(def Nzima
  "Nzima language"
  {:db/ident :lcc-639-2/Nzima,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nzima"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nzema"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nzima",
   :skos/definition "Nzima language"})

(def OfficialAramaic
  "Official Aramaic language"
  {:db/ident :lcc-639-2/OfficialAramaic,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Official Aramaic (700-300 BCE)"}
                           {:rdf/language "en",
                            :rdf/value    "Imperial Aramaic (700-300 BCE)"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "araméen d'empire (700-300 BCE)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Official Aramaic",
   :skos/definition "Official Aramaic language"})

(def OldEnglish
  "Old English language"
  {:db/ident :lcc-639-2/OldEnglish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English, Old (ca. 450-1100)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglo-saxon (ca. 450-1100)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old English",
   :skos/definition "Old English language"})

(def OldFrench
  "Old French language"
  {:db/ident :lcc-639-2/OldFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French, Old (842-ca.1400)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français ancien (842-ca.1400)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old French",
   :skos/definition "Old French language"})

(def OldHighGerman
  "Old High German language"
  {:db/ident :lcc-639-2/OldHighGerman,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German, Old High (ca. 750-1050)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand, vieux haut (ca. 750-1050)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old High German",
   :skos/definition "Old High German language"})

(def OldIrish
  "Old Irish language"
  {:db/ident :lcc-639-2/OldIrish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish, Old (to 900)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais ancien (jusqu'à 900)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Irish",
   :skos/definition "Old Irish language"})

(def OldNorse
  "Old Norse language"
  {:db/ident :lcc-639-2/OldNorse,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Norse, Old"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norrois, vieux"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Norse",
   :skos/definition "Old Norse language"})

(def OldPersian
  "Old Persian language"
  {:db/ident :lcc-639-2/OldPersian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Persian, Old (ca. 600-400 B.C.)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "perse, vieux (ca. 600-400 av. J.-C.)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Persian",
   :skos/definition "Old Persian language"})

(def OldProvencal
  "Old Provencal language"
  {:db/ident :lcc-639-2/OldProvencal,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Provencal, Old (to 1500)"}
                           {:rdf/language "en",
                            :rdf/value    "Occitan, Old (to 1500)"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "provençal ancien (jusqu'à 1500)"}
                          {:rdf/language "fr",
                           :rdf/value    "occitan ancien (jusqu'à 1500)"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Provencal",
   :skos/definition "Old Provencal language"})

(def Osage
  "Osage language"
  {:db/ident :lcc-639-2/Osage,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Osage"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "osage"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Osage",
   :skos/definition "Osage language"})

(def OtomianLanguages
  "Otomian languages family"
  {:db/ident :lcc-639-2/OtomianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Otomian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "otomi, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Otomian languages",
   :skos/definition "Otomian languages family"})

(def OttomanTurkish
  "Ottoman Turkish language"
  {:db/ident :lcc-639-2/OttomanTurkish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkish, Ottoman (1500-1928)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turc ottoman (1500-1928)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ottoman Turkish",
   :skos/definition "Ottoman Turkish language"})

(def Pahlavi
  "Pahlavi language"
  {:db/ident :lcc-639-2/Pahlavi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pahlavi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pahlavi"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pahlavi",
   :skos/definition "Pahlavi language"})

(def Palauan
  "Palauan language"
  {:db/ident :lcc-639-2/Palauan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Palauan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "palau"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Palauan",
   :skos/definition "Palauan language"})

(def Pampanga
  "Pampanga language"
  {:db/ident :lcc-639-2/Pampanga,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Pampanga"}
                           {:rdf/language "en",
                            :rdf/value    "Kapampangan"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pampangan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pampanga",
   :skos/definition "Pampanga language"})

(def Pangasinan
  "Pangasinan language"
  {:db/ident :lcc-639-2/Pangasinan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pangasinan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pangasinan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pangasinan",
   :skos/definition "Pangasinan language"})

(def Papiamento
  "Papiamento language"
  {:db/ident :lcc-639-2/Papiamento,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Papiamento"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "papiamento"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Papiamento",
   :skos/definition "Papiamento language"})

(def PapuanLanguages
  "Papuan languages remainder group"
  {:db/ident :lcc-639-2/PapuanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Papuan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "papoues, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Papuan languages",
   :skos/definition "Papuan languages remainder group"})

(def Pedi
  "Pedi language"
  {:db/ident :lcc-639-2/Pedi,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Northern Sotho"}
                           {:rdf/language "en",
                            :rdf/value    "Pedi"}
                           {:rdf/language "en",
                            :rdf/value    "Sepedi"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "sepedi"}
                          {:rdf/language "fr",
                           :rdf/value    "sotho du Nord"}
                          {:rdf/language "fr",
                           :rdf/value    "pedi"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pedi",
   :skos/definition "Pedi language"})

(def PhilippineLanguages
  "Philippine languages remainder group"
  {:db/ident :lcc-639-2/PhilippineLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Philippine languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "philippines, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Philippine languages",
   :skos/definition "Philippine languages remainder group"})

(def Phoenician
  "Phoenician language"
  {:db/ident :lcc-639-2/Phoenician,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Phoenician"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "phénicien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Phoenician",
   :skos/definition "Phoenician language"})

(def Pohnpeian
  "Pohnpeian language"
  {:db/ident :lcc-639-2/Pohnpeian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pohnpeian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pohnpei"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pohnpeian",
   :skos/definition "Pohnpeian language"})

(def PrakritLanguages
  "Prakrit languages family"
  {:db/ident :lcc-639-2/PrakritLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Prakrit languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "prâkrit, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Prakrit languages",
   :skos/definition "Prakrit languages family"})

(def Rajasthani
  "Language code for Rajasthani"
  {:db/ident :lcc-639-2/Rajasthani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rajasthani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rajasthani"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Rajasthani",
   :skos/definition "Language code for Rajasthani"})

(def Rapanui
  "Rapanui language"
  {:db/ident :lcc-639-2/Rapanui,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rapanui"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rapanui"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Rapanui",
   :skos/definition "Rapanui language"})

(def Rarotongan
  "Rarotongan language"
  {:db/ident :lcc-639-2/Rarotongan,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Rarotongan"}
                           {:rdf/language "en",
                            :rdf/value    "Cook Islands Maori"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "maori des îles Cook"}
                          {:rdf/language "fr",
                           :rdf/value    "rarotonga"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Rarotongan",
   :skos/definition "Rarotongan language"})

(def RomanceLanguages
  "Romance languages remainder group"
  {:db/ident :lcc-639-2/RomanceLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romance languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "romanes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Romance languages",
   :skos/definition "Romance languages remainder group"})

(def Romany
  "Language code for Romany"
  {:db/ident :lcc-639-2/Romany,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romany"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsigane"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Romany",
   :skos/definition "Language code for Romany"})

(def SalishanLanguages
  "Salishan languages family"
  {:db/ident :lcc-639-2/SalishanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Salishan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "salishennes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Salishan languages",
   :skos/definition "Salishan languages family"})

(def SamaritanAramaic
  "Samaritan Aramaic language"
  {:db/ident :lcc-639-2/SamaritanAramaic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Samaritan Aramaic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "samaritain"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Samaritan Aramaic",
   :skos/definition "Samaritan Aramaic language"})

(def SamiLanguages
  "Sami languages remainder group"
  {:db/ident :lcc-639-2/SamiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sami languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sames, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sami languages",
   :skos/definition "Sami languages remainder group"})

(def Sandawe
  "Sandawe language"
  {:db/ident :lcc-639-2/Sandawe,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sandawe"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sandawe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sandawe",
   :skos/definition "Sandawe language"})

(def Santali
  "Santali language"
  {:db/ident :lcc-639-2/Santali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Santali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "santal"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Santali",
   :skos/definition "Santali language"})

(def Sasak
  "Sasak language"
  {:db/ident :lcc-639-2/Sasak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sasak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sasak"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sasak",
   :skos/definition "Sasak language"})

(def Scots
  "Scots language"
  {:db/ident :lcc-639-2/Scots,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Scots"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "écossais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Scots",
   :skos/definition "Scots language"})

(def Selkup
  "Selkup language"
  {:db/ident :lcc-639-2/Selkup,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Selkup"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "selkoupe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Selkup",
   :skos/definition "Selkup language"})

(def SemiticLanguages
  "Semitic languages remainder group"
  {:db/ident :lcc-639-2/SemiticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Semitic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sémitiques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Semitic languages",
   :skos/definition "Semitic languages remainder group"})

(def Serer
  "Serer language"
  {:db/ident :lcc-639-2/Serer,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Serer"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sérère"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Serer",
   :skos/definition "Serer language"})

(def Shan
  "Shan language"
  {:db/ident :lcc-639-2/Shan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Shan",
   :skos/definition "Shan language"})

(def Sicilian
  "Sicilian language"
  {:db/ident :lcc-639-2/Sicilian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sicilian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sicilien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sicilian",
   :skos/definition "Sicilian language"})

(def Sidamo
  "Sidamo language"
  {:db/ident :lcc-639-2/Sidamo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sidamo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sidamo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sidamo",
   :skos/definition "Sidamo language"})

(def SignLanguages
  "Sign languages family"
  {:db/ident :lcc-639-2/SignLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sign languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues des signes"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sign languages",
   :skos/definition "Sign languages family"})

(def Siksika
  "Siksika language"
  {:db/ident :lcc-639-2/Siksika,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Siksika"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "blackfoot"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Siksika",
   :skos/definition "Siksika language"})

(def SinoTibetanLanguages
  "Sino-Tibetan languages remainder group"
  {:db/ident :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sino-Tibetan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sino-tibétaines, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sino-Tibetan languages",
   :skos/definition "Sino-Tibetan languages remainder group"})

(def SiouanLanguages
  "Siouan languages family"
  {:db/ident :lcc-639-2/SiouanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Siouan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sioux, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Siouan languages",
   :skos/definition "Siouan languages family"})

(def SkoltSami
  "Skolt Sami language"
  {:db/ident :lcc-639-2/SkoltSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Skolt Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami skolt"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Skolt Sami",
   :skos/definition "Skolt Sami language"})

(def SlaveAthapascan
  "Language code for Slave (Athapascan)"
  {:db/ident :lcc-639-2/SlaveAthapascan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slave (Athapascan)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "esclave (athapascan)"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Slave - Athapascan",
   :skos/definition "Language code for Slave (Athapascan)"})

(def SlavicLanguages
  "Slavic languages remainder group"
  {:db/ident :lcc-639-2/SlavicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slavic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slaves, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Slavic languages",
   :skos/definition "Slavic languages remainder group"})

(def Sogdian
  "Sogdian language"
  {:db/ident :lcc-639-2/Sogdian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sogdian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sogdien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sogdian",
   :skos/definition "Sogdian language"})

(def SonghaiLanguages
  "Songhai languages family"
  {:db/ident :lcc-639-2/SonghaiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Songhai languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "songhai, autres langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Songhai languages",
   :skos/definition "Songhai languages family"})

(def Soninke
  "Soninke language"
  {:db/ident :lcc-639-2/Soninke,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Soninke"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soninké"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Soninke",
   :skos/definition "Soninke language"})

(def SorbianLanguages
  "Sorbian languages family"
  {:db/ident :lcc-639-2/SorbianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sorbian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sorabes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sorbian languages",
   :skos/definition "Sorbian languages family"})

(def SouthAmericanIndianLanguages
  "South American Indian languages remainder group"
  {:db/ident :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "South American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sud-amérindiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "South American Indian languages",
   :skos/definition "South American Indian languages remainder group"})

(def SouthernAltai
  "Southern Altai language"
  {:db/ident :lcc-639-2/SouthernAltai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Southern Altai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "altai du Sud"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Southern Altai",
   :skos/definition "Southern Altai language"})

(def SouthernSami
  "Southern Sami language"
  {:db/ident :lcc-639-2/SouthernSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Southern Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami du Sud"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Southern Sami",
   :skos/definition "Southern Sami language"})

(def SrananTongo
  "Sranan Tongo language"
  {:db/ident :lcc-639-2/SrananTongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sranan Tongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sranan tongo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sranan Tongo",
   :skos/definition "Sranan Tongo language"})

(def StandardMoroccanTamazight
  "Standard Moroccan Tamazight language"
  {:db/ident :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Standard Moroccan Tamazight"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "amazighe standard marocain"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Standard Moroccan Tamazight",
   :skos/definition "Standard Moroccan Tamazight language"})

(def Sukuma
  "Sukuma language"
  {:db/ident :lcc-639-2/Sukuma,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sukuma"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sukuma"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sukuma",
   :skos/definition "Sukuma language"})

(def Sumerian
  "Sumerian language"
  {:db/ident :lcc-639-2/Sumerian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sumerian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sumérien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sumerian",
   :skos/definition "Sumerian language"})

(def Susu
  "Susu language"
  {:db/ident :lcc-639-2/Susu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Susu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soussou"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Susu",
   :skos/definition "Susu language"})

(def SwissGerman
  "Swiss German language"
  {:db/ident :lcc-639-2/SwissGerman,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Swiss German"}
                           {:rdf/language "en",
                            :rdf/value    "Alsatian"}
                           {:rdf/language "en",
                            :rdf/value    "Alemannic"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "alsacien"}
                          {:rdf/language "fr",
                           :rdf/value    "suisse alémanique"}
                          {:rdf/language "fr",
                           :rdf/value    "alémanique"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Swiss German",
   :skos/definition "Swiss German language"})

(def Syriac
  "Language code for Syriac"
  {:db/ident :lcc-639-2/Syriac,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Syriac"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "syriaque"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Syriac",
   :skos/definition "Language code for Syriac"})

(def TaiLanguages
  "Tai languages remainder group"
  {:db/ident :lcc-639-2/TaiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tai languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tai, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tai languages",
   :skos/definition "Tai languages remainder group"})

(def Tamashek
  "Language code for Tamashek"
  {:db/ident :lcc-639-2/Tamashek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tamashek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tamacheq"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tamashek",
   :skos/definition "Language code for Tamashek"})

(def Tereno
  "Tereno language"
  {:db/ident :lcc-639-2/Tereno,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tereno"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tereno"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tereno",
   :skos/definition "Tereno language"})

(def Tetum
  "Tetum language"
  {:db/ident :lcc-639-2/Tetum,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tetum"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tetum"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tetum",
   :skos/definition "Tetum language"})

(def Tigre
  "Tigre language"
  {:db/ident :lcc-639-2/Tigre,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tigre"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tigré"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tigre",
   :skos/definition "Tigre language"})

(def Timne
  "Timne language"
  {:db/ident :lcc-639-2/Timne,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Timne"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "temne"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Timne",
   :skos/definition "Timne language"})

(def Tiv
  "Tiv language"
  {:db/ident :lcc-639-2/Tiv,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tiv"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tiv"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tiv",
   :skos/definition "Tiv language"})

(def Tlingit
  "Tlingit language"
  {:db/ident :lcc-639-2/Tlingit,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tlingit"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tlingit"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tlingit",
   :skos/definition "Tlingit language"})

(def TokPisin
  "Tok Pisin language"
  {:db/ident :lcc-639-2/TokPisin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tok Pisin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tok pisin"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tok Pisin",
   :skos/definition "Tok Pisin language"})

(def Tokelau
  "Tokelau language"
  {:db/ident :lcc-639-2/Tokelau,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tokelau"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tokelau"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tokelau",
   :skos/definition "Tokelau language"})

(def TongaNyasa
  "Tonga Nyasa language"
  {:db/ident :lcc-639-2/TongaNyasa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tonga (Nyasa)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tonga (Nyasa)"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tonga Nyasa",
   :skos/definition "Tonga Nyasa language"})

(def Tsimshian
  "Tsimshian language"
  {:db/ident :lcc-639-2/Tsimshian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tsimshian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsimshian"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tsimshian",
   :skos/definition "Tsimshian language"})

(def Tumbuka
  "Tumbuka language"
  {:db/ident :lcc-639-2/Tumbuka,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tumbuka"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tumbuka"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tumbuka",
   :skos/definition "Tumbuka language"})

(def TupiLanguages
  "Tupi languages family"
  {:db/ident :lcc-639-2/TupiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tupi languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tupi, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tupi languages",
   :skos/definition "Tupi languages family"})

(def Tuvalu
  "Tuvalu language"
  {:db/ident :lcc-639-2/Tuvalu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tuvalu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tuvalu"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tuvalu",
   :skos/definition "Tuvalu language"})

(def Tuvinian
  "Tuvinian language"
  {:db/ident :lcc-639-2/Tuvinian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tuvinian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "touva"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tuvinian",
   :skos/definition "Tuvinian language"})

(def Udmurt
  "Udmurt language"
  {:db/ident :lcc-639-2/Udmurt,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Udmurt"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "oudmourte"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Udmurt",
   :skos/definition "Udmurt language"})

(def Ugaritic
  "Ugaritic language"
  {:db/ident :lcc-639-2/Ugaritic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ugaritic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ougaritique"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ugaritic",
   :skos/definition "Ugaritic language"})

(def Umbundu
  "Umbundu language"
  {:db/ident :lcc-639-2/Umbundu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Umbundu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "umbundu"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Umbundu",
   :skos/definition "Umbundu language"})

(def UncodedLanguages
  "Uncoded languages special purpose language concept"
  {:db/ident :lcc-639-2/UncodedLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Uncoded languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues non codées"},
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Uncoded languages",
   :skos/definition "Uncoded languages special purpose language concept"})

(def Undetermined
  "Undetermined special purpose language concept"
  {:db/ident :lcc-639-2/Undetermined,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Undetermined"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indéterminée"},
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Undetermined",
   :skos/definition "Undetermined special purpose language concept"})

(def UpperSorbian
  "Upper Sorbian language"
  {:db/ident :lcc-639-2/UpperSorbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Upper Sorbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haut-sorabe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Upper Sorbian",
   :skos/definition "Upper Sorbian language"})

(def Vai
  "Vai language"
  {:db/ident :lcc-639-2/Vai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Vai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vaï"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Vai",
   :skos/definition "Vai language"})

(def Votic
  "Votic language"
  {:db/ident :lcc-639-2/Votic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Votic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vote"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Votic",
   :skos/definition "Votic language"})

(def WakashanLanguages
  "Wakashan languages family"
  {:db/ident :lcc-639-2/WakashanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Wakashan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wakashanes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Wakashan languages",
   :skos/definition "Wakashan languages family"})

(def Waray
  "Waray language"
  {:db/ident :lcc-639-2/Waray,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Waray (Philippines)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "waray"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Waray",
   :skos/definition "Waray language"})

(def Washo
  "Washo language"
  {:db/ident :lcc-639-2/Washo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Washo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "washo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Washo",
   :skos/definition "Washo language"})

(def Wolaitta
  "Wolaitta language"
  {:db/ident :lcc-639-2/Wolaitta,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Wolaitta"}
                           {:rdf/language "en",
                            :rdf/value    "Wolaytta"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "wolaytta"}
                          {:rdf/language "fr",
                           :rdf/value    "wolaitta"}],
   :lcc-lr/hasGermanName {:rdf/language "ge",
                          :rdf/value    "Walamo-Sprache"},
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Wolaitta",
   :skos/definition "Wolaitta language"})

(def Yakut
  "Yakut language"
  {:db/ident :lcc-639-2/Yakut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yakut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iakoute"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yakut",
   :skos/definition "Yakut language"})

(def Yao
  "Yao language"
  {:db/ident :lcc-639-2/Yao,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yao"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yao"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yao",
   :skos/definition "Yao language"})

(def Yapese
  "Yapese language"
  {:db/ident :lcc-639-2/Yapese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yapese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yapois"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yapese",
   :skos/definition "Yapese language"})

(def YupikLanguages
  "Yupik languages family"
  {:db/ident :lcc-639-2/YupikLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yupik languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yupik, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yupik languages",
   :skos/definition "Yupik languages family"})

(def ZandeLanguages
  "Zande languages family"
  {:db/ident :lcc-639-2/ZandeLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zande languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zandé, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zande languages",
   :skos/definition "Zande languages family"})

(def Zapotec
  "Language code for Zapotec"
  {:db/ident :lcc-639-2/Zapotec,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zapotec"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zapotèque"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zapotec",
   :skos/definition "Language code for Zapotec"})

(def Zaza
  "Language code for Zaza"
  {:db/ident :lcc-639-2/Zaza,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kirmanjki"}
                           {:rdf/language "en",
                            :rdf/value    "Zaza"}
                           {:rdf/language "en",
                            :rdf/value    "Zazaki"}
                           {:rdf/language "en",
                            :rdf/value    "Dimli"}
                           {:rdf/language "en",
                            :rdf/value    "Dimili"}
                           {:rdf/language "en",
                            :rdf/value    "Kirdki"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kirmanjki"}
                          {:rdf/language "fr",
                           :rdf/value    "kirdki"}
                          {:rdf/language "fr",
                           :rdf/value    "dimili"}
                          {:rdf/language "fr",
                           :rdf/value    "dimli"}
                          {:rdf/language "fr",
                           :rdf/value    "zazaki"}
                          {:rdf/language "fr",
                           :rdf/value    "zaza"}],
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zaza",
   :skos/definition "Language code for Zaza"})

(def Zenaga
  "Zenaga language"
  {:db/ident :lcc-639-2/Zenaga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zenaga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zenaga"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zenaga",
   :skos/definition "Zenaga language"})

(def Zuni
  "Zuni language"
  {:db/ident :lcc-639-2/Zuni,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zuni"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zuni"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zuni",
   :skos/definition "Zuni language"})

(def aar
  "Alpha-3 language code for Afar"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Afar,
   :db/ident :lcc-639-2/aar,
   :lcc-lr/hasTag "aar",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aar",
   :skos/definition "Alpha-3 language code for Afar"})

(def abk
  "Alpha-3 language code for Abkhazian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Abkhazian,
   :db/ident :lcc-639-2/abk,
   :lcc-lr/hasTag "abk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "abk",
   :skos/definition "Alpha-3 language code for Abkhazian"})

(def ace
  "Alpha-3 language code for Achinese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Achinese,
   :db/ident :lcc-639-2/ace,
   :lcc-lr/hasTag "ace",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ace",
   :skos/definition "Alpha-3 language code for Achinese"})

(def ach
  "Alpha-3 language code for Acoli"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Acoli,
   :db/ident :lcc-639-2/ach,
   :lcc-lr/hasTag "ach",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ach",
   :skos/definition "Alpha-3 language code for Acoli"})

(def ada
  "Alpha-3 language code for Adangme"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Adangme,
   :db/ident :lcc-639-2/ada,
   :lcc-lr/hasTag "ada",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ada",
   :skos/definition "Alpha-3 language code for Adangme"})

(def ady
  "Alpha-3 language code for Adygei, Adyghe"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Adyghe,
   :db/ident :lcc-639-2/ady,
   :lcc-lr/hasTag "ady",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ady",
   :skos/definition "Alpha-3 language code for Adygei, Adyghe"})

(def afa
  "Alpha-3 language code for Afro-Asiatic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AfroAsiaticLanguages,
   :db/ident :lcc-639-2/afa,
   :lcc-lr/hasTag "afa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "afa",
   :skos/definition "Alpha-3 language code for Afro-Asiatic languages"})

(def afh
  "Alpha-3 language code for Afrihili"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Afrihili,
   :db/ident :lcc-639-2/afh,
   :lcc-lr/hasTag "afh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "afh",
   :skos/definition "Alpha-3 language code for Afrihili"})

(def afr
  "Alpha-3 language code for Afrikaans"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Afrikaans,
   :db/ident :lcc-639-2/afr,
   :lcc-lr/hasTag "afr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "afr",
   :skos/definition "Alpha-3 language code for Afrikaans"})

(def ain
  "Alpha-3 language code for Ainu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ainu,
   :db/ident :lcc-639-2/ain,
   :lcc-lr/hasTag "ain",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ain",
   :skos/definition "Alpha-3 language code for Ainu"})

(def aka
  "Alpha-3 language code for Akan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Akan,
   :db/ident :lcc-639-2/aka,
   :lcc-lr/hasTag "aka",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aka",
   :skos/definition "Alpha-3 language code for Akan"})

(def akk
  "Alpha-3 language code for Akkadian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Akkadian,
   :db/ident :lcc-639-2/akk,
   :lcc-lr/hasTag "akk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "akk",
   :skos/definition "Alpha-3 language code for Akkadian"})

(def alb
  "Alpha-3 bibliographic language code for Albanian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Albanian,
   :db/ident :lcc-639-2/alb,
   :lcc-lr/hasTag "alb",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "alb",
   :skos/definition "Alpha-3 bibliographic language code for Albanian"})

(def ale
  "Alpha-3 language code for Aleut"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Aleut,
   :db/ident :lcc-639-2/ale,
   :lcc-lr/hasTag "ale",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ale",
   :skos/definition "Alpha-3 language code for Aleut"})

(def alg
  "Alpha-3 language code for Algonquian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AlgonquianLanguages,
   :db/ident :lcc-639-2/alg,
   :lcc-lr/hasTag "alg",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "alg",
   :skos/definition "Alpha-3 language code for Algonquian languages"})

(def alt
  "Alpha-3 language code for Southern Altai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SouthernAltai,
   :db/ident :lcc-639-2/alt,
   :lcc-lr/hasTag "alt",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "alt",
   :skos/definition "Alpha-3 language code for Southern Altai"})

(def amh
  "Alpha-3 language code for Amharic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Amharic,
   :db/ident :lcc-639-2/amh,
   :lcc-lr/hasTag "amh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "amh",
   :skos/definition "Alpha-3 language code for Amharic"})

(def ang
  "Alpha-3 language code for English, Old (ca. 450-1100)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldEnglish,
   :db/ident :lcc-639-2/ang,
   :lcc-lr/hasTag "ang",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ang",
   :skos/definition "Alpha-3 language code for English, Old (ca. 450-1100)"})

(def anp
  "Alpha-3 language code for Angika"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Angika,
   :db/ident :lcc-639-2/anp,
   :lcc-lr/hasTag "anp",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "anp",
   :skos/definition "Alpha-3 language code for Angika"})

(def apa
  "Alpha-3 language code for Apache languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ApacheLanguages,
   :db/ident :lcc-639-2/apa,
   :lcc-lr/hasTag "apa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "apa",
   :skos/definition "Alpha-3 language code for Apache languages"})

(def ara
  "Alpha-3 language code for Arabic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Arabic,
   :db/ident :lcc-639-2/ara,
   :lcc-lr/hasTag "ara",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ara",
   :skos/definition "Alpha-3 language code for Arabic"})

(def arc
  "Alpha-3 language code for Official Aramaic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OfficialAramaic,
   :db/ident :lcc-639-2/arc,
   :lcc-lr/hasTag "arc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arc",
   :skos/definition "Alpha-3 language code for Official Aramaic"})

(def arg
  "Alpha-3 language code for Aragonese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Aragonese,
   :db/ident :lcc-639-2/arg,
   :lcc-lr/hasTag "arg",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arg",
   :skos/definition "Alpha-3 language code for Aragonese"})

(def arm
  "Alpha-3 bibliographic language code for Armenian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Armenian,
   :db/ident :lcc-639-2/arm,
   :lcc-lr/hasTag "arm",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arm",
   :skos/definition "Alpha-3 bibliographic language code for Armenian"})

(def arn
  "Alpha-3 language code for Mapudungun; Mapuche"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mapudungun,
   :db/ident :lcc-639-2/arn,
   :lcc-lr/hasTag "arn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arn",
   :skos/definition "Alpha-3 language code for Mapudungun; Mapuche"})

(def arp
  "Alpha-3 language code for Arapaho"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Arapaho,
   :db/ident :lcc-639-2/arp,
   :lcc-lr/hasTag "arp",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arp",
   :skos/definition "Alpha-3 language code for Arapaho"})

(def art
  "Alpha-3 language code for Artificial languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ArtificialLanguages,
   :db/ident :lcc-639-2/art,
   :lcc-lr/hasTag "art",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "art",
   :skos/definition "Alpha-3 language code for Artificial languages"})

(def arw
  "Alpha-3 language code for Arawak"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Arawak,
   :db/ident :lcc-639-2/arw,
   :lcc-lr/hasTag "arw",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arw",
   :skos/definition "Alpha-3 language code for Arawak"})

(def asm
  "Alpha-3 language code for Assamese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Assamese,
   :db/ident :lcc-639-2/asm,
   :lcc-lr/hasTag "asm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "asm",
   :skos/definition "Alpha-3 language code for Assamese"})

(def ast
  "Alpha-3 language code for Asturian; Bable"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Asturian,
   :db/ident :lcc-639-2/ast,
   :lcc-lr/hasTag "ast",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ast",
   :skos/definition "Alpha-3 language code for Asturian; Bable"})

(def ath
  "Alpha-3 language code for Athapascan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AthapascanLanguages,
   :db/ident :lcc-639-2/ath,
   :lcc-lr/hasTag "ath",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ath",
   :skos/definition "Alpha-3 language code for Athapascan languages"})

(def aus
  "Alpha-3 language code for Australian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AustralianLanguages,
   :db/ident :lcc-639-2/aus,
   :lcc-lr/hasTag "aus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aus",
   :skos/definition "Alpha-3 language code for Australian languages"})

(def ava
  "Alpha-3 language code for Avaric"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Avaric,
   :db/ident :lcc-639-2/ava,
   :lcc-lr/hasTag "ava",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ava",
   :skos/definition "Alpha-3 language code for Avaric"})

(def ave
  "Alpha-3 language code for Avestan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Avestan,
   :db/ident :lcc-639-2/ave,
   :lcc-lr/hasTag "ave",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ave",
   :skos/definition "Alpha-3 language code for Avestan"})

(def awa
  "Alpha-3 language code for Awadhi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Awadhi,
   :db/ident :lcc-639-2/awa,
   :lcc-lr/hasTag "awa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "awa",
   :skos/definition "Alpha-3 language code for Awadhi"})

(def aym
  "Alpha-3 language code for Aymara"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Aymara,
   :db/ident :lcc-639-2/aym,
   :lcc-lr/hasTag "aym",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aym",
   :skos/definition "Alpha-3 language code for Aymara"})

(def aze
  "Alpha-3 language code for Azerbaijani"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Azerbaijani,
   :db/ident :lcc-639-2/aze,
   :lcc-lr/hasTag "aze",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aze",
   :skos/definition "Alpha-3 language code for Azerbaijani"})

(def bad
  "Alpha-3 language code for Banda languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/BandaLanguages,
   :db/ident :lcc-639-2/bad,
   :lcc-lr/hasTag "bad",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bad",
   :skos/definition "Alpha-3 language code for Banda languages"})

(def bai
  "Alpha-3 language code for Bamileke languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/BamilekeLanguages,
   :db/ident :lcc-639-2/bai,
   :lcc-lr/hasTag "bai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bai",
   :skos/definition "Alpha-3 language code for Bamileke languages"})

(def bak
  "Alpha-3 language code for Bashkir"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bashkir,
   :db/ident :lcc-639-2/bak,
   :lcc-lr/hasTag "bak",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bak",
   :skos/definition "Alpha-3 language code for Bashkir"})

(def bal
  "Alpha-3 language code for Baluchi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Baluchi,
   :db/ident :lcc-639-2/bal,
   :lcc-lr/hasTag "bal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bal",
   :skos/definition "Alpha-3 language code for Baluchi"})

(def bam
  "Alpha-3 language code for Bambara"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bambara,
   :db/ident :lcc-639-2/bam,
   :lcc-lr/hasTag "bam",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bam",
   :skos/definition "Alpha-3 language code for Bambara"})

(def ban
  "Alpha-3 language code for Balinese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Balinese,
   :db/ident :lcc-639-2/ban,
   :lcc-lr/hasTag "ban",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ban",
   :skos/definition "Alpha-3 language code for Balinese"})

(def baq
  "Alpha-3 bibliographic language code for Basque"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Basque,
   :db/ident :lcc-639-2/baq,
   :lcc-lr/hasTag "baq",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "baq",
   :skos/definition "Alpha-3 bibliographic language code for Basque"})

(def bas
  "Alpha-3 language code for Basa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Basa,
   :db/ident :lcc-639-2/bas,
   :lcc-lr/hasTag "bas",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bas",
   :skos/definition "Alpha-3 language code for Basa"})

(def bat
  "Alpha-3 language code for Baltic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/BalticLanguages,
   :db/ident :lcc-639-2/bat,
   :lcc-lr/hasTag "bat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bat",
   :skos/definition "Alpha-3 language code for Baltic languages"})

(def bej
  "Alpha-3 language code for Beja"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Beja,
   :db/ident :lcc-639-2/bej,
   :lcc-lr/hasTag "bej",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bej",
   :skos/definition "Alpha-3 language code for Beja"})

(def bel
  "Alpha-3 language code for Belarusian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Belarusian,
   :db/ident :lcc-639-2/bel,
   :lcc-lr/hasTag "bel",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bel",
   :skos/definition "Alpha-3 language code for Belarusian"})

(def bem
  "Alpha-3 language code for Bemba"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Bemba,
   :db/ident :lcc-639-2/bem,
   :lcc-lr/hasTag "bem",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bem",
   :skos/definition "Alpha-3 language code for Bemba"})

(def ben
  "Alpha-3 language code for Bengali"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bengali,
   :db/ident :lcc-639-2/ben,
   :lcc-lr/hasTag "ben",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ben",
   :skos/definition "Alpha-3 language code for Bengali"})

(def ber
  "Alpha-3 language code for Berber languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/BerberLanguages,
   :db/ident :lcc-639-2/ber,
   :lcc-lr/hasTag "ber",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ber",
   :skos/definition "Alpha-3 language code for Berber languages"})

(def bho
  "Alpha-3 language code for Bhojpuri"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Bhojpuri,
   :db/ident :lcc-639-2/bho,
   :lcc-lr/hasTag "bho",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bho",
   :skos/definition "Alpha-3 language code for Bhojpuri"})

(def bih
  "Alpha-3 language code for Bihari languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/BihariLanguages,
   :db/ident :lcc-639-2/bih,
   :lcc-lr/hasTag "bih",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bih",
   :skos/definition "Alpha-3 language code for Bihari languages"})

(def bik
  "Alpha-3 language code for Bikol"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Bikol,
   :db/ident :lcc-639-2/bik,
   :lcc-lr/hasTag "bik",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bik",
   :skos/definition "Alpha-3 language code for Bikol"})

(def bin
  "Alpha-3 language code for Bini; Edo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Bini,
   :db/ident :lcc-639-2/bin,
   :lcc-lr/hasTag "bin",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bin",
   :skos/definition "Alpha-3 language code for Bini; Edo"})

(def bis
  "Alpha-3 language code for Bislama"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bislama,
   :db/ident :lcc-639-2/bis,
   :lcc-lr/hasTag "bis",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bis",
   :skos/definition "Alpha-3 language code for Bislama"})

(def bla
  "Alpha-3 language code for Siksika"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Siksika,
   :db/ident :lcc-639-2/bla,
   :lcc-lr/hasTag "bla",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bla",
   :skos/definition "Alpha-3 language code for Siksika"})

(def bnt
  "Alpha-3 language code for Bantu languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/BantuLanguages,
   :db/ident :lcc-639-2/bnt,
   :lcc-lr/hasTag "bnt",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bnt",
   :skos/definition "Alpha-3 language code for Bantu languages"})

(def bod
  "Alpha-3 terminologic language code for Tibetan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tibetan,
   :db/ident :lcc-639-2/bod,
   :lcc-lr/hasTag "bod",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bod",
   :skos/definition "Alpha-3 terminologic language code for Tibetan"})

(def bos
  "Alpha-3 language code for Bosnian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bosnian,
   :db/ident :lcc-639-2/bos,
   :lcc-lr/hasTag "bos",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bos",
   :skos/definition "Alpha-3 language code for Bosnian"})

(def bra
  "Alpha-3 language code for Braj"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Braj,
   :db/ident :lcc-639-2/bra,
   :lcc-lr/hasTag "bra",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bra",
   :skos/definition "Alpha-3 language code for Braj"})

(def bre
  "Alpha-3 language code for Breton"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Breton,
   :db/ident :lcc-639-2/bre,
   :lcc-lr/hasTag "bre",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bre",
   :skos/definition "Alpha-3 language code for Breton"})

(def btk
  "Alpha-3 language code for Batak languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/BatakLanguages,
   :db/ident :lcc-639-2/btk,
   :lcc-lr/hasTag "btk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "btk",
   :skos/definition "Alpha-3 language code for Batak languages"})

(def bua
  "Alpha-3 language code for Buriat"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Buriat,
   :db/ident :lcc-639-2/bua,
   :lcc-lr/hasTag "bua",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bua",
   :skos/definition "Alpha-3 language code for Buriat"})

(def bug
  "Alpha-3 language code for Buginese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Buginese,
   :db/ident :lcc-639-2/bug,
   :lcc-lr/hasTag "bug",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bug",
   :skos/definition "Alpha-3 language code for Buginese"})

(def bul
  "Alpha-3 language code for Bulgarian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bulgarian,
   :db/ident :lcc-639-2/bul,
   :lcc-lr/hasTag "bul",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bul",
   :skos/definition "Alpha-3 language code for Bulgarian"})

(def bur
  "Alpha-3 bibliographic language code for Burmese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Burmese,
   :db/ident :lcc-639-2/bur,
   :lcc-lr/hasTag "bur",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bur",
   :skos/definition "Alpha-3 bibliographic language code for Burmese"})

(def byn
  "Alpha-3 language code for Blin; Bilin"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Bilin,
   :db/ident :lcc-639-2/byn,
   :lcc-lr/hasTag "byn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "byn",
   :skos/definition "Alpha-3 language code for Blin; Bilin"})

(def cad
  "Alpha-3 language code for Caddo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Caddo,
   :db/ident :lcc-639-2/cad,
   :lcc-lr/hasTag "cad",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cad",
   :skos/definition "Alpha-3 language code for Caddo"})

(def cai
  "Alpha-3 language code for Central American Indian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CentralAmericanIndianLanguages,
   :db/ident :lcc-639-2/cai,
   :lcc-lr/hasTag "cai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cai",
   :skos/definition
   "Alpha-3 language code for Central American Indian languages"})

(def car
  "Alpha-3 language code for Galibi Carib"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/GalibiCarib,
   :db/ident :lcc-639-2/car,
   :lcc-lr/hasTag "car",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "car",
   :skos/definition "Alpha-3 language code for Galibi Carib"})

(def cat
  "Alpha-3 language code for Catalan; Valencian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Catalan,
   :db/ident :lcc-639-2/cat,
   :lcc-lr/hasTag "cat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cat",
   :skos/definition "Alpha-3 language code for Catalan; Valencian"})

(def cau
  "Alpha-3 language code for Caucasian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CaucasianLanguages,
   :db/ident :lcc-639-2/cau,
   :lcc-lr/hasTag "cau",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cau",
   :skos/definition "Alpha-3 language code for Caucasian languages"})

(def ceb
  "Alpha-3 language code for Cebuano"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Cebuano,
   :db/ident :lcc-639-2/ceb,
   :lcc-lr/hasTag "ceb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ceb",
   :skos/definition "Alpha-3 language code for Cebuano"})

(def cel
  "Alpha-3 language code for Celtic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CelticLanguages,
   :db/ident :lcc-639-2/cel,
   :lcc-lr/hasTag "cel",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cel",
   :skos/definition "Alpha-3 language code for Celtic languages"})

(def ces
  "Alpha-3 terminologic language code for Czech"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Czech,
   :db/ident :lcc-639-2/ces,
   :lcc-lr/hasTag "ces",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ces",
   :skos/definition "Alpha-3 terminologic language code for Czech"})

(def cha
  "Alpha-3 language code for Chamorro"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chamorro,
   :db/ident :lcc-639-2/cha,
   :lcc-lr/hasTag "cha",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cha",
   :skos/definition "Alpha-3 language code for Chamorro"})

(def chb
  "Alpha-3 language code for Chibcha"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Chibcha,
   :db/ident :lcc-639-2/chb,
   :lcc-lr/hasTag "chb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chb",
   :skos/definition "Alpha-3 language code for Chibcha"})

(def che
  "Alpha-3 language code for Chechen"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chechen,
   :db/ident :lcc-639-2/che,
   :lcc-lr/hasTag "che",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "che",
   :skos/definition "Alpha-3 language code for Chechen"})

(def chg
  "Alpha-3 language code for Chagatai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Chagatai,
   :db/ident :lcc-639-2/chg,
   :lcc-lr/hasTag "chg",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chg",
   :skos/definition "Alpha-3 language code for Chagatai"})

(def chi
  "Alpha-3 bibliographic language code for Chinese"
  {:cmns-id/identifies :lcc-639-1/Chinese,
   :db/ident :lcc-639-2/chi,
   :lcc-lr/hasTag "chi",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chi",
   :skos/definition "Alpha-3 bibliographic language code for Chinese"})

(def chk
  "Alpha-3 language code for Chuukese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Chuukese,
   :db/ident :lcc-639-2/chk,
   :lcc-lr/hasTag "chk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chk",
   :skos/definition "Alpha-3 language code for Chuukese"})

(def chm
  "Alpha-3 language code for Mari"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mari,
   :db/ident :lcc-639-2/chm,
   :lcc-lr/hasTag "chm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chm",
   :skos/definition "Alpha-3 language code for Mari"})

(def chn
  "Alpha-3 language code for Chinook jargon"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ChinookJargon,
   :db/ident :lcc-639-2/chn,
   :lcc-lr/hasTag "chn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chn",
   :skos/definition "Alpha-3 language code for Chinook jargon"})

(def cho
  "Alpha-3 language code for Choctaw"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Choctaw,
   :db/ident :lcc-639-2/cho,
   :lcc-lr/hasTag "cho",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cho",
   :skos/definition "Alpha-3 language code for Choctaw"})

(def chp
  "Alpha-3 language code for Chipewyan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Chipewyan,
   :db/ident :lcc-639-2/chp,
   :lcc-lr/hasTag "chp",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chp",
   :skos/definition "Alpha-3 language code for Chipewyan"})

(def chr
  "Alpha-3 language code for Cherokee"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Cherokee,
   :db/ident :lcc-639-2/chr,
   :lcc-lr/hasTag "chr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chr",
   :skos/definition "Alpha-3 language code for Cherokee"})

(def chu
  "Alpha-3 language code for Church Slavic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/ChurchSlavic,
   :db/ident :lcc-639-2/chu,
   :lcc-lr/hasTag "chu",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chu",
   :skos/definition "Alpha-3 language code for Church Slavic"})

(def chv
  "Alpha-3 language code for Chuvash"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chuvash,
   :db/ident :lcc-639-2/chv,
   :lcc-lr/hasTag "chv",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chv",
   :skos/definition "Alpha-3 language code for Chuvash"})

(def chy
  "Alpha-3 language code for Cheyenne"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Cheyenne,
   :db/ident :lcc-639-2/chy,
   :lcc-lr/hasTag "chy",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chy",
   :skos/definition "Alpha-3 language code for Cheyenne"})

(def cmc
  "Alpha-3 language code for Chamic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ChamicLanguages,
   :db/ident :lcc-639-2/cmc,
   :lcc-lr/hasTag "cmc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cmc",
   :skos/definition "Alpha-3 language code for Chamic languages"})

(def cnr
  "Alpha-3 language code for Montenegrin"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Montenegrin,
   :db/ident :lcc-639-2/cnr,
   :lcc-lr/hasTag "cnr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cnr",
   :skos/definition "Alpha-3 language code for Montenegrin"})

(def cop
  "Alpha-3 language code for Coptic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Coptic,
   :db/ident :lcc-639-2/cop,
   :lcc-lr/hasTag "cop",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cop",
   :skos/definition "Alpha-3 language code for Coptic"})

(def cor
  "Alpha-3 language code for Cornish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Cornish,
   :db/ident :lcc-639-2/cor,
   :lcc-lr/hasTag "cor",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cor",
   :skos/definition "Alpha-3 language code for Cornish"})

(def cos
  "Alpha-3 language code for Corsican"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Corsican,
   :db/ident :lcc-639-2/cos,
   :lcc-lr/hasTag "cos",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cos",
   :skos/definition "Alpha-3 language code for Corsican"})

(def cpe
  "Alpha-3 language code for Creoles and pidgins, English based"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CreolesAndPidginsEnglishBased,
   :db/ident :lcc-639-2/cpe,
   :lcc-lr/hasTag "cpe",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cpe",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, English based"})

(def cpf
  "Alpha-3 language code for Creoles and pidgins, French-based"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CreolesAndPidginsFrenchBased,
   :db/ident :lcc-639-2/cpf,
   :lcc-lr/hasTag "cpf",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cpf",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, French-based"})

(def cpp
  "Alpha-3 language code for Creoles and pidgins, Portuguese-based"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :db/ident :lcc-639-2/cpp,
   :lcc-lr/hasTag "cpp",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cpp",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, Portuguese-based"})

(def cre
  "Alpha-3 language code for Cree"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Cree,
   :db/ident :lcc-639-2/cre,
   :lcc-lr/hasTag "cre",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cre",
   :skos/definition "Alpha-3 language code for Cree"})

(def crh
  "Alpha-3 language code for Crimean Tatar; Crimean Turkish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CrimeanTatar,
   :db/ident :lcc-639-2/crh,
   :lcc-lr/hasTag "crh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "crh",
   :skos/definition "Alpha-3 language code for Crimean Tatar; Crimean Turkish"})

(def crp
  "Alpha-3 language code for Creoles and pidgins"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CreolesAndPidgins,
   :db/ident :lcc-639-2/crp,
   :lcc-lr/hasTag "crp",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "crp",
   :skos/definition "Alpha-3 language code for Creoles and pidgins"})

(def csb
  "Alpha-3 language code for Kashubian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kashubian,
   :db/ident :lcc-639-2/csb,
   :lcc-lr/hasTag "csb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "csb",
   :skos/definition "Alpha-3 language code for Kashubian"})

(def cus
  "Alpha-3 language code for Cushitic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/CushiticLanguages,
   :db/ident :lcc-639-2/cus,
   :lcc-lr/hasTag "cus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cus",
   :skos/definition "Alpha-3 language code for Cushitic languages"})

(def cym
  "Alpha-3 terminologic language code for Welsh"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Welsh,
   :db/ident :lcc-639-2/cym,
   :lcc-lr/hasTag "cym",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cym",
   :skos/definition "Alpha-3 terminologic language code for Welsh"})

(def cze
  "Alpha-3 bibliographic language code for Czech"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Czech,
   :db/ident :lcc-639-2/cze,
   :lcc-lr/hasTag "cze",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cze",
   :skos/definition "Alpha-3 bibliographic language code for Czech"})

(def dak
  "Alpha-3 language code for Dakota"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Dakota,
   :db/ident :lcc-639-2/dak,
   :lcc-lr/hasTag "dak",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dak",
   :skos/definition "Alpha-3 language code for Dakota"})

(def dan
  "Alpha-3 language code for Danish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Danish,
   :db/ident :lcc-639-2/dan,
   :lcc-lr/hasTag "dan",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dan",
   :skos/definition "Alpha-3 language code for Danish"})

(def dar
  "Alpha-3 language code for Dargwa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Dargwa,
   :db/ident :lcc-639-2/dar,
   :lcc-lr/hasTag "dar",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dar",
   :skos/definition "Alpha-3 language code for Dargwa"})

(def day
  "Alpha-3 language code for Land Dayak languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/LandDayakLanguages,
   :db/ident :lcc-639-2/day,
   :lcc-lr/hasTag "day",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "day",
   :skos/definition "Alpha-3 language code for Land Dayak languages"})

(def del
  "Alpha-3 language code for Delaware"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Delaware,
   :db/ident :lcc-639-2/del,
   :lcc-lr/hasTag "del",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "del",
   :skos/definition "Alpha-3 language code for Delaware"})

(def den
  "Alpha-3 language code for Slave (Athapascan)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SlaveAthapascan,
   :db/ident :lcc-639-2/den,
   :lcc-lr/hasTag "den",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "den",
   :skos/definition "Alpha-3 language code for Slave (Athapascan)"})

(def deu
  "Alpha-3 terminologic language code for German"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/German,
   :db/ident :lcc-639-2/deu,
   :lcc-lr/hasTag "deu",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "deu",
   :skos/definition "Alpha-3 terminologic language code for German"})

(def dgr
  "Alpha-3 language code for Dogrib"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Dogrib,
   :db/ident :lcc-639-2/dgr,
   :lcc-lr/hasTag "dgr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dgr",
   :skos/definition "Alpha-3 language code for Dogrib"})

(def din
  "Alpha-3 language code for Dinka"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Dinka,
   :db/ident :lcc-639-2/din,
   :lcc-lr/hasTag "din",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "din",
   :skos/definition "Alpha-3 language code for Dinka"})

(def div
  "Alpha-3 language code for Divehi; Dhivehi; Maldivian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dhivehi,
   :db/ident :lcc-639-2/div,
   :lcc-lr/hasTag "div",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "div",
   :skos/definition "Alpha-3 language code for Divehi; Dhivehi; Maldivian"})

(def doi
  "Alpha-3 language code for Dogri"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Dogri,
   :db/ident :lcc-639-2/doi,
   :lcc-lr/hasTag "doi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "doi",
   :skos/definition "Alpha-3 language code for Dogri"})

(def dra
  "Alpha-3 language code for Dravidian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/DravidianLanguages,
   :db/ident :lcc-639-2/dra,
   :lcc-lr/hasTag "dra",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dra",
   :skos/definition "Alpha-3 language code for Dravidian languages"})

(def dsb
  "Alpha-3 language code for Lower Sorbian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/LowerSorbian,
   :db/ident :lcc-639-2/dsb,
   :lcc-lr/hasTag "dsb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dsb",
   :skos/definition "Alpha-3 language code for Lower Sorbian"})

(def dua
  "Alpha-3 language code for Duala"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Duala,
   :db/ident :lcc-639-2/dua,
   :lcc-lr/hasTag "dua",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dua",
   :skos/definition "Alpha-3 language code for Duala"})

(def dum
  "Alpha-3 language code for Dutch, Middle (ca. 1050-1350)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MiddleDutch,
   :db/ident :lcc-639-2/dum,
   :lcc-lr/hasTag "dum",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dum",
   :skos/definition "Alpha-3 language code for Dutch, Middle (ca. 1050-1350)"})

(def dut
  "Alpha-3 bibliographic language code for Dutch; Flemish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dutch,
   :db/ident :lcc-639-2/dut,
   :lcc-lr/hasTag "dut",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dut",
   :skos/definition "Alpha-3 bibliographic language code for Dutch; Flemish"})

(def dyu
  "Alpha-3 language code for Dyula"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Dyula,
   :db/ident :lcc-639-2/dyu,
   :lcc-lr/hasTag "dyu",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dyu",
   :skos/definition "Alpha-3 language code for Dyula"})

(def dzo
  "Alpha-3 language code for Dzongkha"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dzongkha,
   :db/ident :lcc-639-2/dzo,
   :lcc-lr/hasTag "dzo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dzo",
   :skos/definition "Alpha-3 language code for Dzongkha"})

(def efi
  "Alpha-3 language code for Efik"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Efik,
   :db/ident :lcc-639-2/efi,
   :lcc-lr/hasTag "efi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "efi",
   :skos/definition "Alpha-3 language code for Efik"})

(def egy
  "Alpha-3 language code for Egyptian (Ancient)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AncientEgyptian,
   :db/ident :lcc-639-2/egy,
   :lcc-lr/hasTag "egy",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "egy",
   :skos/definition "Alpha-3 language code for Egyptian (Ancient)"})

(def eka
  "Alpha-3 language code for Ekajuk"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ekajuk,
   :db/ident :lcc-639-2/eka,
   :lcc-lr/hasTag "eka",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "eka",
   :skos/definition "Alpha-3 language code for Ekajuk"})

(def ell
  "Alpha-3 terminologic language code for Greek, Modern (post 1453)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/ModernGreek,
   :db/ident :lcc-639-2/ell,
   :lcc-lr/hasTag "ell",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ell",
   :skos/definition
   "Alpha-3 terminologic language code for Greek, Modern (post 1453)"})

(def elx
  "Alpha-3 language code for Elamite"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Elamite,
   :db/ident :lcc-639-2/elx,
   :lcc-lr/hasTag "elx",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "elx",
   :skos/definition "Alpha-3 language code for Elamite"})

(def eng
  "Alpha-3 language code for English"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/English,
   :db/ident :lcc-639-2/eng,
   :lcc-lr/hasTag "eng",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "eng",
   :skos/definition "Alpha-3 language code for English"})

(def enm
  "Alpha-3 language code for English, Middle (1100-1500)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MiddleEnglish,
   :db/ident :lcc-639-2/enm,
   :lcc-lr/hasTag "enm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "enm",
   :skos/definition "Alpha-3 language code for English, Middle (1100-1500)"})

(def epo
  "Alpha-3 language code for Esperanto"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Esperanto,
   :db/ident :lcc-639-2/epo,
   :lcc-lr/hasTag "epo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "epo",
   :skos/definition "Alpha-3 language code for Esperanto"})

(def est
  "Alpha-3 language code for Estonian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Estonian,
   :db/ident :lcc-639-2/est,
   :lcc-lr/hasTag "est",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "est",
   :skos/definition "Alpha-3 language code for Estonian"})

(def eus
  "Alpha-3 terminologic language code for Basque"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Basque,
   :db/ident :lcc-639-2/eus,
   :lcc-lr/hasTag "eus",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "eus",
   :skos/definition "Alpha-3 terminologic language code for Basque"})

(def ewe_1
  "Alpha-3 language code for Ewe"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ewe,
   :db/ident :lcc-639-2/ewe_1,
   :lcc-lr/hasTag "ewe",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ewe",
   :skos/definition "Alpha-3 language code for Ewe"})

(def ewo
  "Alpha-3 language code for Ewondo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ewondo,
   :db/ident :lcc-639-2/ewo,
   :lcc-lr/hasTag "ewo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ewo",
   :skos/definition "Alpha-3 language code for Ewondo"})

(def fan
  "Alpha-3 language code for Fang"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Fang,
   :db/ident :lcc-639-2/fan,
   :lcc-lr/hasTag "fan",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fan",
   :skos/definition "Alpha-3 language code for Fang"})

(def fao
  "Alpha-3 language code for Faroese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Faroese,
   :db/ident :lcc-639-2/fao,
   :lcc-lr/hasTag "fao",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fao",
   :skos/definition "Alpha-3 language code for Faroese"})

(def fas
  "Alpha-3 terminologic language code for Persian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Persian,
   :db/ident :lcc-639-2/fas,
   :lcc-lr/hasTag "fas",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fas",
   :skos/definition "Alpha-3 terminologic language code for Persian"})

(def fat
  "Alpha-3 language code for Fanti"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Fanti,
   :db/ident :lcc-639-2/fat,
   :lcc-lr/hasTag "fat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fat",
   :skos/definition "Alpha-3 language code for Fanti"})

(def fij
  "Alpha-3 language code for Fijian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Fijian,
   :db/ident :lcc-639-2/fij,
   :lcc-lr/hasTag "fij",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fij",
   :skos/definition "Alpha-3 language code for Fijian"})

(def fil
  "Alpha-3 language code for Filipino; Pilipino"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Filipino,
   :db/ident :lcc-639-2/fil,
   :lcc-lr/hasTag "fil",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fil",
   :skos/definition "Alpha-3 language code for Filipino; Pilipino"})

(def fin
  "Alpha-3 language code for Finnish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Finnish,
   :db/ident :lcc-639-2/fin,
   :lcc-lr/hasTag "fin",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fin",
   :skos/definition "Alpha-3 language code for Finnish"})

(def fiu
  "Alpha-3 language code for Finno-Ugrian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/FinnoUgrianLanguages,
   :db/ident :lcc-639-2/fiu,
   :lcc-lr/hasTag "fiu",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fiu",
   :skos/definition "Alpha-3 language code for Finno-Ugrian languages"})

(def fon_1
  "Alpha-3 language code for Fon"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Fon,
   :db/ident :lcc-639-2/fon_1,
   :lcc-lr/hasTag "fon",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fon",
   :skos/definition "Alpha-3 language code for Fon"})

(def fra
  "Alpha-3 terminologic language code for French"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/French,
   :db/ident :lcc-639-2/fra,
   :lcc-lr/hasTag "fra",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fra",
   :skos/definition "Alpha-3 terminologic language code for French"})

(def fre
  "Alpha-3 bibliographic language code for French"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/French,
   :db/ident :lcc-639-2/fre,
   :lcc-lr/hasTag "fre",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fre",
   :skos/definition "Alpha-3 bibliographic language code for French"})

(def frm
  "Alpha-3 language code for French, Middle (ca. 1400-1600)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MiddleFrench,
   :db/ident :lcc-639-2/frm,
   :lcc-lr/hasTag "frm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "frm",
   :skos/definition "Alpha-3 language code for French, Middle (ca. 1400-1600)"})

(def fro
  "Alpha-3 language code for French, Old (842-ca.1400)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldFrench,
   :db/ident :lcc-639-2/fro,
   :lcc-lr/hasTag "fro",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fro",
   :skos/definition "Alpha-3 language code for French, Old (842-ca.1400)"})

(def frr
  "Alpha-3 language code for Northern Frisian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NorthernFrisian,
   :db/ident :lcc-639-2/frr,
   :lcc-lr/hasTag "frr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "frr",
   :skos/definition "Alpha-3 language code for Northern Frisian"})

(def frs
  "Alpha-3 language code for Eastern Frisian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/EasternFrisian,
   :db/ident :lcc-639-2/frs,
   :lcc-lr/hasTag "frs",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "frs",
   :skos/definition "Alpha-3 language code for Eastern Frisian"})

(def fry
  "Alpha-3 language code for Western Frisian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/WesternFrisian,
   :db/ident :lcc-639-2/fry,
   :lcc-lr/hasTag "fry",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fry",
   :skos/definition "Alpha-3 language code for Western Frisian"})

(def ful
  "Alpha-3 language code for Fulah"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Fulah,
   :db/ident :lcc-639-2/ful,
   :lcc-lr/hasTag "ful",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ful",
   :skos/definition "Alpha-3 language code for Fulah"})

(def fur
  "Alpha-3 language code for Friulian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Friulian,
   :db/ident :lcc-639-2/fur,
   :lcc-lr/hasTag "fur",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fur",
   :skos/definition "Alpha-3 language code for Friulian"})

(def gaa
  "Alpha-3 language code for Ga"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ga,
   :db/ident :lcc-639-2/gaa,
   :lcc-lr/hasTag "gaa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gaa",
   :skos/definition "Alpha-3 language code for Ga"})

(def gay
  "Alpha-3 language code for Gayo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gayo,
   :db/ident :lcc-639-2/gay,
   :lcc-lr/hasTag "gay",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gay",
   :skos/definition "Alpha-3 language code for Gayo"})

(def gba
  "Alpha-3 language code for Gbaya"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gbaya,
   :db/ident :lcc-639-2/gba,
   :lcc-lr/hasTag "gba",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gba",
   :skos/definition "Alpha-3 language code for Gbaya"})

(def gem
  "Alpha-3 language code for Germanic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/GermanicLanguages,
   :db/ident :lcc-639-2/gem,
   :lcc-lr/hasTag "gem",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gem",
   :skos/definition "Alpha-3 language code for Germanic languages"})

(def geo
  "Alpha-3 bibliographic language code for Georgian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Georgian,
   :db/ident :lcc-639-2/geo,
   :lcc-lr/hasTag "geo",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "geo",
   :skos/definition "Alpha-3 bibliographic language code for Georgian"})

(def ger
  "Alpha-3 bibliographic language code for German"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/German,
   :db/ident :lcc-639-2/ger,
   :lcc-lr/hasTag "ger",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ger",
   :skos/definition "Alpha-3 bibliographic language code for German"})

(def gez
  "Alpha-3 language code for Geez"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Geez,
   :db/ident :lcc-639-2/gez,
   :lcc-lr/hasTag "gez",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gez",
   :skos/definition "Alpha-3 language code for Geez"})

(def gil
  "Alpha-3 language code for Gilbertese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gilbertese,
   :db/ident :lcc-639-2/gil,
   :lcc-lr/hasTag "gil",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gil",
   :skos/definition "Alpha-3 language code for Gilbertese"})

(def gla
  "Alpha-3 language code for Gaelic; Scottish Gaelic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Gaelic,
   :db/ident :lcc-639-2/gla,
   :lcc-lr/hasTag "gla",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gla",
   :skos/definition "Alpha-3 language code for Gaelic; Scottish Gaelic"})

(def gle
  "Alpha-3 language code for Irish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Irish,
   :db/ident :lcc-639-2/gle,
   :lcc-lr/hasTag "gle",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gle",
   :skos/definition "Alpha-3 language code for Irish"})

(def glg
  "Alpha-3 language code for Galician"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Galician,
   :db/ident :lcc-639-2/glg,
   :lcc-lr/hasTag "glg",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "glg",
   :skos/definition "Alpha-3 language code for Galician"})

(def glv
  "Alpha-3 language code for Manx"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Manx,
   :db/ident :lcc-639-2/glv,
   :lcc-lr/hasTag "glv",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "glv",
   :skos/definition "Alpha-3 language code for Manx"})

(def gmh
  "Alpha-3 language code for German, Middle High (ca. 1050-1500)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MiddleHighGerman,
   :db/ident :lcc-639-2/gmh,
   :lcc-lr/hasTag "gmh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gmh",
   :skos/definition
   "Alpha-3 language code for German, Middle High (ca. 1050-1500)"})

(def goh
  "Alpha-3 language code for German, Old High (ca. 750-1050)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldHighGerman,
   :db/ident :lcc-639-2/goh,
   :lcc-lr/hasTag "goh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "goh",
   :skos/definition
   "Alpha-3 language code for German, Old High (ca. 750-1050)"})

(def gon
  "Alpha-3 language code for Gondi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gondi,
   :db/ident :lcc-639-2/gon,
   :lcc-lr/hasTag "gon",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gon",
   :skos/definition "Alpha-3 language code for Gondi"})

(def gor
  "Alpha-3 language code for Gorontalo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gorontalo,
   :db/ident :lcc-639-2/gor,
   :lcc-lr/hasTag "gor",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gor",
   :skos/definition "Alpha-3 language code for Gorontalo"})

(def got
  "Alpha-3 language code for Gothic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gothic,
   :db/ident :lcc-639-2/got,
   :lcc-lr/hasTag "got",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "got",
   :skos/definition "Alpha-3 language code for Gothic"})

(def grb
  "Alpha-3 language code for Grebo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Grebo,
   :db/ident :lcc-639-2/grb,
   :lcc-lr/hasTag "grb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "grb",
   :skos/definition "Alpha-3 language code for Grebo"})

(def grc
  "Alpha-3 language code for Greek, Ancient (to 1453)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AncientGreek,
   :db/ident :lcc-639-2/grc,
   :lcc-lr/hasTag "grc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "grc",
   :skos/definition "Alpha-3 language code for Greek, Ancient (to 1453)"})

(def gre
  "Alpha-3 bibliographic language code for Greek, Modern (post 1453)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/ModernGreek,
   :db/ident :lcc-639-2/gre,
   :lcc-lr/hasTag "gre",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gre",
   :skos/definition
   "Alpha-3 bibliographic language code for Greek, Modern (post 1453)"})

(def grn
  "Alpha-3 language code for Guarani"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Guarani,
   :db/ident :lcc-639-2/grn,
   :lcc-lr/hasTag "grn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "grn",
   :skos/definition "Alpha-3 language code for Guarani"})

(def gsw
  "Alpha-3 language code for Alemannic, Swiss German"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SwissGerman,
   :db/ident :lcc-639-2/gsw,
   :lcc-lr/hasTag "gsw",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gsw",
   :skos/definition "Alpha-3 language code for Alemannic, Swiss German"})

(def guj
  "Alpha-3 language code for Gujarati"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Gujarati,
   :db/ident :lcc-639-2/guj,
   :lcc-lr/hasTag "guj",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "guj",
   :skos/definition "Alpha-3 language code for Gujarati"})

(def gwi
  "Alpha-3 language code for Gwich'in"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Gwichin,
   :db/ident :lcc-639-2/gwi,
   :lcc-lr/hasTag "gwi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gwi",
   :skos/definition "Alpha-3 language code for Gwich'in"})

(def hai
  "Alpha-3 language code for Haida"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Haida,
   :db/ident :lcc-639-2/hai,
   :lcc-lr/hasTag "hai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hai",
   :skos/definition "Alpha-3 language code for Haida"})

(def hat
  "Alpha-3 language code for Haitian; Haitian Creole"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Haitian,
   :db/ident :lcc-639-2/hat,
   :lcc-lr/hasTag "hat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hat",
   :skos/definition "Alpha-3 language code for Haitian; Haitian Creole"})

(def hau
  "Alpha-3 language code for Hausa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hausa,
   :db/ident :lcc-639-2/hau,
   :lcc-lr/hasTag "hau",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hau",
   :skos/definition "Alpha-3 language code for Hausa"})

(def haw
  "Alpha-3 language code for Hawaiian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Hawaiian,
   :db/ident :lcc-639-2/haw,
   :lcc-lr/hasTag "haw",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "haw",
   :skos/definition "Alpha-3 language code for Hawaiian"})

(def heb
  "Alpha-3 language code for Hebrew"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hebrew,
   :db/ident :lcc-639-2/heb,
   :lcc-lr/hasTag "heb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "heb",
   :skos/definition "Alpha-3 language code for Hebrew"})

(def her
  "Alpha-3 language code for Herero"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Herero,
   :db/ident :lcc-639-2/her,
   :lcc-lr/hasTag "her",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "her",
   :skos/definition "Alpha-3 language code for Herero"})

(def hil
  "Alpha-3 language code for Hiligaynon"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Hiligaynon,
   :db/ident :lcc-639-2/hil,
   :lcc-lr/hasTag "hil",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hil",
   :skos/definition "Alpha-3 language code for Hiligaynon"})

(def him
  "Alpha-3 language code for Himachali languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/HimachaliLanguages,
   :db/ident :lcc-639-2/him,
   :lcc-lr/hasTag "him",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "him",
   :skos/definition "Alpha-3 language code for Himachali languages"})

(def hin
  "Alpha-3 language code for Hindi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hindi,
   :db/ident :lcc-639-2/hin,
   :lcc-lr/hasTag "hin",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hin",
   :skos/definition "Alpha-3 language code for Hindi"})

(def hit
  "Alpha-3 language code for Hittite"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Hittite,
   :db/ident :lcc-639-2/hit,
   :lcc-lr/hasTag "hit",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hit",
   :skos/definition "Alpha-3 language code for Hittite"})

(def hmn
  "Alpha-3 language code for Hmong"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Hmong,
   :db/ident :lcc-639-2/hmn,
   :lcc-lr/hasTag "hmn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hmn",
   :skos/definition "Alpha-3 language code for Hmong"})

(def hmo
  "Alpha-3 language code for Hiri Motu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/HiriMotu,
   :db/ident :lcc-639-2/hmo,
   :lcc-lr/hasTag "hmo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hmo",
   :skos/definition "Alpha-3 language code for Hiri Motu"})

(def hrv
  "Alpha-3 terminologic language code for Croatian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Croatian,
   :db/ident :lcc-639-2/hrv,
   :lcc-lr/hasTag "hrv",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hrv",
   :skos/definition "Alpha-3 terminologic language code for Croatian"})

(def hsb
  "Alpha-3 language code for Upper Sorbian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/UpperSorbian,
   :db/ident :lcc-639-2/hsb,
   :lcc-lr/hasTag "hsb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hsb",
   :skos/definition "Alpha-3 language code for Upper Sorbian"})

(def hun
  "Alpha-3 language code for Hungarian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hungarian,
   :db/ident :lcc-639-2/hun,
   :lcc-lr/hasTag "hun",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hun",
   :skos/definition "Alpha-3 language code for Hungarian"})

(def hup
  "Alpha-3 language code for Hupa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Hupa,
   :db/ident :lcc-639-2/hup,
   :lcc-lr/hasTag "hup",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hup",
   :skos/definition "Alpha-3 language code for Hupa"})

(def hye
  "Alpha-3 terminologic language code for Armenian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Armenian,
   :db/ident :lcc-639-2/hye,
   :lcc-lr/hasTag "hye",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hye",
   :skos/definition "Alpha-3 terminologic language code for Armenian"})

(def iba
  "Alpha-3 language code for Iban"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Iban,
   :db/ident :lcc-639-2/iba,
   :lcc-lr/hasTag "iba",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iba",
   :skos/definition "Alpha-3 language code for Iban"})

(def ibo
  "Alpha-3 language code for Igbo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Igbo,
   :db/ident :lcc-639-2/ibo,
   :lcc-lr/hasTag "ibo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ibo",
   :skos/definition "Alpha-3 language code for Igbo"})

(def ice
  "Alpha-3 bibliographic language code for Icelandic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Icelandic,
   :db/ident :lcc-639-2/ice,
   :lcc-lr/hasTag "ice",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ice",
   :skos/definition "Alpha-3 bibliographic language code for Icelandic"})

(def ido_1
  "Alpha-3 language code for Ido"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ido,
   :db/ident :lcc-639-2/ido_1,
   :lcc-lr/hasTag "ido",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ido",
   :skos/definition "Alpha-3 language code for Ido"})

(def iii
  "Alpha-3 language code for Sichuan Yi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/SichuanYi,
   :db/ident :lcc-639-2/iii,
   :lcc-lr/hasTag "iii",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iii",
   :skos/definition "Alpha-3 language code for Sichuan Yi"})

(def ijo
  "Alpha-3 language code for Ijo languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/IjoLanguages,
   :db/ident :lcc-639-2/ijo,
   :lcc-lr/hasTag "ijo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ijo",
   :skos/definition "Alpha-3 language code for Ijo languages"})

(def iku
  "Alpha-3 language code for Inuktitut"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Inuktitut,
   :db/ident :lcc-639-2/iku,
   :lcc-lr/hasTag "iku",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iku",
   :skos/definition "Alpha-3 language code for Inuktitut"})

(def ile
  "Alpha-3 language code for Interlingue"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Interlingue,
   :db/ident :lcc-639-2/ile,
   :lcc-lr/hasTag "ile",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ile",
   :skos/definition "Alpha-3 language code for Interlingue"})

(def ilo
  "Alpha-3 language code for Iloko"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Iloko,
   :db/ident :lcc-639-2/ilo,
   :lcc-lr/hasTag "ilo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ilo",
   :skos/definition "Alpha-3 language code for Iloko"})

(def ina
  "Alpha-3 language code for Interlingua (International Auxiliary Language Association)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Interlingua,
   :db/ident :lcc-639-2/ina,
   :lcc-lr/hasTag "ina",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ina",
   :skos/definition
   "Alpha-3 language code for Interlingua (International Auxiliary Language Association)"})

(def inc
  "Alpha-3 language code for Indic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/IndicLanguages,
   :db/ident :lcc-639-2/inc,
   :lcc-lr/hasTag "inc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "inc",
   :skos/definition "Alpha-3 language code for Indic languages"})

(def ind
  "Alpha-3 language code for Indonesian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Indonesian,
   :db/ident :lcc-639-2/ind,
   :lcc-lr/hasTag "ind",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ind",
   :skos/definition "Alpha-3 language code for Indonesian"})

(def ine
  "Alpha-3 language code for Indo-European languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/IndoEuropeanLanguages,
   :db/ident :lcc-639-2/ine,
   :lcc-lr/hasTag "ine",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ine",
   :skos/definition "Alpha-3 language code for Indo-European languages"})

(def inh
  "Alpha-3 language code for Ingush"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ingush,
   :db/ident :lcc-639-2/inh,
   :lcc-lr/hasTag "inh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "inh",
   :skos/definition "Alpha-3 language code for Ingush"})

(def ipk
  "Alpha-3 language code for Inupiaq"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Inupiaq,
   :db/ident :lcc-639-2/ipk,
   :lcc-lr/hasTag "ipk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ipk",
   :skos/definition "Alpha-3 language code for Inupiaq"})

(def ira
  "Alpha-3 language code for Iranian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/IranianLanguages,
   :db/ident :lcc-639-2/ira,
   :lcc-lr/hasTag "ira",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ira",
   :skos/definition "Alpha-3 language code for Iranian languages"})

(def iro
  "Alpha-3 language code for Iroquoian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/IroquoianLanguages,
   :db/ident :lcc-639-2/iro,
   :lcc-lr/hasTag "iro",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iro",
   :skos/definition "Alpha-3 language code for Iroquoian languages"})

(def isl
  "Alpha-3 terminologic language code for Icelandic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Icelandic,
   :db/ident :lcc-639-2/isl,
   :lcc-lr/hasTag "isl",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "isl",
   :skos/definition "Alpha-3 terminologic language code for Icelandic"})

(def ita
  "Alpha-3 language code for Italian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Italian,
   :db/ident :lcc-639-2/ita,
   :lcc-lr/hasTag "ita",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ita",
   :skos/definition "Alpha-3 language code for Italian"})

(def jav
  "Alpha-3 language code for Javanese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Javanese,
   :db/ident :lcc-639-2/jav,
   :lcc-lr/hasTag "jav",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jav",
   :skos/definition "Alpha-3 language code for Javanese"})

(def jbo
  "Alpha-3 language code for Lojban"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lojban,
   :db/ident :lcc-639-2/jbo,
   :lcc-lr/hasTag "jbo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jbo",
   :skos/definition "Alpha-3 language code for Lojban"})

(def jpn
  "Alpha-3 language code for Japanese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Japanese,
   :db/ident :lcc-639-2/jpn,
   :lcc-lr/hasTag "jpn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jpn",
   :skos/definition "Alpha-3 language code for Japanese"})

(def jpr
  "Alpha-3 language code for Judeo-Persian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/JudeoPersian,
   :db/ident :lcc-639-2/jpr,
   :lcc-lr/hasTag "jpr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jpr",
   :skos/definition "Alpha-3 language code for Judeo-Persian"})

(def jrb
  "Alpha-3 language code for Judeo-Arabic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/JudeoArabic,
   :db/ident :lcc-639-2/jrb,
   :lcc-lr/hasTag "jrb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jrb",
   :skos/definition "Alpha-3 language code for Judeo-Arabic"})

(def kaa
  "Alpha-3 language code for Kara-Kalpak"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/KaraKalpak,
   :db/ident :lcc-639-2/kaa,
   :lcc-lr/hasTag "kaa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kaa",
   :skos/definition "Alpha-3 language code for Kara-Kalpak"})

(def kab
  "Alpha-3 language code for Kabyle"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kabyle,
   :db/ident :lcc-639-2/kab,
   :lcc-lr/hasTag "kab",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kab",
   :skos/definition "Alpha-3 language code for Kabyle"})

(def kac
  "Alpha-3 language code for Kachin; Jingpho"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kachin,
   :db/ident :lcc-639-2/kac,
   :lcc-lr/hasTag "kac",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kac",
   :skos/definition "Alpha-3 language code for Kachin; Jingpho"})

(def kal
  "Alpha-3 language code for Kalaallisut"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kalaallisut,
   :db/ident :lcc-639-2/kal,
   :lcc-lr/hasTag "kal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kal",
   :skos/definition "Alpha-3 language code for Kalaallisut"})

(def kam
  "Alpha-3 language code for Kamba"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kamba,
   :db/ident :lcc-639-2/kam,
   :lcc-lr/hasTag "kam",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kam",
   :skos/definition "Alpha-3 language code for Kamba"})

(def kan
  "Alpha-3 language code for Kannada"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kannada,
   :db/ident :lcc-639-2/kan,
   :lcc-lr/hasTag "kan",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kan",
   :skos/definition "Alpha-3 language code for Kannada"})

(def kar
  "Alpha-3 language code for Karen languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/KarenLanguages,
   :db/ident :lcc-639-2/kar,
   :lcc-lr/hasTag "kar",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kar",
   :skos/definition "Alpha-3 language code for Karen languages"})

(def kas
  "Alpha-3 language code for Kashmiri"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kashmiri,
   :db/ident :lcc-639-2/kas,
   :lcc-lr/hasTag "kas",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kas",
   :skos/definition "Alpha-3 language code for Kashmiri"})

(def kat
  "Alpha-3 terminologic language code for Georgian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Georgian,
   :db/ident :lcc-639-2/kat,
   :lcc-lr/hasTag "kat",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kat",
   :skos/definition "Alpha-3 terminologic language code for Georgian"})

(def kau
  "Alpha-3 language code for Kanuri"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kanuri,
   :db/ident :lcc-639-2/kau,
   :lcc-lr/hasTag "kau",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kau",
   :skos/definition "Alpha-3 language code for Kanuri"})

(def kaw
  "Alpha-3 language code for Kawi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kawi,
   :db/ident :lcc-639-2/kaw,
   :lcc-lr/hasTag "kaw",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kaw",
   :skos/definition "Alpha-3 language code for Kawi"})

(def kaz
  "Alpha-3 language code for Kazakh"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kazakh,
   :db/ident :lcc-639-2/kaz,
   :lcc-lr/hasTag "kaz",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kaz",
   :skos/definition "Alpha-3 language code for Kazakh"})

(def kbd
  "Alpha-3 language code for Kabardian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kabardian,
   :db/ident :lcc-639-2/kbd,
   :lcc-lr/hasTag "kbd",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kbd",
   :skos/definition "Alpha-3 language code for Kabardian"})

(def kha
  "Alpha-3 language code for Khasi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Khasi,
   :db/ident :lcc-639-2/kha,
   :lcc-lr/hasTag "kha",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kha",
   :skos/definition "Alpha-3 language code for Khasi"})

(def khi
  "Alpha-3 language code for Khoisan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/KhoisanLanguages,
   :db/ident :lcc-639-2/khi,
   :lcc-lr/hasTag "khi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "khi",
   :skos/definition "Alpha-3 language code for Khoisan languages"})

(def khm
  "Alpha-3 language code for Central Khmer"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/CentralKhmer,
   :db/ident :lcc-639-2/khm,
   :lcc-lr/hasTag "khm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "khm",
   :skos/definition "Alpha-3 language code for Central Khmer"})

(def kho
  "Alpha-3 language code for Khotanese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Khotanese,
   :db/ident :lcc-639-2/kho,
   :lcc-lr/hasTag "kho",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kho",
   :skos/definition "Alpha-3 language code for Khotanese"})

(def kik
  "Alpha-3 language code for Kikuyu; Gikuyu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kikuyu,
   :db/ident :lcc-639-2/kik,
   :lcc-lr/hasTag "kik",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kik",
   :skos/definition "Alpha-3 language code for Kikuyu; Gikuyu"})

(def kin
  "Alpha-3 language code for Kinyarwanda"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kinyarwanda,
   :db/ident :lcc-639-2/kin,
   :lcc-lr/hasTag "kin",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kin",
   :skos/definition "Alpha-3 language code for Kinyarwanda"})

(def kir
  "Alpha-3 language code for Kirghiz; Kyrgyz"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kirghiz,
   :db/ident :lcc-639-2/kir,
   :lcc-lr/hasTag "kir",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kir",
   :skos/definition "Alpha-3 language code for Kirghiz; Kyrgyz"})

(def kmb
  "Alpha-3 language code for Kimbundu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kimbundu,
   :db/ident :lcc-639-2/kmb,
   :lcc-lr/hasTag "kmb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kmb",
   :skos/definition "Alpha-3 language code for Kimbundu"})

(def kok
  "Alpha-3 language code for Konkani"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Konkani,
   :db/ident :lcc-639-2/kok,
   :lcc-lr/hasTag "kok",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kok",
   :skos/definition "Alpha-3 language code for Konkani"})

(def kom
  "Alpha-3 language code for Komi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Komi,
   :db/ident :lcc-639-2/kom,
   :lcc-lr/hasTag "kom",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kom",
   :skos/definition "Alpha-3 language code for Komi"})

(def kon
  "Alpha-3 language code for Kongo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kongo,
   :db/ident :lcc-639-2/kon,
   :lcc-lr/hasTag "kon",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kon",
   :skos/definition "Alpha-3 language code for Kongo"})

(def kor
  "Alpha-3 language code for Korean"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Korean,
   :db/ident :lcc-639-2/kor,
   :lcc-lr/hasTag "kor",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kor",
   :skos/definition "Alpha-3 language code for Korean"})

(def kos
  "Alpha-3 language code for Kosraean"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kosraean,
   :db/ident :lcc-639-2/kos,
   :lcc-lr/hasTag "kos",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kos",
   :skos/definition "Alpha-3 language code for Kosraean"})

(def kpe
  "Alpha-3 language code for Kpelle"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kpelle,
   :db/ident :lcc-639-2/kpe,
   :lcc-lr/hasTag "kpe",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kpe",
   :skos/definition "Alpha-3 language code for Kpelle"})

(def krc
  "Alpha-3 language code for Karachay-Balkar"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/KarachayBalkar,
   :db/ident :lcc-639-2/krc,
   :lcc-lr/hasTag "krc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "krc",
   :skos/definition "Alpha-3 language code for Karachay-Balkar"})

(def krl
  "Alpha-3 language code for Karelian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Karelian,
   :db/ident :lcc-639-2/krl,
   :lcc-lr/hasTag "krl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "krl",
   :skos/definition "Alpha-3 language code for Karelian"})

(def kro
  "Alpha-3 language code for Kru languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/KruLanguages,
   :db/ident :lcc-639-2/kro,
   :lcc-lr/hasTag "kro",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kro",
   :skos/definition "Alpha-3 language code for Kru languages"})

(def kru
  "Alpha-3 language code for Kurukh"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kurukh,
   :db/ident :lcc-639-2/kru,
   :lcc-lr/hasTag "kru",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kru",
   :skos/definition "Alpha-3 language code for Kurukh"})

(def kua
  "Alpha-3 language code for Kuanyama; Kwanyama"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kuanyama,
   :db/ident :lcc-639-2/kua,
   :lcc-lr/hasTag "kua",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kua",
   :skos/definition "Alpha-3 language code for Kuanyama; Kwanyama"})

(def kum
  "Alpha-3 language code for Kumyk"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kumyk,
   :db/ident :lcc-639-2/kum,
   :lcc-lr/hasTag "kum",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kum",
   :skos/definition "Alpha-3 language code for Kumyk"})

(def kur
  "Alpha-3 language code for Kurdish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kurdish,
   :db/ident :lcc-639-2/kur,
   :lcc-lr/hasTag "kur",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kur",
   :skos/definition "Alpha-3 language code for Kurdish"})

(def kut
  "Alpha-3 language code for Kutenai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kutenai,
   :db/ident :lcc-639-2/kut,
   :lcc-lr/hasTag "kut",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kut",
   :skos/definition "Alpha-3 language code for Kutenai"})

(def lad
  "Alpha-3 language code for Ladino"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ladino,
   :db/ident :lcc-639-2/lad,
   :lcc-lr/hasTag "lad",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lad",
   :skos/definition "Alpha-3 language code for Ladino"})

(def lah
  "Alpha-3 language code for Lahnda"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lahnda,
   :db/ident :lcc-639-2/lah,
   :lcc-lr/hasTag "lah",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lah",
   :skos/definition "Alpha-3 language code for Lahnda"})

(def lam
  "Alpha-3 language code for Lamba"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lamba,
   :db/ident :lcc-639-2/lam,
   :lcc-lr/hasTag "lam",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lam",
   :skos/definition "Alpha-3 language code for Lamba"})

(def lao_1
  "Alpha-3 language code for Lao"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Lao,
   :db/ident :lcc-639-2/lao_1,
   :lcc-lr/hasTag "lao",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lao",
   :skos/definition "Alpha-3 language code for Lao"})

(def lat
  "Alpha-3 language code for Latin"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Latin,
   :db/ident :lcc-639-2/lat,
   :lcc-lr/hasTag "lat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lat",
   :skos/definition "Alpha-3 language code for Latin"})

(def lav
  "Alpha-3 language code for Latvian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Latvian,
   :db/ident :lcc-639-2/lav,
   :lcc-lr/hasTag "lav",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lav",
   :skos/definition "Alpha-3 language code for Latvian"})

(def lez
  "Alpha-3 language code for Lezghian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lezghian,
   :db/ident :lcc-639-2/lez,
   :lcc-lr/hasTag "lez",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lez",
   :skos/definition "Alpha-3 language code for Lezghian"})

(def lim
  "Alpha-3 language code for Limburgan; Limburger; Limburgish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Limburgan,
   :db/ident :lcc-639-2/lim,
   :lcc-lr/hasTag "lim",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lim",
   :skos/definition
   "Alpha-3 language code for Limburgan; Limburger; Limburgish"})

(def lin
  "Alpha-3 language code for Lingala"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Lingala,
   :db/ident :lcc-639-2/lin,
   :lcc-lr/hasTag "lin",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lin",
   :skos/definition "Alpha-3 language code for Lingala"})

(def lit
  "Alpha-3 language code for Lithuanian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Lithuanian,
   :db/ident :lcc-639-2/lit,
   :lcc-lr/hasTag "lit",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lit",
   :skos/definition "Alpha-3 language code for Lithuanian"})

(def lol
  "Alpha-3 language code for Mongo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mongo,
   :db/ident :lcc-639-2/lol,
   :lcc-lr/hasTag "lol",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lol",
   :skos/definition "Alpha-3 language code for Mongo"})

(def loz
  "Alpha-3 language code for Lozi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lozi,
   :db/ident :lcc-639-2/loz,
   :lcc-lr/hasTag "loz",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "loz",
   :skos/definition "Alpha-3 language code for Lozi"})

(def ltz
  "Alpha-3 language code for Luxembourgish; Letzeburgesch"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Luxembourgish,
   :db/ident :lcc-639-2/ltz,
   :lcc-lr/hasTag "ltz",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ltz",
   :skos/definition "Alpha-3 language code for Luxembourgish; Letzeburgesch"})

(def lua
  "Alpha-3 language code for Luba-Lulua"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/LubaLulua,
   :db/ident :lcc-639-2/lua,
   :lcc-lr/hasTag "lua",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lua",
   :skos/definition "Alpha-3 language code for Luba-Lulua"})

(def lub
  "Alpha-3 language code for Luba-Katanga"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/LubaKatanga,
   :db/ident :lcc-639-2/lub,
   :lcc-lr/hasTag "lub",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lub",
   :skos/definition "Alpha-3 language code for Luba-Katanga"})

(def lug
  "Alpha-3 language code for Ganda"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ganda,
   :db/ident :lcc-639-2/lug,
   :lcc-lr/hasTag "lug",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lug",
   :skos/definition "Alpha-3 language code for Ganda"})

(def lui
  "Alpha-3 language code for Luiseno"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Luiseno,
   :db/ident :lcc-639-2/lui,
   :lcc-lr/hasTag "lui",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lui",
   :skos/definition "Alpha-3 language code for Luiseno"})

(def lun
  "Alpha-3 language code for Lunda"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lunda,
   :db/ident :lcc-639-2/lun,
   :lcc-lr/hasTag "lun",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lun",
   :skos/definition "Alpha-3 language code for Lunda"})

(def luo
  "Alpha-3 language code for Luo (Kenya and Tanzania)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/LuoKenyaAndTanzania,
   :db/ident :lcc-639-2/luo,
   :lcc-lr/hasTag "luo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "luo",
   :skos/definition "Alpha-3 language code for Luo (Kenya and Tanzania)"})

(def lus
  "Alpha-3 language code for Lushai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Lushai,
   :db/ident :lcc-639-2/lus,
   :lcc-lr/hasTag "lus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lus",
   :skos/definition "Alpha-3 language code for Lushai"})

(def mac
  "Alpha-3 bibliographic language code for Macedonian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Macedonian,
   :db/ident :lcc-639-2/mac,
   :lcc-lr/hasTag "mac",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mac",
   :skos/definition "Alpha-3 bibliographic language code for Macedonian"})

(def mad
  "Alpha-3 language code for Madurese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Madurese,
   :db/ident :lcc-639-2/mad,
   :lcc-lr/hasTag "mad",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mad",
   :skos/definition "Alpha-3 language code for Madurese"})

(def mag
  "Alpha-3 language code for Magahi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Magahi,
   :db/ident :lcc-639-2/mag,
   :lcc-lr/hasTag "mag",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mag",
   :skos/definition "Alpha-3 language code for Magahi"})

(def mah
  "Alpha-3 language code for Marshallese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Marshallese,
   :db/ident :lcc-639-2/mah,
   :lcc-lr/hasTag "mah",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mah",
   :skos/definition "Alpha-3 language code for Marshallese"})

(def mai
  "Alpha-3 language code for Maithili"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Maithili,
   :db/ident :lcc-639-2/mai,
   :lcc-lr/hasTag "mai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mai",
   :skos/definition "Alpha-3 language code for Maithili"})

(def mak
  "Alpha-3 language code for Makasar"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Makasar,
   :db/ident :lcc-639-2/mak,
   :lcc-lr/hasTag "mak",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mak",
   :skos/definition "Alpha-3 language code for Makasar"})

(def mal
  "Alpha-3 language code for Malayalam"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malayalam,
   :db/ident :lcc-639-2/mal,
   :lcc-lr/hasTag "mal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mal",
   :skos/definition "Alpha-3 language code for Malayalam"})

(def man
  "Alpha-3 language code for Mandingo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mandingo,
   :db/ident :lcc-639-2/man,
   :lcc-lr/hasTag "man",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "man",
   :skos/definition "Alpha-3 language code for Mandingo"})

(def mao
  "Alpha-3 bibliographic language code for Maori"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Maori,
   :db/ident :lcc-639-2/mao,
   :lcc-lr/hasTag "mao",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mao",
   :skos/definition "Alpha-3 bibliographic language code for Maori"})

(def map
  "Alpha-3 language code for Austronesian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AustronesianLanguages,
   :db/ident :lcc-639-2/map,
   :lcc-lr/hasTag "map",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "map",
   :skos/definition "Alpha-3 language code for Austronesian languages"})

(def mar
  "Alpha-3 language code for Marathi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Marathi,
   :db/ident :lcc-639-2/mar,
   :lcc-lr/hasTag "mar",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mar",
   :skos/definition "Alpha-3 language code for Marathi"})

(def mas
  "Alpha-3 language code for Masai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Masai,
   :db/ident :lcc-639-2/mas,
   :lcc-lr/hasTag "mas",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mas",
   :skos/definition "Alpha-3 language code for Masai"})

(def may
  "Alpha-3 bibliographic language code for Malay"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malay,
   :db/ident :lcc-639-2/may,
   :lcc-lr/hasTag "may",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "may",
   :skos/definition "Alpha-3 bibliographic language code for Malay"})

(def mdf
  "Alpha-3 language code for Moksha"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Moksha,
   :db/ident :lcc-639-2/mdf,
   :lcc-lr/hasTag "mdf",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mdf",
   :skos/definition "Alpha-3 language code for Moksha"})

(def mdr
  "Alpha-3 language code for Mandar"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mandar,
   :db/ident :lcc-639-2/mdr,
   :lcc-lr/hasTag "mdr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mdr",
   :skos/definition "Alpha-3 language code for Mandar"})

(def men
  "Alpha-3 language code for Mende"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mende,
   :db/ident :lcc-639-2/men,
   :lcc-lr/hasTag "men",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "men",
   :skos/definition "Alpha-3 language code for Mende"})

(def mga
  "Alpha-3 language code for Irish, Middle (900-1200)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MiddleIrish,
   :db/ident :lcc-639-2/mga,
   :lcc-lr/hasTag "mga",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mga",
   :skos/definition "Alpha-3 language code for Irish, Middle (900-1200)"})

(def mic
  "Alpha-3 language code for Mi'kmaq; Micmac"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mikmaq,
   :db/ident :lcc-639-2/mic,
   :lcc-lr/hasTag "mic",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mic",
   :skos/definition "Alpha-3 language code for Mi'kmaq; Micmac"})

(def min
  "Alpha-3 language code for Minangkabau"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Minangkabau,
   :db/ident :lcc-639-2/min,
   :lcc-lr/hasTag "min",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "min",
   :skos/definition "Alpha-3 language code for Minangkabau"})

(def mis
  "Alpha-3 language code for Uncoded languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/UncodedLanguages,
   :db/ident :lcc-639-2/mis,
   :lcc-lr/hasTag "mis",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mis",
   :skos/definition "Alpha-3 language code for Uncoded languages"})

(def mkd
  "Alpha-3 terminologic language code for Macedonian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Macedonian,
   :db/ident :lcc-639-2/mkd,
   :lcc-lr/hasTag "mkd",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mkd",
   :skos/definition "Alpha-3 terminologic language code for Macedonian"})

(def mkh
  "Alpha-3 language code for Mon-Khmer languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MonKhmerLanguages,
   :db/ident :lcc-639-2/mkh,
   :lcc-lr/hasTag "mkh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mkh",
   :skos/definition "Alpha-3 language code for Mon-Khmer languages"})

(def mlg
  "Alpha-3 language code for Malagasy"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malagasy,
   :db/ident :lcc-639-2/mlg,
   :lcc-lr/hasTag "mlg",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mlg",
   :skos/definition "Alpha-3 language code for Malagasy"})

(def mlt
  "Alpha-3 language code for Maltese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Maltese,
   :db/ident :lcc-639-2/mlt,
   :lcc-lr/hasTag "mlt",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mlt",
   :skos/definition "Alpha-3 language code for Maltese"})

(def mnc
  "Alpha-3 language code for Manchu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Manchu,
   :db/ident :lcc-639-2/mnc,
   :lcc-lr/hasTag "mnc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mnc",
   :skos/definition "Alpha-3 language code for Manchu"})

(def mni
  "Alpha-3 language code for Manipuri"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Manipuri,
   :db/ident :lcc-639-2/mni,
   :lcc-lr/hasTag "mni",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mni",
   :skos/definition "Alpha-3 language code for Manipuri"})

(def mno
  "Alpha-3 language code for Manobo languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ManoboLanguages,
   :db/ident :lcc-639-2/mno,
   :lcc-lr/hasTag "mno",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mno",
   :skos/definition "Alpha-3 language code for Manobo languages"})

(def moh
  "Alpha-3 language code for Mohawk"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mohawk,
   :db/ident :lcc-639-2/moh,
   :lcc-lr/hasTag "moh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "moh",
   :skos/definition "Alpha-3 language code for Mohawk"})

(def mon
  "Alpha-3 language code for Mongolian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Mongolian,
   :db/ident :lcc-639-2/mon,
   :lcc-lr/hasTag "mon",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mon",
   :skos/definition "Alpha-3 language code for Mongolian"})

(def mos
  "Alpha-3 language code for Mossi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mossi,
   :db/ident :lcc-639-2/mos,
   :lcc-lr/hasTag "mos",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mos",
   :skos/definition "Alpha-3 language code for Mossi"})

(def mri
  "Alpha-3 terminologic language code for Maori"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Maori,
   :db/ident :lcc-639-2/mri,
   :lcc-lr/hasTag "mri",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mri",
   :skos/definition "Alpha-3 terminologic language code for Maori"})

(def msa
  "Alpha-3 terminologic language code for Malay"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malay,
   :db/ident :lcc-639-2/msa,
   :lcc-lr/hasTag "msa",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "msa",
   :skos/definition "Alpha-3 terminologic language code for Malay"})

(def mul
  "Alpha-3 language code for Multiple languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MultipleLanguages,
   :db/ident :lcc-639-2/mul,
   :lcc-lr/hasTag "mul",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mul",
   :skos/definition "Alpha-3 language code for Multiple languages"})

(def mun
  "Alpha-3 language code for Munda languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MundaLanguages,
   :db/ident :lcc-639-2/mun,
   :lcc-lr/hasTag "mun",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mun",
   :skos/definition "Alpha-3 language code for Munda languages"})

(def mus
  "Alpha-3 language code for Creek"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Creek,
   :db/ident :lcc-639-2/mus,
   :lcc-lr/hasTag "mus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mus",
   :skos/definition "Alpha-3 language code for Creek"})

(def mwl
  "Alpha-3 language code for Mirandese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Mirandese,
   :db/ident :lcc-639-2/mwl,
   :lcc-lr/hasTag "mwl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mwl",
   :skos/definition "Alpha-3 language code for Mirandese"})

(def mwr
  "Alpha-3 language code for Marwari"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Marwari,
   :db/ident :lcc-639-2/mwr,
   :lcc-lr/hasTag "mwr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mwr",
   :skos/definition "Alpha-3 language code for Marwari"})

(def mya
  "Alpha-3 terminologic language code for Burmese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Burmese,
   :db/ident :lcc-639-2/mya,
   :lcc-lr/hasTag "mya",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mya",
   :skos/definition "Alpha-3 terminologic language code for Burmese"})

(def myn
  "Alpha-3 language code for Mayan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MayanLanguages,
   :db/ident :lcc-639-2/myn,
   :lcc-lr/hasTag "myn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "myn",
   :skos/definition "Alpha-3 language code for Mayan languages"})

(def myv
  "Alpha-3 language code for Erzya"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Erzya,
   :db/ident :lcc-639-2/myv,
   :lcc-lr/hasTag "myv",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "myv",
   :skos/definition "Alpha-3 language code for Erzya"})

(def nah
  "Alpha-3 language code for Nahuatl languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NahuatlLanguages,
   :db/ident :lcc-639-2/nah,
   :lcc-lr/hasTag "nah",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nah",
   :skos/definition "Alpha-3 language code for Nahuatl languages"})

(def nai
  "Alpha-3 language code for North American Indian (Other)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NorthAmericanIndianLanguages,
   :db/ident :lcc-639-2/nai,
   :lcc-lr/hasTag "nai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nai",
   :skos/definition "Alpha-3 language code for North American Indian (Other)"})

(def nap
  "Alpha-3 language code for Neapolitan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Neapolitan,
   :db/ident :lcc-639-2/nap,
   :lcc-lr/hasTag "nap",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nap",
   :skos/definition "Alpha-3 language code for Neapolitan"})

(def nau
  "Alpha-3 language code for Nauru"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Nauru,
   :db/ident :lcc-639-2/nau,
   :lcc-lr/hasTag "nau",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nau",
   :skos/definition "Alpha-3 language code for Nauru"})

(def nav
  "Alpha-3 language code for Navajo; Navaho"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Navajo,
   :db/ident :lcc-639-2/nav,
   :lcc-lr/hasTag "nav",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nav",
   :skos/definition "Alpha-3 language code for Navajo; Navaho"})

(def nbl
  "Alpha-3 language code for South Ndebele; Ndebele, South"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/SouthNdebele,
   :db/ident :lcc-639-2/nbl,
   :lcc-lr/hasTag "nbl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nbl",
   :skos/definition "Alpha-3 language code for South Ndebele; Ndebele, South"})

(def nde
  "Alpha-3 language code for North Ndebele; Ndebele, North"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorthNdebele,
   :db/ident :lcc-639-2/nde,
   :lcc-lr/hasTag "nde",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nde",
   :skos/definition "Alpha-3 language code for North Ndebele; Ndebele, North"})

(def ndo
  "Alpha-3 language code for Ndonga"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ndonga,
   :db/ident :lcc-639-2/ndo,
   :lcc-lr/hasTag "ndo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ndo",
   :skos/definition "Alpha-3 language code for Ndonga"})

(def nds
  "Alpha-3 language code for Low German; Low Saxon; German, Low; Saxon, Low"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/LowGerman,
   :db/ident :lcc-639-2/nds,
   :lcc-lr/hasTag "nds",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nds",
   :skos/definition
   "Alpha-3 language code for Low German; Low Saxon; German, Low; Saxon, Low"})

(def nep
  "Alpha-3 language code for Nepali"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Nepali,
   :db/ident :lcc-639-2/nep,
   :lcc-lr/hasTag "nep",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nep",
   :skos/definition "Alpha-3 language code for Nepali"})

(def new
  "Alpha-3 language code for Nepal Bhasa; Newari"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Newari,
   :db/ident :lcc-639-2/new,
   :lcc-lr/hasTag "new",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "new",
   :skos/definition "Alpha-3 language code for Nepal Bhasa; Newari"})

(def nia
  "Alpha-3 language code for Nias"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Nias,
   :db/ident :lcc-639-2/nia,
   :lcc-lr/hasTag "nia",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nia",
   :skos/definition "Alpha-3 language code for Nias"})

(def nic
  "Alpha-3 language code for Niger-Kordofanian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NigerKordofanianLanguages,
   :db/ident :lcc-639-2/nic,
   :lcc-lr/hasTag "nic",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nic",
   :skos/definition "Alpha-3 language code for Niger-Kordofanian languages"})

(def niu
  "Alpha-3 language code for Niuean"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Niuean,
   :db/ident :lcc-639-2/niu,
   :lcc-lr/hasTag "niu",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "niu",
   :skos/definition "Alpha-3 language code for Niuean"})

(def nld
  "Alpha-3 terminologic language code for Dutch; Flemish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dutch,
   :db/ident :lcc-639-2/nld,
   :lcc-lr/hasTag "nld",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nld",
   :skos/definition "Alpha-3 terminologic language code for Dutch; Flemish"})

(def nno
  "Alpha-3 language code for Norwegian Nynorsk"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorwegianNynorsk,
   :db/ident :lcc-639-2/nno,
   :lcc-lr/hasTag "nno",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nno",
   :skos/definition "Alpha-3 language code for Norwegian Nynorsk"})

(def nob
  "Alpha-3 language code for Norwegian Bokmal"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorwegianBokmal,
   :db/ident :lcc-639-2/nob,
   :lcc-lr/hasTag "nob",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nob",
   :skos/definition "Alpha-3 language code for Norwegian Bokmal"})

(def nog
  "Alpha-3 language code for Nogai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Nogai,
   :db/ident :lcc-639-2/nog,
   :lcc-lr/hasTag "nog",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nog",
   :skos/definition "Alpha-3 language code for Nogai"})

(def non
  "Alpha-3 language code for Norse, Old"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldNorse,
   :db/ident :lcc-639-2/non,
   :lcc-lr/hasTag "non",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "non",
   :skos/definition "Alpha-3 language code for Norse, Old"})

(def nor
  "Alpha-3 language code for Norwegian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Norwegian,
   :db/ident :lcc-639-2/nor,
   :lcc-lr/hasTag "nor",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nor",
   :skos/definition "Alpha-3 language code for Norwegian"})

(def nqo
  "Alpha-3 language code for N'Ko"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NKo,
   :db/ident :lcc-639-2/nqo,
   :lcc-lr/hasTag "nqo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nqo",
   :skos/definition "Alpha-3 language code for N'Ko"})

(def nso
  "Alpha-3 language code for Northern Sotho; Pedi; Sepedi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Pedi,
   :db/ident :lcc-639-2/nso,
   :lcc-lr/hasTag "nso",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nso",
   :skos/definition "Alpha-3 language code for Northern Sotho; Pedi; Sepedi"})

(def nub
  "Alpha-3 language code for Nubian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NubianLanguages,
   :db/ident :lcc-639-2/nub,
   :lcc-lr/hasTag "nub",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nub",
   :skos/definition "Alpha-3 language code for Nubian languages"})

(def nwc
  "Alpha-3 language code for Classical Newari; Classical Nepal Bhasa; Old Newari"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ClassicalNewari,
   :db/ident :lcc-639-2/nwc,
   :lcc-lr/hasTag "nwc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nwc",
   :skos/definition
   "Alpha-3 language code for Classical Newari; Classical Nepal Bhasa; Old Newari"})

(def nya
  "Alpha-3 language code for Nyanja; Chichewa; Chewa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chichewa,
   :db/ident :lcc-639-2/nya,
   :lcc-lr/hasTag "nya",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nya",
   :skos/definition "Alpha-3 language code for Nyanja; Chichewa; Chewa"})

(def nym
  "Alpha-3 language code for Nyamwezi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Nyamwezi,
   :db/ident :lcc-639-2/nym,
   :lcc-lr/hasTag "nym",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nym",
   :skos/definition "Alpha-3 language code for Nyamwezi"})

(def nyn
  "Alpha-3 language code for Nyankole"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Nyankole,
   :db/ident :lcc-639-2/nyn,
   :lcc-lr/hasTag "nyn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nyn",
   :skos/definition "Alpha-3 language code for Nyankole"})

(def nyo
  "Alpha-3 language code for Nyoro"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Nyoro,
   :db/ident :lcc-639-2/nyo,
   :lcc-lr/hasTag "nyo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nyo",
   :skos/definition "Alpha-3 language code for Nyoro"})

(def nzi
  "Alpha-3 language code for Nzima"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Nzima,
   :db/ident :lcc-639-2/nzi,
   :lcc-lr/hasTag "nzi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nzi",
   :skos/definition "Alpha-3 language code for Nzima"})

(def oci
  "Alpha-3 language code for Occitan (post 1500)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Occitan,
   :db/ident :lcc-639-2/oci,
   :lcc-lr/hasTag "oci",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oci",
   :skos/definition "Alpha-3 language code for Occitan (post 1500)"})

(def oji
  "Alpha-3 language code for Ojibwa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ojibwa,
   :db/ident :lcc-639-2/oji,
   :lcc-lr/hasTag "oji",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oji",
   :skos/definition "Alpha-3 language code for Ojibwa"})

(def ori
  "Alpha-3 language code for Oriya"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Oriya,
   :db/ident :lcc-639-2/ori,
   :lcc-lr/hasTag "ori",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ori",
   :skos/definition "Alpha-3 language code for Oriya"})

(def orm
  "Alpha-3 language code for Oromo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Oromo,
   :db/ident :lcc-639-2/orm,
   :lcc-lr/hasTag "orm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "orm",
   :skos/definition "Alpha-3 language code for Oromo"})

(def osa
  "Alpha-3 language code for Osage"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Osage,
   :db/ident :lcc-639-2/osa,
   :lcc-lr/hasTag "osa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "osa",
   :skos/definition "Alpha-3 language code for Osage"})

(def oss
  "Alpha-3 language code for Ossetian; Ossetic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ossetian,
   :db/ident :lcc-639-2/oss,
   :lcc-lr/hasTag "oss",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oss",
   :skos/definition "Alpha-3 language code for Ossetian; Ossetic"})

(def ota
  "Alpha-3 language code for Turkish, Ottoman (1500-1928)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OttomanTurkish,
   :db/ident :lcc-639-2/ota,
   :lcc-lr/hasTag "ota",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ota",
   :skos/definition "Alpha-3 language code for Turkish, Ottoman (1500-1928)"})

(def oto
  "Alpha-3 language code for Otomian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OtomianLanguages,
   :db/ident :lcc-639-2/oto,
   :lcc-lr/hasTag "oto",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oto",
   :skos/definition "Alpha-3 language code for Otomian languages"})

(def paa
  "Alpha-3 language code for Papuan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/PapuanLanguages,
   :db/ident :lcc-639-2/paa,
   :lcc-lr/hasTag "paa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "paa",
   :skos/definition "Alpha-3 language code for Papuan languages"})

(def pag
  "Alpha-3 language code for Pangasinan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Pangasinan,
   :db/ident :lcc-639-2/pag,
   :lcc-lr/hasTag "pag",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pag",
   :skos/definition "Alpha-3 language code for Pangasinan"})

(def pal
  "Alpha-3 language code for Pahlavi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Pahlavi,
   :db/ident :lcc-639-2/pal,
   :lcc-lr/hasTag "pal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pal",
   :skos/definition "Alpha-3 language code for Pahlavi"})

(def pam
  "Alpha-3 language code for Pampanga"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Pampanga,
   :db/ident :lcc-639-2/pam,
   :lcc-lr/hasTag "pam",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pam",
   :skos/definition "Alpha-3 language code for Pampanga"})

(def pan
  "Alpha-3 language code for Panjabi; Punjabi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Panjabi,
   :db/ident :lcc-639-2/pan,
   :lcc-lr/hasTag "pan",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pan",
   :skos/definition "Alpha-3 language code for Panjabi; Punjabi"})

(def pap
  "Alpha-3 language code for Papiamento"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Papiamento,
   :db/ident :lcc-639-2/pap,
   :lcc-lr/hasTag "pap",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pap",
   :skos/definition "Alpha-3 language code for Papiamento"})

(def pau
  "Alpha-3 language code for Palauan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Palauan,
   :db/ident :lcc-639-2/pau,
   :lcc-lr/hasTag "pau",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pau",
   :skos/definition "Alpha-3 language code for Palauan"})

(def peo
  "Alpha-3 language code for Persian, Old (ca. 600-400 B.C.)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldPersian,
   :db/ident :lcc-639-2/peo,
   :lcc-lr/hasTag "peo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "peo",
   :skos/definition
   "Alpha-3 language code for Persian, Old (ca. 600-400 B.C.)"})

(def per
  "Alpha-3 bibliographic language code for Persian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Persian,
   :db/ident :lcc-639-2/per,
   :lcc-lr/hasTag "per",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "per",
   :skos/definition "Alpha-3 bibliographic language code for Persian"})

(def phi
  "Alpha-3 language code for Philippine languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/PhilippineLanguages,
   :db/ident :lcc-639-2/phi,
   :lcc-lr/hasTag "phi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "phi",
   :skos/definition "Alpha-3 language code for Philippine languages"})

(def phn
  "Alpha-3 language code for Phoenician"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Phoenician,
   :db/ident :lcc-639-2/phn,
   :lcc-lr/hasTag "phn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "phn",
   :skos/definition "Alpha-3 language code for Phoenician"})

(def pli
  "Alpha-3 language code for Pali"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Pali,
   :db/ident :lcc-639-2/pli,
   :lcc-lr/hasTag "pli",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pli",
   :skos/definition "Alpha-3 language code for Pali"})

(def pol
  "Alpha-3 language code for Polish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Polish,
   :db/ident :lcc-639-2/pol,
   :lcc-lr/hasTag "pol",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pol",
   :skos/definition "Alpha-3 language code for Polish"})

(def pon
  "Alpha-3 language code for Pohnpeian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Pohnpeian,
   :db/ident :lcc-639-2/pon,
   :lcc-lr/hasTag "pon",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pon",
   :skos/definition "Alpha-3 language code for Pohnpeian"})

(def por
  "Alpha-3 language code for Portuguese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Portuguese,
   :db/ident :lcc-639-2/por,
   :lcc-lr/hasTag "por",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "por",
   :skos/definition "Alpha-3 language code for Portuguese"})

(def pra
  "Alpha-3 language code for Prakrit languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/PrakritLanguages,
   :db/ident :lcc-639-2/pra,
   :lcc-lr/hasTag "pra",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pra",
   :skos/definition "Alpha-3 language code for Prakrit languages"})

(def pro
  "Alpha-3 language code for Provencal, Old (to 1500)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldProvencal,
   :db/ident :lcc-639-2/pro,
   :lcc-lr/hasTag "pro",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pro",
   :skos/definition "Alpha-3 language code for Provencal, Old (to 1500)"})

(def pus
  "Alpha-3 language code for Pushto"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Pushto,
   :db/ident :lcc-639-2/pus,
   :lcc-lr/hasTag "pus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pus",
   :skos/definition "Alpha-3 language code for Pushto"})

(def que
  "Alpha-3 language code for Quechua"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Quechua,
   :db/ident :lcc-639-2/que,
   :lcc-lr/hasTag "que",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "que",
   :skos/definition "Alpha-3 language code for Quechua"})

(def raj
  "Alpha-3 language code for Rajasthani"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Rajasthani,
   :db/ident :lcc-639-2/raj,
   :lcc-lr/hasTag "raj",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "raj",
   :skos/definition "Alpha-3 language code for Rajasthani"})

(def rap
  "Alpha-3 language code for Rapanui"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Rapanui,
   :db/ident :lcc-639-2/rap,
   :lcc-lr/hasTag "rap",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rap",
   :skos/definition "Alpha-3 language code for Rapanui"})

(def rar
  "Alpha-3 language code for Rarotongan; Cook Islands Maori"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Rarotongan,
   :db/ident :lcc-639-2/rar,
   :lcc-lr/hasTag "rar",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rar",
   :skos/definition "Alpha-3 language code for Rarotongan; Cook Islands Maori"})

(def roa
  "Alpha-3 language code for Romance languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/RomanceLanguages,
   :db/ident :lcc-639-2/roa,
   :lcc-lr/hasTag "roa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "roa",
   :skos/definition "Alpha-3 language code for Romance languages"})

(def roh
  "Alpha-3 language code for Romansh"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Romansh,
   :db/ident :lcc-639-2/roh,
   :lcc-lr/hasTag "roh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "roh",
   :skos/definition "Alpha-3 language code for Romansh"})

(def rom
  "Alpha-3 language code for Romany"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Romany,
   :db/ident :lcc-639-2/rom,
   :lcc-lr/hasTag "rom",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rom",
   :skos/definition "Alpha-3 language code for Romany"})

(def ron
  "Alpha-3 terminologic language code for Romanian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Romanian,
   :db/ident :lcc-639-2/ron,
   :lcc-lr/hasTag "ron",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ron",
   :skos/definition "Alpha-3 terminologic language code for Romanian"})

(def rum
  "Alpha-3 bibliographic language code for Romanian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Romanian,
   :db/ident :lcc-639-2/rum,
   :lcc-lr/hasTag "rum",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rum",
   :skos/definition "Alpha-3 bibliographic language code for Romanian"})

(def run
  "Alpha-3 language code for Rundi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Rundi,
   :db/ident :lcc-639-2/run,
   :lcc-lr/hasTag "run",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "run",
   :skos/definition "Alpha-3 language code for Rundi"})

(def rup
  "Alpha-3 language code for Aromanian; Arumanian; Macedo-Romanian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/MacedoRomanian,
   :db/ident :lcc-639-2/rup,
   :lcc-lr/hasTag "rup",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rup",
   :skos/definition
   "Alpha-3 language code for Aromanian; Arumanian; Macedo-Romanian"})

(def rus
  "Alpha-3 language code for Russian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Russian,
   :db/ident :lcc-639-2/rus,
   :lcc-lr/hasTag "rus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rus",
   :skos/definition "Alpha-3 language code for Russian"})

(def sad
  "Alpha-3 language code for Sandawe"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sandawe,
   :db/ident :lcc-639-2/sad,
   :lcc-lr/hasTag "sad",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sad",
   :skos/definition "Alpha-3 language code for Sandawe"})

(def sag
  "Alpha-3 language code for Sango"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sango,
   :db/ident :lcc-639-2/sag,
   :lcc-lr/hasTag "sag",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sag",
   :skos/definition "Alpha-3 language code for Sango"})

(def sah
  "Alpha-3 language code for Yakut"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Yakut,
   :db/ident :lcc-639-2/sah,
   :lcc-lr/hasTag "sah",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sah",
   :skos/definition "Alpha-3 language code for Yakut"})

(def sai
  "Alpha-3 language code for South American Indian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SouthAmericanIndianLanguages,
   :db/ident :lcc-639-2/sai,
   :lcc-lr/hasTag "sai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sai",
   :skos/definition "Alpha-3 language code for South American Indian"})

(def sal
  "Alpha-3 language code for Salishan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SalishanLanguages,
   :db/ident :lcc-639-2/sal,
   :lcc-lr/hasTag "sal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sal",
   :skos/definition "Alpha-3 language code for Salishan languages"})

(def sam
  "Alpha-3 language code for Samaritan Aramaic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SamaritanAramaic,
   :db/ident :lcc-639-2/sam,
   :lcc-lr/hasTag "sam",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sam",
   :skos/definition "Alpha-3 language code for Samaritan Aramaic"})

(def san
  "Alpha-3 language code for Sanskrit"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sanskrit,
   :db/ident :lcc-639-2/san,
   :lcc-lr/hasTag "san",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "san",
   :skos/definition "Alpha-3 language code for Sanskrit"})

(def sas
  "Alpha-3 language code for Sasak"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sasak,
   :db/ident :lcc-639-2/sas,
   :lcc-lr/hasTag "sas",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sas",
   :skos/definition "Alpha-3 language code for Sasak"})

(def sat
  "Alpha-3 language code for Santali"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Santali,
   :db/ident :lcc-639-2/sat,
   :lcc-lr/hasTag "sat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sat",
   :skos/definition "Alpha-3 language code for Santali"})

(def scn
  "Alpha-3 language code for Sicilian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sicilian,
   :db/ident :lcc-639-2/scn,
   :lcc-lr/hasTag "scn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "scn",
   :skos/definition "Alpha-3 language code for Sicilian"})

(def sco
  "Alpha-3 language code for Scots"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Scots,
   :db/ident :lcc-639-2/sco,
   :lcc-lr/hasTag "sco",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sco",
   :skos/definition "Alpha-3 language code for Scots"})

(def sel
  "Alpha-3 language code for Selkup"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Selkup,
   :db/ident :lcc-639-2/sel,
   :lcc-lr/hasTag "sel",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sel",
   :skos/definition "Alpha-3 language code for Selkup"})

(def sem
  "Alpha-3 language code for Semitic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SemiticLanguages,
   :db/ident :lcc-639-2/sem,
   :lcc-lr/hasTag "sem",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sem",
   :skos/definition "Alpha-3 language code for Semitic languages"})

(def sga
  "Alpha-3 language code for Irish, Old (to 900)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/OldIrish,
   :db/ident :lcc-639-2/sga,
   :lcc-lr/hasTag "sga",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sga",
   :skos/definition "Alpha-3 language code for Irish, Old (to 900)"})

(def sgn
  "Alpha-3 language code for Sign languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SignLanguages,
   :db/ident :lcc-639-2/sgn,
   :lcc-lr/hasTag "sgn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sgn",
   :skos/definition "Alpha-3 language code for Sign languages"})

(def shn
  "Alpha-3 language code for Shan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Shan,
   :db/ident :lcc-639-2/shn,
   :lcc-lr/hasTag "shn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "shn",
   :skos/definition "Alpha-3 language code for Shan"})

(def sid
  "Alpha-3 language code for Sidamo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sidamo,
   :db/ident :lcc-639-2/sid,
   :lcc-lr/hasTag "sid",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sid",
   :skos/definition "Alpha-3 language code for Sidamo"})

(def sin
  "Alpha-3 language code for Sinhalese; Sinhala"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sinhala,
   :db/ident :lcc-639-2/sin,
   :lcc-lr/hasTag "sin",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sin",
   :skos/definition "Alpha-3 language code for Sinhalese; Sinhala"})

(def sio
  "Alpha-3 language code for Siouan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SiouanLanguages,
   :db/ident :lcc-639-2/sio,
   :lcc-lr/hasTag "sio",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sio",
   :skos/definition "Alpha-3 language code for Siouan languages"})

(def sit
  "Alpha-3 language code for Sino-Tibetan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SinoTibetanLanguages,
   :db/ident :lcc-639-2/sit,
   :lcc-lr/hasTag "sit",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sit",
   :skos/definition "Alpha-3 language code for Sino-Tibetan languages"})

(def sla
  "Alpha-3 language code for Slavic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SlavicLanguages,
   :db/ident :lcc-639-2/sla,
   :lcc-lr/hasTag "sla",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sla",
   :skos/definition "Alpha-3 language code for Slavic languages"})

(def slk
  "Alpha-3 terminologic language code for Slovak"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Slovak,
   :db/ident :lcc-639-2/slk,
   :lcc-lr/hasTag "slk",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "slk",
   :skos/definition "Alpha-3 terminologic language code for Slovak"})

(def slo
  "Alpha-3 bibliographic language code for Slovak"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Slovak,
   :db/ident :lcc-639-2/slo,
   :lcc-lr/hasTag "slo",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "slo",
   :skos/definition "Alpha-3 bibliographic language code for Slovak"})

(def slv
  "Alpha-3 language code for Slovenian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Slovenian,
   :db/ident :lcc-639-2/slv,
   :lcc-lr/hasTag "slv",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "slv",
   :skos/definition "Alpha-3 language code for Slovenian"})

(def sma
  "Alpha-3 language code for Southern Sami"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SouthernSami,
   :db/ident :lcc-639-2/sma,
   :lcc-lr/hasTag "sma",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sma",
   :skos/definition "Alpha-3 language code for Southern Sami"})

(def sme
  "Alpha-3 language code for Northern Sami"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorthernSami,
   :db/ident :lcc-639-2/sme,
   :lcc-lr/hasTag "sme",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sme",
   :skos/definition "Alpha-3 language code for Northern Sami"})

(def smi
  "Alpha-3 language code for Sami languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SamiLanguages,
   :db/ident :lcc-639-2/smi,
   :lcc-lr/hasTag "smi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smi",
   :skos/definition "Alpha-3 language code for Sami languages"})

(def smj
  "Alpha-3 language code for Lule Sami"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/LuleSami,
   :db/ident :lcc-639-2/smj,
   :lcc-lr/hasTag "smj",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smj",
   :skos/definition "Alpha-3 language code for Lule Sami"})

(def smn
  "Alpha-3 language code for Inari Sami"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/InariSami,
   :db/ident :lcc-639-2/smn,
   :lcc-lr/hasTag "smn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smn",
   :skos/definition "Alpha-3 language code for Inari Sami"})

(def smo
  "Alpha-3 language code for Samoan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Samoan,
   :db/ident :lcc-639-2/smo,
   :lcc-lr/hasTag "smo",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smo",
   :skos/definition "Alpha-3 language code for Samoan"})

(def sms
  "Alpha-3 language code for Skolt Sami"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SkoltSami,
   :db/ident :lcc-639-2/sms,
   :lcc-lr/hasTag "sms",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sms",
   :skos/definition "Alpha-3 language code for Skolt Sami"})

(def sna
  "Alpha-3 language code for Shona"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Shona,
   :db/ident :lcc-639-2/sna,
   :lcc-lr/hasTag "sna",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sna",
   :skos/definition "Alpha-3 language code for Shona"})

(def snd
  "Alpha-3 language code for Sindhi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sindhi,
   :db/ident :lcc-639-2/snd,
   :lcc-lr/hasTag "snd",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "snd",
   :skos/definition "Alpha-3 language code for Sindhi"})

(def snk
  "Alpha-3 language code for Soninke"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Soninke,
   :db/ident :lcc-639-2/snk,
   :lcc-lr/hasTag "snk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "snk",
   :skos/definition "Alpha-3 language code for Soninke"})

(def sog
  "Alpha-3 language code for Sogdian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sogdian,
   :db/ident :lcc-639-2/sog,
   :lcc-lr/hasTag "sog",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sog",
   :skos/definition "Alpha-3 language code for Sogdian"})

(def som
  "Alpha-3 language code for Somali"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Somali,
   :db/ident :lcc-639-2/som,
   :lcc-lr/hasTag "som",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "som",
   :skos/definition "Alpha-3 language code for Somali"})

(def son
  "Alpha-3 language code for Songhai languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SonghaiLanguages,
   :db/ident :lcc-639-2/son,
   :lcc-lr/hasTag "son",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "son",
   :skos/definition "Alpha-3 language code for Songhai languages"})

(def sot
  "Alpha-3 language code for Southern Sotho"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/SouthernSotho,
   :db/ident :lcc-639-2/sot,
   :lcc-lr/hasTag "sot",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sot",
   :skos/definition "Alpha-3 language code for Southern Sotho"})

(def spa
  "Alpha-3 language code for Spanish; Castilian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Spanish,
   :db/ident :lcc-639-2/spa,
   :lcc-lr/hasTag "spa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "spa",
   :skos/definition "Alpha-3 language code for Spanish; Castilian"})

(def sqi
  "Alpha-3 terminologic language code for Albanian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Albanian,
   :db/ident :lcc-639-2/sqi,
   :lcc-lr/hasTag "sqi",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sqi",
   :skos/definition "Alpha-3 terminologic language code for Albanian"})

(def srd
  "Alpha-3 language code for Sardinian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sardinian,
   :db/ident :lcc-639-2/srd,
   :lcc-lr/hasTag "srd",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srd",
   :skos/definition "Alpha-3 language code for Sardinian"})

(def srn
  "Alpha-3 language code for Sranan Tongo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SrananTongo,
   :db/ident :lcc-639-2/srn,
   :lcc-lr/hasTag "srn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srn",
   :skos/definition "Alpha-3 language code for Sranan Tongo"})

(def srp
  "Alpha-3 terminologic language code for Serbian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Serbian,
   :db/ident :lcc-639-2/srp,
   :lcc-lr/hasTag "srp",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srp",
   :skos/definition "Alpha-3 terminologic language code for Serbian"})

(def srr
  "Alpha-3 language code for Serer"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Serer,
   :db/ident :lcc-639-2/srr,
   :lcc-lr/hasTag "srr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srr",
   :skos/definition "Alpha-3 language code for Serer"})

(def ssa
  "Alpha-3 language code for Nilo-Saharan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NiloSaharanLanguages,
   :db/ident :lcc-639-2/ssa,
   :lcc-lr/hasTag "ssa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ssa",
   :skos/definition "Alpha-3 language code for Nilo-Saharan"})

(def ssw
  "Alpha-3 language code for Swati"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Swati,
   :db/ident :lcc-639-2/ssw,
   :lcc-lr/hasTag "ssw",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ssw",
   :skos/definition "Alpha-3 language code for Swati"})

(def suk
  "Alpha-3 language code for Sukuma"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sukuma,
   :db/ident :lcc-639-2/suk,
   :lcc-lr/hasTag "suk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "suk",
   :skos/definition "Alpha-3 language code for Sukuma"})

(def sun
  "Alpha-3 language code for Sundanese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sundanese,
   :db/ident :lcc-639-2/sun,
   :lcc-lr/hasTag "sun",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sun",
   :skos/definition "Alpha-3 language code for Sundanese"})

(def sus
  "Alpha-3 language code for Susu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Susu,
   :db/ident :lcc-639-2/sus,
   :lcc-lr/hasTag "sus",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sus",
   :skos/definition "Alpha-3 language code for Susu"})

(def sux
  "Alpha-3 language code for Sumerian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Sumerian,
   :db/ident :lcc-639-2/sux,
   :lcc-lr/hasTag "sux",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sux",
   :skos/definition "Alpha-3 language code for Sumerian"})

(def swa
  "Alpha-3 language code for Swahili"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Swahili,
   :db/ident :lcc-639-2/swa,
   :lcc-lr/hasTag "swa",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "swa",
   :skos/definition "Alpha-3 language code for Swahili"})

(def swe
  "Alpha-3 language code for Swedish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Swedish,
   :db/ident :lcc-639-2/swe,
   :lcc-lr/hasTag "swe",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "swe",
   :skos/definition "Alpha-3 language code for Swedish"})

(def syc
  "Alpha-3 language code for Classical Syriac"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ClassicalSyriac,
   :db/ident :lcc-639-2/syc,
   :lcc-lr/hasTag "syc",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "syc",
   :skos/definition "Alpha-3 language code for Classical Syriac"})

(def syr
  "Alpha-3 language code for Syriac"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Syriac,
   :db/ident :lcc-639-2/syr,
   :lcc-lr/hasTag "syr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "syr",
   :skos/definition "Alpha-3 language code for Syriac"})

(def tah
  "Alpha-3 language code for Tahitian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tahitian,
   :db/ident :lcc-639-2/tah,
   :lcc-lr/hasTag "tah",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tah",
   :skos/definition "Alpha-3 language code for Tahitian"})

(def tai
  "Alpha-3 language code for Tai languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/TaiLanguages,
   :db/ident :lcc-639-2/tai,
   :lcc-lr/hasTag "tai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tai",
   :skos/definition "Alpha-3 language code for Tai languages"})

(def tam
  "Alpha-3 language code for Tamil"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tamil,
   :db/ident :lcc-639-2/tam,
   :lcc-lr/hasTag "tam",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tam",
   :skos/definition "Alpha-3 language code for Tamil"})

(def tat
  "Alpha-3 language code for Tatar"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tatar,
   :db/ident :lcc-639-2/tat,
   :lcc-lr/hasTag "tat",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tat",
   :skos/definition "Alpha-3 language code for Tatar"})

(def tel
  "Alpha-3 language code for Telugu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Telugu,
   :db/ident :lcc-639-2/tel,
   :lcc-lr/hasTag "tel",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tel",
   :skos/definition "Alpha-3 language code for Telugu"})

(def tem
  "Alpha-3 language code for Timne"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Timne,
   :db/ident :lcc-639-2/tem,
   :lcc-lr/hasTag "tem",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tem",
   :skos/definition "Alpha-3 language code for Timne"})

(def ter
  "Alpha-3 language code for Tereno"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tereno,
   :db/ident :lcc-639-2/ter,
   :lcc-lr/hasTag "ter",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ter",
   :skos/definition "Alpha-3 language code for Tereno"})

(def tet
  "Alpha-3 language code for Tetum"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tetum,
   :db/ident :lcc-639-2/tet,
   :lcc-lr/hasTag "tet",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tet",
   :skos/definition "Alpha-3 language code for Tetum"})

(def tgk
  "Alpha-3 language code for Tajik"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tajik,
   :db/ident :lcc-639-2/tgk,
   :lcc-lr/hasTag "tgk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tgk",
   :skos/definition "Alpha-3 language code for Tajik"})

(def tgl
  "Alpha-3 language code for Tagalog"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tagalog,
   :db/ident :lcc-639-2/tgl,
   :lcc-lr/hasTag "tgl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tgl",
   :skos/definition "Alpha-3 language code for Tagalog"})

(def tha
  "Alpha-3 language code for Thai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Thai,
   :db/ident :lcc-639-2/tha,
   :lcc-lr/hasTag "tha",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tha",
   :skos/definition "Alpha-3 language code for Thai"})

(def tib
  "Alpha-3 bibliographic language code for Tibetan"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tibetan,
   :db/ident :lcc-639-2/tib,
   :lcc-lr/hasTag "tib",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tib",
   :skos/definition "Alpha-3 bibliographic language code for Tibetan"})

(def tig
  "Alpha-3 language code for Tigre"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tigre,
   :db/ident :lcc-639-2/tig,
   :lcc-lr/hasTag "tig",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tig",
   :skos/definition "Alpha-3 language code for Tigre"})

(def tir
  "Alpha-3 language code for Tigrinya"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tigrinya,
   :db/ident :lcc-639-2/tir,
   :lcc-lr/hasTag "tir",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tir",
   :skos/definition "Alpha-3 language code for Tigrinya"})

(def tiv_1
  "Alpha-3 language code for Tiv"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tiv,
   :db/ident :lcc-639-2/tiv_1,
   :lcc-lr/hasTag "tiv",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tiv",
   :skos/definition "Alpha-3 language code for Tiv"})

(def tkl
  "Alpha-3 language code for Tokelau"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tokelau,
   :db/ident :lcc-639-2/tkl,
   :lcc-lr/hasTag "tkl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tkl",
   :skos/definition "Alpha-3 language code for Tokelau"})

(def tlh
  "Alpha-3 language code for Klingon; tlhIngan-Hol"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Klingon,
   :db/ident :lcc-639-2/tlh,
   :lcc-lr/hasTag "tlh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tlh",
   :skos/definition "Alpha-3 language code for Klingon; tlhIngan-Hol"})

(def tli
  "Alpha-3 language code for Tlingit"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tlingit,
   :db/ident :lcc-639-2/tli,
   :lcc-lr/hasTag "tli",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tli",
   :skos/definition "Alpha-3 language code for Tlingit"})

(def tmh
  "Alpha-3 language code for Tamashek"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tamashek,
   :db/ident :lcc-639-2/tmh,
   :lcc-lr/hasTag "tmh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tmh",
   :skos/definition "Alpha-3 language code for Tamashek"})

(def tog
  "Alpha-3 language code for Tonga (Nyasa)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/TongaNyasa,
   :db/ident :lcc-639-2/tog,
   :lcc-lr/hasTag "tog",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tog",
   :skos/definition "Alpha-3 language code for Tonga (Nyasa)"})

(def ton
  "Alpha-3 language code for Tonga (Tonga Islands)"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tonga-TongaIslands,
   :db/ident :lcc-639-2/ton,
   :lcc-lr/hasTag "ton",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ton",
   :skos/definition "Alpha-3 language code for Tonga (Tonga Islands)"})

(def tpi
  "Alpha-3 language code for Tok Pisin"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/TokPisin,
   :db/ident :lcc-639-2/tpi,
   :lcc-lr/hasTag "tpi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tpi",
   :skos/definition "Alpha-3 language code for Tok Pisin"})

(def tsi
  "Alpha-3 language code for Tsimshian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tsimshian,
   :db/ident :lcc-639-2/tsi,
   :lcc-lr/hasTag "tsi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tsi",
   :skos/definition "Alpha-3 language code for Tsimshian"})

(def tsn
  "Alpha-3 language code for Tswana"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tswana,
   :db/ident :lcc-639-2/tsn,
   :lcc-lr/hasTag "tsn",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tsn",
   :skos/definition "Alpha-3 language code for Tswana"})

(def tso
  "Alpha-3 language code for Tsonga"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tsonga,
   :db/ident :lcc-639-2/tso,
   :lcc-lr/hasTag "tso",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tso",
   :skos/definition "Alpha-3 language code for Tsonga"})

(def tuk
  "Alpha-3 language code for Turkmen"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Turkmen,
   :db/ident :lcc-639-2/tuk,
   :lcc-lr/hasTag "tuk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tuk",
   :skos/definition "Alpha-3 language code for Turkmen"})

(def tum
  "Alpha-3 language code for Tumbuka"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tumbuka,
   :db/ident :lcc-639-2/tum,
   :lcc-lr/hasTag "tum",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tum",
   :skos/definition "Alpha-3 language code for Tumbuka"})

(def tup
  "Alpha-3 language code for Tupi languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/TupiLanguages,
   :db/ident :lcc-639-2/tup,
   :lcc-lr/hasTag "tup",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tup",
   :skos/definition "Alpha-3 language code for Tupi languages"})

(def tur
  "Alpha-3 language code for Turkish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Turkish,
   :db/ident :lcc-639-2/tur,
   :lcc-lr/hasTag "tur",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tur",
   :skos/definition "Alpha-3 language code for Turkish"})

(def tut
  "Alpha-3 language code for Altaic languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/AltaicLanguages,
   :db/ident :lcc-639-2/tut,
   :lcc-lr/hasTag "tut",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tut",
   :skos/definition "Alpha-3 language code for Altaic languages"})

(def tvl
  "Alpha-3 language code for Tuvalu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tuvalu,
   :db/ident :lcc-639-2/tvl,
   :lcc-lr/hasTag "tvl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tvl",
   :skos/definition "Alpha-3 language code for Tuvalu"})

(def twi_1
  "Alpha-3 language code for Twi"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Twi,
   :db/ident :lcc-639-2/twi_1,
   :lcc-lr/hasTag "twi",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "twi_1",
   :skos/definition "Alpha-3 language code for Twi"})

(def tyv
  "Alpha-3 language code for Tuvinian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Tuvinian,
   :db/ident :lcc-639-2/tyv,
   :lcc-lr/hasTag "tyv",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tyv",
   :skos/definition "Alpha-3 language code for Tuvinian"})

(def udm
  "Alpha-3 language code for Udmurt"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Udmurt,
   :db/ident :lcc-639-2/udm,
   :lcc-lr/hasTag "udm",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "udm",
   :skos/definition "Alpha-3 language code for Udmurt"})

(def uga
  "Alpha-3 language code for Ugaritic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Ugaritic,
   :db/ident :lcc-639-2/uga,
   :lcc-lr/hasTag "uga",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "uga",
   :skos/definition "Alpha-3 language code for Ugaritic"})

(def uig
  "Alpha-3 language code for Uighur; Uyghur"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Uighur,
   :db/ident :lcc-639-2/uig,
   :lcc-lr/hasTag "uig",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "uig",
   :skos/definition "Alpha-3 language code for Uighur; Uyghur"})

(def ukr
  "Alpha-3 language code for Ukrainian"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ukrainian,
   :db/ident :lcc-639-2/ukr,
   :lcc-lr/hasTag "ukr",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ukr",
   :skos/definition "Alpha-3 language code for Ukrainian"})

(def umb
  "Alpha-3 language code for Umbundu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Umbundu,
   :db/ident :lcc-639-2/umb,
   :lcc-lr/hasTag "umb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "umb",
   :skos/definition "Alpha-3 language code for Umbundu"})

(def und
  "Alpha-3 language code for Undetermined"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Undetermined,
   :db/ident :lcc-639-2/und,
   :lcc-lr/hasTag "und",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "und",
   :skos/definition "Alpha-3 language code for Undetermined"})

(def urd
  "Alpha-3 language code for Urdu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Urdu,
   :db/ident :lcc-639-2/urd,
   :lcc-lr/hasTag "urd",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "urd",
   :skos/definition "Alpha-3 language code for Urdu"})

(def uzb
  "Alpha-3 language code for Uzbek"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Uzbek,
   :db/ident :lcc-639-2/uzb,
   :lcc-lr/hasTag "uzb",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "uzb",
   :skos/definition "Alpha-3 language code for Uzbek"})

(def vai_1
  "Alpha-3 language code for Vai"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Vai,
   :db/ident :lcc-639-2/vai_1,
   :lcc-lr/hasTag "vai",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vai",
   :skos/definition "Alpha-3 language code for Vai"})

(def ven
  "Alpha-3 language code for Venda"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Venda,
   :db/ident :lcc-639-2/ven,
   :lcc-lr/hasTag "ven",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ven",
   :skos/definition "Alpha-3 language code for Venda"})

(def vie
  "Alpha-3 language code for Vietnamese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Vietnamese,
   :db/ident :lcc-639-2/vie,
   :lcc-lr/hasTag "vie",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vie",
   :skos/definition "Alpha-3 language code for Vietnamese"})

(def vol
  "Alpha-3 language code for Volapuk"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Volapuk,
   :db/ident :lcc-639-2/vol,
   :lcc-lr/hasTag "vol",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vol",
   :skos/definition "Alpha-3 language code for Volapuk"})

(def vot
  "Alpha-3 language code for Votic"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Votic,
   :db/ident :lcc-639-2/vot,
   :lcc-lr/hasTag "vot",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vot",
   :skos/definition "Alpha-3 language code for Votic"})

(def wak
  "Alpha-3 language code for Wakashan languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/WakashanLanguages,
   :db/ident :lcc-639-2/wak,
   :lcc-lr/hasTag "wak",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wak",
   :skos/definition "Alpha-3 language code for Wakashan languages"})

(def wal
  "Alpha-3 language code for Wolaitta"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Wolaitta,
   :db/ident :lcc-639-2/wal,
   :lcc-lr/hasTag "wal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wal",
   :skos/definition "Alpha-3 language code for Wolaitta"})

(def war
  "Alpha-3 language code for Waray"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Waray,
   :db/ident :lcc-639-2/war,
   :lcc-lr/hasTag "war",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "war",
   :skos/definition "Alpha-3 language code for Waray"})

(def was
  "Alpha-3 language code for Washo"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Washo,
   :db/ident :lcc-639-2/was,
   :lcc-lr/hasTag "was",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "was",
   :skos/definition "Alpha-3 language code for Washo"})

(def wel
  "Alpha-3 bibliographic language code for Welsh"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Welsh,
   :db/ident :lcc-639-2/wel,
   :lcc-lr/hasTag "wel",
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wel",
   :skos/definition "Alpha-3 bibliographic language code for Welsh"})

(def wen
  "Alpha-3 language code for Sorbian languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/SorbianLanguages,
   :db/ident :lcc-639-2/wen,
   :lcc-lr/hasTag "wen",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wen",
   :skos/definition "Alpha-3 language code for Sorbian languages"})

(def wln
  "Alpha-3 language code for Walloon"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Walloon,
   :db/ident :lcc-639-2/wln,
   :lcc-lr/hasTag "wln",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wln",
   :skos/definition "Alpha-3 language code for Walloon"})

(def wol
  "Alpha-3 language code for Wolof"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Wolof,
   :db/ident :lcc-639-2/wol,
   :lcc-lr/hasTag "wol",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wol",
   :skos/definition "Alpha-3 language code for Wolof"})

(def xal
  "Alpha-3 language code for Kalmyk; Oirat"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Kalmyk,
   :db/ident :lcc-639-2/xal,
   :lcc-lr/hasTag "xal",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "xal",
   :skos/definition "Alpha-3 language code for Kalmyk; Oirat"})

(def xho
  "Alpha-3 language code for Xhosa"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Xhosa,
   :db/ident :lcc-639-2/xho,
   :lcc-lr/hasTag "xho",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "xho",
   :skos/definition "Alpha-3 language code for Xhosa"})

(def yao_1
  "Alpha-3 language code for Yao"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Yao,
   :db/ident :lcc-639-2/yao_1,
   :lcc-lr/hasTag "yao",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yao",
   :skos/definition "Alpha-3 language code for Yao"})

(def yap
  "Alpha-3 language code for Yapese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Yapese,
   :db/ident :lcc-639-2/yap,
   :lcc-lr/hasTag "yap",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yap",
   :skos/definition "Alpha-3 language code for Yapese"})

(def yid
  "Alpha-3 language code for Yiddish"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Yiddish,
   :db/ident :lcc-639-2/yid,
   :lcc-lr/hasTag "yid",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yid",
   :skos/definition "Alpha-3 language code for Yiddish"})

(def yor
  "Alpha-3 language code for Yoruba"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Yoruba,
   :db/ident :lcc-639-2/yor,
   :lcc-lr/hasTag "yor",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yor",
   :skos/definition "Alpha-3 language code for Yoruba"})

(def ypk
  "Alpha-3 language code for Yupik languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/YupikLanguages,
   :db/ident :lcc-639-2/ypk,
   :lcc-lr/hasTag "ypk",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ypk",
   :skos/definition "Alpha-3 language code for Yupik languages"})

(def zap
  "Alpha-3 language code for Zapotec"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Zapotec,
   :db/ident :lcc-639-2/zap,
   :lcc-lr/hasTag "zap",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zap",
   :skos/definition "Alpha-3 language code for Zapotec"})

(def zbl
  "Alpha-3 language code for Bliss"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Bliss,
   :db/ident :lcc-639-2/zbl,
   :lcc-lr/hasTag "zbl",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zbl",
   :skos/definition "Alpha-3 language code for Bliss"})

(def zen
  "Alpha-3 language code for Zenaga"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Zenaga,
   :db/ident :lcc-639-2/zen,
   :lcc-lr/hasTag "zen",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zen",
   :skos/definition "Alpha-3 language code for Zenaga"})

(def zgh
  "Alpha-3 language code for Standard Moroccan Tamazight"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/StandardMoroccanTamazight,
   :db/ident :lcc-639-2/zgh,
   :lcc-lr/hasTag "zgh",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zgh",
   :skos/definition "Alpha-3 language code for Standard Moroccan Tamazight"})

(def zha
  "Alpha-3 language code for Zhuang"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Zhuang,
   :db/ident :lcc-639-2/zha,
   :lcc-lr/hasTag "zha",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zha",
   :skos/definition "Alpha-3 language code for Zhuang"})

(def zho
  "Alpha-3 terminologic language code for Chinese"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chinese,
   :db/ident :lcc-639-2/zho,
   :lcc-lr/hasTag "zho",
   :rdf/type
   [:lcc-lr/TerminologyCode :lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zho",
   :skos/definition "Alpha-3 terminologic language code for Chinese"})

(def znd
  "Alpha-3 language code for Zande languages"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/ZandeLanguages,
   :db/ident :lcc-639-2/znd,
   :lcc-lr/hasTag "znd",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "znd",
   :skos/definition "Alpha-3 language code for Zande languages"})

(def zul
  "Alpha-3 language code for Zulu"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-1/Zulu,
   :db/ident :lcc-639-2/zul,
   :lcc-lr/hasTag "zul",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zul",
   :skos/definition "Alpha-3 language code for Zulu"})

(def zun
  "Alpha-3 language code for Zuni"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Zuni,
   :db/ident :lcc-639-2/zun,
   :lcc-lr/hasTag "zun",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zun",
   :skos/definition "Alpha-3 language code for Zuni"})

(def zxx
  "Alpha-3 language code for No linguistic content"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/NoLinguisticContent,
   :db/ident :lcc-639-2/zxx,
   :lcc-lr/hasTag "zxx",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zxx",
   :skos/definition "Alpha-3 language code for No linguistic content"})

(def zza
  "Alpha-3 language code for Zaza; Dimili; Dimli; Kirdki; Kirmanjki; Zazaki"
  {:cmns-col/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :cmns-id/identifies :lcc-639-2/Zaza,
   :db/ident :lcc-639-2/zza,
   :lcc-lr/hasTag "zza",
   :rdf/type [:lcc-lr/Alpha3LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zza",
   :skos/definition
   "Alpha-3 language code for Zaza; Dimili; Dimli; Kirdki; Kirmanjki; Zazaki"})