(ns net.wikipunk.rdf.lcc-639-1
  "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-1."
  {:cmns-av/copyright ["Copyright (c) 2015-2022 Object Management Group, Inc."
                       "Copyright (c) 2015-2017 Unisys"
                       "Copyright (c) 2015-2022 Thematix Partners LLC"
                       "Copyright (c) 2015-2019 Adaptive, Inc."
                       "Copyright (c) 2019-2022 agnos.ai UK Ltd."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Languages/ISO639-1-LanguageCodes.rdf",
   :dcterms/abstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-1.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai U.K. Ltd"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references ["http://purl.org/dc/terms/"
                        "http://www.w3.org/2004/02/skos/core#"],
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/Identifiers/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20221101/Languages/ISO639-1-LanguageCodes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfa/prefix "lcc-639-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "LCC ISO 639-1 Language Codes Ontology",
   :rdfs/seeAlso ["https://id.loc.gov/vocabulary/iso639-1.html"
                  "http://www.loc.gov/standards/iso639-2/php/code_list.php/"
                  "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"]}
  (:refer-clojure :exclude [or]))

(def Abkhazian
  "Abkhazian language"
  {:db/ident :lcc-639-1/Abkhazian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Abkhazian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "abkhaze"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Abchasisch"},
   :lcc-lr/hasIndigenousName "apṕsua bysžwa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ab",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Abkhazian",
   :skos/definition "Abkhazian language"})

(def Afar
  "Afar language"
  {:db/ident :lcc-639-1/Afar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Danakil-Sprache"},
   :lcc-lr/hasIndigenousName "afar",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/aa",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Afar",
   :skos/definition "Afar language"})

(def Afrikaans
  "Afrikaans language"
  {:db/ident :lcc-639-1/Afrikaans,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afrikaans"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afrikaans"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Afrikaans"},
   :lcc-lr/hasIndigenousName "Afrikaans",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/af",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Afrikaans",
   :skos/definition "Afrikaans language"})

(def Akan
  "Akan language"
  {:db/ident :lcc-639-1/Akan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Akan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "akan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Akan-Sprache"},
   :lcc-lr/hasIndigenousName "akana",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ak",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Akan",
   :skos/definition "Akan language"})

(def Albanian
  "Albanian languages"
  {:db/ident :lcc-639-1/Albanian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Albanian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "albanais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Albanisch"},
   :lcc-lr/hasIndigenousName "shqip",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sq",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Albanian",
   :skos/definition "Albanian languages"})

(def Amharic
  "Amharic language"
  {:db/ident :lcc-639-1/Amharic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Amharic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "amharique"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Amharisch"},
   :lcc-lr/hasIndigenousName "amarinja",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/am",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Amharic",
   :skos/definition "Amharic language"})

(def Arabic
  "Arabic language"
  {:db/ident :lcc-639-1/Arabic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arabic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arabe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Arabisch"},
   :lcc-lr/hasIndigenousName "'arabiy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ar",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Arabic",
   :skos/definition "Arabic language"})

(def Aragonese
  "Aragonese language"
  {:db/ident :lcc-639-1/Aragonese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aragonese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aragonais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Aragonesisch"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/an",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Aragonese",
   :skos/definition "Aragonese language"})

(def Armenian
  "Armenian language"
  {:db/ident :lcc-639-1/Armenian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Armenian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arménien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Armenisch"},
   :lcc-lr/hasIndigenousName "hayeren lezow",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hy",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Armenian",
   :skos/definition "Armenian language"})

(def Assamese
  "Assamese language"
  {:db/ident :lcc-639-1/Assamese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Assamese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "assamais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Assamesisch"},
   :lcc-lr/hasIndigenousName "asamī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/as",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Assamese",
   :skos/definition "Assamese language"})

(def Avaric
  "Avaric language"
  {:db/ident :lcc-639-1/Avaric,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Avaric"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "avar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Awarisch"},
   :lcc-lr/hasIndigenousName "avar mac‡",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/av",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Avaric",
   :skos/definition "Avaric language"})

(def Avestan
  "Avestan language"
  {:db/ident :lcc-639-1/Avestan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Avestan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "avestique"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Avestisch"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ae",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Avestan",
   :skos/definition "Avestan language"})

(def Aymara
  "Aymara language"
  {:db/ident :lcc-639-1/Aymara,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aymara"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aymara"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Aymará-Sprache"},
   :lcc-lr/hasIndigenousName "aymara",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ay",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Aymara",
   :skos/definition "Aymara language"})

(def Azerbaijani
  "Azerbaijani language"
  {:db/ident :lcc-639-1/Azerbaijani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Azerbaijani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "azéri"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Aserbeidschanisch"},
   :lcc-lr/hasIndigenousName "azǝrbaycan dil",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/az",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Azerbaijani",
   :skos/definition "Azerbaijani language"})

(def Bambara
  "Bambara language"
  {:db/ident :lcc-639-1/Bambara,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bambara"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bambara"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bambara-Sprache"},
   :lcc-lr/hasIndigenousName "bambankan",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bm",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bambara",
   :skos/definition "Bambara language"})

(def Bashkir
  "Bashkir language"
  {:db/ident :lcc-639-1/Bashkir,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bashkir"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bachkir"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Baschkirisch"},
   :lcc-lr/hasIndigenousName "bašǩort",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ba",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bashkir",
   :skos/definition "Bashkir language"})

(def Basque
  "Basque language"
  {:db/ident :lcc-639-1/Basque,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Basque"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "basque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Baskisch"},
   :lcc-lr/hasIndigenousName ["euskera" "euskara"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/eu",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Basque",
   :skos/definition "Basque language"})

(def Belarusian
  "Belarusian language"
  {:db/ident :lcc-639-1/Belarusian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Belarusian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "biélorusse"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Weißrussisch"},
   :lcc-lr/hasIndigenousName "belaruskaâ mova",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/be",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Belarusian",
   :skos/definition "Belarusian language"})

(def Bengali
  "Bengali language"
  {:db/ident :lcc-639-1/Bengali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bengali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bengali"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bengali"},
   :lcc-lr/hasIndigenousName "bāṅlā",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bn",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bengali",
   :skos/definition "Bengali language"})

(def BihariLanguages
  {:db/ident :lcc-639-1/BihariLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bihari languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues biharis"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bihari (Andere)"},
   :lcc-lr/hasIndigenousName "bihārī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bh",
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bihari languages"})

(def Bislama
  "Bislama language"
  {:db/ident :lcc-639-1/Bislama,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bislama"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bichlamar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Beach-la-mar"},
   :lcc-lr/hasIndigenousName "bislama",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bi",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bislama",
   :skos/definition "Bislama language"})

(def Bosnian
  "Bosnian language"
  {:db/ident :lcc-639-1/Bosnian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bosnian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bosniaque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bosnisch"},
   :lcc-lr/hasIndigenousName "bosanski (jezik)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bs",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bosnian",
   :skos/definition "Bosnian language"})

(def Breton
  "Breton language"
  {:db/ident :lcc-639-1/Breton,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Breton"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "breton"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bretonisch"},
   :lcc-lr/hasIndigenousName "Brezhoneg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/br",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Breton",
   :skos/definition "Breton language"})

(def Bulgarian
  "Bulgarian language"
  {:db/ident :lcc-639-1/Bulgarian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bulgarian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bulgare"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bulgarisch"},
   :lcc-lr/hasIndigenousName "b\"lgarski ezik",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bg",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bulgarian",
   :skos/definition "Bulgarian language"})

(def Burmese
  "Burmese language"
  {:db/ident :lcc-639-1/Burmese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Burmese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "birman"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Birmanisch"},
   :lcc-lr/hasIndigenousName "myanmasa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/my",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Burmese",
   :skos/definition "Burmese language"})

(def Catalan
  "Catalan language"
  {:db/ident :lcc-639-1/Catalan,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Valencian"}
                           {:rdf/language "en",
                            :rdf/value    "Catalan"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "catalan"}
                          {:rdf/language "fr",
                           :rdf/value    "valencien"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Katalanisch"},
   :lcc-lr/hasIndigenousName "català",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ca",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Catalan",
   :skos/definition "Catalan language"})

(def CentralKhmer
  "Central Khmer language"
  {:db/ident :lcc-639-1/CentralKhmer,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Central Khmer"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khmer central"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kambodschanisch"},
   :lcc-lr/hasIndigenousName "khmêr",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/km",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Central Khmer",
   :skos/definition "Central Khmer language"})

(def Chamorro
  "Chamorro language"
  {:db/ident :lcc-639-1/Chamorro,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chamorro"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chamorro"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Chamorro-Sprache"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ch",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chamorro",
   :skos/definition "Chamorro language"})

(def Chechen
  "Chechen language"
  {:db/ident :lcc-639-1/Chechen,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chechen"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tchétchène"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tschetschenisch"},
   :lcc-lr/hasIndigenousName ["nohčijn mott" "noxçiyn mott"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ce",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chechen",
   :skos/definition "Chechen language"})

(def Chichewa
  "Chichewa language"
  {:db/ident :lcc-639-1/Chichewa,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Chichewa"}
                           {:rdf/language "en",
                            :rdf/value    "Nyanja"}
                           {:rdf/language "en",
                            :rdf/value    "Chewa"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "chichewa"}
                          {:rdf/language "fr",
                           :rdf/value    "chewa"}
                          {:rdf/language "fr",
                           :rdf/value    "nyanja"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nyanja-Sprache"},
   :lcc-lr/hasIndigenousName ["tshichewa" "tshinyanja"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ny",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chichewa",
   :skos/definition "Chichewa language"})

(def Chinese
  "Chinese languages"
  {:db/ident :lcc-639-1/Chinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chinois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Chinesisch"},
   :lcc-lr/hasIndigenousName "zhongwen",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/zh",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chinese",
   :skos/definition "Chinese languages"})

(def ChurchSlavic
  "Church Slavic language"
  {:db/ident :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Church Slavonic"}
                           {:rdf/language "en",
                            :rdf/value    "Old Slavonic"}
                           {:rdf/language "en",
                            :rdf/value    "Old Church Slavonic"}
                           {:rdf/language "en",
                            :rdf/value    "Old Bulgarian"}
                           {:rdf/language "en",
                            :rdf/value    "Church Slavic"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "vieux slave"}
                          {:rdf/language "fr",
                           :rdf/value    "vieux bulgare"}
                          {:rdf/language "fr",
                           :rdf/value    "slavon liturgique"}
                          {:rdf/language "fr",
                           :rdf/value    "slavon d'église"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kirchenslawisch"},
   :lcc-lr/hasIndigenousName "cerkovno-slavânskij",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cu",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Church Slavic",
   :skos/definition "Church Slavic language"})

(def Chuvash
  "Chuvash language"
  {:db/ident :lcc-639-1/Chuvash,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chuvash"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tchouvache"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tschuwaschisch"},
   :lcc-lr/hasIndigenousName "čǎvaš čělhi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cv",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chuvash",
   :skos/definition "Chuvash language"})

(def Cornish
  "Cornish language"
  {:db/ident :lcc-639-1/Cornish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cornish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cornique"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kornisch"},
   :lcc-lr/hasIndigenousName "Kernewek",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kw",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Cornish",
   :skos/definition "Cornish language"})

(def Corsican
  "Corsican language"
  {:db/ident :lcc-639-1/Corsican,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Corsican"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "corse"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Korsisch"},
   :lcc-lr/hasIndigenousName "corsu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/co",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Corsican",
   :skos/definition "Corsican language"})

(def Cree
  "Cree languages"
  {:db/ident :lcc-639-1/Cree,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cree"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cree"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Cree-Sprache"},
   :lcc-lr/hasIndigenousName "nêhiyawa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cr",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Cree",
   :skos/definition "Cree languages"})

(def Croatian
  "Croatian language"
  {:db/ident :lcc-639-1/Croatian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Croatian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "croate"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kroatisch"},
   :lcc-lr/hasIndigenousName "hrvatski jezik",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Croatian",
   :skos/definition "Croatian language"})

(def Czech
  "Czech language"
  {:db/ident :lcc-639-1/Czech,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Czech"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tchèque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tschechisch"},
   :lcc-lr/hasIndigenousName "český jazyk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cs",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Czech",
   :skos/definition "Czech language"})

(def Danish
  "Danish language"
  {:db/ident :lcc-639-1/Danish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Danish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "danois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Dänisch"},
   :lcc-lr/hasIndigenousName "dansk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/da",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Danish",
   :skos/definition "Danish language"})

(def Dhivehi
  "Divehi language"
  {:db/ident :lcc-639-1/Dhivehi,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Divehi"}
                           {:rdf/language "en",
                            :rdf/value    "Dhivehi"}
                           {:rdf/language "en",
                            :rdf/value    "Maldivian"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maldivien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Maledivisch"},
   :lcc-lr/hasIndigenousName "dhivehi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/dv",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Dhivehi",
   :skos/definition "Divehi language"})

(def Dutch
  "Dutch language"
  {:db/ident :lcc-639-1/Dutch,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Dutch"}
                           {:rdf/language "en",
                            :rdf/value    "Flemish"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "néerlandais"}
                          {:rdf/language "fr",
                           :rdf/value    "flamand"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Niederländisch"},
   :lcc-lr/hasIndigenousName "Nederlands",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nl",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Dutch",
   :skos/definition "Dutch language"})

(def Dzongkha
  "Dzongkha language"
  {:db/ident :lcc-639-1/Dzongkha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dzongkha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dzongkha"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Dzongkha"},
   :lcc-lr/hasIndigenousName "dzongkha",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/dz",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Dzongkha",
   :skos/definition "Dzongkha language"})

(def English
  "English language"
  {:db/ident :lcc-639-1/English,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Englisch"},
   :lcc-lr/hasIndigenousName "English",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/en",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "English",
   :skos/definition "English language"})

(def Esperanto
  "Esperanto language"
  {:db/ident :lcc-639-1/Esperanto,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Esperanto"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "espéranto"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Esperanto"},
   :lcc-lr/hasIndigenousName "esperanto",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/eo",
   :rdf/type
   [:lcc-lr/ArtificialLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Esperanto",
   :skos/definition "Esperanto language"})

(def Estonian
  "Estonian language"
  {:db/ident :lcc-639-1/Estonian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Estonian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "estonien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Estnisch"},
   :lcc-lr/hasIndigenousName "eesti keel",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/et",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Estonian",
   :skos/definition "Estonian language"})

(def Ewe
  "Ewe language"
  {:db/ident :lcc-639-1/Ewe,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ewe"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "éwé"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ewe-Sprache"},
   :lcc-lr/hasIndigenousName "eve",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ee",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ewe",
   :skos/definition "Ewe language"})

(def Faroese
  "Faroese language"
  {:db/ident :lcc-639-1/Faroese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Faroese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "féroïen"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Färöisch"},
   :lcc-lr/hasIndigenousName "føroyskt",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fo",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Faroese",
   :skos/definition "Faroese language"})

(def Fijian
  "Fijian language"
  {:db/ident :lcc-639-1/Fijian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fijian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fidjien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Fidschi-Sprache"},
   :lcc-lr/hasIndigenousName "Na Vosa Vakaviti",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fj",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Fijian",
   :skos/definition "Fijian language"})

(def Finnish
  "Finnish language"
  {:db/ident :lcc-639-1/Finnish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Finnish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "finnois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Finnisch"},
   :lcc-lr/hasIndigenousName ["suomi" "suomen kieli"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fi",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Finnish",
   :skos/definition "Finnish language"})

(def French
  "French language"
  {:db/ident :lcc-639-1/French,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Französisch"},
   :lcc-lr/hasIndigenousName "français",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "French",
   :skos/definition "French language"})

(def Fulah
  "Fulah languages"
  {:db/ident :lcc-639-1/Fulah,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fulah"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "peul"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ful"},
   :lcc-lr/hasIndigenousName "fulfulde",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ff",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Fulah",
   :skos/definition "Fulah languages"})

(def Gaelic
  "Gaelic language"
  {:db/ident :lcc-639-1/Gaelic,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Gaelic"}
                           {:rdf/language "en",
                            :rdf/value    "Scottish Gaelic"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "gaélique"}
                          {:rdf/language "fr",
                           :rdf/value    "gaélique écossais"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Gälisch-Schottisch"},
   :lcc-lr/hasIndigenousName "Gàidhlig",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gd",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Gaelic",
   :skos/definition "Gaelic language"})

(def Galician
  "Galician; Gallegan language"
  {:db/ident :lcc-639-1/Galician,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Galician"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "galicien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Galicisch"},
   :lcc-lr/hasIndigenousName "galego",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gl",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Galician",
   :skos/definition "Galician; Gallegan language"})

(def Ganda
  "Ganda language"
  {:db/ident :lcc-639-1/Ganda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ganda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ganda"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ganda-Sprache"},
   :lcc-lr/hasIndigenousName "luganda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lg",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ganda",
   :skos/definition "Ganda language"})

(def Georgian
  "Georgian language"
  {:db/ident :lcc-639-1/Georgian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Georgian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "géorgien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Georgisch"},
   :lcc-lr/hasIndigenousName "k'art'uli ena",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ka",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Georgian",
   :skos/definition "Georgian language"})

(def German
  "German language"
  {:db/ident :lcc-639-1/German,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Deutsch"},
   :lcc-lr/hasIndigenousName "Deutsch",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/de",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "German",
   :skos/definition "German language"})

(def Guarani
  "Guarani language"
  {:db/ident :lcc-639-1/Guarani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Guarani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "guarani"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Guaraní-Sprache"},
   :lcc-lr/hasIndigenousName "guarani",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gn",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Guarani",
   :skos/definition "Guarani language"})

(def Gujarati
  "Gujarati language"
  {:db/ident :lcc-639-1/Gujarati,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gujarati"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "goudjrati"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Gujarati-Sprache"},
   :lcc-lr/hasIndigenousName "gujarātī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gu",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Gujarati",
   :skos/definition "Gujarati language"})

(def Haitian
  "Haitian; Haitian Creole language"
  {:db/ident :lcc-639-1/Haitian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Haitian"}
                           {:rdf/language "en",
                            :rdf/value    "Haitian Creole"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "créole haïtien"}
                          {:rdf/language "fr",
                           :rdf/value    "haïtien"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Haïtien (Haiti-Kreolisch)"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ht",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Haitian",
   :skos/definition "Haitian; Haitian Creole language"})

(def Hausa
  "Hausa language"
  {:db/ident :lcc-639-1/Hausa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hausa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haoussa"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Haussa-Sprache"},
   :lcc-lr/hasIndigenousName "hausa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ha",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hausa",
   :skos/definition "Hausa language"})

(def Hebrew
  "Hebrew language"
  {:db/ident :lcc-639-1/Hebrew,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hebrew"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hébreu"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Hebräisch"},
   :lcc-lr/hasIndigenousName "ivrit",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/he",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hebrew",
   :skos/definition "Hebrew language"})

(def Herero
  "Herero language"
  {:db/ident :lcc-639-1/Herero,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Herero"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "herero"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Herero-Sprache"},
   :lcc-lr/hasIndigenousName "otshiherero",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hz",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Herero",
   :skos/definition "Herero language"})

(def Hindi
  "Hindi language"
  {:db/ident :lcc-639-1/Hindi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hindi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hindi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Hindi"},
   :lcc-lr/hasIndigenousName "hindī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hi",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hindi",
   :skos/definition "Hindi language"})

(def HiriMotu
  "Hiri Motu language"
  {:db/ident :lcc-639-1/HiriMotu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hiri Motu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hiri motu"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Hiri-Motu"},
   :lcc-lr/hasIndigenousName "Hiri Motu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ho",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hiri Motu",
   :skos/definition "Hiri Motu language"})

(def Hungarian
  "Hungarian language"
  {:db/ident :lcc-639-1/Hungarian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hungarian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hongrois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ungarisch"},
   :lcc-lr/hasIndigenousName "magyar nyelv",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hu",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hungarian",
   :skos/definition "Hungarian language"})

(def ISO639-1-CodeSet
  "the set of language identifiers that make up the ISO 639-1 specification"
  {:db/ident :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ISO 639-1 code set",
   :rdfs/seeAlso
   ["https://id.loc.gov/vocabulary/iso639-1.html"
    "http://www.infoterm.info/standardization/iso_639_1_2002.php"],
   :skos/definition
   "the set of language identifiers that make up the ISO 639-1 specification"})

(def Icelandic
  "Icelandic language"
  {:db/ident :lcc-639-1/Icelandic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Icelandic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "islandais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Isländisch"},
   :lcc-lr/hasIndigenousName "íslenska",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/is",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Icelandic",
   :skos/definition "Icelandic language"})

(def Ido
  "Ido language"
  {:db/ident :lcc-639-1/Ido,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ido"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ido"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ido"},
   :lcc-lr/hasIndigenousName "ido",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/io",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ido",
   :skos/definition "Ido language"})

(def Igbo
  "Igbo language"
  {:db/ident :lcc-639-1/Igbo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Igbo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "igbo"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ibo-Sprache"},
   :lcc-lr/hasIndigenousName "igbo",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ig",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Igbo",
   :skos/definition "Igbo language"})

(def Indonesian
  "Indonesian language"
  {:db/ident :lcc-639-1/Indonesian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indonesian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indonésien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bahasa Indonesia"},
   :lcc-lr/hasIndigenousName "bahasa Indonesia",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/id",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Indonesian",
   :skos/definition "Indonesian language"})

(def Interlingua
  "Interlingua (International Auxiliary Language Association) language"
  {:db/ident :lcc-639-1/Interlingua,
   :lcc-lr/hasEnglishName
   {:rdf/language "en",
    :rdf/value    "Interlingua (International Auxiliary Language Association)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "interlingua (langue auxiliaire internationale)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Interlingua"},
   :lcc-lr/hasIndigenousName "interlingua",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ia",
   :rdf/type
   [:lcc-lr/ArtificialLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Interlingua",
   :skos/definition
   "Interlingua (International Auxiliary Language Association) language"})

(def Interlingue
  "Interlingue language"
  {:db/ident :lcc-639-1/Interlingue,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Occidental"}
                           {:rdf/language "en",
                            :rdf/value    "Interlingue"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "interlingue"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Interlingue"},
   :lcc-lr/hasIndigenousName "interlingue",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ie",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/ArtificialLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Interlingue",
   :skos/definition "Interlingue language"})

(def Inuktitut
  "Inuktitut language"
  {:db/ident :lcc-639-1/Inuktitut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inuktitut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "inuktitut"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Inuktitut"},
   :lcc-lr/hasIndigenousName "inuktitut",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/iu",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Inuktitut",
   :skos/definition "Inuktitut language"})

(def Inupiaq
  "Inupiaq language"
  {:db/ident :lcc-639-1/Inupiaq,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inupiaq"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "inupiaq"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Inupik"},
   :lcc-lr/hasIndigenousName "inupiaq",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ik",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Inupiaq",
   :skos/definition "Inupiaq language"})

(def Irish
  "Irish language"
  {:db/ident :lcc-639-1/Irish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Irisch"},
   :lcc-lr/hasIndigenousName "Gaeilge",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ga",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Irish",
   :skos/definition "Irish language"})

(def Italian
  "Italian language"
  {:db/ident :lcc-639-1/Italian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Italian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "italien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Italienisch"},
   :lcc-lr/hasIndigenousName "italiano",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/it",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Italian",
   :skos/definition "Italian language"})

(def Japanese
  "Japanese language"
  {:db/ident :lcc-639-1/Japanese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Japanese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "japonais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Japanisch"},
   :lcc-lr/hasIndigenousName ["nippongo" "nihongo"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ja",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Japanese",
   :skos/definition "Japanese language"})

(def Javanese
  "Javanese language"
  {:db/ident :lcc-639-1/Javanese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Javanese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "javanais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Javanisch"},
   :lcc-lr/hasIndigenousName "bahasa Jawa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/jv",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Javanese",
   :skos/definition "Javanese language"})

(def Kalaallisut
  "Kalaallisut language"
  {:db/ident :lcc-639-1/Kalaallisut,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Greenlandic"}
                           {:rdf/language "en",
                            :rdf/value    "Kalaallisut"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "groenlandais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Grönländisch"},
   :lcc-lr/hasIndigenousName "kalaallisut",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kl",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kalaallisut",
   :skos/definition "Kalaallisut language"})

(def Kannada
  "Kannada language"
  {:db/ident :lcc-639-1/Kannada,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kannada"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kannada"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kannada"},
   :lcc-lr/hasIndigenousName "kannaḍa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kn",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kannada",
   :skos/definition "Kannada language"})

(def Kanuri
  "Kanuri language"
  {:db/ident :lcc-639-1/Kanuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kanuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kanouri"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kanuri-Sprache"},
   :lcc-lr/hasIndigenousName "kanuri",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kr",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Macrolanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kanuri",
   :skos/definition "Kanuri language"})

(def Kashmiri
  "Kashmiri language"
  {:db/ident :lcc-639-1/Kashmiri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kashmiri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kashmiri"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kaschmiri"},
   :lcc-lr/hasIndigenousName "kaśmīrī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ks",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kashmiri",
   :skos/definition "Kashmiri language"})

(def Kazakh
  "Kazakh language"
  {:db/ident :lcc-639-1/Kazakh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kazakh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kazakh"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kasachisch"},
   :lcc-lr/hasIndigenousName "ķazaķ (tili)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kazakh",
   :skos/definition "Kazakh language"})

(def Kikuyu
  "Kikuyu language"
  {:db/ident :lcc-639-1/Kikuyu,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kikuyu"}
                           {:rdf/language "en",
                            :rdf/value    "Gikuyu"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kikuyu"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kikuyu-Sprache"},
   :lcc-lr/hasIndigenousName "Gikuyu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ki",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kikuyu",
   :skos/definition "Kikuyu language"})

(def Kinyarwanda
  "Kinyarwanda language"
  {:db/ident :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kinyarwanda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kinyarwanda"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rwanda-Sprache"},
   :lcc-lr/hasIndigenousName "kinyarwanda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/rw",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kinyarwanda",
   :skos/definition "Kinyarwanda language"})

(def Kirghiz
  "Kirghiz language"
  {:db/ident :lcc-639-1/Kirghiz,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kyrgyz"}
                           {:rdf/language "en",
                            :rdf/value    "Kirghiz"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kirghiz"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kirgisisch"},
   :lcc-lr/hasIndigenousName "kyrgyz tili",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ky",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kirghiz",
   :skos/definition "Kirghiz language"})

(def Komi
  "Komi language"
  {:db/ident :lcc-639-1/Komi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Komi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "komi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Komi-Sprache"},
   :lcc-lr/hasIndigenousName "komi kyv",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kv",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Komi",
   :skos/definition "Komi language"})

(def Kongo
  "Kongo languages"
  {:db/ident :lcc-639-1/Kongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kongo"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kongo-Sprache"},
   :lcc-lr/hasIndigenousName "kikongo",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kg",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kongo",
   :skos/definition "Kongo languages"})

(def Korean
  "Korean language"
  {:db/ident :lcc-639-1/Korean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Korean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "coréen"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Koreanisch"},
   :lcc-lr/hasIndigenousName ["hanguk-o" "choson-o"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ko",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Korean",
   :skos/definition "Korean language"})

(def Kuanyama
  "Kuanyama language"
  {:db/ident :lcc-639-1/Kuanyama,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kuanyama"}
                           {:rdf/language "en",
                            :rdf/value    "Kwanyama"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kwanyama"}
                          {:rdf/language "fr",
                           :rdf/value    "kuanyama"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kwanyama-Sprache"},
   :lcc-lr/hasIndigenousName "oshikwanyama",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kj",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kuanyama",
   :skos/definition "Kuanyama language"})

(def Kurdish
  "Kurdish language"
  {:db/ident :lcc-639-1/Kurdish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kurdish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kurde"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kurdisch"},
   :lcc-lr/hasIndigenousName "zimany kurdy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ku",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kurdish",
   :skos/definition "Kurdish language"})

(def Lao
  "Lao language"
  {:db/ident :lcc-639-1/Lao,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lao"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lao"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Laotisch"},
   :lcc-lr/hasIndigenousName "pha xa lao",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lo",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Lao",
   :skos/definition "Lao language"})

(def Latin
  "Latin language"
  {:db/ident :lcc-639-1/Latin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Latin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "latin"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Latein"},
   :lcc-lr/hasIndigenousName "lingua latina",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/la",
   :rdf/type
   [:lcc-lr/AncientLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Latin",
   :skos/definition "Latin language"})

(def Latvian
  "Latvian language"
  {:db/ident :lcc-639-1/Latvian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Latvian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "letton"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Lettisch"},
   :lcc-lr/hasIndigenousName "latviešu valoda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lv",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Latvian",
   :skos/definition "Latvian language"})

(def Limburgan
  "Limburgan; Limburger; Limburgish language"
  {:db/ident :lcc-639-1/Limburgan,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Limburgish"}
                           {:rdf/language "en",
                            :rdf/value    "Limburgan"}
                           {:rdf/language "en",
                            :rdf/value    "Limburger"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "limbourgeois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Limburgisch"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/li",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Limburgan",
   :skos/definition "Limburgan; Limburger; Limburgish language"})

(def Lingala
  "Lingala language"
  {:db/ident :lcc-639-1/Lingala,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lingala"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lingala"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Lingala"},
   :lcc-lr/hasIndigenousName "lingala",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ln",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Lingala",
   :skos/definition "Lingala language"})

(def Lithuanian
  "Lithuanian language"
  {:db/ident :lcc-639-1/Lithuanian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lithuanian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lituanien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Litauisch"},
   :lcc-lr/hasIndigenousName "lietuvių kalba",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lt",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Lithuanian",
   :skos/definition "Lithuanian language"})

(def LubaKatanga
  "Luba-Katanga language"
  {:db/ident :lcc-639-1/LubaKatanga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luba-Katanga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luba-katanga"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Luba-Katanga-Sprache"},
   :lcc-lr/hasIndigenousName "tshiluba",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lu",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Luba-Katanga",
   :skos/definition "Luba-Katanga language"})

(def Luxembourgish
  "Luxembourgish language"
  {:db/ident :lcc-639-1/Luxembourgish,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Luxembourgish"}
                           {:rdf/language "en",
                            :rdf/value    "Letzeburgesch"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luxembourgeois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Luxemburgisch"},
   :lcc-lr/hasIndigenousName "lëtzebuergesch",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lb",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Luxembourgish",
   :skos/definition "Luxembourgish language"})

(def Macedonian
  "Macedonian language"
  {:db/ident :lcc-639-1/Macedonian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Macedonian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "macédonien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Makedonisch"},
   :lcc-lr/hasIndigenousName "makedonski",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Macedonian",
   :skos/definition "Macedonian language"})

(def Malagasy
  "Malagasy languages"
  {:db/ident :lcc-639-1/Malagasy,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Malagasy"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "malgache"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Malagassi-Sprache"},
   :lcc-lr/hasIndigenousName "malagasy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mg",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Malagasy",
   :skos/definition "Malagasy languages"})

(def Malay
  "Malay macrolanguage"
  {:db/ident :lcc-639-1/Malay,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Malay (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "malais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Malaiisch"},
   :lcc-lr/hasIndigenousName "bahasa Malaysia",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ms",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Malay",
   :skos/definition "Malay macrolanguage"})

(def Malayalam
  "Malayalam language"
  {:db/ident :lcc-639-1/Malayalam,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Malayalam"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "malayalam"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Malayalam"},
   :lcc-lr/hasIndigenousName "malayāḷaṁ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ml",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Malayalam",
   :skos/definition "Malayalam language"})

(def Maltese
  "Maltese language"
  {:db/ident :lcc-639-1/Maltese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maltese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maltais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Maltesisch"},
   :lcc-lr/hasIndigenousName "il-Malti",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mt",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Maltese",
   :skos/definition "Maltese language"})

(def Manx
  "Manx language"
  {:db/ident :lcc-639-1/Manx,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manx"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "manx"}
                          {:rdf/language "fr",
                           :rdf/value    "mannois"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Manx"},
   :lcc-lr/hasIndigenousName "Gaelg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gv",
   :rdf/type
   [:lcc-lr/ExtinctLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Manx",
   :skos/definition "Manx language"})

(def Maori
  "Maori language"
  {:db/ident :lcc-639-1/Maori,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maori"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maori"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Maori-Sprache"},
   :lcc-lr/hasIndigenousName "māori",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mi",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Maori",
   :skos/definition "Maori language"})

(def Marathi
  "Marathi language"
  {:db/ident :lcc-639-1/Marathi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marathi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marathe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Marathi"},
   :lcc-lr/hasIndigenousName "marāṭī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Marathi",
   :skos/definition "Marathi language"})

(def Marshallese
  "Marshallese language"
  {:db/ident :lcc-639-1/Marshallese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marshallese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marshall"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Marschallesisch"},
   :lcc-lr/hasIndigenousName "M̧ajeł",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mh",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Marshallese",
   :skos/definition "Marshallese language"})

(def ModernGreek
  "Modern Greek (post 1453-) language"
  {:db/ident :lcc-639-1/ModernGreek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Greek, Modern (1453-)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grec moderne (après 1453)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Neugriechisch"},
   :lcc-lr/hasIndigenousName "elliniká",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/el",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Modern Greek",
   :skos/definition "Modern Greek (post 1453-) language"})

(def Mongolian
  "Mongolian languages"
  {:db/ident :lcc-639-1/Mongolian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mongolian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mongol"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Mongolisch"},
   :lcc-lr/hasIndigenousName "mongol",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mn",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Mongolian",
   :skos/definition "Mongolian languages"})

(def Nauru
  "Nauru language"
  {:db/ident :lcc-639-1/Nauru,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nauru"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nauruan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nauruanisch"},
   :lcc-lr/hasIndigenousName "nauru",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/na",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Nauru",
   :skos/definition "Nauru language"})

(def Navajo
  "Navajo language"
  {:db/ident :lcc-639-1/Navajo,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Navaho"}
                           {:rdf/language "en",
                            :rdf/value    "Navajo"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "navaho"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Navajo-Sprache"},
   :lcc-lr/hasIndigenousName "diné bizaad",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nv",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Navajo",
   :skos/definition "Navajo language"})

(def Ndonga
  "Ndonga language"
  {:db/ident :lcc-639-1/Ndonga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ndonga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ndonga"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ndonga"},
   :lcc-lr/hasIndigenousName "oshindonga",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ng",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ndonga",
   :skos/definition "Ndonga language"})

(def Nepali
  "Nepali language"
  {:db/ident :lcc-639-1/Nepali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nepali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "népalais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nepali"},
   :lcc-lr/hasIndigenousName "nepālī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ne",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Nepali",
   :skos/definition "Nepali language"})

(def NorthNdebele
  "North Ndebele language"
  {:db/ident :lcc-639-1/NorthNdebele,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "North Ndebele"}
                           {:rdf/language "en",
                            :rdf/value    "Ndebele, North"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ndébélé du Nord"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ndebele-Sprache (Simbabwe)"},
   :lcc-lr/hasIndigenousName "isiNdebele",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nd",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "North Ndebele",
   :skos/definition "North Ndebele language"})

(def NorthernSami
  "Northern Sami language"
  {:db/ident :lcc-639-1/NorthernSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Northern Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami du Nord"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nordsaamisch"},
   :lcc-lr/hasIndigenousName "davvisámegiella",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/se",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Northern Sami",
   :skos/definition "Northern Sami language"})

(def Norwegian
  "Norwegian language"
  {:db/ident :lcc-639-1/Norwegian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Norwegian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norvégien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Norwegisch"},
   :lcc-lr/hasIndigenousName "norsk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/no",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Norwegian",
   :skos/definition "Norwegian language"})

(def NorwegianBokmal
  "Norwegian Bokmal language"
  {:db/ident :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Bokmål, Norwegian"}
                           {:rdf/language "en",
                            :rdf/value    "Norwegian Bokmål"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norvégien bokmål"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bokmål"},
   :lcc-lr/hasIndigenousName "bokmål",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nb",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Norwegian Bokmal",
   :skos/definition "Norwegian Bokmal language"})

(def NorwegianNynorsk
  "Norwegian Nynorsk language"
  {:db/ident :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Nynorsk, Norwegian"}
                           {:rdf/language "en",
                            :rdf/value    "Norwegian Nynorsk"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norvégien nynorsk"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nynorsk"},
   :lcc-lr/hasIndigenousName "nynorsk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nn",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Norwegian Nynorsk",
   :skos/definition "Norwegian Nynorsk language"})

(def Occitan
  "Occitan (post 1500) language"
  {:db/ident :lcc-639-1/Occitan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Occitan (post 1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "occitan (après 1500)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Okzitanisch"},
   :lcc-lr/hasIndigenousName "occitan",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/oc",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Occitan",
   :skos/definition "Occitan (post 1500) language"})

(def Ojibwa
  "Ojibwa languages"
  {:db/ident :lcc-639-1/Ojibwa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ojibwa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ojibwa"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ojibwa-Sprache"},
   :lcc-lr/hasIndigenousName ["ojibwe" "chippewa"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/oj",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ojibwa",
   :skos/definition "Ojibwa languages"})

(def Oriya
  "Oriya language"
  {:db/ident :lcc-639-1/Oriya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Oriya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "oriya"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Oriya-Sprache"},
   :lcc-lr/hasIndigenousName "oṛiā",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/or",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Oriya",
   :skos/definition "Oriya language"})

(def Oromo
  "Oromo languages"
  {:db/ident :lcc-639-1/Oromo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Oromo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "galla"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Galla-Sprache"},
   :lcc-lr/hasIndigenousName "(afan) oromo",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/om",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Oromo",
   :skos/definition "Oromo languages"})

(def Ossetian
  "Ossetian; Ossetic language"
  {:db/ident :lcc-639-1/Ossetian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Ossetian"}
                           {:rdf/language "en",
                            :rdf/value    "Ossetic"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ossète"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ossetisch"},
   :lcc-lr/hasIndigenousName "iron avzæg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/os",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ossetian",
   :skos/definition "Ossetian; Ossetic language"})

(def Pali
  "Pali language"
  {:db/ident :lcc-639-1/Pali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pali"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Pali"},
   :lcc-lr/hasIndigenousName "pāli bhāsa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pi",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Pali",
   :skos/definition "Pali language"})

(def Panjabi
  "Panjabi language"
  {:db/ident :lcc-639-1/Panjabi,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Panjabi"}
                           {:rdf/language "en",
                            :rdf/value    "Punjabi"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pendjabi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Pandschabi-Sprache"},
   :lcc-lr/hasIndigenousName "paṁjābī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pa",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Panjabi",
   :skos/definition "Panjabi language"})

(def Persian
  "Persian languages"
  {:db/ident :lcc-639-1/Persian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Persian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "persan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Persisch"},
   :lcc-lr/hasIndigenousName "fârsy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fa",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Persian",
   :skos/definition "Persian languages"})

(def Polish
  "Polish language"
  {:db/ident :lcc-639-1/Polish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Polish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "polonais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Polnisch"},
   :lcc-lr/hasIndigenousName "(język) polski",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pl",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Polish",
   :skos/definition "Polish language"})

(def Portuguese
  "Portuguese language"
  {:db/ident :lcc-639-1/Portuguese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Portuguese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "portugais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Portugiesisch"},
   :lcc-lr/hasIndigenousName "português",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pt",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Portuguese",
   :skos/definition "Portuguese language"})

(def Pushto
  "Pushto languages"
  {:db/ident :lcc-639-1/Pushto,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Pushto"}
                           {:rdf/language "en",
                            :rdf/value    "Pashto"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pachto"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Paschtu"},
   :lcc-lr/hasIndigenousName "pashto",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ps",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Pushto",
   :skos/definition "Pushto languages"})

(def Quechua
  "Quechua languages"
  {:db/ident :lcc-639-1/Quechua,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Quechua"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "quechua"}
                          {:rdf/language "fr",
                           :rdf/value    "quichua"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Quechua-Sprache"},
   :lcc-lr/hasIndigenousName "qhëtshwa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/qu",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Quechua",
   :skos/definition "Quechua languages"})

(def Romanian
  "Romanian language"
  {:db/ident :lcc-639-1/Romanian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Moldovan"}
                           {:rdf/language "en",
                            :rdf/value    "Romanian"}
                           {:rdf/language "en",
                            :rdf/value    "Moldavian"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "roumain"}
                          {:rdf/language "fr",
                           :rdf/value    "moldave"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rumänisch"},
   :lcc-lr/hasIndigenousName ["(limba) moldoveanǎ" "(limba) română"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ro",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Romanian",
   :skos/definition "Romanian language"})

(def Romansh
  "Romansh language"
  {:db/ident :lcc-639-1/Romansh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romansh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "romanche"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rätoromanisch"},
   :lcc-lr/hasIndigenousName "romontsch",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/rm",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Romansh",
   :skos/definition "Romansh language"})

(def Rundi
  "Rundi language"
  {:db/ident :lcc-639-1/Rundi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rundi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rundi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rundi-Sprache"},
   :lcc-lr/hasIndigenousName "kirundi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/rn",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Rundi",
   :skos/definition "Rundi language"})

(def Russian
  "Russian language"
  {:db/ident :lcc-639-1/Russian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Russian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "russe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Russisch"},
   :lcc-lr/hasIndigenousName "russkij (âzyk)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ru",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Russian",
   :skos/definition "Russian language"})

(def Samoan
  "Samoan language"
  {:db/ident :lcc-639-1/Samoan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Samoan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "samoan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Samoanisch"},
   :lcc-lr/hasIndigenousName "samoa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sm",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Samoan",
   :skos/definition "Samoan language"})

(def Sango
  "Sango language"
  {:db/ident :lcc-639-1/Sango,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sango"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sango"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sango-Sprache"},
   :lcc-lr/hasIndigenousName "sango",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sg",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sango",
   :skos/definition "Sango language"})

(def Sanskrit
  "Sanskrit language"
  {:db/ident :lcc-639-1/Sanskrit,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sanskrit"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sanskrit"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sanskrit"},
   :lcc-lr/hasIndigenousName "saṁskr̥tam",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sa",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sanskrit",
   :skos/definition "Sanskrit language"})

(def Sardinian
  "Sardinian languages"
  {:db/ident :lcc-639-1/Sardinian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sardinian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sarde"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sardisch"},
   :lcc-lr/hasIndigenousName "sardu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sc",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Macrolanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sardinian",
   :skos/definition "Sardinian languages"})

(def Serbian
  "Serbian language"
  {:db/ident :lcc-639-1/Serbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Serbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "serbe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Serbisch"},
   :lcc-lr/hasIndigenousName "srpski (jezik)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sr",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Serbian",
   :skos/definition "Serbian language"})

(def Shona
  "Shona language"
  {:db/ident :lcc-639-1/Shona,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shona"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "shona"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Schona-Sprache"},
   :lcc-lr/hasIndigenousName "chiShona",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sn",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Shona",
   :skos/definition "Shona language"})

(def SichuanYi
  "Sichuan Yi language"
  {:db/ident :lcc-639-1/SichuanYi,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Nuosu"}
                           {:rdf/language "en",
                            :rdf/value    "Sichuan Yi"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yi de Sichuan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Lalo-Sprache"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ii",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sichuan Yi",
   :skos/definition "Sichuan Yi language"})

(def Sindhi
  "Sindhi language"
  {:db/ident :lcc-639-1/Sindhi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sindhi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sindhi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sindhi-Sprache"},
   :lcc-lr/hasIndigenousName "sindhī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sd",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sindhi",
   :skos/definition "Sindhi language"})

(def Sinhala
  "Sinhala; Sinhalese language"
  {:db/ident :lcc-639-1/Sinhala,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Sinhalese"}
                           {:rdf/language "en",
                            :rdf/value    "Sinhala"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "singhalais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Singhalesisch"},
   :lcc-lr/hasIndigenousName "siṁhala",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/si",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sinhala",
   :skos/definition "Sinhala; Sinhalese language"})

(def Slovak
  "Slovak language"
  {:db/ident :lcc-639-1/Slovak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slovak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slovaque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Slowakisch"},
   :lcc-lr/hasIndigenousName "slovenský (jazyk)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Slovak",
   :skos/definition "Slovak language"})

(def Slovenian
  "Slovenian language"
  {:db/ident :lcc-639-1/Slovenian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slovenian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slovène"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Slowenisch"},
   :lcc-lr/hasIndigenousName "slovenski (jezik)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sl",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Slovenian",
   :skos/definition "Slovenian language"})

(def Somali
  "Somali language"
  {:db/ident :lcc-639-1/Somali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Somali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "somali"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Somali"},
   :lcc-lr/hasIndigenousName "soomaali",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/so",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Somali",
   :skos/definition "Somali language"})

(def SouthNdebele
  "South Ndebele language"
  {:db/ident :lcc-639-1/SouthNdebele,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Ndebele, South"}
                           {:rdf/language "en",
                            :rdf/value    "South Ndebele"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ndébélé du Sud"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ndebele-Sprache (Transvaal)"},
   :lcc-lr/hasIndigenousName "isiNdebele",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "South Ndebele",
   :skos/definition "South Ndebele language"})

(def SouthernSotho
  "Southern Sotho language"
  {:db/ident :lcc-639-1/SouthernSotho,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Southern Sotho"}
                           {:rdf/language "en",
                            :rdf/value    "Sotho, Southern"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sotho du Sud"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Süd-Sotho-Sprache"},
   :lcc-lr/hasIndigenousName "Sesotho",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/st",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Southern Sotho",
   :skos/definition "Southern Sotho language"})

(def Spanish
  "Spanish language"
  {:db/ident :lcc-639-1/Spanish,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Spanish"}
                           {:rdf/language "en",
                            :rdf/value    "Castilian"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "castillan"}
                          {:rdf/language "fr",
                           :rdf/value    "espagnol"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Spanisch"},
   :lcc-lr/hasIndigenousName ["castellano" "español"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/es",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Spanish",
   :skos/definition "Spanish language"})

(def Sundanese
  "Sundanese languaage"
  {:db/ident :lcc-639-1/Sundanese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sundanese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soundanais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sundanesisch"},
   :lcc-lr/hasIndigenousName "bahasa Sunda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/su",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sundanese",
   :skos/definition "Sundanese languaage"})

(def Swahili
  "Swahili macrolanguage"
  {:db/ident :lcc-639-1/Swahili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Swahili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "swahili"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Swahili"},
   :lcc-lr/hasIndigenousName "Kiswahili",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sw",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Swahili",
   :skos/definition "Swahili macrolanguage"})

(def Swati
  "Swati language"
  {:db/ident :lcc-639-1/Swati,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Swati"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "swati"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Swasi-Sprache"},
   :lcc-lr/hasIndigenousName "siSwati",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ss",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Swati",
   :skos/definition "Swati language"})

(def Swedish
  "Swedish language"
  {:db/ident :lcc-639-1/Swedish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Swedish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "suédois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Schwedisch"},
   :lcc-lr/hasIndigenousName "svenska",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sv",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Swedish",
   :skos/definition "Swedish language"})

(def Tagalog
  "Tagalog language"
  {:db/ident :lcc-639-1/Tagalog,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tagalog"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tagalog"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tagalog"},
   :lcc-lr/hasIndigenousName "tagalog",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tl",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tagalog",
   :skos/definition "Tagalog language"})

(def Tahitian
  "Tahitian language"
  {:db/ident :lcc-639-1/Tahitian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tahitian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tahitien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tahitisch"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ty",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tahitian",
   :skos/definition "Tahitian language"})

(def Tajik
  "Tajik language"
  {:db/ident :lcc-639-1/Tajik,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tajik"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tadjik"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tadschikisch"},
   :lcc-lr/hasIndigenousName "toçikī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tg",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tajik",
   :skos/definition "Tajik language"})

(def Tamil
  "Tamil language"
  {:db/ident :lcc-639-1/Tamil,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tamil"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tamoul"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tamil"},
   :lcc-lr/hasIndigenousName "tamiḻ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ta",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tamil",
   :skos/definition "Tamil language"})

(def Tatar
  "Tatar language"
  {:db/ident :lcc-639-1/Tatar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tatar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tatar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tatarisch"},
   :lcc-lr/hasIndigenousName "tatar tele",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tt",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tatar",
   :skos/definition "Tatar language"})

(def Telugu
  "Telugu language"
  {:db/ident :lcc-639-1/Telugu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Telugu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "télougou"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Telugu-Sprache"},
   :lcc-lr/hasIndigenousName "telugu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/te",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Telugu",
   :skos/definition "Telugu language"})

(def Thai
  "Thai language"
  {:db/ident :lcc-639-1/Thai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Thai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "thaï"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Thailändisch"},
   :lcc-lr/hasIndigenousName "thai",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/th",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Thai",
   :skos/definition "Thai language"})

(def Tibetan
  "Tibetan language"
  {:db/ident :lcc-639-1/Tibetan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tibetan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tibétain"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tibetisch"},
   :lcc-lr/hasIndigenousName "bod skad",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bo",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tibetan",
   :skos/definition "Tibetan language"})

(def Tigrinya
  "Tigrinya language"
  {:db/ident :lcc-639-1/Tigrinya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tigrinya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tigrigna"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tigrinja-Sprache"},
   :lcc-lr/hasIndigenousName "tigriña",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ti",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tigrinya",
   :skos/definition "Tigrinya language"})

(def Tonga-TongaIslands
  "Tonga (Tonga Islands) language"
  {:db/ident :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tonga (Tonga Islands)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tonga (îles Tonga)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tongaisch"},
   :lcc-lr/hasIndigenousName "tonga",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/to",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tonga (Tonga Islands)",
   :skos/definition "Tonga (Tonga Islands) language"})

(def Tsonga
  "Tsonga language"
  {:db/ident :lcc-639-1/Tsonga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tsonga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsonga"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tsonga-Sprache"},
   :lcc-lr/hasIndigenousName "Xitsonga",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ts",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tsonga",
   :skos/definition "Tsonga language"})

(def Tswana
  "Tswana language"
  {:db/ident :lcc-639-1/Tswana,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tswana"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tswana"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tswana-Sprache"},
   :lcc-lr/hasIndigenousName "Setswana",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tn",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tswana",
   :skos/definition "Tswana language"})

(def Turkish
  "Turkish language"
  {:db/ident :lcc-639-1/Turkish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turc"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Türkisch"},
   :lcc-lr/hasIndigenousName "türkçe",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Turkish",
   :skos/definition "Turkish language"})

(def Turkmen
  "Turkmen language"
  {:db/ident :lcc-639-1/Turkmen,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkmen"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turkmène"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Turkmenisch"},
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tk",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Turkmen",
   :skos/definition "Turkmen language"})

(def Twi
  "Twi language"
  {:db/ident :lcc-639-1/Twi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Twi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "twi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Twi-Sprache"},
   :lcc-lr/hasIndigenousName "twi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tw",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Twi",
   :skos/definition "Twi language"})

(def Uighur
  "Uighur language"
  {:db/ident :lcc-639-1/Uighur,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Uighur"}
                           {:rdf/language "en",
                            :rdf/value    "Uyghur"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ouïgour"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Uigurisch"},
   :lcc-lr/hasIndigenousName "oyghurqǝ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ug",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Uighur",
   :skos/definition "Uighur language"})

(def Ukrainian
  "Ukrainian language"
  {:db/ident :lcc-639-1/Ukrainian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ukrainian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ukrainien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ukrainisch"},
   :lcc-lr/hasIndigenousName "ukraïns'ka mova",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/uk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ukrainian",
   :skos/definition "Ukrainian language"})

(def Urdu
  "Urdu language"
  {:db/ident :lcc-639-1/Urdu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Urdu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ourdou"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Urdu"},
   :lcc-lr/hasIndigenousName "urdū",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ur",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Urdu",
   :skos/definition "Urdu language"})

(def Uzbek
  "Uzbek languages"
  {:db/ident :lcc-639-1/Uzbek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Uzbek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ouszbek"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Usbekisch"},
   :lcc-lr/hasIndigenousName "oʻzbek tili",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/uz",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Uzbek",
   :skos/definition "Uzbek languages"})

(def Venda
  "Venda language"
  {:db/ident :lcc-639-1/Venda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Venda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "venda"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Venda-Sprache"},
   :lcc-lr/hasIndigenousName "Tshivenḓa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ve",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Venda",
   :skos/definition "Venda language"})

(def Vietnamese
  "Vietnamese language"
  {:db/ident :lcc-639-1/Vietnamese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Vietnamese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vietnamien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Vietnamesisch"},
   :lcc-lr/hasIndigenousName "Tiếng Việt Nam",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/vi",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Vietnamese",
   :skos/definition "Vietnamese language"})

(def Volapuk
  "Volapuk language"
  {:db/ident :lcc-639-1/Volapuk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Volapük"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "volapük"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Volapük"},
   :lcc-lr/hasIndigenousName "volapük",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/vo",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Volapuk",
   :skos/definition "Volapuk language"})

(def Walloon
  "Walloon language"
  {:db/ident :lcc-639-1/Walloon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Walloon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wallon"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Wallonisch"},
   :lcc-lr/hasIndigenousName "wallon",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/wa",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Walloon",
   :skos/definition "Walloon language"})

(def Welsh
  "Welsh language"
  {:db/ident :lcc-639-1/Welsh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Welsh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gallois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kymrisch"},
   :lcc-lr/hasIndigenousName "Cymraeg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cy",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Welsh",
   :skos/definition "Welsh language"})

(def WesternFrisian
  "Western Frisian language"
  {:db/ident :lcc-639-1/WesternFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Western Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison occidental"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Friesisch"},
   :lcc-lr/hasIndigenousName "frysk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fy",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Western Frisian",
   :skos/definition "Western Frisian language"})

(def Wolof
  "Wolof language"
  {:db/ident :lcc-639-1/Wolof,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Wolof"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wolof"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Wolof-Sprache"},
   :lcc-lr/hasIndigenousName "wolof",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/wo",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Wolof",
   :skos/definition "Wolof language"})

(def Xhosa
  "Xhosa language"
  {:db/ident :lcc-639-1/Xhosa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Xhosa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "xhosa"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Xhosa-Sprache"},
   :lcc-lr/hasIndigenousName "isiXhosa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/xh",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Xhosa",
   :skos/definition "Xhosa language"})

(def Yiddish
  "Yiddish language"
  {:db/ident :lcc-639-1/Yiddish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yiddish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yiddish"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Jiddisch"},
   :lcc-lr/hasIndigenousName "yidiš",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/yi",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Macrolanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Yiddish",
   :skos/definition "Yiddish language"})

(def Yoruba
  "Yoruba language"
  {:db/ident :lcc-639-1/Yoruba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yoruba"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yoruba"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Yoruba-Sprache"},
   :lcc-lr/hasIndigenousName "Yorùbá",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/yo",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Yoruba",
   :skos/definition "Yoruba language"})

(def Zhuang
  "Zhuang languages"
  {:db/ident :lcc-639-1/Zhuang,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Zhuang"}
                           {:rdf/language "en",
                            :rdf/value    "Chuang"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "zhuang"}
                          {:rdf/language "fr",
                           :rdf/value    "chuang"}],
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Zhuang"},
   :lcc-lr/hasIndigenousName "cuengh",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/za",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Zhuang",
   :skos/definition "Zhuang languages"})

(def Zulu
  "Zulu language"
  {:db/ident :lcc-639-1/Zulu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zulu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zoulou"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Zulu-Sprache"},
   :lcc-lr/hasIndigenousName "isiZulu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/zu",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Zulu",
   :skos/definition "Zulu language"})

(def aa
  "language identifier for Afar"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Afar,
   :db/ident :lcc-639-1/aa,
   :lcc-lr/hasTag "aa",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "aa",
   :skos/definition "language identifier for Afar"})

(def ab
  "language identifier for Abkhazian; Abkhaz"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Abkhazian,
   :db/ident :lcc-639-1/ab,
   :lcc-lr/hasTag "ab",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ab",
   :skos/definition "language identifier for Abkhazian; Abkhaz"})

(def ae
  "language identifier for Avestan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Avestan,
   :db/ident :lcc-639-1/ae,
   :lcc-lr/hasTag "ae",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ae",
   :skos/definition "language identifier for Avestan"})

(def af
  "language identifier for Afrikaans"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Afrikaans,
   :db/ident :lcc-639-1/af,
   :lcc-lr/hasTag "af",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "af",
   :skos/definition "language identifier for Afrikaans"})

(def ak
  "language identifier for Akan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Akan,
   :db/ident :lcc-639-1/ak,
   :lcc-lr/hasTag "ak",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ak",
   :skos/definition "language identifier for Akan"})

(def am
  "language identifier for Amharic"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Amharic,
   :db/ident :lcc-639-1/am,
   :lcc-lr/hasTag "am",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "am",
   :skos/definition "language identifier for Amharic"})

(def an
  "language identifier for Aragonese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Aragonese,
   :db/ident :lcc-639-1/an,
   :lcc-lr/hasTag "an",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "an",
   :skos/definition "language identifier for Aragonese"})

(def ar
  "language identifier for Arabic"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Arabic,
   :db/ident :lcc-639-1/ar,
   :lcc-lr/hasTag "ar",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ar",
   :skos/definition "language identifier for Arabic"})

(def as
  "language identifier for Assamese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Assamese,
   :db/ident :lcc-639-1/as,
   :lcc-lr/hasTag "as",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "as",
   :skos/definition "language identifier for Assamese"})

(def av
  "language identifier for Avaric"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Avaric,
   :db/ident :lcc-639-1/av,
   :lcc-lr/hasTag "av",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "av",
   :skos/definition "language identifier for Avaric"})

(def ay
  "language identifier for Aymara"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Aymara,
   :db/ident :lcc-639-1/ay,
   :lcc-lr/hasTag "ay",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ay",
   :skos/definition "language identifier for Aymara"})

(def az
  "language identifier for Azerbaijani"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Azerbaijani,
   :db/ident :lcc-639-1/az,
   :lcc-lr/hasTag "az",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "az",
   :skos/definition "language identifier for Azerbaijani"})

(def ba
  "language identifier for Bashkir"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bashkir,
   :db/ident :lcc-639-1/ba,
   :lcc-lr/hasTag "ba",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ba",
   :skos/definition "language identifier for Bashkir"})

(def be
  "language identifier for Belarusian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Belarusian,
   :db/ident :lcc-639-1/be,
   :lcc-lr/hasTag "be",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "be",
   :skos/definition "language identifier for Belarusian"})

(def bg
  "language identifier for Bulgarian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bulgarian,
   :db/ident :lcc-639-1/bg,
   :lcc-lr/hasTag "bg",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bg",
   :skos/definition "language identifier for Bulgarian"})

(def bh
  "language identifier for Bihari languages"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/BihariLanguages,
   :db/ident :lcc-639-1/bh,
   :lcc-lr/hasTag "bh",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bh",
   :skos/definition "language identifier for Bihari languages"})

(def bi
  "language identifier for Bislama"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bislama,
   :db/ident :lcc-639-1/bi,
   :lcc-lr/hasTag "bi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bi",
   :skos/definition "language identifier for Bislama"})

(def bm
  "language identifier for Bambara"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bambara,
   :db/ident :lcc-639-1/bm,
   :lcc-lr/hasTag "bm",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bm",
   :skos/definition "language identifier for Bambara"})

(def bn
  "language identifier for Bengali; Bangla"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bengali,
   :db/ident :lcc-639-1/bn,
   :lcc-lr/hasTag "bn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bn",
   :skos/definition "language identifier for Bengali; Bangla"})

(def bo
  "language identifier for Tibetan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tibetan,
   :db/ident :lcc-639-1/bo,
   :lcc-lr/hasTag "bo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bo",
   :skos/definition "language identifier for Tibetan"})

(def br
  "language identifier for Breton"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Breton,
   :db/ident :lcc-639-1/br,
   :lcc-lr/hasTag "br",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "br",
   :skos/definition "language identifier for Breton"})

(def bs
  "language identifier for Bosnian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Bosnian,
   :db/ident :lcc-639-1/bs,
   :lcc-lr/hasTag "bs",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bs",
   :skos/definition "language identifier for Bosnian"})

(def ca
  "language identifier for Catalan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Catalan,
   :db/ident :lcc-639-1/ca,
   :lcc-lr/hasTag "ca",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ca",
   :skos/definition "language identifier for Catalan"})

(def ce
  "language identifier for Chechen"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chechen,
   :db/ident :lcc-639-1/ce,
   :lcc-lr/hasTag "ce",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ce",
   :skos/definition "language identifier for Chechen"})

(def ch
  "language identifier for Chamorro"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chamorro,
   :db/ident :lcc-639-1/ch,
   :lcc-lr/hasTag "ch",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ch",
   :skos/definition "language identifier for Chamorro"})

(def co
  "language identifier for Corsican"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Corsican,
   :db/ident :lcc-639-1/co,
   :lcc-lr/hasTag "co",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "co",
   :skos/definition "language identifier for Corsican"})

(def cr
  "language identifier for Cree"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Cree,
   :db/ident :lcc-639-1/cr,
   :lcc-lr/hasTag "cr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cr",
   :skos/definition "language identifier for Cree"})

(def cs
  "language identifier for Czech"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Czech,
   :db/ident :lcc-639-1/cs,
   :lcc-lr/hasTag "cs",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cs",
   :skos/definition "language identifier for Czech"})

(def cu
  "language identifier for Old Slavonic; Old Church Slavonic; Church Slavonic; Church Slavic; Old Bulgarian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/ChurchSlavic,
   :db/ident :lcc-639-1/cu,
   :lcc-lr/hasTag "cu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cu",
   :skos/definition
   "language identifier for Old Slavonic; Old Church Slavonic; Church Slavonic; Church Slavic; Old Bulgarian"})

(def cv
  "language identifier for Chuvash"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chuvash,
   :db/ident :lcc-639-1/cv,
   :lcc-lr/hasTag "cv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cv",
   :skos/definition "language identifier for Chuvash"})

(def cy
  "language identifier for Welsh"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Welsh,
   :db/ident :lcc-639-1/cy,
   :lcc-lr/hasTag "cy",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cy",
   :skos/definition "language identifier for Welsh"})

(def da
  "language identifier for Danish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Danish,
   :db/ident :lcc-639-1/da,
   :lcc-lr/hasTag "da",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "da",
   :skos/definition "language identifier for Danish"})

(def de
  "language identifier for German"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/German,
   :db/ident :lcc-639-1/de,
   :lcc-lr/hasTag "de",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "de",
   :skos/definition "language identifier for German"})

(def dv
  "language identifier for Dhivehi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dhivehi,
   :db/ident :lcc-639-1/dv,
   :lcc-lr/hasTag "dv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "dv",
   :skos/definition "language identifier for Dhivehi"})

(def dz
  "language identifier for Dzongkha; Bhutani; Butanese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dzongkha,
   :db/ident :lcc-639-1/dz,
   :lcc-lr/hasTag "dz",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "dz",
   :skos/definition "language identifier for Dzongkha; Bhutani; Butanese"})

(def ee
  "language identifier for Ewe"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ewe,
   :db/ident :lcc-639-1/ee,
   :lcc-lr/hasTag "ee",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ee",
   :skos/definition "language identifier for Ewe"})

(def el
  "language identifier for Modern Greek (post 1453)"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/ModernGreek,
   :db/ident :lcc-639-1/el,
   :lcc-lr/hasTag "el",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "el",
   :skos/definition "language identifier for Modern Greek (post 1453)"})

(def en
  "language identifier for English"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/English,
   :db/ident :lcc-639-1/en,
   :lcc-lr/hasTag "en",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "en",
   :skos/definition "language identifier for English"})

(def eo
  "language identifier for Esperanto"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Esperanto,
   :db/ident :lcc-639-1/eo,
   :lcc-lr/hasTag "eo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "eo",
   :skos/definition "language identifier for Esperanto"})

(def es
  "language identifier for Spanish; Castilian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Spanish,
   :db/ident :lcc-639-1/es,
   :lcc-lr/hasTag "es",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "es",
   :skos/definition "language identifier for Spanish; Castilian"})

(def et
  "language identifier for Estonian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Estonian,
   :db/ident :lcc-639-1/et,
   :lcc-lr/hasTag "et",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "et",
   :skos/definition "language identifier for Estonian"})

(def eu
  "language identifier for Basque"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Basque,
   :db/ident :lcc-639-1/eu,
   :lcc-lr/hasTag "eu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "eu",
   :skos/definition "language identifier for Basque"})

(def fa
  "language identifier for Persian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Persian,
   :db/ident :lcc-639-1/fa,
   :lcc-lr/hasTag "fa",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fa",
   :skos/definition "language identifier for Persian"})

(def ff
  "language identifier for Fulah; Fula; Fulani; Fulfulde; Peul"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Fulah,
   :db/ident :lcc-639-1/ff,
   :lcc-lr/hasTag "ff",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ff",
   :skos/definition
   "language identifier for Fulah; Fula; Fulani; Fulfulde; Peul"})

(def fi
  "language identifier for Finnish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Finnish,
   :db/ident :lcc-639-1/fi,
   :lcc-lr/hasTag "fi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fi",
   :skos/definition "language identifier for Finnish"})

(def fj
  "language identifier for Fijian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Fijian,
   :db/ident :lcc-639-1/fj,
   :lcc-lr/hasTag "fj",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fj",
   :skos/definition "language identifier for Fijian"})

(def fo
  "language identifier for Faroese; Faeroese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Faroese,
   :db/ident :lcc-639-1/fo,
   :lcc-lr/hasTag "fo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fo",
   :skos/definition "language identifier for Faroese; Faeroese"})

(def fr
  "language identifier for French"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/French,
   :db/ident :lcc-639-1/fr,
   :lcc-lr/hasTag "fr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fr",
   :skos/definition "language identifier for French"})

(def fy
  "language identifier for Western Frisian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/WesternFrisian,
   :db/ident :lcc-639-1/fy,
   :lcc-lr/hasTag "fy",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fy",
   :skos/definition "language identifier for Western Frisian"})

(def ga
  "language identifier for Irish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Irish,
   :db/ident :lcc-639-1/ga,
   :lcc-lr/hasTag "ga",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ga",
   :skos/definition "language identifier for Irish"})

(def gd
  "language identifier for Gaelic; Scottish Gaelic"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Gaelic,
   :db/ident :lcc-639-1/gd,
   :lcc-lr/hasTag "gd",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gd",
   :skos/definition "language identifier for Gaelic; Scottish Gaelic"})

(def gl
  "language identifier for Galician; Gallegan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Galician,
   :db/ident :lcc-639-1/gl,
   :lcc-lr/hasTag "gl",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gl",
   :skos/definition "language identifier for Galician; Gallegan"})

(def gn
  "language identifier for Guarani"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Guarani,
   :db/ident :lcc-639-1/gn,
   :lcc-lr/hasTag "gn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gn",
   :skos/definition "language identifier for Guarani"})

(def gu
  "language identifier for Gujarati"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Gujarati,
   :db/ident :lcc-639-1/gu,
   :lcc-lr/hasTag "gu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gu",
   :skos/definition "language identifier for Gujarati"})

(def gv
  "language identifier for Manx"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Manx,
   :db/ident :lcc-639-1/gv,
   :lcc-lr/hasTag "gv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gv",
   :skos/definition "language identifier for Manx"})

(def ha
  "language identifier for Hausa"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hausa,
   :db/ident :lcc-639-1/ha,
   :lcc-lr/hasTag "ha",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ha",
   :skos/definition "language identifier for Hausa"})

(def he
  "language identifier for Hebrew"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hebrew,
   :db/ident :lcc-639-1/he,
   :lcc-lr/hasTag "he",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "he",
   :skos/definition "language identifier for Hebrew"})

(def hi
  "language identifier for Hindi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hindi,
   :db/ident :lcc-639-1/hi,
   :lcc-lr/hasTag "hi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hi",
   :skos/definition "language identifier for Hindi"})

(def ho
  "language identifier for Hiri Motu"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/HiriMotu,
   :db/ident :lcc-639-1/ho,
   :lcc-lr/hasTag "ho",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ho",
   :skos/definition "language identifier for Hiri Motu"})

(def hr
  "language identifier for Croatian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Croatian,
   :db/ident :lcc-639-1/hr,
   :lcc-lr/hasTag "hr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hr",
   :skos/definition "language identifier for Croatian"})

(def ht
  "language identifier for Haitian; Haitian Creole"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Haitian,
   :db/ident :lcc-639-1/ht,
   :lcc-lr/hasTag "ht",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ht",
   :skos/definition "language identifier for Haitian; Haitian Creole"})

(def hu
  "language identifier for Hungarian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Hungarian,
   :db/ident :lcc-639-1/hu,
   :lcc-lr/hasTag "hu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hu",
   :skos/definition "language identifier for Hungarian"})

(def hy
  "language identifier for Armenian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Armenian,
   :db/ident :lcc-639-1/hy,
   :lcc-lr/hasTag "hy",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hy",
   :skos/definition "language identifier for Armenian"})

(def hz
  "language identifier for Herero"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Herero,
   :db/ident :lcc-639-1/hz,
   :lcc-lr/hasTag "hz",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hz",
   :skos/definition "language identifier for Herero"})

(def ia
  "language identifier for Interlingua (International Auxiliary Language Association)"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Interlingua,
   :db/ident :lcc-639-1/ia,
   :lcc-lr/hasTag "ia",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ia",
   :skos/definition
   "language identifier for Interlingua (International Auxiliary Language Association)"})

(def id
  "language identifier for Indonesian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Indonesian,
   :db/ident :lcc-639-1/id,
   :lcc-lr/hasTag "id",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "id",
   :skos/definition "language identifier for Indonesian"})

(def ie
  "language identifier for Interlingue"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Interlingue,
   :db/ident :lcc-639-1/ie,
   :lcc-lr/hasTag "ie",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ie",
   :skos/definition "language identifier for Interlingue"})

(def ig
  "language identifier for Igbo"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Igbo,
   :db/ident :lcc-639-1/ig,
   :lcc-lr/hasTag "ig",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ig",
   :skos/definition "language identifier for Igbo"})

(def ii
  "language identifier for Sichuan Yi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/SichuanYi,
   :db/ident :lcc-639-1/ii,
   :lcc-lr/hasTag "ii",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ii",
   :skos/definition "language identifier for Sichuan Yi"})

(def ik
  "language identifier for Inupiaq"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Inupiaq,
   :db/ident :lcc-639-1/ik,
   :lcc-lr/hasTag "ik",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ik",
   :skos/definition "language identifier for Inupiaq"})

(def io
  "language identifier for Ido"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ido,
   :db/ident :lcc-639-1/io,
   :lcc-lr/hasTag "io",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "io",
   :skos/definition "language identifier for Ido"})

(def is
  "language identifier for Icelandic"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Icelandic,
   :db/ident :lcc-639-1/is,
   :lcc-lr/hasTag "is",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "is",
   :skos/definition "language identifier for Icelandic"})

(def it
  "language identifier for Italian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Italian,
   :db/ident :lcc-639-1/it,
   :lcc-lr/hasTag "it",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "it",
   :skos/definition "language identifier for Italian"})

(def iu
  "language identifier for Inuktitut"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Inuktitut,
   :db/ident :lcc-639-1/iu,
   :lcc-lr/hasTag "iu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "iu",
   :skos/definition "language identifier for Inuktitut"})

(def ja
  "language identifier for Japanese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Japanese,
   :db/ident :lcc-639-1/ja,
   :lcc-lr/hasTag "ja",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ja",
   :skos/definition "language identifier for Japanese"})

(def jv
  "language identifier for Javanese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Javanese,
   :db/ident :lcc-639-1/jv,
   :lcc-lr/hasTag "jv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "jv",
   :skos/definition "language identifier for Javanese"})

(def ka
  "language identifier for Georgian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Georgian,
   :db/ident :lcc-639-1/ka,
   :lcc-lr/hasTag "ka",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ka",
   :skos/definition "language identifier for Georgian"})

(def kg
  "language identifier for Kongo"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kongo,
   :db/ident :lcc-639-1/kg,
   :lcc-lr/hasTag "kg",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kg",
   :skos/definition "language identifier for Kongo"})

(def ki
  "language identifier for Kikuyu; Gikuyu"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kikuyu,
   :db/ident :lcc-639-1/ki,
   :lcc-lr/hasTag "ki",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ki",
   :skos/definition "language identifier for Kikuyu; Gikuyu"})

(def kj
  "language identifier for Kwanyama; Kuanyama"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kuanyama,
   :db/ident :lcc-639-1/kj,
   :lcc-lr/hasTag "kj",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kj",
   :skos/definition "language identifier for Kwanyama; Kuanyama"})

(def kk
  "language identifier for Kazakh"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kazakh,
   :db/ident :lcc-639-1/kk,
   :lcc-lr/hasTag "kk",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kk",
   :skos/definition "language identifier for Kazakh"})

(def kl
  "language identifier for Kalaallisut; Greenlandic"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kalaallisut,
   :db/ident :lcc-639-1/kl,
   :lcc-lr/hasTag "kl",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kl",
   :skos/definition "language identifier for Kalaallisut; Greenlandic"})

(def km
  "language identifier for Central Khmer"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/CentralKhmer,
   :db/ident :lcc-639-1/km,
   :lcc-lr/hasTag "km",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "km",
   :skos/definition "language identifier for Central Khmer"})

(def kn
  "language identifier for Kannada"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kannada,
   :db/ident :lcc-639-1/kn,
   :lcc-lr/hasTag "kn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kn",
   :skos/definition "language identifier for Kannada"})

(def ko
  "language identifier for Korean"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Korean,
   :db/ident :lcc-639-1/ko,
   :lcc-lr/hasTag "ko",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ko",
   :skos/definition "language identifier for Korean"})

(def kr
  "language identifier for Kanuri"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kanuri,
   :db/ident :lcc-639-1/kr,
   :lcc-lr/hasTag "kr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kr",
   :skos/definition "language identifier for Kanuri"})

(def ks
  "language identifier for Kashmiri"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kashmiri,
   :db/ident :lcc-639-1/ks,
   :lcc-lr/hasTag "ks",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ks",
   :skos/definition "language identifier for Kashmiri"})

(def ku
  "language identifier for Kurdish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kurdish,
   :db/ident :lcc-639-1/ku,
   :lcc-lr/hasTag "ku",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ku",
   :skos/definition "language identifier for Kurdish"})

(def kv
  "language identifier for Komi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Komi,
   :db/ident :lcc-639-1/kv,
   :lcc-lr/hasTag "kv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kv",
   :skos/definition "language identifier for Komi"})

(def kw
  "language identifier for Cornish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Cornish,
   :db/ident :lcc-639-1/kw,
   :lcc-lr/hasTag "kw",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kw",
   :skos/definition "language identifier for Cornish"})

(def ky
  "language identifier for Kirghiz; Kyrgyz"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kirghiz,
   :db/ident :lcc-639-1/ky,
   :lcc-lr/hasTag "ky",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ky",
   :skos/definition "language identifier for Kirghiz; Kyrgyz"})

(def la
  "language identifier for Latin"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Latin,
   :db/ident :lcc-639-1/la,
   :lcc-lr/hasTag "la",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "la",
   :skos/definition "language identifier for Latin"})

(def lb
  "language identifier for Luxembourgish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Luxembourgish,
   :db/ident :lcc-639-1/lb,
   :lcc-lr/hasTag "lb",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lb",
   :skos/definition "language identifier for Luxembourgish"})

(def lg
  "language identifier for Ganda"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ganda,
   :db/ident :lcc-639-1/lg,
   :lcc-lr/hasTag "lg",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lg",
   :skos/definition "language identifier for Ganda"})

(def li
  "language identifier for Limburgan; Limburger; Limburgish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Limburgan,
   :db/ident :lcc-639-1/li,
   :lcc-lr/hasTag "li",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "li",
   :skos/definition "language identifier for Limburgan; Limburger; Limburgish"})

(def ln
  "language identifier for Lingala"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Lingala,
   :db/ident :lcc-639-1/ln,
   :lcc-lr/hasTag "ln",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ln",
   :skos/definition "language identifier for Lingala"})

(def lo
  "language identifier for Lao"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Lao,
   :db/ident :lcc-639-1/lo,
   :lcc-lr/hasTag "lo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lo",
   :skos/definition "language identifier for Lao"})

(def lt
  "language identifier for Lithuanian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Lithuanian,
   :db/ident :lcc-639-1/lt,
   :lcc-lr/hasTag "lt",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lt",
   :skos/definition "language identifier for Lithuanian"})

(def lu
  "language identifier for Luba-Katanga"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/LubaKatanga,
   :db/ident :lcc-639-1/lu,
   :lcc-lr/hasTag "lu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lu",
   :skos/definition "language identifier for Luba-Katanga"})

(def lv
  "language identifier for Latvian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Latvian,
   :db/ident :lcc-639-1/lv,
   :lcc-lr/hasTag "lv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lv",
   :skos/definition "language identifier for Latvian"})

(def mg
  "language identifier for Malagasy"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malagasy,
   :db/ident :lcc-639-1/mg,
   :lcc-lr/hasTag "mg",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mg",
   :skos/definition "language identifier for Malagasy"})

(def mh
  "language identifier for Marshallese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Marshallese,
   :db/ident :lcc-639-1/mh,
   :lcc-lr/hasTag "mh",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mh",
   :skos/definition "language identifier for Marshallese"})

(def mi
  "language identifier for Maori"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Maori,
   :db/ident :lcc-639-1/mi,
   :lcc-lr/hasTag "mi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mi",
   :skos/definition "language identifier for Maori"})

(def mk
  "language identifier for Macedonian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Macedonian,
   :db/ident :lcc-639-1/mk,
   :lcc-lr/hasTag "mk",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mk",
   :skos/definition "language identifier for Macedonian"})

(def ml
  "language identifier for Malayalam"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malayalam,
   :db/ident :lcc-639-1/ml,
   :lcc-lr/hasTag "ml",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ml",
   :skos/definition "language identifier for Malayalam"})

(def mn
  "language identifier for Mongolian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Mongolian,
   :db/ident :lcc-639-1/mn,
   :lcc-lr/hasTag "mn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mn",
   :skos/definition "language identifier for Mongolian"})

(def mr
  "language identifier for Marathi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Marathi,
   :db/ident :lcc-639-1/mr,
   :lcc-lr/hasTag "mr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mr",
   :skos/definition "language identifier for Marathi"})

(def ms
  "language identifier for Malay"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Malay,
   :db/ident :lcc-639-1/ms,
   :lcc-lr/hasTag "ms",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ms",
   :skos/definition "language identifier for Malay"})

(def mt
  "language identifier for Maltese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Maltese,
   :db/ident :lcc-639-1/mt,
   :lcc-lr/hasTag "mt",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mt",
   :skos/definition "language identifier for Maltese"})

(def my
  "language identifier for Burmese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Burmese,
   :db/ident :lcc-639-1/my,
   :lcc-lr/hasTag "my",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "my",
   :skos/definition "language identifier for Burmese"})

(def na
  "language identifier for Nauruan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Nauru,
   :db/ident :lcc-639-1/na,
   :lcc-lr/hasTag "na",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "na",
   :skos/definition "language identifier for Nauruan"})

(def nb
  "language identifier for Norwegian Bokmal"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorwegianBokmal,
   :db/ident :lcc-639-1/nb,
   :lcc-lr/hasTag "nb",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nb",
   :skos/definition "language identifier for Norwegian Bokmal"})

(def nd
  "language identifier for North Ndebele"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorthNdebele,
   :db/ident :lcc-639-1/nd,
   :lcc-lr/hasTag "nd",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nd",
   :skos/definition "language identifier for North Ndebele"})

(def ne
  "language identifier for Nepali"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Nepali,
   :db/ident :lcc-639-1/ne,
   :lcc-lr/hasTag "ne",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ne",
   :skos/definition "language identifier for Nepali"})

(def ng
  "language identifier for Ndonga"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ndonga,
   :db/ident :lcc-639-1/ng,
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ng",
   :skos/definition "language identifier for Ndonga"})

(def nl
  "language identifier for Dutch"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Dutch,
   :db/ident :lcc-639-1/nl,
   :lcc-lr/hasTag "nl",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nl",
   :skos/definition "language identifier for Dutch"})

(def nn
  "language identifier for Norwegian Nynorsk"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorwegianNynorsk,
   :db/ident :lcc-639-1/nn,
   :lcc-lr/hasTag "nn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nn",
   :skos/definition "language identifier for Norwegian Nynorsk"})

(def no
  "language identifier for Norwegian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Norwegian,
   :db/ident :lcc-639-1/no,
   :lcc-lr/hasTag "no",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "no",
   :skos/definition "language identifier for Norwegian"})

(def nr
  "language identifier for South Ndebele"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/SouthNdebele,
   :db/ident :lcc-639-1/nr,
   :lcc-lr/hasTag "nr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nr",
   :skos/definition "language identifier for South Ndebele"})

(def nv
  "language identifier for Navajo; Navaho"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Navajo,
   :db/ident :lcc-639-1/nv,
   :lcc-lr/hasTag "nv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nv",
   :skos/definition "language identifier for Navajo; Navaho"})

(def ny
  "language identifier for Chichewa; Chewa; Nyanja"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chichewa,
   :db/ident :lcc-639-1/ny,
   :lcc-lr/hasTag "ny",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ny",
   :skos/definition "language identifier for Chichewa; Chewa; Nyanja"})

(def oc
  "language identifier for Occitan; Provencal (post 1500)"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Occitan,
   :db/ident :lcc-639-1/oc,
   :lcc-lr/hasTag "oc",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "oc",
   :skos/definition "language identifier for Occitan; Provencal (post 1500)"})

(def oj
  "language identifier for Ojibwa"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ojibwa,
   :db/ident :lcc-639-1/oj,
   :lcc-lr/hasTag "oj",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "oj",
   :skos/definition "language identifier for Ojibwa"})

(def om
  "language identifier for Oromo"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Oromo,
   :db/ident :lcc-639-1/om,
   :lcc-lr/hasTag "om",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "om",
   :skos/definition "language identifier for Oromo"})

(def or
  "language identifier for Oriya"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Oriya,
   :db/ident :lcc-639-1/or,
   :lcc-lr/hasTag "or",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "or",
   :skos/definition "language identifier for Oriya"})

(def os
  "language identifier for Ossetian; Ossetic"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ossetian,
   :db/ident :lcc-639-1/os,
   :lcc-lr/hasTag "os",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "os",
   :skos/definition "language identifier for Ossetian; Ossetic"})

(def pa
  "language identifier for Panjabi; Punjabi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Panjabi,
   :db/ident :lcc-639-1/pa,
   :lcc-lr/hasTag "pa",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pa",
   :skos/definition "language identifier for Panjabi; Punjabi"})

(def pi
  "language identifier for Pali"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Pali,
   :db/ident :lcc-639-1/pi,
   :lcc-lr/hasTag "pi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pi",
   :skos/definition "language identifier for Pali"})

(def pl
  "language identifier for Polish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Polish,
   :db/ident :lcc-639-1/pl,
   :lcc-lr/hasTag "pl",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pl",
   :skos/definition "language identifier for Polish"})

(def ps
  "language identifier for Pashto; Pushto"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Pushto,
   :db/ident :lcc-639-1/ps,
   :lcc-lr/hasTag "ps",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ps",
   :skos/definition "language identifier for Pashto; Pushto"})

(def pt
  "language identifier for Portuguese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Portuguese,
   :db/ident :lcc-639-1/pt,
   :lcc-lr/hasTag "pt",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pt",
   :skos/definition "language identifier for Portuguese"})

(def qu
  "language identifier for Quechua"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Quechua,
   :db/ident :lcc-639-1/qu,
   :lcc-lr/hasTag "qu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "qu",
   :skos/definition "language identifier for Quechua"})

(def rm
  "language identifier for Romansh"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Romansh,
   :db/ident :lcc-639-1/rm,
   :lcc-lr/hasTag "rm",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "rm",
   :skos/definition "language identifier for Romansh"})

(def rn
  "language identifier for Rundi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Rundi,
   :db/ident :lcc-639-1/rn,
   :lcc-lr/hasTag "rn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "rn",
   :skos/definition "language identifier for Rundi"})

(def ro
  "language identifier for Romanian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Romanian,
   :db/ident :lcc-639-1/ro,
   :lcc-lr/hasTag "ro",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ro",
   :skos/definition "language identifier for Romanian"})

(def ru
  "language identifier for Russian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Russian,
   :db/ident :lcc-639-1/ru,
   :lcc-lr/hasTag "ru",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ru",
   :skos/definition "language identifier for Russian"})

(def rw
  "language identifier for Kinyarwanda; Rwanda"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Kinyarwanda,
   :db/ident :lcc-639-1/rw,
   :lcc-lr/hasTag "rw",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "rw",
   :skos/definition "language identifier for Kinyarwanda; Rwanda"})

(def sa
  "language identifier for Sanskrit"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sanskrit,
   :db/ident :lcc-639-1/sa,
   :lcc-lr/hasTag "sa",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sa",
   :skos/definition "language identifier for Sanskrit"})

(def sc
  "language identifier for Sardinian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sardinian,
   :db/ident :lcc-639-1/sc,
   :lcc-lr/hasTag "sc",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sc",
   :skos/definition "language identifier for Sardinian"})

(def sd
  "language identifier for Sindhi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sindhi,
   :db/ident :lcc-639-1/sd,
   :lcc-lr/hasTag "sd",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sd",
   :skos/definition "language identifier for Sindhi"})

(def se
  "language identifier for Northern Sami"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/NorthernSami,
   :db/ident :lcc-639-1/se,
   :lcc-lr/hasTag "se",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "se",
   :skos/definition "language identifier for Northern Sami"})

(def sg
  "language identifier for Sango"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sango,
   :db/ident :lcc-639-1/sg,
   :lcc-lr/hasTag "sg",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sg",
   :skos/definition "language identifier for Sango"})

(def si
  "language identifier for Sinhala; Sinhalese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sinhala,
   :db/ident :lcc-639-1/si,
   :lcc-lr/hasTag "si",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "si",
   :skos/definition "language identifier for Sinhala; Sinhalese"})

(def sk
  "language identifier for Slovak"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Slovak,
   :db/ident :lcc-639-1/sk,
   :lcc-lr/hasTag "sk",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sk",
   :skos/definition "language identifier for Slovak"})

(def sl
  "language identifier for Slovenian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Slovenian,
   :db/ident :lcc-639-1/sl,
   :lcc-lr/hasTag "sl",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sl",
   :skos/definition "language identifier for Slovenian"})

(def sm
  "language identifier for Samoan"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Samoan,
   :db/ident :lcc-639-1/sm,
   :lcc-lr/hasTag "sm",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sm",
   :skos/definition "language identifier for Samoan"})

(def sn
  "language identifier for Shona"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Shona,
   :db/ident :lcc-639-1/sn,
   :lcc-lr/hasTag "sn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sn",
   :skos/definition "language identifier for Shona"})

(def so
  "language identifier for Somali"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Somali,
   :db/ident :lcc-639-1/so,
   :lcc-lr/hasTag "so",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "so",
   :skos/definition "language identifier for Somali"})

(def sq
  "language identifier for Albanian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Albanian,
   :db/ident :lcc-639-1/sq,
   :lcc-lr/hasTag "sq",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sq",
   :skos/definition "language identifier for Albanian"})

(def sr
  "language identifier for Serbian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Serbian,
   :db/ident :lcc-639-1/sr,
   :lcc-lr/hasTag "sr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sr",
   :skos/definition "language identifier for Serbian"})

(def ss
  "language identifier for Swati"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Swati,
   :db/ident :lcc-639-1/ss,
   :lcc-lr/hasTag "ss",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ss",
   :skos/definition "language identifier for Swati"})

(def st
  "language identifier for Sesotho; Southern Sotho"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/SouthernSotho,
   :db/ident :lcc-639-1/st,
   :lcc-lr/hasTag "st",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "st",
   :skos/definition "language identifier for Sesotho; Southern Sotho"})

(def su
  "language identifier for Sundanese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Sundanese,
   :db/ident :lcc-639-1/su,
   :lcc-lr/hasTag "su",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "su",
   :skos/definition "language identifier for Sundanese"})

(def sv
  "language identifier for Swedish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Swedish,
   :db/ident :lcc-639-1/sv,
   :lcc-lr/hasTag "sv",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sv",
   :skos/definition "language identifier for Swedish"})

(def sw
  "language identifier for Swahili"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Swahili,
   :db/ident :lcc-639-1/sw,
   :lcc-lr/hasTag "sw",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sw",
   :skos/definition "language identifier for Swahili"})

(def ta
  "language identifier for Tamil"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tamil,
   :db/ident :lcc-639-1/ta,
   :lcc-lr/hasTag "ta",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ta",
   :skos/definition "language identifier for Tamil"})

(def te
  "language identifier for Telugu"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Telugu,
   :db/ident :lcc-639-1/te,
   :lcc-lr/hasTag "te",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "te",
   :skos/definition "language identifier for Telugu"})

(def tg
  "language identifier for Tajik"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tajik,
   :db/ident :lcc-639-1/tg,
   :lcc-lr/hasTag "tg",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tg",
   :skos/definition "language identifier for Tajik"})

(def th
  "language identifier for Thai"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Thai,
   :db/ident :lcc-639-1/th,
   :lcc-lr/hasTag "th",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "th",
   :skos/definition "language identifier for Thai"})

(def ti
  "language identifier for Tigrinya"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tigrinya,
   :db/ident :lcc-639-1/ti,
   :lcc-lr/hasTag "ti",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ti",
   :skos/definition "language identifier for Tigrinya"})

(def tk
  "language identifier for Turkmen"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Turkmen,
   :db/ident :lcc-639-1/tk,
   :lcc-lr/hasTag "tk",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tk",
   :skos/definition "language identifier for Turkmen"})

(def tl
  "language identifier for Tagalog"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tagalog,
   :db/ident :lcc-639-1/tl,
   :lcc-lr/hasTag "tl",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tl",
   :skos/definition "language identifier for Tagalog"})

(def tn
  "language identifier for Tswana"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tswana,
   :db/ident :lcc-639-1/tn,
   :lcc-lr/hasTag "tn",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tn",
   :skos/definition "language identifier for Tswana"})

(def to
  "language identifier for Tonga (Tonga Islands)"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tonga-TongaIslands,
   :db/ident :lcc-639-1/to,
   :lcc-lr/hasTag "to",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "to",
   :skos/definition "language identifier for Tonga (Tonga Islands)"})

(def tr
  "language identifier for Turkish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Turkish,
   :db/ident :lcc-639-1/tr,
   :lcc-lr/hasTag "tr",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tr",
   :skos/definition "language identifier for Turkish"})

(def ts
  "language identifier for Tsonga"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tsonga,
   :db/ident :lcc-639-1/ts,
   :lcc-lr/hasTag "ts",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ts",
   :skos/definition "language identifier for Tsonga"})

(def tt
  "language identifier for Tatar"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tatar,
   :db/ident :lcc-639-1/tt,
   :lcc-lr/hasTag "tt",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tt",
   :skos/definition "language identifier for Tatar"})

(def tw
  "language identifier for Twi"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :db/ident :lcc-639-1/tw,
   :lcc-lr/hasTag "tw",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tw",
   :skos/definition "language identifier for Twi"})

(def ty
  "language identifier for Tahitian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Tahitian,
   :db/ident :lcc-639-1/ty,
   :lcc-lr/hasTag "ty",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ty",
   :skos/definition "language identifier for Tahitian"})

(def ug
  "language identifier for Uighur; Uyghur"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Uighur,
   :db/ident :lcc-639-1/ug,
   :lcc-lr/hasTag "ug",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ug",
   :skos/definition "language identifier for Uighur; Uyghur"})

(def uk
  "language identifier for Ukrainian"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Ukrainian,
   :db/ident :lcc-639-1/uk,
   :lcc-lr/hasTag "uk",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "uk",
   :skos/definition "language identifier for Ukrainian"})

(def ur
  "language identifier for Urdu"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Urdu,
   :db/ident :lcc-639-1/ur,
   :lcc-lr/hasTag "ur",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ur",
   :skos/definition "language identifier for Urdu"})

(def uz
  "language identifier for Uzbek"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Uzbek,
   :db/ident :lcc-639-1/uz,
   :lcc-lr/hasTag "uz",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "uz",
   :skos/definition "language identifier for Uzbek"})

(def ve
  "language identifier for Venda"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Venda,
   :db/ident :lcc-639-1/ve,
   :lcc-lr/hasTag "ve",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ve",
   :skos/definition "language identifier for Venda"})

(def vi
  "language identifier for Vietnamese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Vietnamese,
   :db/ident :lcc-639-1/vi,
   :lcc-lr/hasTag "vi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "vi",
   :skos/definition "language identifier for Vietnamese"})

(def vo
  "language identifier for Volapuk"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Volapuk,
   :db/ident :lcc-639-1/vo,
   :lcc-lr/hasTag "vo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "vo",
   :skos/definition "language identifier for Volapuk"})

(def wa
  "language identifier for Walloon"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Walloon,
   :db/ident :lcc-639-1/wa,
   :lcc-lr/hasTag "wa",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "wa",
   :skos/definition "language identifier for Walloon"})

(def wo
  "language identifier for Wolof"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Wolof,
   :db/ident :lcc-639-1/wo,
   :lcc-lr/hasTag "wo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "wo",
   :skos/definition "language identifier for Wolof"})

(def xh
  "language identifier for Xhosa"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Xhosa,
   :db/ident :lcc-639-1/xh,
   :lcc-lr/hasTag "xh",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "xh",
   :skos/definition "language identifier for Xhosa"})

(def yi
  "language identifier for Yiddish"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Yiddish,
   :db/ident :lcc-639-1/yi,
   :lcc-lr/hasTag "yi",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "yi",
   :skos/definition "language identifier for Yiddish"})

(def yo
  "language identifier for Yoruba"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Yoruba,
   :db/ident :lcc-639-1/yo,
   :lcc-lr/hasTag "yo",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "yo",
   :skos/definition "language identifier for Yoruba"})

(def za
  "language identifier for Zhuang; Chuang"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Zhuang,
   :db/ident :lcc-639-1/za,
   :lcc-lr/hasTag "za",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "za",
   :skos/definition "language identifier for Zhuang; Chuang"})

(def zh
  "language identifier for Chinese"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Chinese,
   :db/ident :lcc-639-1/zh,
   :lcc-lr/hasTag "zh",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "zh",
   :skos/definition "language identifier for Chinese"})

(def zu
  "language identifier for Zulu"
  {:cmns-col/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :cmns-id/identifies :lcc-639-1/Zulu,
   :db/ident :lcc-639-1/zu,
   :lcc-lr/hasTag "zu",
   :rdf/type [:lcc-lr/Alpha2LanguageCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "zu",
   :skos/definition "language identifier for Zulu"})