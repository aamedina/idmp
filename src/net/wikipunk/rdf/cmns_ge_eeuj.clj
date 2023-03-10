(ns net.wikipunk.rdf.cmns-ge-eeuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective."
  {:cmns-av/copyright ["Copyright (c) 2010-2022 EDM Council, Inc."
                       "Copyright (c) 2010-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Eastern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-eeuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-eeuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons Eastern Europe Government Entities and Jurisdictions Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Eastern Europe Government Entities and Jurisdictions ontology.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def BelarusianEntity
  "sovereign state and polity that is Belarus"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Belarus,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :db/ident        :cmns-ge-eeuj/BelarusianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "ru",
                      :rdf/value    "?????????????????????? ??????????????????????"}
                     {:rdf/language "be",
                      :rdf/value    "???????????????????? ??????????????????"}
                     {:rdf/language "en",
                      :rdf/value    "Belarusian entity"}],
   :skos/definition "sovereign state and polity that is Belarus"})

(def BulgarianEntity
  "sovereign state and polity that is Bulgaria"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Bulgaria,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :db/ident        :cmns-ge-eeuj/BulgarianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "bg",
                      :rdf/value    "?????????????????? ??????????????????????"}
                     {:rdf/language "en",
                      :rdf/value    "Bulgarian entity"}],
   :skos/definition "sovereign state and polity that is Bulgaria"})

(def CzechEntity
  "sovereign state and polity that is Czechia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Czechia,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheCzechRepublic,
   :db/ident        :cmns-ge-eeuj/CzechEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "cs",
                      :rdf/value    "??esk?? subjekt"}
                     {:rdf/language "en",
                      :rdf/value    "Czech entity"}],
   :skos/definition "sovereign state and polity that is Czechia"})

(def GovernmentOfHungary
  "unitary, dominant-party, parliamentary republic, bordering Slovakia to the north, Ukraine to the northeast, Romania to the east and southeast, Serbia to the south, Croatia and Slovenia to the southwest, and Austria to the west"
  {:cmns-rga/governs :lcc-3166-1/Hungary,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfHungary,
   :db/ident :cmns-ge-eeuj/GovernmentOfHungary,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "hu",
                 :rdf/value    "Magyarorsz??g korm??nya"}
                {:rdf/language "en",
                 :rdf/value    "Government of Hungary"}],
   :rdfs/seeAlso "https://www.kormany.hu/en/",
   :skos/definition
   "unitary, dominant-party, parliamentary republic, bordering Slovakia to the north, Ukraine to the northeast, Romania to the east and southeast, Serbia to the south, Croatia and Slovenia to the southwest, and Austria to the west"})

(def GovernmentOfRomania
  "unitary, semi-presidential republic at the crossroads of Central, Eastern, and Southeastern Europe, bordering Bulgaria to the south, Ukraine to the north, Hungary to the west, Serbia to the southwest, and Moldova to the east"
  {:cmns-rga/governs :lcc-3166-1/Romania,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfRomania,
   :db/ident :cmns-ge-eeuj/GovernmentOfRomania,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ro",
                 :rdf/value    "Guvernul Rom??niei"}
                {:rdf/language "en",
                 :rdf/value    "Government of Romania"}],
   :rdfs/seeAlso "https://www.gov.ro/en/",
   :skos/definition
   "unitary, semi-presidential republic at the crossroads of Central, Eastern, and Southeastern Europe, bordering Bulgaria to the south, Ukraine to the north, Hungary to the west, Serbia to the southwest, and Moldova to the east"})

(def GovernmentOfTheCzechRepublic
  "unitary, parliamentary, constitutional republic and multi-party, representative democracy, with the president as head of state and prime minister as head of government, that is a landlocked country in Central Europe bordered by Austria to the south, Germany to the west, Poland to the northeast and Slovakia to the southeast"
  {:cmns-rga/governs :lcc-3166-1/Czechia,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfCzechia,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheCzechRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "Vl??da ??esk?? republiky"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Czech Republic"}],
   :rdfs/seeAlso "https://www.vlada.cz/en/",
   :skos/definition
   "unitary, parliamentary, constitutional republic and multi-party, representative democracy, with the president as head of state and prime minister as head of government, that is a landlocked country in Central Europe bordered by Austria to the south, Germany to the west, Poland to the northeast and Slovakia to the southeast"})

(def GovernmentOfTheRepublicOfBelarus
  "unitary presidential republic, a landlocked country in Eastern Europe bordered by Russia to the northeast, Ukraine to the south, Poland to the west, and Lithuania and Latvia to the northwest"
  {:cmns-rga/governs :lcc-3166-1/Belarus,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfBelarus,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "be",
                 :rdf/value    "???????? ???????????????????? ????????????????"}
                {:rdf/language "ru",
                 :rdf/value    "?????????????????????????? ???????????????????? ????????????????"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Belarus"}],
   :rdfs/seeAlso "https://www.bundeskanzleramt.gv.at/en.html",
   :skos/definition
   "unitary presidential republic, a landlocked country in Eastern Europe bordered by Russia to the northeast, Ukraine to the south, Poland to the west, and Lithuania and Latvia to the northwest"})

(def GovernmentOfTheRepublicOfBulgaria
  "unitary parliamentary democracy where the prime minister is the head of government, located in Southeastern Europe bordered by Romania to the north, Serbia and North Macedonia to the west, Greece and Turkey to the south, and the Black Sea to the east"
  {:cmns-rga/governs :lcc-3166-1/Bulgaria,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfBulgaria,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "bg",
                 :rdf/value    "???????????????????????? ???? ?????????????????? ????????????????"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Bulgaria"}],
   :rdfs/seeAlso "https:/gov.bg/",
   :skos/definition
   "unitary parliamentary democracy where the prime minister is the head of government, located in Southeastern Europe bordered by Romania to the north, Serbia and North Macedonia to the west, Greece and Turkey to the south, and the Black Sea to the east"})

(def GovernmentOfTheRepublicOfMoldova
  "unitary parliamentary constitutional republic that is a landlocked country in Eastern Europe, bordered by Romania to the west and Ukraine to the north, east, and south"
  {:cmns-rga/governs :lcc-3166-1/Moldova,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfMoldova,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ro",
                 :rdf/value    "Guvernul Republicii Moldova"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Moldova"}],
   :rdfs/seeAlso "https:/gov.md/en/",
   :skos/definition
   "unitary parliamentary constitutional republic that is a landlocked country in Eastern Europe, bordered by Romania to the west and Ukraine to the north, east, and south"})

(def GovernmentOfTheRepublicOfPoland
  "unitary, semi-presidential, constitutional, and representative democratic republic located in Central Europe and bordered by the Baltic Sea, Lithuania, and Russia's Kaliningrad Oblast to the north, Belarus and Ukraine to the east, Slovakia and the Czech Republic to the south, and Germany to the west"
  {:cmns-rga/governs :lcc-3166-1/Poland,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfPoland,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "Rz??d Rzeczpospolita Polska"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Poland"}],
   :rdfs/seeAlso "https://www.gov.pl/",
   :skos/definition
   "unitary, semi-presidential, constitutional, and representative democratic republic located in Central Europe and bordered by the Baltic Sea, Lithuania, and Russia's Kaliningrad Oblast to the north, Belarus and Ukraine to the east, Slovakia and the Czech Republic to the south, and Germany to the west"})

(def GovernmentOfTheRussianFederation
  "federal, dominant-party and semi-presidential constitutional republic located in Eastern Europe and Northern Asia"
  {:cmns-rga/governs :lcc-3166-1/RussianFederation,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfRussianFederation,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheRussianFederation,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "?????????????????????????? ???????????????????? ??????????????????"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Russian Federation"}],
   :rdfs/seeAlso "http://government.ru/en/",
   :skos/definition
   "federal, dominant-party and semi-presidential constitutional republic located in Eastern Europe and Northern Asia"})

(def GovernmentOfTheSlovakRepublic
  "unitary, parliamentary democratic republic that is a landlocked country in Central Europe, bordered by Poland to the north, Ukraine to the east, Hungary to the south, Austria to the southwest, and Czech Republic to the northwest"
  {:cmns-rga/governs :lcc-3166-1/Slovakia,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfSlovakia,
   :db/ident :cmns-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sk",
                 :rdf/value    "Vl??da Slovenskej republiky"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Slovak Republic"}],
   :rdfs/seeAlso "https://www.vlada.gov.sk/government-of-the-slovak-republic/",
   :skos/definition
   "unitary, parliamentary democratic republic that is a landlocked country in Central Europe, bordered by Poland to the north, Ukraine to the east, Hungary to the south, Austria to the southwest, and Czech Republic to the northwest"})

(def GovernmentOfUkraine
  "unitary, mixed semi-parliamentary and semi-presidential, constitutional republic located in Eastern Europe, bordered by Russia to the north-east; Belarus to the north; Poland, Slovakia and Hungary to the west; and Romania, Moldova, and the Black Sea to the south"
  {:cmns-rga/governs :lcc-3166-1/Ukraine,
   :cmns-rga/hasJurisdiction :cmns-ge-eeuj/JurisdictionOfUkraine,
   :db/ident :cmns-ge-eeuj/GovernmentOfUkraine,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "uk",
                 :rdf/value    "???????? ??????????????"}
                {:rdf/language "en",
                 :rdf/value    "Government of Ukraine"}],
   :rdfs/seeAlso "https://www.president.gov.ua/en/",
   :skos/definition
   "unitary, mixed semi-parliamentary and semi-presidential, constitutional republic located in Eastern Europe, bordered by Russia to the north-east; Belarus to the north; Poland, Slovakia and Hungary to the west; and Romania, Moldova, and the Black Sea to the south"})

(def HungarianEntity
  "sovereign state and polity that is Hungary"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Hungary,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfHungary,
   :db/ident        :cmns-ge-eeuj/HungarianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "hu",
                      :rdf/value    "Magyar entit??s"}
                     {:rdf/language "en",
                      :rdf/value    "Hungarian entity"}],
   :skos/definition "sovereign state and polity that is Hungary"})

(def JurisdictionOfBelarus
  "jurisdiction of the judiciary of Belarus, consisting of the Supreme Court and specialized courts such as the Constitutional Court, which deals with specific issues related to constitutional and business law"
  {:cmns-rga/hasReach :lcc-3166-1/Belarus,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheRepublicOfBelarus,
   :db/ident :cmns-ge-eeuj/JurisdictionOfBelarus,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "be",
                 :rdf/value    "???????????????????? ????????????????"}
                {:rdf/language "en",
                 :rdf/value    "???????????????????? ????????????????"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Belarus"}],
   :skos/definition
   "jurisdiction of the judiciary of Belarus, consisting of the Supreme Court and specialized courts such as the Constitutional Court, which deals with specific issues related to constitutional and business law"})

(def JurisdictionOfBulgaria
  "jurisdiction of the judiciary of Bulgaria, a civil law legal system under the Ministry of Justice, including the Supreme Administrative Court and the Supreme Court of Cassation, which are the highest courts of appeal and oversee the application of laws in subordinate courts"
  {:cmns-rga/hasReach :lcc-3166-1/Bulgaria,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheRepublicOfBulgaria,
   :db/ident :cmns-ge-eeuj/JurisdictionOfBulgaria,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "bg",
                 :rdf/value    "???????????????????? ???? ????????????????"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Bulgaria"}],
   :skos/definition
   "jurisdiction of the judiciary of Bulgaria, a civil law legal system under the Ministry of Justice, including the Supreme Administrative Court and the Supreme Court of Cassation, which are the highest courts of appeal and oversee the application of laws in subordinate courts"})

(def JurisdictionOfCzechia
  "jurisdiction of the judiciary of the Czech Republic, a civil law system grounded in the Constitution of the Czech Republic, including the Constitutional Court, Supreme Court, and Supreme Administrative Court, as well as district and county courts that are divided into civil, criminal, and administrative branches"
  {:cmns-rga/hasReach :lcc-3166-1/Czechia,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheCzechRepublic,
   :db/ident :cmns-ge-eeuj/JurisdictionOfCzechia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "cs",
                 :rdf/value    "jurisdikce ??eska"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Czechia"}],
   :skos/definition
   "jurisdiction of the judiciary of the Czech Republic, a civil law system grounded in the Constitution of the Czech Republic, including the Constitutional Court, Supreme Court, and Supreme Administrative Court, as well as district and county courts that are divided into civil, criminal, and administrative branches"})

(def JurisdictionOfHungary
  "jurisdiction of the judiciary of Hungary, a civil law system based primarily on German that is divided between courts with regular civil and criminal jurisdiction and administrative courts, including local courts, regional appellate courts, and the supreme court"
  {:cmns-rga/hasReach :lcc-3166-1/Hungary,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfHungary,
   :db/ident :cmns-ge-eeuj/JurisdictionOfHungary,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Hungary"}
                {:rdf/language "hu",
                 :rdf/value    "Magyarorsz??g joghat??s??ga"}],
   :skos/definition
   "jurisdiction of the judiciary of Hungary, a civil law system based primarily on German that is divided between courts with regular civil and criminal jurisdiction and administrative courts, including local courts, regional appellate courts, and the supreme court"})

(def JurisdictionOfMoldova
  "jurisdiction of the judiciary of Moldova, which is the system of courts that interprets and applies the law in Moldova, including an independent Constitutional Court"
  {:cmns-rga/hasReach :lcc-3166-1/Moldova,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :db/ident :cmns-ge-eeuj/JurisdictionOfMoldova,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ro",
                 :rdf/value    "jurisdic??ia Moldovei"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Moldova"}],
   :skos/definition
   "jurisdiction of the judiciary of Moldova, which is the system of courts that interprets and applies the law in Moldova, including an independent Constitutional Court"})

(def JurisdictionOfPoland
  "jurisdiction of the judiciary of Poland, a four-tier court system composed of the Supreme Court, the Supreme Administrative Court, Common Courts (District, Regional, Appellate) and the Military Court"
  {:cmns-rga/hasReach :lcc-3166-1/Poland,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :db/ident :cmns-ge-eeuj/JurisdictionOfPoland,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "pl",
                 :rdf/value    "jurysdykcja Polski"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Poland"}],
   :skos/definition
   "jurisdiction of the judiciary of Poland, a four-tier court system composed of the Supreme Court, the Supreme Administrative Court, Common Courts (District, Regional, Appellate) and the Military Court"})

(def JurisdictionOfRomania
  "jurisdiction of the judiciary of Romania, a civil law system influenced by the French system that is a hierarchical system of courts with the High Court of Cassation and Justice being the supreme court of Romania, and includes courts of appeal, county courts and local courts"
  {:cmns-rga/hasReach :lcc-3166-1/Romania,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfRomania,
   :db/ident :cmns-ge-eeuj/JurisdictionOfRomania,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ro",
                 :rdf/value    "jurisdic??ia Rom??niei"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Romania"}],
   :skos/definition
   "jurisdiction of the judiciary of Romania, a civil law system influenced by the French system that is a hierarchical system of courts with the High Court of Cassation and Justice being the supreme court of Romania, and includes courts of appeal, county courts and local courts"})

(def JurisdictionOfRussianFederation
  "jurisdiction of the judiciary of Russian Federation, which is the system of courts that interprets and applies the law in the Russian Federation, including Constitutional Court, Supreme Court and lower federal courts, whose judges are appointed by the Federation Council on the recommendation of the President"
  {:cmns-rga/hasReach :lcc-3166-1/RussianFederation,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheRussianFederation,
   :db/ident :cmns-ge-eeuj/JurisdictionOfRussianFederation,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "???????????????????? ???????????????????? ??????????????????"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Russian Federation"}],
   :skos/definition
   "jurisdiction of the judiciary of Russian Federation, which is the system of courts that interprets and applies the law in the Russian Federation, including Constitutional Court, Supreme Court and lower federal courts, whose judges are appointed by the Federation Council on the recommendation of the President"})

(def JurisdictionOfSlovakia
  "jurisdiction of the judiciary of the Slovak Republic, which is the system of courts that interprets and applies the law in Slovakia, whose highest judicial body is the Constitutional Court of Slovakia, which rules on constitutional issues"
  {:cmns-rga/hasReach :lcc-3166-1/Slovakia,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :db/ident :cmns-ge-eeuj/JurisdictionOfSlovakia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sk",
                 :rdf/value    "jurisdikcia Slovenska"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Slovakia"}],
   :skos/definition
   "jurisdiction of the judiciary of the Slovak Republic, which is the system of courts that interprets and applies the law in Slovakia, whose highest judicial body is the Constitutional Court of Slovakia, which rules on constitutional issues"})

(def JurisdictionOfUkraine
  "jurisdiction of the judiciary of Ukraine, which is the system of courts that interprets and applies the law in Ukraine, including the Supreme Court of Ukraine, which is the highest judicial body in the system of courts of general jurisdiction in Ukraine"
  {:cmns-rga/hasReach :lcc-3166-1/Ukraine,
   :cmns-rga/isJurisdictionOf :cmns-ge-eeuj/GovernmentOfUkraine,
   :db/ident :cmns-ge-eeuj/JurisdictionOfUkraine,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "uk",
                 :rdf/value    "???????????????????? ??????????????"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Ukraine"}],
   :skos/definition
   "jurisdiction of the judiciary of Ukraine, which is the system of courts that interprets and applies the law in Ukraine, including the Supreme Court of Ukraine, which is the highest judicial body in the system of courts of general jurisdiction in Ukraine"})

(def MoldovanEntity
  "sovereign state and polity that is Moldova"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Moldova,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheRepublicOfMoldova,
   :db/ident        :cmns-ge-eeuj/MoldovanEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Moldovan entity"}
                     {:rdf/language "ro",
                      :rdf/value    "Entitate moldoveneasc??"}],
   :skos/definition "sovereign state and polity that is Moldova"})

(def PolishEntity
  "sovereign state and polity that is Poland"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Poland,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheRepublicOfPoland,
   :db/ident        :cmns-ge-eeuj/PolishEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Polish entity"}
                     {:rdf/language "pl",
                      :rdf/value    "Podmiot polski"}],
   :skos/definition "sovereign state and polity that is Poland"})

(def RomanianEntity
  "sovereign state and polity that is Romania"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Romania,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfRomania,
   :db/ident        :cmns-ge-eeuj/RomanianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Romanian entity"}
                     {:rdf/language "ro",
                      :rdf/value    "Entitate rom??neasc??"}],
   :skos/definition "sovereign state and polity that is Romania"})

(def RussianEntity
  "federated sovereignty and polity that is the Russian Federation"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/RussianFederation,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheRussianFederation,
   :db/ident :cmns-ge-eeuj/RussianEntity,
   :rdf/type [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "???????????????????? ??????????????????????"}
                {:rdf/language "en",
                 :rdf/value    "Russian entity"}],
   :skos/definition
   "federated sovereignty and polity that is the Russian Federation"})

(def SlovakEntity
  "sovereign state and polity that is Slovakia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Slovakia,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfTheSlovakRepublic,
   :db/ident        :cmns-ge-eeuj/SlovakEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "sk",
                      :rdf/value    "Slovensk?? subjekt"}
                     {:rdf/language "en",
                      :rdf/value    "Slovak entity"}],
   :skos/definition "sovereign state and polity that is Slovakia"})

(def UkranianEntity
  "sovereign state and polity that is Ukraine"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Ukraine,
   :cmns-ge/isRepresentedBy :cmns-ge-eeuj/GovernmentOfUkraine,
   :db/ident        :cmns-ge-eeuj/UkranianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "uk",
                      :rdf/value    "???????????????????? ??????????????????"}
                     {:rdf/language "en",
                      :rdf/value    "Ukrainian entity"}],
   :skos/definition "sovereign state and polity that is Ukraine"})