(ns net.wikipunk.rdf.cmns-ge-neuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Northern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective."
  {:cmns-av/copyright ["Copyright (c) 2010-2022 EDM Council, Inc."
                       "Copyright (c) 2010-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Northern Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-neuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
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
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-neuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons Northern Europe Government Entities and Jurisdictions Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Northern Europe Government Entities and Jurisdictions ontology.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def AlandIslandsJurisdiction
  "jurisdiction of the Aland District Court, which deals with criminal cases, civil cases and petitionary matters in first instance, with escalation to the appellate level in Finland as needed"
  {:cmns-av/synonym {:rdf/language "fi",
                     :rdf/value    "Ålands tingsrätt"},
   :cmns-rga/hasReach :lcc-3166-1/AlandIslands,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfAland,
   :db/ident :cmns-ge-neuj/AlandIslandsJurisdiction,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "fi",
                 :rdf/value    "Ahvenanmaan lainkäyttöalue"}
                {:rdf/language "sv",
                 :rdf/value    "Ålandöarnas jurisdiktion"}
                {:rdf/language "en",
                 :rdf/value    "Aland Islands jurisdiction"}],
   :rdfs/seeAlso "https://www.lexadin.nl/wlg/courts/nofr/eur/lxctfin.htm/",
   :skos/definition
   "jurisdiction of the Aland District Court, which deals with criminal cases, civil cases and petitionary matters in first instance, with escalation to the appellate level in Finland as needed"})

(def AlandicEntity
  "regional sovereignty and polity that is Aland"
  {:cmns-ge/hasSharedSovereigntyOver :lcc-3166-1/AlandIslands,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfAland,
   :db/ident        :cmns-ge-neuj/AlandicEntity,
   :rdf/type        [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "sv",
                      :rdf/value    "Ålandisk enhet"}
                     {:rdf/language "en",
                      :rdf/value    "Alandic entity"}
                     {:rdf/language "fi",
                      :rdf/value    "Ahvenanmaan kokonaisuus"}],
   :skos/definition "regional sovereignty and polity that is Aland"})

(def DanishEntity
  "sovereign state and polity that is Denmark"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Denmark,
   :cmns-ge/hasSharedSovereigntyOver [:lcc-3166-1/Greenland
                                      :lcc-3166-1/FaroeIslands],
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :db/ident :cmns-ge-neuj/DanishEntity,
   :rdf/type [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "da",
                 :rdf/value    "Dansk enhed"}
                {:rdf/language "en",
                 :rdf/value    "Danish entity"}],
   :skos/definition "sovereign state and polity that is Denmark"})

(def EstonianEntity
  "sovereign state and polity that is Estonia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Estonia,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :db/ident        :cmns-ge-neuj/EstonianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Estonian entity"}
                     {:rdf/language "et",
                      :rdf/value    "Eesti üksus"}],
   :skos/definition "sovereign state and polity that is Estonia"})

(def FinnishEntity
  "sovereign state and polity that is Finland"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Finland,
   :cmns-ge/hasSharedSovereigntyOver :lcc-3166-1/AlandIslands,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :db/ident :cmns-ge-neuj/FinnishEntity,
   :rdf/type [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "fi",
                 :rdf/value    "Suomen entiteetti"}
                {:rdf/language "en",
                 :rdf/value    "Finnish entity"}],
   :skos/definition "sovereign state and polity that is Finland"})

(def GovernmentOfAland
  "regional government of the Aland Islands, an archipelago province at the entrance to the Gulf of Bothnia in the Baltic Sea belonging to Finland"
  {:cmns-av/explanatoryNote
   "The Aland Islands are governed according to the Act on the Autonomy of Aland and international treaties. These laws guarantee the islands' autonomy from Finland, which has ultimate sovereignty over them, as well as a demilitarised status. The Government of Aland answers to the Parliament of Aland, in accordance with the principles of parliamentarism.",
   :cmns-rga/governs :lcc-3166-1/AlandIslands,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/AlandIslandsJurisdiction,
   :db/ident :cmns-ge-neuj/GovernmentOfAland,
   :rdf/type [:cmns-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "Ålands regering"}
                {:rdf/language "en",
                 :rdf/value    "Government of Aland"}
                {:rdf/language "fi",
                 :rdf/value    "Ahvenanmaan hallitus"}],
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/%C3%85land_Islands/",
   :skos/definition
   "regional government of the Aland Islands, an archipelago province at the entrance to the Gulf of Bothnia in the Baltic Sea belonging to Finland"})

(def GovernmentOfIceland
  "unitary parliamentary republic and representative democracy, that is a Nordic island country in the North Atlantic"
  {:cmns-rga/governs :lcc-3166-1/Iceland,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfIceland,
   :db/ident :cmns-ge-neuj/GovernmentOfIceland,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "is",
                 :rdf/value    "Ríkisstjórn Íslands"}
                {:rdf/language "en",
                 :rdf/value    "Government of Iceland"}],
   :rdfs/seeAlso "https://www.government.is/",
   :skos/definition
   "unitary parliamentary republic and representative democracy, that is a Nordic island country in the North Atlantic"})

(def GovernmentOfTheKingdomOfDenmark
  "unitary constitutional monarchy and parliamentary democracy, with the monarch as the official head of government, that includes the southernmost of the Scandinavian countries, consisting of a peninsula, Jutland, and an archipelago of 443 named islands"
  {:cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "Danish government"}
                     {:rdf/language "da",
                      :rdf/value    "Danmarks regering"}],
   :cmns-rga/governs :lcc-3166-1/Denmark,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfDenmark,
   :db/ident :cmns-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :rdf/type [:owl/NamedIndividual :cmns-ge/NationalGovernment],
   :rdfs/label [{:rdf/language "da",
                 :rdf/value    "Kongeriget Danmarks regering"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Denmark"}],
   :rdfs/seeAlso
   "https://denmark.dk/society-and-business/government-and-politics/",
   :skos/definition
   "unitary constitutional monarchy and parliamentary democracy, with the monarch as the official head of government, that includes the southernmost of the Scandinavian countries, consisting of a peninsula, Jutland, and an archipelago of 443 named islands"})

(def GovernmentOfTheKingdomOfNorway
  "unitary constitutional monarchy and parliamentary democracy, wherein the monarch is the head of state and the prime minister is the head of government, whose mainland comprises the western and northernmost portion of the Scandinavian Peninsula and includes the remote island of Jan Mayen as well as the archipelago of Svalbard"
  {:cmns-rga/governs :lcc-3166-1/Norway,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfNorway,
   :db/ident :cmns-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "no",
                 :rdf/value    "Kongeriket Norges regjering"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Norway"}],
   :rdfs/seeAlso "https://www.regjeringen.no/en/the-government/id443314/",
   :skos/definition
   "unitary constitutional monarchy and parliamentary democracy, wherein the monarch is the head of state and the prime minister is the head of government, whose mainland comprises the western and northernmost portion of the Scandinavian Peninsula and includes the remote island of Jan Mayen as well as the archipelago of Svalbard"})

(def GovernmentOfTheKingdomOfSweden
  "constitutional monarchy and parliamentary democracy, with a largely ceremonial and representative monarch as head of state, located in Scandinavia between the North Atlantic, the Baltic Sea and Eurasian Russia"
  {:cmns-rga/governs :lcc-3166-1/Sweden,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfSweden,
   :db/ident :cmns-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "Konungariket Sveriges regering"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Kingdom of Sweden"}],
   :rdfs/seeAlso "https://www.government.se/government-of-sweden/",
   :skos/definition
   "constitutional monarchy and parliamentary democracy, with a largely ceremonial and representative monarch as head of state, located in Scandinavia between the North Atlantic, the Baltic Sea and Eurasian Russia"})

(def GovernmentOfTheRepublicOfEstonia
  "democratic unitary parliamentary republic divided into fifteen counties, located on the eastern coast of the Baltic Sea in Northern Europe"
  {:cmns-rga/governs :lcc-3166-1/Estonia,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfEstonia,
   :db/ident :cmns-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the Republic of Estonia"}
                {:rdf/language "et",
                 :rdf/value    "Eesti Vabariigi valitsus"}],
   :rdfs/seeAlso "https://www.valitsus.ee/en/",
   :skos/definition
   "democratic unitary parliamentary republic divided into fifteen counties, located on the eastern coast of the Baltic Sea in Northern Europe"})

(def GovernmentOfTheRepublicOfFinland
  "parliamentary republic within the framework of a representative democracy comprised of 19 regions and 310 municipalities, located in the Nordic region of Europe"
  {:cmns-rga/governs :lcc-3166-1/Finland,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfFinland,
   :db/ident :cmns-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "fi",
                 :rdf/value    "Suomen tasavallan hallitus"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Finland"}],
   :rdfs/seeAlso "https://valtioneuvosto.fi/en/government",
   :skos/definition
   "parliamentary republic within the framework of a representative democracy comprised of 19 regions and 310 municipalities, located in the Nordic region of Europe"})

(def GovernmentOfTheRepublicOfIreland
  "parliamentary, representative democratic republic, based on the British model, that is an independent state and member of the European Union, which covers five-sixths of the island of Ireland in the North Atlantic"
  {:cmns-rga/governs :lcc-3166-1/Ireland,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfIreland,
   :db/ident :cmns-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "ga",
                 :rdf/value    "Rialtas Phoblacht na hÉireann"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Ireland"}],
   :rdfs/seeAlso "https://www.gov.ie/",
   :skos/definition
   "parliamentary, representative democratic republic, based on the British model, that is an independent state and member of the European Union, which covers five-sixths of the island of Ireland in the North Atlantic"})

(def GovernmentOfTheRepublicOfLatvia
  "unitary, parliamentary, constitutional republic located in the Baltic region of Northern Europe"
  {:cmns-rga/governs :lcc-3166-1/Latvia,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfLatvia,
   :db/ident :cmns-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "lv",
                 :rdf/value    "Latvijas Republikas valdība"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Latvia"}],
   :rdfs/seeAlso "https://www.mk.gov.lv/en",
   :skos/definition
   "unitary, parliamentary, constitutional republic located in the Baltic region of Northern Europe"})

(def GovernmentOfTheRepublicOfLithuania
  "unitary semi-presidential republic situated along the southeastern shore of the Baltic Sea, to the southeast of Sweden and Denmark"
  {:cmns-rga/governs :lcc-3166-1/Lithuania,
   :cmns-rga/hasJurisdiction :cmns-ge-neuj/JurisdictionOfLithuania,
   :db/ident :cmns-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "lt",
                 :rdf/value    "Lietuvos Respublikos Vyriausybė"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Republic of Lithuania"}],
   :rdfs/seeAlso "https://lrv.lt/en/",
   :skos/definition
   "unitary semi-presidential republic situated along the southeastern shore of the Baltic Sea, to the southeast of Sweden and Denmark"})

(def IcelandicEntity
  "sovereign state and polity that is Iceland"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Iceland,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfIceland,
   :db/ident        :cmns-ge-neuj/IcelandicEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "is",
                      :rdf/value    "Íslensk eining"}
                     {:rdf/language "en",
                      :rdf/value    "Icelandic entity"}],
   :skos/definition "sovereign state and polity that is Iceland"})

(def IrishEntity
  "sovereign state and polity that is Ireland"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Ireland,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :db/ident        :cmns-ge-neuj/IrishEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Irish entity"}
                     {:rdf/language "ga",
                      :rdf/value    "Aonán Éireannach"}],
   :skos/definition "sovereign state and polity that is Ireland"})

(def JurisdictionOfDenmark
  "jurisdiction of the judiciary of Denmark, a civil law system with some references to Germanic law that was substantially reformed in 2007"
  {:cmns-rga/hasReach :lcc-3166-1/Denmark,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheKingdomOfDenmark,
   :db/ident :cmns-ge-neuj/JurisdictionOfDenmark,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Denmark"}
                {:rdf/language "da",
                 :rdf/value    "Danmarks jurisdiktion"}],
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/Courts_of_Denmark/",
   :skos/definition
   "jurisdiction of the judiciary of Denmark, a civil law system with some references to Germanic law that was substantially reformed in 2007"})

(def JurisdictionOfEstonia
  "jurisdiction of the judiciary of Estonia, a civil law legal system based on the Germanic legal model, whose Supreme Court is the court of cassation, which also conducts constitutional review"
  {:cmns-rga/hasReach :lcc-3166-1/Estonia,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheRepublicOfEstonia,
   :db/ident :cmns-ge-neuj/JurisdictionOfEstonia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Estonia"}
                {:rdf/language "et",
                 :rdf/value    "Eesti jurisdiktsioon"}],
   :rdfs/seeAlso
   "https://www.kohus.ee/en/estonian-courts/estonian-court-system",
   :skos/definition
   "jurisdiction of the judiciary of Estonia, a civil law legal system based on the Germanic legal model, whose Supreme Court is the court of cassation, which also conducts constitutional review"})

(def JurisdictionOfFinland
  "jurisdiction of the judiciary of Finland, a civil law system divided between courts with regular civil and criminal jurisdiction and administrative courts with jurisdiction over litigation between individuals and the public administration"
  {:cmns-rga/hasReach :lcc-3166-1/Finland,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheRepublicOfFinland,
   :db/ident :cmns-ge-neuj/JurisdictionOfFinland,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Finland"}
                {:rdf/language "fi",
                 :rdf/value    "Suomen lainkäyttövaltaan"}],
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/Judicial_system_of_Finland",
   :skos/definition
   "jurisdiction of the judiciary of Finland, a civil law system divided between courts with regular civil and criminal jurisdiction and administrative courts with jurisdiction over litigation between individuals and the public administration"})

(def JurisdictionOfIceland
  "jurisdiction of the judiciary of Finland, a three-tier civil law system whose highest court is the Supreme Court of Iceland"
  {:cmns-rga/hasReach :lcc-3166-1/Iceland,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfIceland,
   :db/ident :cmns-ge-neuj/JurisdictionOfIceland,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "is",
                 :rdf/value    "lögsögu Íslands"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Iceland"}],
   :rdfs/seeAlso
   "https://www.government.is/topics/law-and-order/the-judicial-system-in-iceland/",
   :skos/definition
   "jurisdiction of the judiciary of Finland, a three-tier civil law system whose highest court is the Supreme Court of Iceland"})

(def JurisdictionOfIreland
  "jurisdiction of the judiciary of Ireland, which is the system of courts that interprets and applies the law in Ireland"
  {:cmns-rga/hasReach :lcc-3166-1/Ireland,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheRepublicOfIreland,
   :db/ident :cmns-ge-neuj/JurisdictionOfIreland,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Ireland"}
                {:rdf/language "ga",
                 :rdf/value    "dlínse na hÉireann"}],
   :rdfs/seeAlso "https://www.citizensinformation.ie/en/justice/courts_system/",
   :skos/definition
   "jurisdiction of the judiciary of Ireland, which is the system of courts that interprets and applies the law in Ireland"})

(def JurisdictionOfLatvia
  "jurisdiction of the judiciary of Latvia, which is the system of courts that interprets and applies the law in Latvia"
  {:cmns-rga/hasReach :lcc-3166-1/Latvia,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :db/ident :cmns-ge-neuj/JurisdictionOfLatvia,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Latvia"}
                {:rdf/language "lv",
                 :rdf/value    "Latvijas jurisdikcija"}],
   :rdfs/seeAlso "http://www.satv.tiesa.gov.lv/",
   :skos/definition
   "jurisdiction of the judiciary of Latvia, which is the system of courts that interprets and applies the law in Latvia"})

(def JurisdictionOfLithuania
  "jurisdiction of the judiciary of Lithuania, whose highest court is the Constitutional Court (Konstitucinis Teismas), but the general jurisdiction dealing with civil and criminal cases includes the Supreme Court of Lithuania, the Court of Appeal of Lithuania, regional courts, and district courts"
  {:cmns-rga/hasReach :lcc-3166-1/Lithuania,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :db/ident :cmns-ge-neuj/JurisdictionOfLithuania,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Lithuania"}
                {:rdf/language "lt",
                 :rdf/value    "Lietuvos jurisdikcija"}],
   :rdfs/seeAlso "https://www.teismai.lt/en/courts/judicial-system/650",
   :skos/definition
   "jurisdiction of the judiciary of Lithuania, whose highest court is the Constitutional Court (Konstitucinis Teismas), but the general jurisdiction dealing with civil and criminal cases includes the Supreme Court of Lithuania, the Court of Appeal of Lithuania, regional courts, and district courts"})

(def JurisdictionOfNorway
  "jurisdiction of the judiciary system in Norway, a civil law system where laws are created and amended in parliament and the system regulated through the Courts of Justice of Norway"
  {:cmns-rga/hasReach :lcc-3166-1/Sweden,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :db/ident :cmns-ge-neuj/JurisdictionOfNorway,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "no",
                 :rdf/value    "jurisdiksjon av Norge"}
                {:rdf/language "en",
                 :rdf/value    "jurisdiction of Norway"}],
   :rdfs/seeAlso "https://www.domstol.no/en/",
   :skos/definition
   "jurisdiction of the judiciary system in Norway, a civil law system where laws are created and amended in parliament and the system regulated through the Courts of Justice of Norway"})

(def JurisdictionOfSweden
  "jurisdiction of the judiciary system in Sweden, which is part of the Ministry of Justice, whose courts are divided into two parallel and separate systems - general courts (allmänna domstolar) for criminal and civil cases, and general administrative courts (allmänna förvaltningsdomstolar) for cases relating to disputes between private persons and the authorities"
  {:cmns-rga/hasReach :lcc-3166-1/Sweden,
   :cmns-rga/isJurisdictionOf :cmns-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :db/ident :cmns-ge-neuj/JurisdictionOfSweden,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "jurisdiction of Sweden"}
                {:rdf/language "sv",
                 :rdf/value    "Sveriges jurisdiktion"}],
   :rdfs/seeAlso
   "https://www.government.se/information-material/2019/03/organisation-and-responsibilities-of-the-ministry-of-justice/",
   :skos/definition
   "jurisdiction of the judiciary system in Sweden, which is part of the Ministry of Justice, whose courts are divided into two parallel and separate systems - general courts (allmänna domstolar) for criminal and civil cases, and general administrative courts (allmänna förvaltningsdomstolar) for cases relating to disputes between private persons and the authorities"})

(def LatvianEntity
  "sovereign state and polity that is Latvia"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Latvia,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheRepublicOfLatvia,
   :db/ident        :cmns-ge-neuj/LatvianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "lv",
                      :rdf/value    "Latvijas vienība"}
                     {:rdf/language "en",
                      :rdf/value    "Latvian entity"}],
   :skos/definition "sovereign state and polity that is Latvia"})

(def LithuanianEntity
  "sovereign state and polity that is Lithuania"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Lithuania,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheRepublicOfLithuania,
   :db/ident        :cmns-ge-neuj/LithuanianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Lithuanian entity"}
                     {:rdf/language "lt",
                      :rdf/value    "Lietuvos subjektas"}],
   :skos/definition "sovereign state and polity that is Lithuania"})

(def NorwegianEntity
  "sovereign state and polity that is Norway"
  {:cmns-ge/hasFullSovereigntyOver [:lcc-3166-1/SvalbardAndJanMayen
                                    :lcc-3166-1/Norway
                                    :lcc-3166-1/BouvetIsland],
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheKingdomOfNorway,
   :db/ident        :cmns-ge-neuj/NorwegianEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Norwegian entity"}
                     {:rdf/language "no",
                      :rdf/value    "Norsk enhet"}],
   :skos/definition "sovereign state and polity that is Norway"})

(def SwedishEntity
  "sovereign state and polity that is Sweden"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Sweden,
   :cmns-ge/isRepresentedBy :cmns-ge-neuj/GovernmentOfTheKingdomOfSweden,
   :db/ident        :cmns-ge-neuj/SwedishEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      [{:rdf/language "en",
                      :rdf/value    "Swedish entity"}
                     {:rdf/language "sv",
                      :rdf/value    "Svensk enhet"}],
   :skos/definition "sovereign state and polity that is Sweden"})