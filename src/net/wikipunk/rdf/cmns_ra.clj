(ns net.wikipunk.rdf.cmns-ra
  "This ontology defines concepts for representation of registration authorities, registrars, registration-specific identifiers and related identification schemes. It was derived from the FIBO Registration Authorities Ontology and ISO 11179-3, and adapted for broader use."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/RegistrationAuthorities.rdf",
   :dcterms/abstract
   "This ontology defines concepts for representation of registration authorities, registrars, registration-specific identifiers and related identification schemes. It was derived from the FIBO Registration Authorities Ontology and ISO 11179-3, and adapted for broader use.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/Identifiers/"
                 "https://www.omg.org/spec/Commons/DatesAndTimes/"
                 "https://www.omg.org/spec/Commons/ContextualIdentifiers/"
                 "https://www.omg.org/spec/Commons/Documents/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/PartiesAndSituations/"
                 "https://www.omg.org/spec/Commons/Collections/"
                 "https://www.omg.org/spec/Commons/ProductsAndServices/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/RegistrationAuthorities/",
   :rdf/ns-prefix-map
   {"cmns-av"    "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col"   "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-doc"   "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt"    "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id"    "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-prd"   "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts"   "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-ra"    "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "dcterms"    "http://purl.org/dc/terms/",
    "owl"        "http://www.w3.org/2002/07/owl#",
    "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
    "skos"       "http://www.w3.org/2004/02/skos/core#",
    "xsd"        "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
   :rdfa/prefix "cmns-ra",
   :rdfa/uri "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
   :rdfs/label "Commons Registration Authorities Ontology"})

(def RegisteredIdentifier
  "contextual identifier that is registered in a registry by, or on behalf of, a registration authority according to some registration scheme"
  {:db/ident :cmns-ra/RegisteredIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "registered identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ra/isRegisteredIn,
                      :owl/someValuesFrom :cmns-ra/Registry,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ra/isRegisteredBy,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:cmns-ra/RegistrationAuthority
                                            :cmns-ra/Registrar],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :cmns-ra/hasRegistrationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :cmns-ra/RegistrationScheme,
                      :owl/onProperty :cmns-col/compliesWith,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-cxtid/ContextualIdentifier],
   :skos/definition
   "contextual identifier that is registered in a registry by, or on behalf of, a registration authority according to some registration scheme"})

(def Registrar
  "party that acts as a representative of a registration authority to provide registration services, including official record keeping"
  {:cmns-av/adaptedFrom
   "Barron's Dictionary of Business and Economic Terms, Fifth Edition, 2012",
   :db/ident :cmns-ra/Registrar,
   :rdf/type :owl/Class,
   :rdfs/label "registrar",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ra/registers,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-ra/isDesignatedBy,
                      :owl/someValuesFrom :cmns-ra/RegistrationAuthority,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-prd/provides,
                      :owl/someValuesFrom :cmns-ra/RegistrationService,
                      :rdf/type           :owl/Restriction}
                     :cmns-prd/ServiceProvider
                     :cmns-pts/Actor],
   :skos/definition
   "party that acts as a representative of a registration authority to provide registration services, including official record keeping"})

(def RegistrationAuthority
  "service provider that is officially responsible for maintaining a registry and providing registration services and/or for delegating of some or all of these roles to a registrar"
  {:cmns-av/abbreviation "RA",
   :db/ident :cmns-ra/RegistrationAuthority,
   :rdf/type :owl/Class,
   :rdfs/label "registration authority",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-ra/RegistrationService,
                      :owl/onProperty :cmns-prd/provides,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :cmns-ra/isRegistrationAuthorityFor,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :cmns-ra/registers,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Actor
                     :cmns-prd/ServiceProvider
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-ra/Registry,
                      :owl/onProperty :cmns-ra/manages,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "service provider that is officially responsible for maintaining a registry and providing registration services and/or for delegating of some or all of these roles to a registrar"})

(def RegistrationScheme
  "scheme for organizing information in a registry and allocating identifiers to registered items"
  {:db/ident :cmns-ra/RegistrationScheme,
   :rdf/type :owl/Class,
   :rdfs/label "registration scheme",
   :rdfs/subClassOf :cmns-id/IdentificationScheme,
   :skos/definition
   "scheme for organizing information in a registry and allocating identifiers to registered items"})

(def RegistrationService
  "service provided to individuals and/or organizations for the registration of items in a registry"
  {:db/ident :cmns-ra/RegistrationService,
   :rdf/type :owl/Class,
   :rdfs/label "registration service",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/isProvidedBy,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:cmns-ra/RegistrationAuthority
                                            :cmns-ra/Registrar],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :cmns-prd/Service],
   :skos/definition
   "service provided to individuals and/or organizations for the registration of items in a registry"})

(def Registry
  "authoritative record or collection of records relating to something"
  {:cmns-av/explanatoryNote
   "Electronic registries typically contain a unique identifier for each entry, so that individual records can be referenced from other documents and registries.",
   :cmns-av/synonym "register",
   :db/ident :cmns-ra/Registry,
   :rdf/type :owl/Class,
   :rdfs/label "registry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-ra/isManagedBy,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:cmns-ra/RegistrationAuthority
                                            :cmns-ra/Registrar],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-ra/RegistryEntry,
                      :owl/onProperty :cmns-col/comprises,
                      :rdf/type       :owl/Restriction}
                     :cmns-doc/Record
                     :cmns-col/StructuredCollection],
   :skos/definition
   "authoritative record or collection of records relating to something"})

(def RegistryEntry
  "constituent of a registry that includes the details for something recorded in that registry"
  {:db/ident :cmns-ra/RegistryEntry,
   :rdf/type :owl/Class,
   :rdfs/label "registry entry",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :cmns-ra/RegisteredIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :cmns-ra/Registry,
                      :owl/onProperty    :cmns-col/isIncludedIn,
                      :rdf/type          :owl/Restriction}
                     :cmns-col/Constituent],
   :skos/definition
   "constituent of a registry that includes the details for something recorded in that registry"})

(def designates
  "appoints someone officially"
  {:cmns-av/explanatoryNote
   "This property is intended to cover assigning a job or role to someone, selecting or designating someone to fill an office or a position, and fixing or setting by authority or by mutual agreement.",
   :db/ident           :cmns-ra/designates,
   :rdf/type           [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/domain        :cmns-pts/PartyRole,
   :rdfs/label         "designates",
   :rdfs/range         :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :cmns-pts/hasRelatedPartyRole,
   :skos/definition    "appoints someone officially"})

(def hasRegistrationAuthority
  "indicates the registration authority for something"
  {:db/ident           :cmns-ra/hasRegistrationAuthority,
   :owl/inverseOf      :cmns-ra/isRegistrationAuthorityFor,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "has registration authority",
   :rdfs/range         :cmns-ra/RegistrationAuthority,
   :rdfs/subPropertyOf [:cmns-ra/isRelatedTo :cmns-pts/hasPartyRole],
   :skos/definition    "indicates the registration authority for something"})

(def hasRegistrationDate
  "indicates the date or date and time on which something is registered"
  {:db/ident :cmns-ra/hasRegistrationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has registration date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates the date or date and time on which something is registered"})

(def isDesignatedBy
  "indicates the role of the party that has assigned or appointed someone to an office or position"
  {:db/ident :cmns-ra/isDesignatedBy,
   :owl/inverseOf :cmns-ra/designates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is designated by",
   :rdfs/subPropertyOf :cmns-pts/hasRelatedPartyRole,
   :skos/definition
   "indicates the role of the party that has assigned or appointed someone to an office or position"})

(def isManagedBy
  "indicates the role of a party that directs the affairs or administration of something or someone"
  {:db/ident :cmns-ra/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is managed by",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf [:cmns-ra/isRelatedTo :cmns-pts/hasPartyRole],
   :skos/definition
   "indicates the role of a party that directs the affairs or administration of something or someone"})

(def isRegisteredBy
  "indicates the registration authority or registrar that registers something"
  {:db/ident :cmns-ra/isRegisteredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is registered by",
   :rdfs/range {:owl/unionOf [:cmns-ra/RegistrationAuthority
                              :cmns-ra/Registrar],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:cmns-ra/isRelatedTo :cmns-pts/hasPartyRole],
   :skos/definition
   "indicates the registration authority or registrar that registers something"})

(def isRegisteredIn
  "indicates the registry that something is registered in"
  {:db/ident :cmns-ra/isRegisteredIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is registered in",
   :rdfs/range :cmns-ra/Registry,
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition "indicates the registry that something is registered in"})

(def isRegistrationAuthorityFor
  "indicates something (typically an identifier or code) that the registration authority issues"
  {:db/ident :cmns-ra/isRegistrationAuthorityFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-ra/RegistrationAuthority,
   :rdfs/label "is registration authority for",
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition
   "indicates something (typically an identifier or code) that the registration authority issues"})

(def isRelatedTo
  "links something or someone to something or someone else"
  {:db/ident        :cmns-ra/isRelatedTo,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is related to",
   :skos/definition "links something or someone to something or someone else"})

(def manages
  "relates a party to something or someone that it directs or administers in some way"
  {:db/ident :cmns-ra/manages,
   :owl/inverseOf :cmns-ra/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/PartyRole,
   :rdfs/label "manages",
   :rdfs/subPropertyOf :cmns-ra/isRelatedTo,
   :skos/definition
   "relates a party to something or someone that it directs or administers in some way"})

(def registers
  "records something in a registry or archive"
  {:db/ident           :cmns-ra/registers,
   :owl/inverseOf      :cmns-ra/isRegisteredBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        {:owl/unionOf [:cmns-ra/RegistrationAuthority
                                      :cmns-ra/Registrar],
                        :rdf/type    :owl/Class},
   :rdfs/label         "registers",
   :rdfs/subPropertyOf :cmns-doc/records,
   :skos/definition    "records something in a registry or archive"})

(def specifies
  "states a fact about something"
  {:db/ident        :cmns-ra/specifies,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "specifies",
   :skos/definition "states a fact about something"})