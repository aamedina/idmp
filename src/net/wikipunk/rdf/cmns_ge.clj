(ns net.wikipunk.rdf.cmns-ge
  "The Commons Government Entities ontology defines fundamental concepts for representing polities, government bodies and the relations between them."
  {:cmns-av/copyright ["Copyright (c) 2016-2022 Object Management Group, Inc."
                       "Copyright (c) 2016-2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/GovernmentEntities.rdf",
   :dcterms/abstract
   "The Commons Government Entities ontology defines fundamental concepts for representing polities, government bodies and the relations between them.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Locations/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/GovernmentEntities/",
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-ge"  "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-loc" "https://www.omg.org/spec/Commons/Locations/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-ra"  "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms"  "http://purl.org/dc/terms/",
    "lcc-cr"   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/GovernmentEntities/",
   :rdfa/prefix "cmns-ge",
   :rdfa/uri "https://www.omg.org/spec/Commons/GovernmentEntities/",
   :rdfs/label "Commons Government Entities Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Government Entities ontology."})

(def BranchOfGovernment
  "division of the government of a state, with separate and independent powers and areas of responsibility so that the powers of one branch are not in conflict with the powers associated with the other branches"
  {:cmns-av/adaptedFrom "https://www.usa.gov/branches-of-government",
   :db/ident :cmns-ge/BranchOfGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "branch of government",
   :rdfs/subClassOf :cmns-ge/GovernmentBody,
   :skos/definition
   "division of the government of a state, with separate and independent powers and areas of responsibility so that the powers of one branch are not in conflict with the powers associated with the other branches"})

(def CourtOfLaw
  "person or body of persons having judicial authority to hear and resolve disputes on the basis of statutes or the common law"
  {:cmns-av/explanatoryNote
   "A court of law is a formal forum of justice that may have authority over civil, criminal, ecclesiastical, or military cases.",
   :db/ident :cmns-ge/CourtOfLaw,
   :rdf/type :owl/Class,
   :rdfs/label "court of law",
   :rdfs/subClassOf :cmns-org/FormalOrganization,
   :skos/definition
   "person or body of persons having judicial authority to hear and resolve disputes on the basis of statutes or the common law"})

(def DevolvedGovernment
  "government and the politicians that that run a subnational territory with powers that may be temporary and reversible, ultimately residing with the central government"
  {:db/ident :cmns-ge/DevolvedGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "devolved government",
   :rdfs/subClassOf :cmns-ge/Government,
   :skos/definition
   "government and the politicians that that run a subnational territory with powers that may be temporary and reversible, ultimately residing with the central government"})

(def ExecutiveBranch
  "the branch of government that is authorized and responsible for the daily administration of the government"
  {:cmns-av/adaptedFrom "https://www.usa.gov/branches-of-government",
   :cmns-av/explanatoryNote
   "The executive branch executes and enforces the law.",
   :db/ident :cmns-ge/ExecutiveBranch,
   :rdf/type :owl/Class,
   :rdfs/label "executive branch",
   :rdfs/subClassOf :cmns-ge/BranchOfGovernment,
   :skos/definition
   "the branch of government that is authorized and responsible for the daily administration of the government"})

(def FederalGovernment
  "union of states under a central government distinct from the individual governments of the separate states"
  {:cmns-av/explanatoryNote
   "A federation is a political entity characterized by a union of partially self-governing states or regions under a central (federal) government. In a federation, the self-governing status of the component states, as well as the division of power between them and the central government, are typically constitutionally entrenched and may not be altered by a unilateral decision of either party, the states or the federal political body.",
   :db/ident :cmns-ge/FederalGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "federal government",
   :rdfs/subClassOf [{:owl/intersectionOf [{:owl/minQualifiedCardinality 0,
                                            :owl/onClass
                                            :cmns-loc/FederalCapitalArea,
                                            :owl/onProperty :cmns-rga/governs,
                                            :rdf/type :owl/Restriction}
                                           {:owl/minQualifiedCardinality 2,
                                            :owl/onClass :cmns-loc/FederalState,
                                            :owl/onProperty :cmns-rga/governs,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}
                     :cmns-ge/NationalGovernment],
   :skos/definition
   "union of states under a central government distinct from the individual governments of the separate states"})

(def FederatedSovereignty
  "polity characterized by a union of partially self-governing states or regions under a central (federal) government"
  {:cmns-av/explanatoryNote
   "The federated sovereignty is the legal entity that can incur debt for a federal government, as distinct from the Federal government.",
   :db/ident :cmns-ge/FederatedSovereignty,
   :rdf/type :owl/Class,
   :rdfs/label "federated sovereignty",
   :rdfs/subClassOf
   [{:owl/intersectionOf [{:owl/onProperty     :cmns-ge/hasFullSovereigntyOver,
                           :owl/someValuesFrom :lcc-cr/Country,
                           :rdf/type           :owl/Restriction}
                          {:owl/minQualifiedCardinality 2,
                           :owl/onClass    :cmns-loc/FederalState,
                           :owl/onProperty :cmns-ge/hasSharedSovereigntyOver,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    {:owl/intersectionOf [{:owl/minQualifiedCardinality 2,
                           :owl/onClass    :cmns-ge/RegionalGovernment,
                           :owl/onProperty :cmns-ge/isRepresentedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/onClass    :cmns-ge/FederalGovernment,
                           :owl/onProperty :cmns-ge/isRepresentedBy,
                           :owl/qualifiedCardinality 1,
                           :rdf/type       :owl/Restriction}],
     :rdf/type :owl/Class}
    :cmns-ge/SovereignState],
   :skos/definition
   "polity characterized by a union of partially self-governing states or regions under a central (federal) government"})

(def Government
  "the system by which a state or community is controlled"
  {:cmns-av/explanatoryNote
   "In the Commonwealth of Nations, the word government is also used more narrowly to refer to the collective group of people that exercises executive authority in a state. This usage is analogous to what is called an 'administration' in American English. Furthermore, especially in American English, the concepts of the state and the government may be used synonymously to refer to the person or group of people exercising authority over a politically organized territory.",
   :db/ident         :cmns-ge/Government,
   :owl/disjointWith :cmns-ge/Instrumentality,
   :rdf/type         :owl/Class,
   :rdfs/label       "government",
   :rdfs/subClassOf  [{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-ge/GovernmentAgency,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-ge/GovernmentDepartment,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-rga/governs,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-ge/BranchOfGovernment,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      :cmns-pts/FunctionalRole],
   :skos/definition  "the system by which a state or community is controlled"})

(def GovernmentAgency
  "permanent or semi-permanent organization, often an appointed commission, in the machinery of government that is responsible for the oversight and administration of specific functions"
  {:cmns-av/explanatoryNote
   "There is a notable variety of agency types. Although usage differs, a government agency is normally distinct both from a department or ministry, and other types of public body established by government. The functions of an agency are normally executive in character, since different types of organizations (such as commissions) are most often constituted in an advisory role; this distinction is often blurred in practice however.",
   :db/ident :cmns-ge/GovernmentAgency,
   :owl/disjointWith :cmns-ge/GovernmentDepartment,
   :rdf/type :owl/Class,
   :rdfs/label "government agency",
   :rdfs/subClassOf :cmns-ge/GovernmentBody,
   :skos/definition
   "permanent or semi-permanent organization, often an appointed commission, in the machinery of government that is responsible for the oversight and administration of specific functions"})

(def GovernmentBody
  "formal organization that is an agency, instrumentality, or other body of a supranational, national, federal, state, or local government, including certain multijurisdictional agencies and departments that carry out the business of government"
  {:cmns-av/explanatoryNote
   "Identifying government bodies is a pre-requisite for identifying government officials. This information is needed to help ensure compliance with applicable laws relating to bribery or corruption, including the U.S. Foreign Corrupt Practices Act (FCPA), the UK Bribery Act 2010 (UKBA), the U.S. Bank Bribery Act (Bribery Act), and other anti-bribery and corruption laws in the jurisdictions where financial institutions conduct business.",
   :db/ident :cmns-ge/GovernmentBody,
   :rdf/type :owl/Class,
   :rdfs/label "government body",
   :rdfs/subClassOf :cmns-org/FormalOrganization,
   :skos/definition
   "formal organization that is an agency, instrumentality, or other body of a supranational, national, federal, state, or local government, including certain multijurisdictional agencies and departments that carry out the business of government"})

(def GovernmentDepartment
  "specialized organization responsible for a sector of government public administration"
  {:db/ident :cmns-ge/GovernmentDepartment,
   :rdf/type :owl/Class,
   :rdfs/label "government department",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isConstituentOf,
                      :owl/someValuesFrom :cmns-ge/GovernmentBody,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/GovernmentBody],
   :skos/definition
   "specialized organization responsible for a sector of government public administration"})

(def Instrumentality
  "organization that serves a public purpose and is closely tied to a government, but is not a government agency"
  {:cmns-av/explanatoryNote
   "Many instrumentalities are private companies, and some are chartered directly by state or federal government. Instrumentalities are subject to a unique set of laws that shape their activities.",
   :db/ident :cmns-ge/Instrumentality,
   :rdf/type :owl/Class,
   :rdfs/label "instrumentality",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/isInstrumentOf,
                      :owl/someValuesFrom :cmns-ge/Government,
                      :rdf/type           :owl/Restriction}
                     :cmns-org/LegalEntity
                     :cmns-ge/GovernmentBody],
   :skos/definition
   "organization that serves a public purpose and is closely tied to a government, but is not a government agency"})

(def Judiciary
  "branch of government that comprises the system of courts that interprets and applies the law in the name of the supranational, national, federal, or regional government, depending on its jurisdiction"
  {:cmns-av/explanatoryNote
   "The judiciary also provides a mechanism for the resolution of disputes. Under the doctrine of the separation of powers, the judiciary generally does not make law (that is, in a plenary fashion, which is the responsibility of the legislature) or enforce law (which is the responsibility of the executive), but rather interprets law and applies it to the facts of each case.",
   :db/ident :cmns-ge/Judiciary,
   :rdf/type :owl/Class,
   :rdfs/label "judiciary",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasPart,
                      :owl/someValuesFrom :cmns-ge/CourtOfLaw,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/BranchOfGovernment],
   :skos/definition
   "branch of government that comprises the system of courts that interprets and applies the law in the name of the supranational, national, federal, or regional government, depending on its jurisdiction"})

(def Legislature
  "the law-making body of a political unit, usually a national government, that has power to enact, amend, and repeal public policy"
  {:cmns-av/explanatoryNote
   "Laws enacted by legislatures are known as legislation. Legislatures observe and steer governing actions and usually have exclusive authority to amend the budget or budgets involved in the process.",
   :db/ident :cmns-ge/Legislature,
   :rdf/type :owl/Class,
   :rdfs/label "legislature",
   :rdfs/subClassOf :cmns-ge/BranchOfGovernment,
   :skos/definition
   "the law-making body of a political unit, usually a national government, that has power to enact, amend, and repeal public policy"})

(def MunicipalEntity
  "polity that typically represents a city, township, or other administrative subdivision having corporate status and powers of self-government or jurisdiction"
  {:cmns-av/explanatoryNote
   "Municipal entity in the sense of a legal entity, that is, what it is that incurs debt for a municipality, as distinct from the Municipal government. A municipal entity has a Government which sets laws applicable within the geographical area corresponding to its jurisdiction.",
   :cmns-av/synonym "municipality",
   :db/ident :cmns-ge/MunicipalEntity,
   :rdf/type :owl/Class,
   :rdfs/label "municipal entity",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/isRepresentedBy,
                      :owl/someValuesFrom :cmns-ge/MunicipalGovernment,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ge/hasSovereigntyOver,
                      :owl/someValuesFrom :cmns-loc/Municipality,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Polity],
   :skos/definition
   "polity that typically represents a city, township, or other administrative subdivision having corporate status and powers of self-government or jurisdiction"})

(def MunicipalGovernment
  "regional government of a city, township, or other administrative subdivision"
  {:db/ident :cmns-ge/MunicipalGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "municipal government",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-rga/governs,
                      :owl/someValuesFrom :cmns-loc/Municipality,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Government],
   :skos/definition
   "regional government of a city, township, or other administrative subdivision"})

(def NationalGovernment
  "government and the politicians that that run a country as a whole (as opposed to local government)"
  {:db/ident :cmns-ge/NationalGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "national government",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-rga/governs,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Government],
   :skos/definition
   "government and the politicians that that run a country as a whole (as opposed to local government)"})

(def Polity
  "legal person that is a supranational entity, crown, state, or subordinate civil authority, such as a province, prefecture, county, municipality, city, or district representing the people of that entity"
  {:db/ident :cmns-ge/Polity,
   :rdf/type :owl/Class,
   :rdfs/label "polity",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/isRepresentedBy,
                      :owl/someValuesFrom :cmns-ge/Government,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ge/hasSovereigntyOver,
                      :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                      :rdf/type           :owl/Restriction}
                     :cmns-org/LegalPerson
                     :cmns-ge/GovernmentBody],
   :skos/definition
   "legal person that is a supranational entity, crown, state, or subordinate civil authority, such as a province, prefecture, county, municipality, city, or district representing the people of that entity"})

(def RegionalGovernment
  "administrative body for a geographic area, such as a county, smaller town, or other similar community"
  {:cmns-av/explanatoryNote
   "A local government will typically only have control over their specific geographical region, and cannot pass or enforce laws that will affect a wider area. Local governments can elect officials, enact taxes, and do many other things that a national government would do, just on a smaller scale.",
   :cmns-av/synonym "local government",
   :db/ident :cmns-ge/RegionalGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "regional government",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-rga/governs,
                      :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Government],
   :skos/definition
   "administrative body for a geographic area, such as a county, smaller town, or other similar community"})

(def RegionalSovereignty
  "legal person that corresponds to an administrative division, administrative unit, administrative entity or country subdivision (or, sometimes, geopolitical division or subnational entity), that has the capacity to incur debt, issue contracts, and enter into relations with other similar entities"
  {:db/ident :cmns-ge/RegionalSovereignty,
   :rdf/type :owl/Class,
   :rdfs/label "regional sovereignty",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/hasSharedSovereigntyOver,
                      :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-ge/RegionalGovernment,
                      :owl/onProperty :cmns-ge/isRepresentedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-ge/Polity],
   :skos/definition
   "legal person that corresponds to an administrative division, administrative unit, administrative entity or country subdivision (or, sometimes, geopolitical division or subnational entity), that has the capacity to incur debt, issue contracts, and enter into relations with other similar entities",
   :skos/example
   "A country may be divided into provinces, which, in turn, are divided into counties, which, in turn, may be divided in whole or in part into municipalities; and so on."})

(def SovereignState
  "non-physical juridical entity that is represented by one centralized government that has sovereignty over a geographic area"
  {:cmns-av/explanatoryNote
   "A legal entity that is represented by one centralized government, has a permanent population, defined territory, and the capacity to enter into relations with other sovereign states.",
   :db/ident :cmns-ge/SovereignState,
   :rdf/type :owl/Class,
   :rdfs/label "sovereign state",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/isRepresentedBy,
                      :owl/someValuesFrom :cmns-ge/NationalGovernment,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ge/hasFullSovereigntyOver,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Polity],
   :skos/definition
   "non-physical juridical entity that is represented by one centralized government that has sovereignty over a geographic area"})

(def SupranationalEntity
  "governmental or non-governmental entity that is established by international law or treaty or incorporated at an international level"
  {:cmns-av/adaptedFrom
   ["Kiljunen, Kimmo (2004). The European Constitution in the Making. Centre for European Policy Studies. pp. 21-26. ISBN 978-92-9079-493-6"
    "ISO 20275:2017, Financial services - Entity legal forms (ELF), First Edition, July 2017."],
   :cmns-av/explanatoryNote
   "A supranational union is a supranational polity which lies somewhere between a confederation that is an association of states and a federation that is a state. Unlike states in a federal super-state, member states retain ultimate sovereignty, although some sovereignty is shared with, or ceded to, the supranational body.",
   :db/ident :cmns-ge/SupranationalEntity,
   :rdf/type :owl/Class,
   :rdfs/label "supranational entity",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/isRepresentedBy,
                      :owl/someValuesFrom :cmns-ge/GovernmentBody,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 2,
                      :owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :cmns-ge/hasSharedSovereigntyOver,
                      :rdf/type       :owl/Restriction}
                     :cmns-ge/Polity],
   :skos/definition
   "governmental or non-governmental entity that is established by international law or treaty or incorporated at an international level"})

(def TribalArea
  "designation for geographic region administered by a group of indigenous people rather than by a sovereign state or regional governmental entity"
  {:db/ident :cmns-ge/TribalArea,
   :rdf/type :owl/Class,
   :rdfs/label "tribal area",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "designation for geographic region administered by a group of indigenous people rather than by a sovereign state or regional governmental entity"})

(def TribalEntity
  "legal entity that represents fundamental unit of sovereign tribal (indigenous) government"
  {:cmns-av/explanatoryNote
   "Any indigenous group or community which is recognized as having rights and obligations independent of the central government.",
   :db/ident :cmns-ge/TribalEntity,
   :rdf/type :owl/Class,
   :rdfs/label "tribal entity",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ge/isRepresentedBy,
                      :owl/someValuesFrom :cmns-ge/TribalGovernment,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ge/hasSharedSovereigntyOver,
                      :owl/someValuesFrom :cmns-ge/TribalArea,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Polity],
   :skos/definition
   "legal entity that represents fundamental unit of sovereign tribal (indigenous) government"})

(def TribalGovernment
  "government representing a group of indigenous people that has legal authority to govern those people, including authority to legislate the existence of tribal entities"
  {:db/ident :cmns-ge/TribalGovernment,
   :rdf/type :owl/Class,
   :rdfs/label "tribal government",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-rga/governs,
                      :owl/someValuesFrom :cmns-ge/TribalArea,
                      :rdf/type           :owl/Restriction}
                     :cmns-ge/Government],
   :skos/definition
   "government representing a group of indigenous people that has legal authority to govern those people, including authority to legislate the existence of tribal entities"})

(def hasFullSovereigntyOver
  "relates a polity to a geopolitical entity where the polity has absolute, supreme and ultimate dominion and authority of a political state subject to no higher power, expressed within its territory in full self-government and in complete freedom from any outside influence"
  {:db/ident :cmns-ge/hasFullSovereigntyOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has full sovereignty over",
   :rdfs/subPropertyOf :cmns-ge/hasSovereigntyOver,
   :skos/definition
   "relates a polity to a geopolitical entity where the polity has absolute, supreme and ultimate dominion and authority of a political state subject to no higher power, expressed within its territory in full self-government and in complete freedom from any outside influence"})

(def hasSharedSovereigntyOver
  "relates a polity to a geopolitical entity where the polity exercises shared dominion and authority of a political state"
  {:db/ident :cmns-ge/hasSharedSovereigntyOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has shared sovereignty over",
   :rdfs/subPropertyOf :cmns-ge/hasSovereigntyOver,
   :skos/definition
   "relates a polity to a geopolitical entity where the polity exercises shared dominion and authority of a political state"})

(def hasSovereigntyOver
  "relates a polity to a geopolitical entity where the polity exercises dominion and authority of a political state"
  {:db/ident :cmns-ge/hasSovereigntyOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-ge/Polity,
   :rdfs/label "has sovereignty over",
   :rdfs/range :lcc-cr/GeopoliticalEntity,
   :rdfs/subPropertyOf :cmns-rga/governs,
   :skos/definition
   "relates a polity to a geopolitical entity where the polity exercises dominion and authority of a political state"})

(def isInstrumentOf
  "relates an instrumentality of some government to the government that it supports"
  {:db/ident :cmns-ge/isInstrumentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-ge/Instrumentality,
   :rdfs/label "is an instrument of",
   :rdfs/range :cmns-ge/Government,
   :skos/definition
   "relates an instrumentality of some government to the government that it supports"})

(def isRepresentedBy
  "relates a system of governance to its chosen representatives"
  {:db/ident :cmns-ge/isRepresentedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is represented by",
   :skos/definition
   "relates a system of governance to its chosen representatives"})