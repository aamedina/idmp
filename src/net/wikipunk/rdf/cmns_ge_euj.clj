(ns net.wikipunk.rdf.cmns-ge-euj
  "The Commons European Government Entities and Jurisdictions ontology defines basic European Union government level entities and jurisdictions needed by various ontologies and applications."
  {:cmns-av/copyright ["Copyright (c) 2016-2022 EDM Council, Inc."
                       "Copyright (c) 2016-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "The Commons European Government Entities and Jurisdictions ontology defines basic European Union government level entities and jurisdictions needed by various ontologies and applications.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-eeuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
    "cmns-ge-euj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "cmns-ge-neuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
    "cmns-ge-seuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
    "cmns-ge-ukj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
    "cmns-ge-wasj"
    "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
    "cmns-ge-weuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-euj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons European Government Entities and Jurisdictions Ontology",
   :skos/note
   "This ontology is derived from and significantly extends the Financial Industry Business Ontology (FIBO) European Government Entities and Jurisdictions ontology."})

(def CouncilOfEurope
  "supranational entity founded in the wake of World War II to uphold human rights, democracy and the rule of law in Europe"
  {:cmns-av/directSource "https://www.coe.int/en/web/portal/home",
   :cmns-av/explanatoryNote
   "Founded in 1949, it has 46 member states, with a population of approximately 675 million; it operates with an annual budget of approximately 500 million euros.",
   :cmns-col/hasMember [:cmns-ge-weuj/GermanEntity
                        :cmns-ge-seuj/SerbianEntity
                        :cmns-ge-seuj/AndorranEntity
                        :cmns-ge-neuj/DanishEntity
                        :cmns-ge-eeuj/PolishEntity
                        :cmns-ge-seuj/MontenegrinEntity
                        :cmns-ge-seuj/SammarineseEntity
                        :cmns-ge-seuj/CroatianEntity
                        :cmns-ge-wasj/GeorgianEntity
                        :cmns-ge-seuj/BosnianAndHerzegovinianEntity
                        :cmns-ge-eeuj/SlovakEntity
                        :cmns-ge-neuj/LithuanianEntity
                        :cmns-ge-seuj/GreekEntity
                        :cmns-ge-weuj/BelgianEntity
                        :cmns-ge-seuj/AlbanianEntity
                        :cmns-ge-neuj/IcelandicEntity
                        :cmns-ge-weuj/AustrianEntity
                        :cmns-ge-seuj/ItalianEntity
                        :cmns-ge-neuj/FinnishEntity
                        :cmns-ge-neuj/IrishEntity
                        :cmns-ge-seuj/SpanishEntity
                        :cmns-ge-wasj/ArmenianEntity
                        :cmns-ge-wasj/TurkishEntity
                        :cmns-ge-weuj/SwissEntity
                        :cmns-ge-weuj/NetherlandsEntity
                        :cmns-ge-weuj/FrenchEntity
                        :cmns-ge-neuj/EstonianEntity
                        :cmns-ge-eeuj/UkranianEntity
                        :cmns-ge-wasj/CypriotEntity
                        :cmns-ge-seuj/SloveneEntity
                        :cmns-ge-wasj/AzerbaijaniEntity
                        :cmns-ge-weuj/LuxembourgerEntity
                        :cmns-ge-weuj/MonegasqueEntity
                        :cmns-ge-seuj/PortugueseEntity
                        :cmns-ge-neuj/SwedishEntity
                        :cmns-ge-eeuj/HungarianEntity
                        :cmns-ge-weuj/LiechtensteinerEntity
                        :cmns-ge-seuj/MalteseEntity
                        :cmns-ge-eeuj/BulgarianEntity
                        :cmns-ge-eeuj/RomanianEntity
                        :cmns-ge-eeuj/MoldovanEntity
                        :cmns-ge-eeuj/CzechEntity
                        :cmns-ge-neuj/LatvianEntity
                        :cmns-ge-neuj/NorwegianEntity
                        :cmns-ge-ukj/UnitedKingdomEntity
                        :cmns-ge-seuj/NorthMacedonianEntity],
   :db/ident :cmns-ge-euj/CouncilOfEurope,
   :rdf/type [:owl/NamedIndividual :cmns-ge/SupranationalEntity],
   :rdfs/label "Council of Europe",
   :skos/definition
   "supranational entity founded in the wake of World War II to uphold human rights, democracy and the rule of law in Europe"})

(def EuropeanCommission
  "supranational entity that helps to shape the EU's overall strategy, proposes new EU laws and policies, monitors their implementation and manages the EU budget"
  {:cmns-av/abbreviation "EC",
   :cmns-av/directSource "https://ec.europa.eu/info/about-european-commission",
   :db/ident :cmns-ge-euj/EuropeanCommission,
   :rdf/type [:cmns-ge/SupranationalEntity :owl/NamedIndividual],
   :rdfs/label "European Commission",
   :skos/definition
   "supranational entity that helps to shape the EU's overall strategy, proposes new EU laws and policies, monitors their implementation and manages the EU budget",
   :skos/note
   "The European Commission also plays a significant role in supporting international development and delivering aid."})

(def EuropeanCommissionAsRegulatoryAgency
  "European Commission in its role as a regulator with shared jurisdiction over the European Union"
  {:cmns-pts/isPlayedBy :cmns-ge-euj/EuropeanCommission,
   :cmns-rga/hasJurisdiction :cmns-ge-euj/EuropeanUnionJurisdiction,
   :db/ident :cmns-ge-euj/EuropeanCommissionAsRegulatoryAgency,
   :rdf/type [:cmns-rga/RegulatoryAgency :owl/NamedIndividual],
   :rdfs/label "European Commission as regulatory agency",
   :skos/definition
   "European Commission in its role as a regulator with shared jurisdiction over the European Union"})

(def EuropeanEconomicArea
  "jurisdiction that consists of the member states of the European Union (EU) and three countries of the European Free Trade Association (EFTA) (Iceland, Liechtenstein and Norway; excluding Switzerland)"
  {:cmns-av/abbreviation "EEA",
   :cmns-av/explanatoryNote
   "The Agreement on the EEA entered into force on 1 January 1994. It seeks to strengthen trade and economic relations between the contracting parties and is principally concerned with the four fundamental pillars of the internal market, namely: the free movement of goods, people, services and capital. The availability of comparable statistical data is considered as relevant to the four freedoms and is therefore included in the agreement.",
   :cmns-rga/hasReach [:lcc-3166-1/Czechia
                       :lcc-3166-1/Estonia
                       :lcc-3166-1/Norway
                       :lcc-3166-1/Romania
                       :lcc-3166-1/Iceland
                       :lcc-3166-1/Portugal
                       :lcc-3166-1/Germany
                       :lcc-3166-1/Ireland
                       :lcc-3166-1/Denmark
                       :lcc-3166-1/Cyprus
                       :lcc-3166-1/Poland
                       :lcc-3166-1/Slovenia
                       :lcc-3166-1/Hungary
                       :lcc-3166-1/Malta
                       :lcc-3166-1/Sweden
                       :lcc-3166-1/Spain
                       :lcc-3166-1/Slovakia
                       :lcc-3166-1/Bulgaria
                       :lcc-3166-1/Belgium
                       :lcc-3166-1/Netherlands
                       :lcc-3166-1/Lithuania
                       :lcc-3166-1/Italy
                       :lcc-3166-1/Croatia
                       :lcc-3166-1/Austria
                       :lcc-3166-1/Finland
                       :lcc-3166-1/France
                       :lcc-3166-1/Latvia
                       :lcc-3166-1/Liechtenstein
                       :lcc-3166-1/Luxembourg
                       :lcc-3166-1/Greece],
   :db/ident :cmns-ge-euj/EuropeanEconomicArea,
   :dcterms/source
   "https://ec.europa.eu/eurostat/statistics-explained/index.php?title=Glossary:European_Economic_Area_(EEA)",
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "European Economic Area jurisdiction",
   :skos/definition
   "jurisdiction that consists of the member states of the European Union (EU) and three countries of the European Free Trade Association (EFTA) (Iceland, Liechtenstein and Norway; excluding Switzerland)"})

(def EuropeanFreeTradeAssociation
  "intergovernmental organization of Iceland, Liechtenstein, Norway and Switzerland set up for the promotion of free trade and economic cooperation between its members, within Europe, and globally"
  {:cmns-av/abbreviation "EFTA",
   :cmns-av/adaptedFrom "https://www.efta.int/about-efta",
   :cmns-col/hasMember [:cmns-ge-neuj/NorwegianEntity
                        :cmns-ge-weuj/SwissEntity
                        :cmns-ge-neuj/IcelandicEntity
                        :cmns-ge-weuj/LiechtensteinerEntity],
   :db/ident :cmns-ge-euj/EuropeanFreeTradeAssociation,
   :rdf/type [:owl/NamedIndividual :cmns-ge/SupranationalEntity],
   :rdfs/label "European Free Trade Association",
   :skos/definition
   "intergovernmental organization of Iceland, Liechtenstein, Norway and Switzerland set up for the promotion of free trade and economic cooperation between its members, within Europe, and globally",
   :skos/note
   "EFTA was established in 1960 by its then seven Member States for the promotion of free trade and economic integration between its members. The four EFTA States are competitive in several sectors vital to the global economy and score among the highest in the world in competitiveness, wealth creation per inhabitant, life expectancy and quality of life."})

(def EuropeanUnion
  "federated sovereignty and polity that is the European Union"
  {:cmns-ge/hasSharedSovereigntyOver [:lcc-3166-1/Ireland
                                      :lcc-3166-1/Romania
                                      :lcc-3166-1/Austria
                                      :lcc-3166-1/Estonia
                                      :lcc-3166-1/Malta
                                      :lcc-3166-1/Poland
                                      :lcc-3166-1/Netherlands
                                      :lcc-3166-1/Cyprus
                                      :lcc-3166-1/Italy
                                      :lcc-3166-1/Denmark
                                      :lcc-3166-1/Portugal
                                      :lcc-3166-1/Czechia
                                      :lcc-3166-1/Finland
                                      :lcc-3166-1/Latvia
                                      :lcc-3166-1/Sweden
                                      :lcc-3166-1/Slovakia
                                      :lcc-3166-1/France
                                      :lcc-3166-1/Croatia
                                      :lcc-3166-1/Slovenia
                                      :lcc-3166-1/Greece
                                      :lcc-3166-1/Belgium
                                      :lcc-3166-1/Hungary
                                      :lcc-3166-1/Spain
                                      :lcc-3166-1/Luxembourg
                                      :lcc-3166-1/Germany
                                      :lcc-3166-1/Lithuania
                                      :lcc-3166-1/Bulgaria],
   :cmns-ge/isRepresentedBy :cmns-ge-euj/GovernmentOfTheEuropeanUnion,
   :db/ident :cmns-ge-euj/EuropeanUnion,
   :rdf/type [:owl/NamedIndividual :cmns-ge/SupranationalEntity],
   :rdfs/label "European Union entity",
   :rdfs/seeAlso "https:/europa.eu/european-union/about-eu/countries_en",
   :skos/definition
   "federated sovereignty and polity that is the European Union"})

(def EuropeanUnionJurisdiction
  "jurisdiction for the European Union, namely, that of the Court of Justice of the EU and Court of Auditors of the EU"
  {:cmns-av/adaptedFrom "https:/europa.eu/european-union/about-eu/countries_en",
   :cmns-rga/hasReach [:lcc-3166-1/Romania
                       :lcc-3166-1/Denmark
                       :lcc-3166-1/Slovenia
                       :lcc-3166-1/Spain
                       :lcc-3166-1/Malta
                       :lcc-3166-1/Austria
                       :lcc-3166-1/Finland
                       :lcc-3166-1/Germany
                       :lcc-3166-1/Greece
                       :lcc-3166-1/Czechia
                       :lcc-3166-1/Lithuania
                       :lcc-3166-1/Belgium
                       :lcc-3166-1/Slovakia
                       :lcc-3166-1/Hungary
                       :lcc-3166-1/Sweden
                       :lcc-3166-1/Portugal
                       :lcc-3166-1/Ireland
                       :lcc-3166-1/Cyprus
                       :lcc-3166-1/France
                       :lcc-3166-1/Poland
                       :lcc-3166-1/Luxembourg
                       :lcc-3166-1/Italy
                       :lcc-3166-1/Estonia
                       :lcc-3166-1/Latvia
                       :lcc-3166-1/Netherlands
                       :lcc-3166-1/Bulgaria
                       :lcc-3166-1/Croatia],
   :cmns-rga/isJurisdictionOf :cmns-ge-euj/GovernmentOfTheEuropeanUnion,
   :db/ident :cmns-ge-euj/EuropeanUnionJurisdiction,
   :rdf/type [:owl/NamedIndividual :cmns-rga/Jurisdiction],
   :rdfs/label "European Union jurisdiction",
   :skos/definition
   "jurisdiction for the European Union, namely, that of the Court of Justice of the EU and Court of Auditors of the EU"})

(def GovernmentOfTheEuropeanUnion
  "parliament and other institutions that comprise the government of the European Union"
  {:cmns-av/adaptedFrom "https:/europa.eu/european-union/about-eu/countries_en",
   :cmns-av/explanatoryNote
   "In the EU's unique institutional set-up:\n- the EU's broad priorities are set by the Council of Europe, which brings together national and EU-level leaders directly elected MEPs represent European citizens in the European Parliament\n- the interests of the EU as a whole are promoted by the European Commission, whose members are appointed by national governments\n- governments defend their own country's national interests in the Council of Europe.",
   :cmns-ge/governs [:lcc-3166-1/Lithuania
                     :lcc-3166-1/Croatia
                     :lcc-3166-1/Finland
                     :lcc-3166-1/Spain
                     :lcc-3166-1/Romania
                     :lcc-3166-1/Ireland
                     :lcc-3166-1/Slovenia
                     :lcc-3166-1/Cyprus
                     :lcc-3166-1/Poland
                     :lcc-3166-1/Greece
                     :lcc-3166-1/Luxembourg
                     :lcc-3166-1/Latvia
                     :lcc-3166-1/Austria
                     :lcc-3166-1/Malta
                     :lcc-3166-1/Czechia
                     :lcc-3166-1/Bulgaria
                     :lcc-3166-1/Slovakia
                     :lcc-3166-1/Belgium
                     :lcc-3166-1/France
                     :lcc-3166-1/Portugal
                     :lcc-3166-1/Netherlands
                     :lcc-3166-1/Italy
                     :lcc-3166-1/Hungary
                     :lcc-3166-1/Denmark
                     :lcc-3166-1/Germany
                     :lcc-3166-1/Estonia
                     :lcc-3166-1/Sweden],
   :cmns-rga/hasJurisdiction :cmns-ge-euj/EuropeanUnionJurisdiction,
   :db/ident :cmns-ge-euj/GovernmentOfTheEuropeanUnion,
   :rdf/type [:cmns-ge/Government :owl/NamedIndividual],
   :rdfs/label "Government of the European Union",
   :skos/definition
   "parliament and other institutions that comprise the government of the European Union"})