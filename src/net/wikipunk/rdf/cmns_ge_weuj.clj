(ns net.wikipunk.rdf.cmns-ge-weuj
  "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective."
  {:cmns-av/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions.rdf",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a business perspective.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-weuj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
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
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "cmns-ge-weuj",
   :rdfa/uri
   "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Commons Western Europe Government Entities and Jurisdictions Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Western Europe Government Entities and Jurisdictions ontology.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only."})

(def AustrianEntity
  "federated sovereignty and polity that is Austria"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Austria,
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfTheRepublicOfAustria,
   :db/ident        :cmns-ge-weuj/AustrianEntity,
   :rdf/type        [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label      "Austrian entity",
   :skos/definition "federated sovereignty and polity that is Austria"})

(def BelgianEntity
  "federated sovereignty and polity that is Belgium"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Belgium,
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfTheKingdomOfBelgium,
   :db/ident        :cmns-ge-weuj/BelgianEntity,
   :rdf/type        [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label      "Belgian entity",
   :skos/definition "federated sovereignty and polity that is Belgium"})

(def FrenchEntity
  "sovereign state and polity that is France"
  {:cmns-ge/hasFullSovereigntyOver [:lcc-3166-1/FrenchSouthernTerritories
                                    :lcc-3166-1/France],
   :cmns-ge/hasSharedSovereigntyOver [:lcc-3166-1/SaintBarthelemy
                                      :lcc-3166-1/Mayotte
                                      :lcc-3166-1/SaintMartin
                                      :lcc-3166-1/SaintPierreAndMiquelon
                                      :lcc-3166-1/WallisAndFutuna
                                      :lcc-3166-1/FrenchGuiana
                                      :lcc-3166-1/Martinique
                                      :lcc-3166-1/Reunion
                                      :lcc-3166-1/FrenchPolynesia
                                      :lcc-3166-1/NewCaledonia
                                      :lcc-3166-1/Guadeloupe],
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfTheFrenchRepublic,
   :db/ident :cmns-ge-weuj/FrenchEntity,
   :rdf/type [:owl/NamedIndividual :cmns-ge/SovereignState],
   :rdfs/label "French entity",
   :skos/definition "sovereign state and polity that is France"})

(def GermanEntity
  "federated sovereignty and polity that is Germany"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Germany,
   :cmns-ge/isRepresentedBy
   :cmns-ge-weuj/GovernmentOfTheFederalRepublicOfGermany,
   :db/ident        :cmns-ge-weuj/GermanEntity,
   :rdf/type        [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label      "German entity",
   :skos/definition "federated sovereignty and polity that is Germany"})

(def GovernmentOfTheFederalRepublicOfGermany
  "democratic, federal parliamentary republic led by a chancellor, where federal legislative power is vested in the parliament, consisting of the Bundestag and the Bundesrat"
  {:cmns-rga/governs :lcc-3166-1/Germany,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfGermany,
   :db/ident :cmns-ge-weuj/GovernmentOfTheFederalRepublicOfGermany,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the Federal Republic of Germany"}
                {:rdf/language "de",
                 :rdf/value    "Bundesrepublik Deutschland"}],
   :rdfs/seeAlso "https://www.bundesregierung.de/breg-en",
   :skos/definition
   "democratic, federal parliamentary republic led by a chancellor, where federal legislative power is vested in the parliament, consisting of the Bundestag and the Bundesrat"})

(def GovernmentOfTheFrenchRepublic
  "unitary semi-presidential constitutional republic, built on strong representative democratic roots, based on the Constitution of the Fifth Republic which was approved in 1958"
  {:cmns-rga/governs :lcc-3166-1/France,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfFrance,
   :db/ident :cmns-ge-weuj/GovernmentOfTheFrenchRepublic,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of the French Republic"}
                {:rdf/language "fr",
                 :rdf/value    "Gouvernement de la République française"}],
   :rdfs/seeAlso "https://www.gouvernement.fr/en/news",
   :skos/definition
   "unitary semi-presidential constitutional republic, built on strong representative democratic roots, based on the Constitution of the Fifth Republic which was approved in 1958"})

(def GovernmentOfTheGrandDuchyOfLuxembourg
  "representative democracy that is a unitary, parliamentary constitutional monarchy, headed by the Grand Duke, which is the world's only remaining sovereign grand duchy"
  {:cmns-rga/governs :lcc-3166-1/Luxembourg,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfLuxembourg,
   :db/ident :cmns-ge-weuj/GovernmentOfTheGrandDuchyOfLuxembourg,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label "Government of the Grand Duchy of Luxembourg",
   :rdfs/seeAlso "https:/gouvernement.lu/en.html",
   :skos/definition
   "representative democracy that is a unitary, parliamentary constitutional monarchy, headed by the Grand Duke, which is the world's only remaining sovereign grand duchy"})

(def GovernmentOfTheKingdomOfBelgium
  "federal parliamentary constitutional monarchy, whose head of state is the king, though with limited prerogatives"
  {:cmns-rga/governs :lcc-3166-1/Belgium,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfBelgium,
   :db/ident :cmns-ge-weuj/GovernmentOfTheKingdomOfBelgium,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Kingdom of Belgium"},
   :rdfs/seeAlso "https://www.belgium.be/en/about_belgium/government",
   :skos/definition
   "federal parliamentary constitutional monarchy, whose head of state is the king, though with limited prerogatives"})

(def GovernmentOfTheNetherlands
  "parliamentary constitutional monarchy with a unitary structure, with its monarch as head of state"
  {:cmns-rga/governs :lcc-3166-1/Netherlands,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfTheNetherlands,
   :db/ident :cmns-ge-weuj/GovernmentOfTheNetherlands,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "Rijksoverheid"}
                {:rdf/language "en",
                 :rdf/value    "Government of the Netherlands"}],
   :rdfs/seeAlso "https://www.government.nl/",
   :skos/definition
   "parliamentary constitutional monarchy with a unitary structure, with its monarch as head of state"})

(def GovernmentOfThePrincipalityOfLiechtenstein
  "semi-constitutional monarchy headed by the Prince of Liechtenstein, with an elected parliament that enacts the law, as well as being a direct democracy, where voters can propose and enact constitutional amendments and legislation independently of the legislature"
  {:cmns-rga/governs :lcc-3166-1/Liechtenstein,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfLiechtenstein,
   :db/ident :cmns-ge-weuj/GovernmentOfThePrincipalityOfLiechtenstein,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label "Government of the Principality of Liechtenstein",
   :rdfs/seeAlso
   "https://www.liechtenstein.li/en/country-and-people/state/government/",
   :skos/definition
   "semi-constitutional monarchy headed by the Prince of Liechtenstein, with an elected parliament that enacts the law, as well as being a direct democracy, where voters can propose and enact constitutional amendments and legislation independently of the legislature"})

(def GovernmentOfThePrincipalityOfMonaco
  "constitutional monarchy with the Sovereign Prince of Monaco as head of state, and a Minister of State as the head of government, who presides over a five-member Council of Government"
  {:cmns-rga/governs :lcc-3166-1/Monaco,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfMonaco,
   :db/ident :cmns-ge-weuj/GovernmentOfThePrincipalityOfMonaco,
   :rdf/type [:cmns-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/label "Government of the Principality of Monaco",
   :rdfs/seeAlso "https://en.gouv.mc/",
   :skos/definition
   "constitutional monarchy with the Sovereign Prince of Monaco as head of state, and a Minister of State as the head of government, who presides over a five-member Council of Government"})

(def GovernmentOfTheRepublicOfAustria
  "federal, representative democratic republic, with nine states, whose head of state is the Federal President (Bundespräsident), and head of the federal government is the Federal Chancellor (Bundeskanzler)"
  {:cmns-rga/governs :lcc-3166-1/Austria,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfAustria,
   :db/ident :cmns-ge-weuj/GovernmentOfTheRepublicOfAustria,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Republic of Austria"},
   :rdfs/seeAlso "https://www.bundeskanzleramt.gv.at/en.html",
   :skos/definition
   "federal, representative democratic republic, with nine states, whose head of state is the Federal President (Bundespräsident), and head of the federal government is the Federal Chancellor (Bundeskanzler)"})

(def GovernmentOfTheSwissConfederation
  "federal semi-direct democracy under a multi-party presidential directorial republic, which represents a confederation of 26 cantons and communes with executive, legislative and judiciary branches"
  {:cmns-rga/governs :lcc-3166-1/Switzerland,
   :cmns-rga/hasJurisdiction :cmns-ge-weuj/JurisdictionOfSwitzerland,
   :db/ident :cmns-ge-weuj/GovernmentOfTheSwissConfederation,
   :rdf/type [:cmns-ge/FederalGovernment :owl/NamedIndividual],
   :rdfs/label "Government of the Swiss Confederation",
   :rdfs/seeAlso "https://www.admin.ch/gov/en/start.html/",
   :skos/definition
   "federal semi-direct democracy under a multi-party presidential directorial republic, which represents a confederation of 26 cantons and communes with executive, legislative and judiciary branches"})

(def JurisdictionOfAustria
  "jurisdiction of the judiciary of Austria (österreichische Justiz), consisting of general courts (ordentliche Gerichte) and courts of public law (Gerichte öffentlichen Rechts)"
  {:cmns-rga/hasReach :lcc-3166-1/Austria,
   :cmns-rga/isJurisdictionOf :cmns-ge-weuj/GovernmentOfTheRepublicOfAustria,
   :db/ident :cmns-ge-weuj/JurisdictionOfAustria,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Austria",
   :skos/definition
   "jurisdiction of the judiciary of Austria (österreichische Justiz), consisting of general courts (ordentliche Gerichte) and courts of public law (Gerichte öffentlichen Rechts)"})

(def JurisdictionOfBelgium
  "jurisdiction of the judiciary of Belgium, which is based on civil law and originates from the Napoleonic code, including the Court of Cassation and the courts of appeal, one level below"
  {:cmns-rga/hasReach :lcc-3166-1/Belgium,
   :cmns-rga/isJurisdictionOf :cmns-ge-weuj/GovernmentOfTheKingdomOfBelgium,
   :db/ident :cmns-ge-weuj/JurisdictionOfBelgium,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Belgium",
   :skos/definition
   "jurisdiction of the judiciary of Belgium, which is based on civil law and originates from the Napoleonic code, including the Court of Cassation and the courts of appeal, one level below"})

(def JurisdictionOfFrance
  "jurisdiction of the judiciary of France, which is part of the Ministry of Justice based on a civil legal system, headed by the Court of Cassation and Council of State"
  {:cmns-rga/hasReach :lcc-3166-1/France,
   :cmns-rga/isJurisdictionOf :cmns-ge-weuj/GovernmentOfTheFrenchRepublic,
   :db/ident :cmns-ge-weuj/JurisdictionOfFrance,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of France",
   :skos/definition
   "jurisdiction of the judiciary of France, which is part of the Ministry of Justice based on a civil legal system, headed by the Court of Cassation and Council of State"})

(def JurisdictionOfGermany
  "jurisdiction of the judiciary of Germany, whose civil law system is based on Roman law with some references to early Germanic law, headed by the Bundesverfassungsgericht (German supreme court) responsible for constitutional matters"
  {:cmns-rga/hasReach :lcc-3166-1/Germany,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-weuj/GovernmentOfTheFederalRepublicOfGermany,
   :db/ident :cmns-ge-weuj/JurisdictionOfGermany,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "German jurisdiction",
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/Judiciary_of_Germany/",
   :skos/definition
   "jurisdiction of the judiciary of Germany, whose civil law system is based on Roman law with some references to early Germanic law, headed by the Bundesverfassungsgericht (German supreme court) responsible for constitutional matters"})

(def JurisdictionOfLiechtenstein
  "jurisdiction of the judiciary of Liechtenstein, the system of courts and tribunals which interpret and apply the law in Liechtenstein, including the Regional Court at Vaduz, the Princely High Court of Appeal at Vaduz, the Princely Supreme Court, the Administrative Court, and the State Court"
  {:cmns-rga/hasReach :lcc-3166-1/Liechtenstein,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-weuj/GovernmentOfThePrincipalityOfLiechtenstein,
   :db/ident :cmns-ge-weuj/JurisdictionOfLiechtenstein,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Liechtenstein",
   :skos/definition
   "jurisdiction of the judiciary of Liechtenstein, the system of courts and tribunals which interpret and apply the law in Liechtenstein, including the Regional Court at Vaduz, the Princely High Court of Appeal at Vaduz, the Princely Supreme Court, the Administrative Court, and the State Court"})

(def JurisdictionOfLuxembourg
  "jurisdiction of the judiciary of Luxembourg, the system of courts and tribunals which interpret and apply the law in Luxembourg, including three lower tribunals (justices de paix; in Esch-sur-Alzette, the city of Luxembourg, and Diekirch), two district tribunals (Luxembourg and Diekirch), and a Superior Court of Justice (Luxembourg), which includes the Court of Appeal and the Court of Cassation"
  {:cmns-rga/hasReach :lcc-3166-1/Luxembourg,
   :cmns-rga/isJurisdictionOf
   :cmns-ge-weuj/GovernmentOfTheGrandDuchyOfLuxembourg,
   :db/ident :cmns-ge-weuj/JurisdictionOfLuxembourg,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Luxembourg",
   :rdfs/seeAlso
   "https://gouvernement.lu/en/systeme-politique/cours-tribunaux.html",
   :skos/definition
   "jurisdiction of the judiciary of Luxembourg, the system of courts and tribunals which interpret and apply the law in Luxembourg, including three lower tribunals (justices de paix; in Esch-sur-Alzette, the city of Luxembourg, and Diekirch), two district tribunals (Luxembourg and Diekirch), and a Superior Court of Justice (Luxembourg), which includes the Court of Appeal and the Court of Cassation"})

(def JurisdictionOfMonaco
  "jurisdiction of the judiciary of Monaco, the system of courts and tribunals which interpret and apply the law in Monaco, including the Monegasque Supreme Court, one of the highest courts of law in the city-state of Monaco for judicial appeals as well as ensuring the constitution of Monaco is upheld"
  {:cmns-rga/hasReach :lcc-3166-1/Monaco,
   :cmns-rga/isJurisdictionOf :cmns-ge-weuj/GovernmentOfThePrincipalityOfMonaco,
   :db/ident :cmns-ge-weuj/JurisdictionOfMonaco,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Monaco",
   :skos/definition
   "jurisdiction of the judiciary of Monaco, the system of courts and tribunals which interpret and apply the law in Monaco, including the Monegasque Supreme Court, one of the highest courts of law in the city-state of Monaco for judicial appeals as well as ensuring the constitution of Monaco is upheld"})

(def JurisdictionOfSwitzerland
  "jurisdiction of the Federal Supreme Court, Federal Criminal Court, Federal Administrative Court, and the Federal Patent Court representing the judiciary branch at the federal level in Switzerland"
  {:cmns-rga/hasReach :lcc-3166-1/Switzerland,
   :cmns-rga/isJurisdictionOf :cmns-ge-weuj/GovernmentOfTheSwissConfederation,
   :db/ident :cmns-ge-weuj/JurisdictionOfSwitzerland,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of Switzerland",
   :rdfs/seeAlso
   "https://www.ch.ch/en/demokratie/federalism/separation-of-powers/switzerlands-courts/",
   :skos/definition
   "jurisdiction of the Federal Supreme Court, Federal Criminal Court, Federal Administrative Court, and the Federal Patent Court representing the judiciary branch at the federal level in Switzerland"})

(def JurisdictionOfTheNetherlands
  "jurisdiction of the judiciary of the Netherlands, the system of courts which interprets and applies the law in the Netherlands"
  {:cmns-rga/hasReach :lcc-3166-1/Netherlands,
   :cmns-rga/isJurisdictionOf :cmns-ge-weuj/GovernmentOfTheNetherlands,
   :db/ident :cmns-ge-weuj/JurisdictionOfTheNetherlands,
   :rdf/type [:cmns-rga/Jurisdiction :owl/NamedIndividual],
   :rdfs/label "jurisdiction of the Netherlands",
   :rdfs/seeAlso "https://en.wikipedia.org/wiki/Judiciary_of_the_Netherlands",
   :skos/definition
   "jurisdiction of the judiciary of the Netherlands, the system of courts which interprets and applies the law in the Netherlands"})

(def LiechtensteinerEntity
  "sovereign state and polity that is Liechtenstein"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Liechtenstein,
   :cmns-ge/isRepresentedBy
   :cmns-ge-weuj/GovernmentOfThePrincipalityOfLiechtenstein,
   :db/ident        :cmns-ge-weuj/LiechtensteinerEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Liechtensteiner entity",
   :skos/definition "sovereign state and polity that is Liechtenstein"})

(def LuxembourgerEntity
  "sovereign state and polity that is Luxembourg"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Luxembourg,
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfTheGrandDuchyOfLuxembourg,
   :db/ident        :cmns-ge-weuj/LuxembourgerEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Luxembourger entity",
   :skos/definition "sovereign state and polity that is Luxembourg"})

(def MonegasqueEntity
  "sovereign state and polity that is Monaco"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Monaco,
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfThePrincipalityOfMonaco,
   :db/ident        :cmns-ge-weuj/MonegasqueEntity,
   :rdf/type        [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label      "Monegasque entity",
   :skos/definition "sovereign state and polity that is Monaco"})

(def NetherlandsEntity
  "sovereign state and polity that is the Netherlands"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Netherlands,
   :cmns-ge/hasSharedSovereigntyOver [:lcc-3166-1/SintMaarten
                                      :lcc-3166-1/Bonaire],
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfTheNetherlands,
   :db/ident :cmns-ge-weuj/NetherlandsEntity,
   :rdf/type [:cmns-ge/SovereignState :owl/NamedIndividual],
   :rdfs/label "Netherlands entity",
   :skos/definition "sovereign state and polity that is the Netherlands"})

(def SwissEntity
  "federated sovereignty and polity that is Switzerland"
  {:cmns-ge/hasFullSovereigntyOver :lcc-3166-1/Switzerland,
   :cmns-ge/isRepresentedBy :cmns-ge-weuj/GovernmentOfTheSwissConfederation,
   :db/ident        :cmns-ge-weuj/SwissEntity,
   :rdf/type        [:cmns-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/label      "Swiss entity",
   :skos/definition "federated sovereignty and polity that is Switzerland"})