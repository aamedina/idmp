(ns net.wikipunk.rdf.cmns-org
  "This ontology defines high-level concepts for organizations and related terms. It is purposefully underspecified to facilitate mapping to specific organization ontologies, such as the emerging W3C organization ontology, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2013-2022 Object Management Group, Inc."
                       "Copyright (c) 2013-2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Organizations.rdf",
   :dcterms/abstract
   "This ontology defines high-level concepts for organizations and related terms. It is purposefully underspecified to facilitate mapping to specific organization ontologies, such as the emerging W3C organization ontology, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/Designators/"
                 "https://www.omg.org/spec/Commons/ContextualDesignators/"
                 "https://www.omg.org/spec/Commons/PartiesAndSituations/"
                 "https://www.omg.org/spec/Commons/Collections/"
                 "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI "https://www.omg.org/spec/Commons/20221101/Organizations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/Organizations/",
   :rdfa/prefix "cmns-org",
   :rdfa/uri "https://www.omg.org/spec/Commons/Organizations/",
   :rdfs/label "Commons Organizations Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Organizations, Formal Organizations, and Legal Persons ontologies."})

(def FormalOrganization
  "organization that is recognized in some legal jurisdiction, with associated rights and responsibilities"
  {:cmns-av/adaptedFrom
   "https://www.w3.org/TR/vocab-org/#class-formalorganization",
   :db/ident :cmns-org/FormalOrganization,
   :owl/disjointWith :cmns-org/InformalOrganization,
   :rdf/type :owl/Class,
   :rdfs/label "formal organization",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-cr/GeopoliticalEntity,
                      :owl/onProperty :cmns-org/isDomiciledIn,
                      :rdf/type       :owl/Restriction}
                     :cmns-org/Organization],
   :skos/definition
   "organization that is recognized in some legal jurisdiction, with associated rights and responsibilities",
   :skos/example
   "Examples include a corporation, charity, government or church."})

(def Group
  "collection of agents (people, organizations, software agents, etc.) that are considered as a unit"
  {:db/ident :cmns-org/Group,
   :rdf/type :owl/Class,
   :rdfs/label "group",
   :rdfs/subClassOf [{:owl/allValuesFrom :cmns-pts/Agent,
                      :owl/onProperty    :cmns-col/hasMember,
                      :rdf/type          :owl/Restriction}
                     :cmns-col/Collection],
   :skos/definition
   "collection of agents (people, organizations, software agents, etc.) that are considered as a unit"})

(def InformalOrganization
  "organization that is not formally constituted in some way"
  {:db/ident :cmns-org/InformalOrganization,
   :rdf/type :owl/Class,
   :rdfs/label "informal organization",
   :rdfs/subClassOf :cmns-org/Organization,
   :skos/definition
   "organization that is not formally constituted in some way"})

(def LegalEntity
  "legal person that is a partnership, corporation, or other organization having the capacity to negotiate contracts, assume financial obligations, and pay off debts, organized under the laws of some jurisdiction"
  {:cmns-av/adaptedFrom
   "ISO 17442, Financial services - Legal Entity Identifier (LEI), first edition, 2012-06-01, section 3.1",
   :cmns-av/synonym ["juristic person"
                     "juridical entity"
                     "artificial person"
                     "juridical person"],
   :db/ident :cmns-org/LegalEntity,
   :rdf/type :owl/Class,
   :rdfs/label "legal entity",
   :rdfs/subClassOf [:cmns-org/FormalOrganization :cmns-org/LegalPerson],
   :skos/definition
   "legal person that is a partnership, corporation, or other organization having the capacity to negotiate contracts, assume financial obligations, and pay off debts, organized under the laws of some jurisdiction",
   :skos/scopeNote
   "The term 'legal entities' includes, but is not limited to, unique parties that are legally or financially responsible for the performance of financial transactions or have the legal right in their jurisdiction to enter independently into legal contracts, regardless of whether they are incorporated or constituted in some other way (e.g. trust, partnership, contractual). It excludes natural persons, but includes governmental organizations and supranationals."})

(def LegalPerson
  "party that is recognized as having rights and obligations under the law, including but not limited to the right to sue and be sued, enter into contracts, own property, and incur financial and other obligations"
  {:cmns-av/explanatoryNote
   "To have legal personality means to be capable of having legal rights and duties within a certain legal system, such as to enter into contracts, sue, and be sued. Legal personality is a prerequisite to legal capacity, the ability of any legal person to amend (enter into, transfer, etc.) rights and obligations.",
   :db/ident :cmns-org/LegalPerson,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal person"},
   :rdfs/subClassOf :cmns-pts/Party,
   :skos/definition
   "party that is recognized as having rights and obligations under the law, including but not limited to the right to sue and be sued, enter into contracts, own property, and incur financial and other obligations"})

(def MemberBearingOrganization
  "role of a group or organization that has members that are people or other organizations"
  {:db/ident :cmns-org/MemberBearingOrganization,
   :rdf/type :owl/Class,
   :rdfs/label "member-bearing organization",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty :cmns-col/hasMember,
                                           :owl/someValuesFrom :cmns-pts/Party,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/PartyRole],
   :skos/definition
   "role of a group or organization that has members that are people or other organizations"})

(def Membership
  "situation, corresponding to an n-ary relation, in which some group or organization has at least one member (person or organization) for some period of time"
  {:db/ident :cmns-org/Membership,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "membership"},
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#class-membership",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-org/hasOrganizationMember,
                      :owl/someValuesFrom :cmns-org/OrganizationMember,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-org/hasMembership,
                      :owl/someValuesFrom :cmns-org/MemberBearingOrganization,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Situation],
   :skos/definition
   "situation, corresponding to an n-ary relation, in which some group or organization has at least one member (person or organization) for some period of time"})

(def Organization
  "collection of one or more people, or groups of people formed together into a community or other social, commercial or political structure to act, or that is designated to act, towards some purpose, such as to meet a need or pursue collective goals on a continuing basis"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :db/ident :cmns-org/Organization,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"},
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:Organization",
   :rdfs/subClassOf [{:owl/allValuesFrom :cmns-pts/Party,
                      :owl/onProperty    :cmns-col/hasMember,
                      :rdf/type          :owl/Restriction}
                     :cmns-pts/Party
                     {:owl/allValuesFrom :cmns-org/Organization,
                      :owl/onProperty    :cmns-col/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-org/OrganizationName,
                      :owl/onProperty :cmns-dsg/hasName,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "collection of one or more people, or groups of people formed together into a community or other social, commercial or political structure to act, or that is designated to act, towards some purpose, such as to meet a need or pursue collective goals on a continuing basis",
   :skos/example
   "This may be a business entity, government, international organization, not-for-profit, academic institution, or other unincorporated and/or informal social organization."})

(def OrganizationIdentificationScheme
  "identification scheme dedicated to the unique identification of organizations"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :db/ident :cmns-org/OrganizationIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/label "organization identification scheme",
   :rdfs/subClassOf :cmns-id/IdentificationScheme,
   :skos/definition
   "identification scheme dedicated to the unique identification of organizations"})

(def OrganizationIdentifier
  "identifier assigned to an organization within an organization identification scheme, and unique within that scheme"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :db/ident :cmns-org/OrganizationIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "organization identifier",
   :rdfs/subClassOf [{:owl/onClass :cmns-org/OrganizationIdentificationScheme,
                      :owl/onProperty :cmns-col/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :cmns-org/Organization,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "identifier assigned to an organization within an organization identification scheme, and unique within that scheme"})

(def OrganizationMember
  "party (person or organization) that has a membership role with respect to some organization"
  {:db/ident :cmns-org/OrganizationMember,
   :rdf/type :owl/Class,
   :rdfs/label "organization member",
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:Role",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom {:owl/allValuesFrom
                                           :cmns-org/Organization,
                                           :owl/onProperty :cmns-col/isMemberOf,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/PartyRole],
   :skos/definition
   "party (person or organization) that has a membership role with respect to some organization"})

(def OrganizationName
  "designation by which some organization is known in some context"
  {:db/ident :cmns-org/OrganizationName,
   :rdf/type :owl/Class,
   :rdfs/label "organization name",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-org/Organization,
                      :owl/onProperty :cmns-dsg/isNameOf,
                      :rdf/type       :owl/Restriction}
                     :cmns-cxtdsg/ContextualName],
   :skos/definition
   "designation by which some organization is known in some context"})

(def OrganizationPartIdentifier
  "identifier allocated to a particular organizational sub-unit"
  {:cmns-av/abbreviation "OPI",
   :cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :cmns-av/synonym "organization sub-unit identifier",
   :db/ident :cmns-org/OrganizationPartIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "organization part identifier",
   :rdfs/subClassOf [{:owl/onClass    :cmns-org/OrganizationalSubUnit,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "identifier allocated to a particular organizational sub-unit"})

(def OrganizationalSubUnit
  "any department, service, and other entity within a larger organization that only has full recognition within the context of that organization, but requires identification for some purpose"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :cmns-av/explanatoryNote
   "In other words, it is not a legal entity in its own right.",
   :cmns-av/synonym "organization part",
   :db/ident :cmns-org/OrganizationalSubUnit,
   :rdf/type :owl/Class,
   :rdfs/label "organizational sub-unit",
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:OrganizationalUnit",
   :rdfs/subClassOf [{:owl/allValuesFrom :cmns-org/Organization,
                      :owl/onProperty    :cmns-col/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :cmns-org/Organization],
   :skos/definition
   "any department, service, and other entity within a larger organization that only has full recognition within the context of that organization, but requires identification for some purpose"})

(def hasMembership
  "identifies the organization acting in the role of having members in an organizational membership situation"
  {:db/ident :cmns-org/hasMembership,
   :owl/inverseOf :cmns-org/isMembershipPartyIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/Membership,
   :rdfs/label "has membership",
   :rdfs/range :cmns-org/MemberBearingOrganization,
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:organization",
   :rdfs/subPropertyOf :cmns-pts/hasActor,
   :skos/definition
   "identifies the organization acting in the role of having members in an organizational membership situation"})

(def hasOrganizationMember
  "indicates the party that is the member in an organizational membership situation"
  {:db/ident :cmns-org/hasOrganizationMember,
   :owl/inverseOf :cmns-org/isOrganizationMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/Membership,
   :rdfs/label "has organization member",
   :rdfs/range :cmns-org/OrganizationMember,
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:member",
   :rdfs/subPropertyOf :cmns-pts/hasUndergoer,
   :skos/definition
   "indicates the party that is the member in an organizational membership situation"})

(def hasSubUnit
  "relates an organization to a part of that organization"
  {:db/ident :cmns-org/hasSubUnit,
   :owl/inverseOf :cmns-org/isSubUnitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/Organization,
   :rdfs/label "has sub-unit",
   :rdfs/range :cmns-org/OrganizationalSubUnit,
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:hasSubOrganization",
   :rdfs/subPropertyOf :cmns-col/hasPart,
   :skos/definition "relates an organization to a part of that organization"})

(def isDomiciledIn
  "indicates the principal place where an entity conducts business within some country, such as where its headquarters is located"
  {:cmns-av/explanatoryNote
   "Corporate domicile refers to a place where a company's affairs are discharged. It is also typically the legal home of a corporation within a country because the place is considered by law as the center of corporate affairs. In cases where a business has incorporated in one location for convenience, such as for taxation, legal, or regulatory purposes, but operates primarily in one or more other locations, domicile refers to the operational location(s) rather than legal location. Many companies in the US have incorporated in the State of Delaware, for example, but do not have operational facilities in Delaware (or only have small offices there).",
   :db/ident :cmns-org/isDomiciledIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/FormalOrganization,
   :rdfs/label "is domiciled in",
   :rdfs/range :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "indicates the principal place where an entity conducts business within some country, such as where its headquarters is located"})

(def isMembershipPartyIn
  "indicates the context of membership in which the party plays the role of having members"
  {:db/ident :cmns-org/isMembershipPartyIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/MemberBearingOrganization,
   :rdfs/label "is membership party in",
   :rdfs/range :cmns-org/Membership,
   :rdfs/subPropertyOf :cmns-pts/actsIn,
   :skos/definition
   "indicates the context of membership in which the party plays the role of having members"})

(def isOrganizationMember
  "indicates the context of membership in which some party is an organization member"
  {:db/ident :cmns-org/isOrganizationMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/OrganizationMember,
   :rdfs/label "is organization member",
   :rdfs/range :cmns-org/Membership,
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:role",
   :rdfs/subPropertyOf :cmns-pts/undergoes,
   :skos/definition
   "indicates the context of membership in which some party is an organization member"})

(def isSubUnitOf
  "relates a part of an organization to the larger entity"
  {:db/ident :cmns-org/isSubUnitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-org/OrganizationalSubUnit,
   :rdfs/label "is sub-unit of",
   :rdfs/range :cmns-org/Organization,
   :rdfs/seeAlso "https://www.w3.org/TR/vocab-org/#org:subOrganizationOf",
   :rdfs/subPropertyOf :cmns-col/isPartOf,
   :skos/definition "relates a part of an organization to the larger entity"})