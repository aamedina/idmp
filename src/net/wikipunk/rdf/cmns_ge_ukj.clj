(ns net.wikipunk.rdf.cmns-ge-ukj
  "The UK Government Entities and Jurisdictions ontology defines government entities and jurisdictions for the United Kingdom of Great Britain and Northern Ireland for use other ontologies and applications that need them."
  {:cmns-av/copyright ["Copyright (c) 2016-2022 EDM Council, Inc."
                       "Copyright (c) 2016-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "The UK Government Entities and Jurisdictions ontology defines government entities and jurisdictions for the United Kingdom of Great Britain and Northern Ireland for use other ontologies and applications that need them.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221201/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-ukj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-gb"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-ukj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons Government Entities and Jurisdictions for the United Kingdom of Great Britain and Northern Ireland Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) UK Government Entities and Jurisdictions ontology."})

(def EnglandAndWalesJurisdiction
  "jurisdiction of the Courts of England and Wales"
  {:cmns-rga/hasReach [:lcc-3166-2-gb/Wales :lcc-3166-2-gb/England],
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/NationalAssemblyForWales,
   :db/ident          :cmns-ge-ukj/EnglandAndWalesJurisdiction,
   :rdf/type          [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label        "England and Wales jurisdiction",
   :rdfs/seeAlso      "https://law.gov.wales/",
   :skos/definition   "jurisdiction of the Courts of England and Wales"})

(def GovernmentOfGuernsey
  "parliamentary representative democracy that is the central government of the Bailiwick of Guernsey, a self-governing dependency of the United Kingdom and one of the British Channel Islands off the coast of Normandy"
  {:cmns-rga/governs :lcc-3166-1/Guernsey,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/JurisdictionOfGuernsey,
   :db/ident :cmns-ge-ukj/GovernmentOfGuernsey,
   :rdf/type [:cmns-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of Guernsey"}
                {:rdf/language "fr",
                 :rdf/value    "Gouvèrnément d'Guernési"}],
   :rdfs/seeAlso "https://www.gov.gg/",
   :skos/definition
   "parliamentary representative democracy that is the central government of the Bailiwick of Guernsey, a self-governing dependency of the United Kingdom and one of the British Channel Islands off the coast of Normandy"})

(def GovernmentOfJersey
  "central government of the Bailiwick of Jersey, a self-governing dependency of the United Kingdom that is the largest of the Channel Islands between England and France"
  {:cmns-rga/governs :lcc-3166-1/Jersey,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/JurisdictionOfJersey,
   :db/ident :cmns-ge-ukj/GovernmentOfJersey,
   :rdf/type [:cmns-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of Jersey"}
                {:rdf/language "fr",
                 :rdf/value    "Gouvèrnément d'Jèrri"}],
   :rdfs/seeAlso "https://www.gov.je/Pages/default.aspx",
   :skos/definition
   "central government of the Bailiwick of Jersey, a self-governing dependency of the United Kingdom that is the largest of the Channel Islands between England and France"})

(def GovernmentOfScotland
  "devolved government of Scotland"
  {:cmns-av/synonym  "Scottish government",
   :cmns-rga/governs :lcc-3166-2-gb/Scotland,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/ScotlandJurisdiction,
   :db/ident         :cmns-ge-ukj/GovernmentOfScotland,
   :rdf/type         [:cmns-ge/DevolvedGovernment
                      :cmns-ge/RegionalGovernment
                      :owl/NamedIndividual],
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "Government of Scotland"}
                      {:rdf/language "gd",
                       :rdf/value    "Riaghaltas na h-Alba"}],
   :rdfs/seeAlso     ["https://www.gov.scot/"
                      "https://www.parliament.scot/index.aspx"],
   :skos/definition  "devolved government of Scotland"})

(def GovernmentOfTheIsleOfMan
  "central government of the Isle of Man, a self-governing British Crown dependency in the Irish Sea between England and Ireland"
  {:cmns-av/synonym "Manx Government",
   :cmns-rga/governs :lcc-3166-1/IsleOfMan,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/JurisdictionOfTheIsleOfMan,
   :db/ident :cmns-ge-ukj/GovernmentOfTheIsleOfMan,
   :rdf/type [:cmns-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Isle of Man"},
   :rdfs/seeAlso "https://www.gov.im/",
   :skos/definition
   "central government of the Isle of Man, a self-governing British Crown dependency in the Irish Sea between England and Ireland"})

(def GovernmentOfTheUnitedKingdom
  "constitutional monarchy that is the government of the United Kingdom of Great Britain and Northern Ireland, including the monarch, who is the head of state and sovereign, prime minister, who is the head of government, and cabinet, parliament (House of Lords and House of Commons), and other agencies and institutions that comprise the government"
  {:cmns-av/synonym "British government",
   :cmns-rga/governs :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/UnitedKingdomJurisdiction,
   :db/ident :cmns-ge-ukj/GovernmentOfTheUnitedKingdom,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label "Government of the United Kingdom",
   :rdfs/seeAlso
   ["https://www.gov.uk/"
    "http://www.parliament.uk/about/how/role/parliament-government/"],
   :skos/definition
   "constitutional monarchy that is the government of the United Kingdom of Great Britain and Northern Ireland, including the monarch, who is the head of state and sovereign, prime minister, who is the head of government, and cabinet, parliament (House of Lords and House of Commons), and other agencies and institutions that comprise the government"})

(def GuernseyEntity
  "regional sovereignty and polity that is the Bailiwick of Guernsey"
  {:cmns-ge/hasSharedSovereigntyOver :lcc-3166-1/Guernsey,
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/GovernmentOfGuernsey,
   :db/ident :cmns-ge-ukj/GuernseyEntity,
   :rdf/type [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label "Guernsey entity",
   :skos/definition
   "regional sovereignty and polity that is the Bailiwick of Guernsey"})

(def IsleOfManEntity
  "regional sovereignty and polity that is the Isle of Man"
  {:cmns-av/synonym "Manx entity",
   :cmns-ge/hasSharedSovereigntyOver :lcc-3166-1/IsleOfMan,
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/GovernmentOfTheIsleOfMan,
   :db/ident        :cmns-ge-ukj/IsleOfManEntity,
   :rdf/type        [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label      "Isle of Man entity",
   :skos/definition "regional sovereignty and polity that is the Isle of Man"})

(def JerseyEntity
  "regional sovereignty and polity that is the Bailiwick of Jersey"
  {:cmns-ge/hasSharedSovereigntyOver :lcc-3166-1/Jersey,
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/GovernmentOfJersey,
   :db/ident :cmns-ge-ukj/JerseyEntity,
   :rdf/type [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label "Jersey entity",
   :skos/definition
   "regional sovereignty and polity that is the Bailiwick of Jersey"})

(def JurisdictionOfGuernsey
  "jurisdiction of the bailiwick judiciary of Guernsey, headed by its Bailiff, which is derived from a combination of Norman Customary Law and principles taken from English common law and Equity, as well as from statute law enacted by the competent legislature(s)"
  {:cmns-rga/hasReach :lcc-3166-1/Guernsey,
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/GovernmentOfGuernsey,
   :db/ident :cmns-ge-ukj/JurisdictionOfGuernsey,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Guernsey",
   :skos/definition
   "jurisdiction of the bailiwick judiciary of Guernsey, headed by its Bailiff, which is derived from a combination of Norman Customary Law and principles taken from English common law and Equity, as well as from statute law enacted by the competent legislature(s)"})

(def JurisdictionOfJersey
  "jurisdiction of the judiciary of Jersey, headed by is the Bailiff, who as well as performing the judicial functions of a chief justice is also the President (presiding officer) of the States of Jersey and has certain civic, ceremonial and executive functions"
  {:cmns-rga/hasReach :lcc-3166-1/Jersey,
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/GovernmentOfJersey,
   :db/ident :cmns-ge-ukj/JurisdictionOfJersey,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Jersey",
   :skos/definition
   "jurisdiction of the judiciary of Jersey, headed by is the Bailiff, who as well as performing the judicial functions of a chief justice is also the President (presiding officer) of the States of Jersey and has certain civic, ceremonial and executive functions"})

(def JurisdictionOfTheIsleOfMan
  "jurisdiction of the judiciary of the Isle of Man, including the High Court of Justice of the Isle of Man, consisting of a Civil Division and an appeal division, called the Staff of Government Division"
  {:cmns-rga/hasReach :lcc-3166-1/IsleOfMan,
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/GovernmentOfTheIsleOfMan,
   :db/ident :cmns-ge-ukj/JurisdictionOfTheIsleOfMan,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Isle of Man",
   :skos/definition
   "jurisdiction of the judiciary of the Isle of Man, including the High Court of Justice of the Isle of Man, consisting of a Civil Division and an appeal division, called the Staff of Government Division"})

(def NationalAssemblyForWales
  "devolved government of Wales"
  {:cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "Welsh Assembly"}
                     {:rdf/language "cy",
                      :rdf/value    "Senedd"}],
   :cmns-rga/governs :lcc-3166-2-gb/Wales,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/EnglandAndWalesJurisdiction,
   :db/ident :cmns-ge-ukj/NationalAssemblyForWales,
   :rdf/type [:cmns-ge/RegionalGovernment
              :owl/NamedIndividual
              :cmns-ge/DevolvedGovernment],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "National Assembly for Wales"}
                {:rdf/language "cy",
                 :rdf/value    "Cynulliad Cenedlaethol Cymru"}],
   :rdfs/seeAlso ["http://www.assembly.wales/en/Pages/Home.aspx"
                  "https://law.gov.wales/constitution-government/devolution/"],
   :skos/definition "devolved government of Wales"})

(def NorthernIrelandAssembly
  "devolved government of Northern Ireland"
  {:cmns-rga/governs :lcc-3166-2-gb/NorthernIreland,
   :cmns-rga/hasJurisdiction :cmns-ge-ukj/NorthernIrelandJurisdiction,
   :db/ident         :cmns-ge-ukj/NorthernIrelandAssembly,
   :rdf/type         [:cmns-ge/RegionalGovernment
                      :cmns-ge/DevolvedGovernment
                      :owl/NamedIndividual],
   :rdfs/label       [{:rdf/language "ga",
                       :rdf/value    "Tionól Thuaisceart Éireann"}
                      {:rdf/language "en",
                       :rdf/value    "Northern Ireland Assembly"}],
   :rdfs/seeAlso     "http://www.niassembly.gov.uk/",
   :skos/definition  "devolved government of Northern Ireland"})

(def NorthernIrelandEntity
  "regional devolved sovereignty that is Northern Ireland"
  {:cmns-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/NorthernIreland,
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/NorthernIrelandAssembly,
   :db/ident        :cmns-ge-ukj/NorthernIrelandEntity,
   :rdf/type        [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Northern Ireland entity"},
   :rdfs/seeAlso    "http://www.niassembly.gov.uk/",
   :skos/definition "regional devolved sovereignty that is Northern Ireland"})

(def NorthernIrelandJurisdiction
  "jurisdiction of the Courts of Northern Ireland"
  {:cmns-rga/hasReach :lcc-3166-2-gb/NorthernIreland,
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/NorthernIrelandAssembly,
   :db/ident :cmns-ge-ukj/NorthernIrelandJurisdiction,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "Northern Ireland jurisdiction",
   :rdfs/seeAlso "https://www.justice-ni.gov.uk/topics/courts-and-tribunals",
   :skos/definition "jurisdiction of the Courts of Northern Ireland"})

(def ScotlandEntity
  "regional devolved sovereignty that is Scotland"
  {:cmns-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/Scotland,
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/GovernmentOfScotland,
   :db/ident        :cmns-ge-ukj/ScotlandEntity,
   :rdf/type        [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Scotland entity"},
   :rdfs/seeAlso    "https://www.gov.scot/",
   :skos/definition "regional devolved sovereignty that is Scotland"})

(def ScotlandJurisdiction
  "jurisdiction of the Supreme Courts of Scotland"
  {:cmns-rga/hasReach :lcc-3166-2-gb/Scotland,
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/GovernmentOfScotland,
   :db/ident :cmns-ge-ukj/ScotlandJurisdiction,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "Scotland jurisdiction",
   :rdfs/seeAlso
   ["https://www.scotcourts.gov.uk/the-courts/supreme-courts/high-court/about-the-high-court/"
    "https://www.scotcourts.gov.uk/the-courts/supreme-courts/about-the-court-of-session"
    "https://www.scotcourts.gov.uk/"],
   :skos/definition "jurisdiction of the Supreme Courts of Scotland"})

(def UnitedKingdomEntity
  "federated sovereignty and polity that is the United Kingdom of Great Britain and Northern Ireland"
  {:cmns-ge/hasFullSovereigntyOver
   [:lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland
    :lcc-3166-1/Gibraltar],
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/GovernmentOfTheUnitedKingdom,
   :db/ident :cmns-ge-ukj/UnitedKingdomEntity,
   :rdf/type [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label "United Kingdom entity",
   :rdfs/seeAlso "https://www.gov.uk/",
   :skos/definition
   "federated sovereignty and polity that is the United Kingdom of Great Britain and Northern Ireland"})

(def UnitedKingdomJurisdiction
  "jurisdiction of the Supreme Court of the United Kingdom, the tribunal system, including the Asylum and Immigration Tribunal and the Special Immigration Appeals Commission, Employment tribunals and the Employment Appeal Tribunal"
  {:cmns-rga/hasReach :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :cmns-rga/isJurisdictionOf :cmns-ge-ukj/GovernmentOfTheUnitedKingdom,
   :db/ident :cmns-ge-ukj/UnitedKingdomJurisdiction,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "United Kingdom jurisdiction",
   :rdfs/seeAlso "https://www.supremecourt.uk/",
   :skos/definition
   "jurisdiction of the Supreme Court of the United Kingdom, the tribunal system, including the Asylum and Immigration Tribunal and the Special Immigration Appeals Commission, Employment tribunals and the Employment Appeal Tribunal",
   :skos/scopeNote
   "Note that the Courts of the United Kingdom are separated into three separate jurisdictions, the Courts of England and Wales, Courts of Scotland and the Courts of Northern Ireland, as the United Kingdom does not have a single unified judicial system, aside from the courts specifically identified in the definition of this individual."})

(def WelshEntity
  "regional devolved sovereignty that is Wales"
  {:cmns-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/Wales,
   :cmns-ge/isRepresentedBy :cmns-ge-ukj/NationalAssemblyForWales,
   :db/ident        :cmns-ge-ukj/WelshEntity,
   :rdf/type        [:cmns-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Welsh entity"},
   :rdfs/seeAlso    "http://www.assembly.wales/en/Pages/Home.aspx",
   :skos/definition "regional devolved sovereignty that is Wales"})