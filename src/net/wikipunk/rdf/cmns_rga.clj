(ns net.wikipunk.rdf.cmns-rga
  "This ontology defines general purpose concepts for representation of regulatory agencies, also known as regulatory authorities or regulators. It was derived from the FIBO Regulatory Agencies, Legal Capacity, and Jurisdictions ontologies and simplified/adapted for broader use."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/RegulatoryAgencies.rdf",
   :dcterms/abstract
   "This ontology defines general purpose concepts for representation of regulatory agencies, also known as regulatory authorities or regulators. It was derived from the FIBO Regulatory Agencies, Legal Capacity, and Jurisdictions ontologies and simplified/adapted for broader use.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/Organizations/"
                 "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
                 "https://www.omg.org/spec/Commons/ContextualIdentifiers/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/Documents/"
                 "https://www.omg.org/spec/Commons/ProductsAndServices/"
                 "https://www.omg.org/spec/Commons/DatesAndTimes/"
                 "https://www.omg.org/spec/Commons/PartiesAndSituations/"
                 "https://www.omg.org/spec/Commons/Identifiers/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/RegulatoryAgencies/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
   :rdfa/prefix "cmns-rga",
   :rdfa/uri "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
   :rdfs/label "Regulatory Agencies Ontology"})

(def GovernmentIssuedLicense
  "grant of permission to legally perform some task, provide some product or service, exercise a certain privilege, or pursue some business or occupation"
  {:cmns-av/adaptedFrom
   "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012",
   :db/ident :cmns-rga/GovernmentIssuedLicense,
   :rdf/type :owl/Class,
   :rdfs/label "government-issued license",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/isIssuedBy,
                      :owl/someValuesFrom :cmns-rga/RegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     :cmns-rga/License],
   :skos/definition
   "grant of permission to legally perform some task, provide some product or service, exercise a certain privilege, or pursue some business or occupation"})

(def Jurisdiction
  "power of a court or regulatory agency to adjudicate cases, issue orders, and interpret and apply the law with respect to some specific geographic area"
  {:cmns-av/adaptedFrom "https://www.law.cornell.edu/wex/jurisdiction",
   :db/ident :cmns-rga/Jurisdiction,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-rga/hasReach,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/Context],
   :skos/definition
   "power of a court or regulatory agency to adjudicate cases, issue orders, and interpret and apply the law with respect to some specific geographic area"})

(def License
  "grant of permission needed to do something"
  {:cmns-av/adaptedFrom
   "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012",
   :cmns-av/explanatoryNote
   "Note that in some cases, a license may also be considered an agreement or contract, depending on the specifics of the license and jurisdiction.",
   :db/ident :cmns-rga/License,
   :rdf/type :owl/Class,
   :rdfs/label "license",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/isIssuedBy,
                      :owl/someValuesFrom :cmns-rga/Licensor,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-pts/hasPartyRole,
                      :owl/someValuesFrom :cmns-rga/Licensee,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-dt/DatePeriod,
                      :owl/onProperty :cmns-pts/holdsDuring,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-doc/LegalDocument],
   :skos/definition "grant of permission needed to do something"})

(def LicenseIdentifier
  "contextual identifier that is unique within the context of the licensor for a license"
  {:db/ident :cmns-rga/LicenseIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "license identifier",
   :rdfs/subClassOf [{:owl/onClass    :cmns-rga/License,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-cxtid/ContextualIdentifier],
   :skos/definition
   "contextual identifier that is unique within the context of the licensor for a license"})

(def Licensee
  "party to whom a license has been granted"
  {:cmns-av/adaptedFrom
   "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012",
   :db/ident :cmns-rga/Licensee,
   :rdf/type :owl/Class,
   :rdfs/label "licensee",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                                           :owl/someValuesFrom
                                           :cmns-rga/License,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Undergoer
                     :cmns-pts/PartyRole],
   :skos/definition "party to whom a license has been granted"})

(def Licensor
  "party that grants a license"
  {:cmns-av/adaptedFrom
   "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012",
   :db/ident :cmns-rga/Licensor,
   :rdf/type :owl/Class,
   :rdfs/label "licensor",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/issues,
                      :owl/someValuesFrom :cmns-rga/License,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                                           :owl/someValuesFrom
                                           :cmns-rga/License,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Actor],
   :skos/definition "party that grants a license"})

(def RegulatoryAgency
  "public authority or government agency responsible for exercising authority over something in a regulatory or supervisory capacity"
  {:cmns-av/explanatoryNote
   "Typically, a regulatory agency is chartered to protect some constituancy, (e.g., investors in the financial industry, consumers with respect to product safety), to ensure the fairness and integrity of some market, and fair and safe business practices among the service providers in that market.",
   :cmns-av/synonym ["regulator" "regulatory authority" "regulatory body"],
   :db/ident :cmns-rga/RegulatoryAgency,
   :rdf/type :owl/Class,
   :rdfs/label "regulatory agency",
   :rdfs/subClassOf [:cmns-prd/ServiceProvider
                     :cmns-pts/Actor
                     {:owl/minCardinality 0,
                      :owl/onProperty     :cmns-rga/regulates,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-rga/GovernmentIssuedLicense,
                      :owl/onProperty :cmns-prd/issues,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-rga/hasJurisdiction,
                      :owl/someValuesFrom :cmns-rga/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-rga/RegulatoryService,
                      :owl/onProperty :cmns-prd/provides,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "public authority or government agency responsible for exercising authority over something in a regulatory or supervisory capacity",
   :skos/example
   "See http://www.finra.org/AboutFINRA/ for an example describing a regulatory agency."})

(def RegulatoryReport
  "report required to support operational transparency that demonstrates compliance with some specification, law, policy, restriction, or other rule specified by a regulatory agency"
  {:cmns-av/explanatoryNote
   "Such a report may be needed for licensing, monitoring, taxation, or for other purposes that demonstrate the integrity, fairness, safety, or other capacity of a given industry, organization, or product.",
   :db/ident :cmns-rga/RegulatoryReport,
   :rdf/type :owl/Class,
   :rdfs/label "regulatory report",
   :rdfs/subClassOf :cmns-doc/Report,
   :skos/definition
   "report required to support operational transparency that demonstrates compliance with some specification, law, policy, restriction, or other rule specified by a regulatory agency"})

(def RegulatoryService
  "service provided by a regulatory agency, which may include, but not be limited to, examination, monitoring, supervision, testing, or other capabilities required to ensure the integrity, fairness, safety, or other capacity of a given industry, organization, or product"
  {:db/ident :cmns-rga/RegulatoryService,
   :rdf/type :owl/Class,
   :rdfs/label "regulatory service",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/isProvidedBy,
                      :owl/someValuesFrom :cmns-rga/RegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     :cmns-prd/Service],
   :skos/definition
   "service provided by a regulatory agency, which may include, but not be limited to, examination, monitoring, supervision, testing, or other capabilities required to ensure the integrity, fairness, safety, or other capacity of a given industry, organization, or product"})

(def governs
  "has and exercises authority over, regulates"
  {:db/ident        :cmns-rga/governs,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "governs",
   :skos/definition "has and exercises authority over, regulates"})

(def hasJurisdiction
  "relates a polity, government entity or regulatory agency to one or more jurisdictions, over which it has some level of legal authority"
  {:db/ident :cmns-rga/hasJurisdiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has jurisdiction",
   :rdfs/range :cmns-rga/Jurisdiction,
   :rdfs/subPropertyOf :cmns-rga/governs,
   :skos/definition
   "relates a polity, government entity or regulatory agency to one or more jurisdictions, over which it has some level of legal authority"})

(def hasReach
  "indicates the geopolitical area covered by the jurisdiction"
  {:db/ident :cmns-rga/hasReach,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rga/Jurisdiction,
   :rdfs/label "has reach",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :cmns-cxtdsg/isApplicableIn,
   :skos/definition
   "indicates the geopolitical area covered by the jurisdiction"})

(def isApplicableInJurisdiction
  "indicates the geopolitical region identifier for the jurisdiction in which something is applicable"
  {:db/ident :cmns-rga/isApplicableInJurisdiction,
   :owl/propertyChainAxiom
   [:cmns-cxtdsg/isApplicableIn :cmns-rga/hasReach :cmns-id/isIdentifiedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is applicable in jurisdiction",
   :skos/definition
   "indicates the geopolitical region identifier for the jurisdiction in which something is applicable"})

(def isGovernedBy
  "relates a contract, agreement, jurisdiction, or other legal construct and the regulation, policy, procedure, or legal person that regulates or oversees (governs) it"
  {:db/ident :cmns-rga/isGovernedBy,
   :owl/inverseOf :cmns-rga/governs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is governed by",
   :skos/definition
   "relates a contract, agreement, jurisdiction, or other legal construct and the regulation, policy, procedure, or legal person that regulates or oversees (governs) it"})

(def isJurisdictionOf
  "relates a jurisdiction to a polity or other government entity or court that has some level of legal authority over it"
  {:db/ident :cmns-rga/isJurisdictionOf,
   :owl/inverseOf :cmns-rga/hasJurisdiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rga/Jurisdiction,
   :rdfs/label "is jurisdiction of",
   :rdfs/subPropertyOf :cmns-rga/isGovernedBy,
   :skos/definition
   "relates a jurisdiction to a polity or other government entity or court that has some level of legal authority over it"})

(def isOrganizedIn
  "indicates the jurisdiction whose laws a legal entity is organized under"
  {:db/ident :cmns-rga/isOrganizedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/LegalEntity,
   :rdfs/label "is organized in",
   :rdfs/range :cmns-rga/Jurisdiction,
   :rdfs/subPropertyOf :cmns-rga/isRecognizedIn,
   :skos/definition
   "indicates the jurisdiction whose laws a legal entity is organized under"})

(def isRecognizedIn
  "indicates the jurisdiction in which a legal person is considered competent to enter into a contract, conduct business, or participate in other activities, or in which an agreement may be acknowledged and possibly enforceable"
  {:db/ident :cmns-rga/isRecognizedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is recognized in",
   :rdfs/range :cmns-rga/Jurisdiction,
   :rdfs/subPropertyOf :cmns-rga/isGovernedBy,
   :skos/definition
   "indicates the jurisdiction in which a legal person is considered competent to enter into a contract, conduct business, or participate in other activities, or in which an agreement may be acknowledged and possibly enforceable"})

(def isRegulatedBy
  "specifies a regulatory agency that has regulatory authority for something"
  {:db/ident :cmns-rga/isRegulatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is regulated by",
   :rdfs/range :cmns-rga/RegulatoryAgency,
   :rdfs/subPropertyOf [:cmns-rga/isGovernedBy :cmns-pts/hasPartyRole],
   :skos/definition
   "specifies a regulatory agency that has regulatory authority for something"})

(def regulates
  "has regulatory authority over or directs according to rule or law, typically an industry, organization, or product"
  {:cmns-av/adaptedFrom "http://www.merriam-webster.com/dictionary/regulate",
   :db/ident :cmns-rga/regulates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-rga/RegulatoryAgency,
   :rdfs/label "regulates",
   :rdfs/subPropertyOf :cmns-rga/governs,
   :skos/definition
   "has regulatory authority over or directs according to rule or law, typically an industry, organization, or product"})