(ns net.wikipunk.rdf.cmns-pts
  "This ontology defines the high-level concepts of parties and the roles they play in various situations."
  {:cmns-av/copyright ["Copyright (c) 2020-2022 Working Ontologist LLC"
                       "Copyright (c) 2020-2022 EDM Council, Inc."
                       "Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2020-2022 Thematix Partners LLC"],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/PartiesAndSituations.rdf",
   :dcterms/abstract
   "This ontology defines the high-level concepts of parties and the roles they play in various situations.",
   :dcterms/contributor ["Dean Allemang, Working Ontologist"
                         "Elisa Kendall, Thematix Partners LLC"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/Collections/"
                 "https://www.omg.org/spec/Commons/Designators/"
                 "https://www.omg.org/spec/Commons/ContextualDesignators/"
                 "https://www.omg.org/spec/Commons/DatesAndTimes/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20220901/PartiesAndSituations/",
   :rdf/ns-prefix-map
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col"    "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg"    "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt"     "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts"    "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms"     "http://purl.org/dc/terms/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "skos"        "http://www.w3.org/2004/02/skos/core#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/PartiesAndSituations/",
   :rdfa/prefix "cmns-pts",
   :rdfa/uri "https://www.omg.org/spec/Commons/PartiesAndSituations/",
   :rdfs/label "Commons Parties and Situations Ontology",
   :skos/note
   "This ontology was originally designed for use in the Financial Industry Business Ontology (FIBO) for representing complex relationships between parties, such as employment, ownership and control."})

(def Actor
  "party that is the primary performer in a relationship between parties, i.e., the party that does something, causes something to happen, or otherwise plays an agentive role in the relationship"
  {:db/ident :cmns-pts/Actor,
   :rdf/type :owl/Class,
   :rdfs/label "actor",
   :rdfs/subClassOf :cmns-pts/PartyRole,
   :skos/definition
   "party that is the primary performer in a relationship between parties, i.e., the party that does something, causes something to happen, or otherwise plays an agentive role in the relationship",
   :skos/example
   "Examples include owner, controlling party, beneficiary, guarantor, partner in a partnership, shareholder, etc."})

(def Agent
  "something autonomous that can adapt to and interact with its environment"
  {:cmns-av/directSource
   "http://www.omg.org/techprocess/meetings/schedule/AMP.html",
   :db/ident :cmns-pts/Agent,
   :rdf/type :owl/Class,
   :rdfs/label "agent",
   :rdfs/seeAlso ["http://www.jamesodell.com/WhyShouldWeCareAboutAgents.pdf"
                  "http://www.jamesodell.com/WhatIsAnAgent.pdf"],
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :cmns-cxtdsg/ContextualName,
                     :owl/onProperty :cmns-dsg/hasName,
                     :rdf/type       :owl/Restriction},
   :skos/definition
   "something autonomous that can adapt to and interact with its environment",
   :skos/note
   ["Note that this does not necessarily imply that an agent is free to act as it sees fit, without constraint. Rather, an agent in the sense meant here is something which may or may not be subject to controls and constraints but is self-actualizing in its behavior in response to any such constraints."
    "Agents can be human beings, organizations, software agents, robots and living things other than plants. They are defined as having the following three important properties: autonomy, interactive behavior, and adaptability. (1) Autonomy - an agent is capable of acting without direct external intervention. This includes software or other agents that have some degree of control over their internal state and can act based on their own experiences. They can also possess their own set of internal responsibilities and capabilities that enable them to act without any external choreography. This definition excludes agents that act on on behalf of (or as a proxy for) some person or thing (see AgentRole). (2) Interactive behavior - they are capable of exchanging communicating with other things in their environment. This includes, in the case of software agents, messages that can support requests for services and other kinds of resources, as well as event detection and notification. They can be synchronous or asynchronous in nature. The interaction can also be conversational in nature, such as negotiating contracts, marketplace-style bidding, or simply making a query. (3) Adaptability - an agent is capable of responding to other agents and/or its environment. Agents can react to communications and events and then respond appropriately. Software agents can be designed to make difficult decisions and even modify their behavior based on their experiences. In other words, they can learn and evolve."]})

(def AgentRole
  "role that is played by an agent"
  {:db/ident        :cmns-pts/AgentRole,
   :rdf/type        :owl/Class,
   :rdfs/label      "agent role",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-pts/Agent,
                      :owl/onProperty :cmns-pts/isPlayedBy,
                      :rdf/type       :owl/Restriction}
                     :cmns-pts/Role],
   :skos/definition "role that is played by an agent"})

(def Constituency
  "relationship that defines something based on its constituent(s) and/or constituent roles that may be context-specific"
  {:db/ident :cmns-pts/Constituency,
   :rdf/type :owl/Class,
   :rdfs/label "constituency",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-cxtdsg/Context,
                      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :cmns-pts/Role,
                      :owl/onProperty    :cmns-pts/hasRole,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :cmns-col/Constituent,
                      :owl/onProperty    :cmns-col/hasConstituent,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :owl/Thing,
                      :owl/onProperty    :cmns-dsg/defines,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   "relationship that defines something based on its constituent(s) and/or constituent roles that may be context-specific"})

(def FunctionalRole
  "role specifying one or more activities, capabilities, purposes, skills or combination thereof"
  {:db/ident :cmns-pts/FunctionalRole,
   :rdf/type :owl/Class,
   :rdfs/label "functional role",
   :rdfs/subClassOf :cmns-pts/Role,
   :skos/definition
   "role specifying one or more activities, capabilities, purposes, skills or combination thereof",
   :skos/note
   "A functional role may be played by an agent involved in a process or business activity, or by material or equipment that is produced by, consumed by, or participates in some process, for example."})

(def Party
  "person or organization"
  {:db/ident         :cmns-pts/Party,
   :owl/disjointWith :cmns-pts/Role,
   :rdf/type         :owl/Class,
   :rdfs/label       "party",
   :rdfs/subClassOf  :cmns-pts/Agent,
   :skos/definition  "person or organization"})

(def PartyRole
  "agent role that is played by person or organization, that typically holds for some period of time"
  {:db/ident :cmns-pts/PartyRole,
   :rdf/type :owl/Class,
   :rdfs/label "party role",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-pts/Party,
                      :owl/onProperty :cmns-pts/isPlayedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DatePeriod,
                      :owl/onProperty :cmns-cxtdsg/hasApplicablePeriod,
                      :rdf/type       :owl/Restriction}
                     :cmns-pts/AgentRole],
   :skos/definition
   "agent role that is played by person or organization, that typically holds for some period of time",
   :skos/example
   "Examples include organization member, employee, issuer, owner, partner in a partnership, shareholder, and so forth.",
   :skos/note
   "Note that there may be cases whre the identity of the party playing the role is not known, as well as cases where in some situation, such as ownership, there may be more than one party playing the role of owner.",
   :skos/scopeNote
   "The concept of a party role is used in contexts in which one would call someone a 'party to something', such as party to a contract or to a transaction, a supplier, buyer, customer, student, employee, and so forth. More specific roles such as those that are performed in the context of some activity or process are actors in that situation."})

(def Role
  "relative concept that ties a part to something or someone that fills it"
  {:db/ident :cmns-pts/Role,
   :rdf/type :owl/Class,
   :rdfs/label "role",
   :rdfs/subClassOf {:owl/minCardinality 0,
                     :owl/onProperty     :cmns-pts/isPlayedBy,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "relative concept that ties a part to something or someone that fills it"})

(def Situation
  "setting, state of being, or relationship that is relatively stable for some period of time"
  {:db/ident :cmns-pts/Situation,
   :rdf/type :owl/Class,
   :rdfs/label "situation",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/hasSubjectRole,
                      :owl/someValuesFrom :cmns-pts/Role,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-pts/Role,
                      :owl/onProperty :cmns-pts/hasObjectRole,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/DatePeriod,
                      :owl/onProperty :cmns-pts/holdsDuring,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "setting, state of being, or relationship that is relatively stable for some period of time",
   :skos/example
   "Examples include ownership, control, possession, affiliation, beneficial ownership, employment, and other similar situations.",
   :skos/note
   "From a usage perspective, situations are essentially reified relations, sometimes called mediating relationships."})

(def Undergoer
  "something that plays the role of the object or recipient in a situation, i.e., the thing (or party) that the situation impacts, affects, or that otherwise plays a passive recipient / patient or thematic role"
  {:db/ident :cmns-pts/Undergoer,
   :rdf/type :owl/Class,
   :rdfs/label "undergoer",
   :rdfs/subClassOf :cmns-pts/Role,
   :skos/definition
   "something that plays the role of the object or recipient in a situation, i.e., the thing (or party) that the situation impacts, affects, or that otherwise plays a passive recipient / patient or thematic role",
   :skos/example "Examples include something that is owned or controlled."})

(def actsIn
  "indicates a situation in which the actor plays a primary role"
  {:db/ident :cmns-pts/actsIn,
   :owl/inverseOf :cmns-pts/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Actor,
   :rdfs/label "acts in",
   :rdfs/range :cmns-pts/Situation,
   :rdfs/subPropertyOf :cmns-pts/isSubjectRoleIn,
   :skos/definition
   "indicates a situation in which the actor plays a primary role"})

(def actsOn
  "relates an actor in a given situation to the undergoer that they affect under the circumstances"
  {:db/ident :cmns-pts/actsOn,
   :owl/propertyChainAxiom [:cmns-pts/actsIn :cmns-pts/hasUndergoer],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "acts on",
   :skos/definition
   "relates an actor in a given situation to the undergoer that they affect under the circumstances"})

(def directlyAffects
  "relates an actor in a given situation to the thing (or party) that they impact under the circumstances"
  {:db/ident :cmns-pts/directlyAffects,
   :owl/inverseOf :cmns-pts/experiencesWith,
   :owl/propertyChainAxiom
   [:cmns-pts/actsIn :cmns-pts/hasUndergoer :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "directly affects",
   :skos/definition
   "relates an actor in a given situation to the thing (or party) that they impact under the circumstances"})

(def experiences
  "relates something to a situation that affects them in some way"
  {:db/ident :cmns-pts/experiences,
   :owl/propertyChainAxiom [:cmns-pts/playsRole :cmns-pts/undergoes],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "experiences",
   :skos/definition
   "relates something to a situation that affects them in some way"})

(def experiencesDirectly
  "relates something directly to a party that drives a situation involving it"
  {:db/ident :cmns-pts/experiencesDirectly,
   :owl/propertyChainAxiom [:cmns-pts/playsRole
                            :cmns-pts/undergoes
                            :cmns-pts/hasActor
                            :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "experiences directly",
   :skos/definition
   "relates something directly to a party that drives a situation involving it"})

(def experiencesWith
  "relates something to an actor that drives a situation involving it"
  {:db/ident :cmns-pts/experiencesWith,
   :owl/propertyChainAxiom
   [:cmns-pts/playsRole :cmns-pts/undergoes :cmns-pts/hasActor],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "experiences with",
   :skos/definition
   "relates something to an actor that drives a situation involving it"})

(def hasActiveParty
  "relates a situation to the person or organization acting in a primary (agentive) role"
  {:db/ident :cmns-pts/hasActiveParty,
   :owl/inverseOf :cmns-pts/playsActivePartyIn,
   :owl/propertyChainAxiom [:cmns-pts/hasActor :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has active party",
   :skos/definition
   "relates a situation to the person or organization acting in a primary (agentive) role"})

(def hasActiveRole
  "relates a situation to something that is acting in a primary (agentive) role"
  {:db/ident :cmns-pts/hasActiveRole,
   :owl/inverseOf :cmns-pts/playsActiveRoleIn,
   :owl/propertyChainAxiom [:cmns-pts/hasSubjectRole :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has active role",
   :skos/definition
   "relates a situation to something that is acting in a primary (agentive) role"})

(def hasActor
  "identifies the primary party acting in a specific role with respect to a given situation"
  {:db/ident :cmns-pts/hasActor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Situation,
   :rdfs/label "has actor",
   :rdfs/range :cmns-pts/Actor,
   :rdfs/subPropertyOf [:cmns-pts/hasSubjectRole :cmns-pts/hasPartyRole],
   :skos/definition
   "identifies the primary party acting in a specific role with respect to a given situation"})

(def hasObjectRole
  "identifies a person or thing that is affected by, or is a secondary argument in a specific role with respect to a given relation or situation"
  {:db/ident :cmns-pts/hasObjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:cmns-pts/Constituency :cmns-pts/Situation],
                 :rdf/type    :owl/Class},
   :rdfs/label "has object role",
   :rdfs/range :cmns-pts/Role,
   :rdfs/subPropertyOf :cmns-pts/hasRole,
   :skos/definition
   "identifies a person or thing that is affected by, or is a secondary argument in a specific role with respect to a given relation or situation"})

(def hasParty
  "identifies an independent party associated with an agreement, contract, policy, regulation, or other arrangement"
  {:db/ident :cmns-pts/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has party",
   :rdfs/range :cmns-pts/Party,
   :skos/definition
   "identifies an independent party associated with an agreement, contract, policy, regulation, or other arrangement"})

(def hasPartyRole
  "identifies a specific role played by some person or organization as related to a situation, agreement, contract, policy, regulation, activity or other relationship"
  {:db/ident :cmns-pts/hasPartyRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has party role",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasRole,
   :skos/definition
   "identifies a specific role played by some person or organization as related to a situation, agreement, contract, policy, regulation, activity or other relationship"})

(def hasRelatedPartyRole
  "relates a party acting in a specific role directly to another party acting in the same or another role"
  {:db/ident :cmns-pts/hasRelatedPartyRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/PartyRole,
   :rdfs/label "has related party role",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasRole,
   :skos/definition
   "relates a party acting in a specific role directly to another party acting in the same or another role",
   :skos/note
   "This property is intended as an abstract property, whose subproperties may or may not be symmetric, but could be inverses of one another."})

(def hasRole
  "identifies something acting in a recipient or target role as related to the particular agreement, contract, policy, regulation, situation, or other arrangement"
  {:db/ident :cmns-pts/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has role",
   :rdfs/range :cmns-pts/Role,
   :skos/definition
   "identifies something acting in a recipient or target role as related to the particular agreement, contract, policy, regulation, situation, or other arrangement"})

(def hasSubjectRole
  "identifies the person or thing that is being discussed, described, dealt with, or is the main topic in a specific role with respect to a given situation"
  {:db/ident :cmns-pts/hasSubjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Situation,
   :rdfs/label "has subject role",
   :rdfs/range :cmns-pts/Role,
   :rdfs/subPropertyOf :cmns-pts/hasRole,
   :skos/definition
   "identifies the person or thing that is being discussed, described, dealt with, or is the main topic in a specific role with respect to a given situation"})

(def hasUndergoer
  "identifies an experiencer / passive or other object role in a given situation"
  {:db/ident :cmns-pts/hasUndergoer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Situation,
   :rdfs/label "has undergoer",
   :rdfs/range :cmns-pts/Undergoer,
   :rdfs/subPropertyOf :cmns-pts/hasObjectRole,
   :skos/definition
   "identifies an experiencer / passive or other object role in a given situation"})

(def holdsDuring
  "indicates a date period during which something is true"
  {:db/ident :cmns-pts/holdsDuring,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "holds during",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-cxtdsg/hasApplicablePeriod,
   :skos/definition "indicates a date period during which something is true"})

(def isAPartyTo
  "identifies an agreement, contract, policy, regulation, or other arrangement that an independent party is associated with"
  {:db/ident :cmns-pts/isAPartyTo,
   :owl/inverseOf :cmns-pts/hasParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Party,
   :rdfs/label "is a party to",
   :skos/definition
   "identifies an agreement, contract, policy, regulation, or other arrangement that an independent party is associated with"})

(def isAffectedBy
  "relates an undergoer in a given situation to the actor that has an impact on them under the circumstances"
  {:db/ident :cmns-pts/isAffectedBy,
   :owl/propertyChainAxiom [:cmns-pts/undergoes :cmns-pts/hasActor],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is affected by",
   :skos/definition
   "relates an undergoer in a given situation to the actor that has an impact on them under the circumstances"})

(def isDirectlyAffectedBy
  "relates an undergoer in a given situation to the person or organization that has an impact on them under the circumstances"
  {:db/ident :cmns-pts/isDirectlyAffectedBy,
   :owl/propertyChainAxiom
   [:cmns-pts/undergoes :cmns-pts/hasActor :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is directly affected by",
   :skos/definition
   "relates an undergoer in a given situation to the person or organization that has an impact on them under the circumstances"})

(def isExperiencedBy
  "relates a situation to something that is directly involved in or affected by it"
  {:db/ident :cmns-pts/isExperiencedBy,
   :owl/inverseOf :cmns-pts/experiences,
   :owl/propertyChainAxiom [:cmns-pts/hasUndergoer :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is experienced by",
   :skos/definition
   "relates a situation to something that is directly involved in or affected by it"})

(def isManifestedIn
  "indicates something in which the role is realized, appears, or occurs"
  {:db/ident :cmns-pts/isManifestedIn,
   :owl/inverseOf :cmns-pts/manifests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Role,
   :rdfs/label "is manifested in",
   :skos/definition
   "indicates something in which the role is realized, appears, or occurs"})

(def isObjectRoleIn
  "indicates a situation in which the role is secondary, such as an experiencer or passive participant"
  {:db/ident :cmns-pts/isObjectRoleIn,
   :owl/inverseOf :cmns-pts/hasObjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Role,
   :rdfs/label "is object role in",
   :rdfs/range {:owl/unionOf [:cmns-pts/Constituency :cmns-pts/Situation],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :cmns-pts/isRoleIn,
   :skos/definition
   "indicates a situation in which the role is secondary, such as an experiencer or passive participant"})

(def isPlayedBy
  "indicates the independent thing, such as a person, organization, or asset, filling a role"
  {:db/ident :cmns-pts/isPlayedBy,
   :owl/inverseOf :cmns-pts/playsRole,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :cmns-pts/Role,
   :rdfs/label "is played by",
   :skos/definition
   "indicates the independent thing, such as a person, organization, or asset, filling a role",
   :skos/example
   "A party, counterparty, or third party to a contract is played by an organization or person; an issuer of a financial instrument is typically played by an organization."})

(def isRealizedIn
  "relates a situation or constituency to something that is affected by, or is a secondary argument to in a specific role with respect to a given relation or situation"
  {:db/ident :cmns-pts/isRealizedIn,
   :owl/inverseOf :cmns-pts/realizes,
   :owl/propertyChainAxiom [:cmns-pts/hasObjectRole :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is realized in",
   :skos/definition
   "relates a situation or constituency to something that is affected by, or is a secondary argument to in a specific role with respect to a given relation or situation"})

(def isRoleIn
  "identifies an agreement, policy, regulation, situation, constituency or other arrangementinvolving the role"
  {:db/ident :cmns-pts/isRoleIn,
   :owl/inverseOf :cmns-pts/hasRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Role,
   :rdfs/label "is role in",
   :skos/definition
   "identifies an agreement, policy, regulation, situation, constituency or other arrangementinvolving the role"})

(def isSubjectRoleIn
  "indicates a situation in which the role is the primary topic"
  {:db/ident :cmns-pts/isSubjectRoleIn,
   :owl/inverseOf :cmns-pts/hasSubjectRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Role,
   :rdfs/label "is subject role in",
   :rdfs/range :cmns-pts/Situation,
   :rdfs/subPropertyOf :cmns-pts/isRoleIn,
   :skos/definition
   "indicates a situation in which the role is the primary topic"})

(def manifests
  "indicates a role that realizes, displays, or shows something, typically in some context"
  {:db/ident :cmns-pts/manifests,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "manifests",
   :rdfs/range :cmns-pts/Role,
   :skos/definition
   "indicates a role that realizes, displays, or shows something, typically in some context"})

(def playsActivePartyIn
  "relates a person or organization to a situation that they are directly involved in"
  {:db/ident :cmns-pts/playsActivePartyIn,
   :owl/propertyChainAxiom [:cmns-pts/playsRole :cmns-pts/actsIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active party in",
   :skos/definition
   "relates a person or organization to a situation that they are directly involved in"})

(def playsActiveRoleIn
  "relates something to a situation that it is directly involved in"
  {:db/ident :cmns-pts/playsActiveRoleIn,
   :owl/propertyChainAxiom [:cmns-pts/playsRole :cmns-pts/isSubjectRoleIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active role in",
   :skos/definition
   "relates something to a situation that it is directly involved in"})

(def playsActiveRoleThatAffects
  "relates a person or organization to an undergoer they have an impact on under the circumstances"
  {:db/ident :cmns-pts/playsActiveRoleThatAffects,
   :owl/inverseOf :cmns-pts/isDirectlyAffectedBy,
   :owl/propertyChainAxiom
   [:cmns-pts/playsRole :cmns-pts/actsIn :cmns-pts/hasUndergoer],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active role that affects",
   :skos/definition
   "relates a person or organization to an undergoer they have an impact on under the circumstances"})

(def playsActiveRoleThatDirectlyAffects
  "relates a person or organization to something they have a direct impact on under the circumstances"
  {:db/ident :cmns-pts/playsActiveRoleThatDirectlyAffects,
   :owl/inverseOf :cmns-pts/experiencesDirectly,
   :owl/propertyChainAxiom [:cmns-pts/playsRole
                            :cmns-pts/actsIn
                            :cmns-pts/hasUndergoer
                            :cmns-pts/isPlayedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays active role that directly affects",
   :skos/definition
   "relates a person or organization to something they have a direct impact on under the circumstances"})

(def playsRole
  "indicates a part that someone or something plays under some circumstance"
  {:db/ident :cmns-pts/playsRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "plays role",
   :rdfs/range :cmns-pts/Role,
   :skos/definition
   "indicates a part that someone or something plays under some circumstance",
   :skos/example
   "an organization may play the role of employer, issuer, regulatory agency, bank, custodian, manufacturer, vendor, etc.; a person may play the role of employee, examiner, banker, seller, buyer, etc."})

(def realizes
  "relates something to a situation or constituency in which the role they play is secondary, such as an experiencer or passive participant"
  {:db/ident :cmns-pts/realizes,
   :owl/propertyChainAxiom [:cmns-pts/playsRole :cmns-pts/isObjectRoleIn],
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "realizes",
   :skos/definition
   "relates something to a situation or constituency in which the role they play is secondary, such as an experiencer or passive participant"})

(def undergoes
  "indicates a situation that the undergoer experiences"
  {:db/ident           :cmns-pts/undergoes,
   :owl/inverseOf      :cmns-pts/hasUndergoer,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :cmns-pts/Undergoer,
   :rdfs/label         "undergoes",
   :rdfs/range         :cmns-pts/Situation,
   :rdfs/subPropertyOf :cmns-pts/isObjectRoleIn,
   :skos/definition    "indicates a situation that the undergoer experiences"})