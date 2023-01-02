(ns net.wikipunk.rdf.cmns-prd
  "This ontology defines fundamental concepts for products, services, and providers of those services. It also covers well-known identifiers used to support supply chain applications."
  {:cmns-av/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/ProductsAndServices.rdf",
   :dcterms/abstract
   "This ontology defines fundamental concepts for products, services, and providers of those services. It also covers well-known identifiers used to support supply chain applications.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/ContextualIdentifiers/"
                 "https://www.omg.org/spec/Commons/Identifiers/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/Collections/"
                 "https://www.omg.org/spec/Commons/Documents/"
                 "https://www.omg.org/spec/Commons/Classifiers/"
                 "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
                 "https://www.omg.org/spec/Commons/ContextualDesignators/"
                 "https://www.omg.org/spec/Commons/PartiesAndSituations/"
                 "https://www.omg.org/spec/Commons/Locations/"
                 "https://www.omg.org/spec/Commons/Organizations/"
                 "https://www.omg.org/spec/Commons/Designators/"],
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20221101/ProductsAndServices/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-loc" "https://www.omg.org/spec/Commons/Locations/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/ProductsAndServices/",
   :rdfa/prefix "cmns-prd",
   :rdfa/uri "https://www.omg.org/spec/Commons/ProductsAndServices/",
   :rdfs/label "Commons Products and Services Ontology",
   :skos/note
   "This ontology was originally designed for and has been adapted from the Financial Industry Business Ontology (FIBO) Products and Services Ontology."})

(def Capability
  "ability to perform a directed process towards meeting an objective or according to some specification"
  {:cmns-av/adaptedFrom
   "Value Delivery Modeling Language Specification, http://www.omg.org/spec/VDML/",
   :cmns-av/explanatoryNote
   "Capabilities may involve people with particular skills and knowledge, intellectual property, defined practices, operating facilities, tools and equipment.",
   :db/ident :cmns-prd/Capability,
   :rdf/type :owl/Class,
   :rdfs/label "capability",
   :skos/definition
   "ability to perform a directed process towards meeting an objective or according to some specification"})

(def CommercialProduct
  "commercially distributed good that is (1) tangible property, (2) the output or result of a fabrication, manufacturing, or production process, or (3) something that passes through a distribution channel before being consumed or used"
  {:cmns-av/adaptedFrom ["https://www.oecd.org/regreform/sectors/2376087.pdf"
                         "https://thelawdictionary.org/product/"],
   :cmns-av/explanatoryNote
   ["Products are considered to be homogenous when they are perfect substitutes and buyers perceive no actual or real differences between the products offered by different firms. In contrast, heterogenous products differ significantly from each other and are not easily substitutable."
    "Goods, services, and in some cases rights may be products depending on the circumstances."],
   :db/ident :cmns-prd/CommercialProduct,
   :rdf/type :owl/Class,
   :rdfs/label "commercial product",
   :rdfs/subClassOf
   [{:owl/unionOf [:cmns-prd/Good :cmns-prd/Right :cmns-prd/Service],
     :rdf/type    :owl/Class}
    :cmns-prd/Product],
   :skos/definition
   "commercially distributed good that is (1) tangible property, (2) the output or result of a fabrication, manufacturing, or production process, or (3) something that passes through a distribution channel before being consumed or used"})

(def Commodity
  "material resource used in commerce that is interchangeable with other commodities of the same type"
  {:cmns-av/explanatoryNote
   "Commodities are most often used as inputs in the production of other goods or services. The quality of a given commodity may differ slightly, but it is essentially uniform across producers.",
   :db/ident :cmns-prd/Commodity,
   :rdf/type :owl/Class,
   :rdfs/label "commodity",
   :rdfs/subClassOf :cmns-prd/Good,
   :skos/definition
   "material resource used in commerce that is interchangeable with other commodities of the same type"})

(def Facility
  "something established to serve a particular purpose, make some course of action or operation easier, or provide some capability or service"
  {:cmns-av/explanatoryNote
   "A facility may be concrete (as in a manufacturing facility) or abstract. Concrete facilities may be permanent, semi-permanent, or temporary structures, providing one or more capabilities at a given site. A single site may include multiple facilities and a given facility may span multiple sites.",
   :db/ident :cmns-prd/Facility,
   :rdf/type :owl/Class,
   :rdfs/label "facility",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-prd/Site,
                      :owl/onProperty :cmns-prd/isSituatedAt,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-prd/Capability,
                      :owl/onProperty :cmns-prd/provides,
                      :rdf/type       :owl/Restriction}
                     :cmns-pts/FunctionalRole],
   :skos/definition
   "something established to serve a particular purpose, make some course of action or operation easier, or provide some capability or service"})

(def GS1CompanyPrefix
  "unique string of four to twelve digits used to issue GS1 identification keys"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 1.4.4; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :db/ident :cmns-prd/GS1CompanyPrefix,
   :rdf/type :owl/Class,
   :rdfs/label "GS1 company prefix",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf [:cmns-prd/GS1Member
                                                     :cmns-prd/GS1User],
                                       :rdf/type    :owl/Class},
                      :owl/onProperty :cmns-id/identifies,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :cmns-prd/GS1CompanyPrefixIssuer,
                      :owl/onProperty :cmns-prd/isIssuedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue   :cmns-prd/GS1GeneralSpecifications,
                      :owl/onProperty :cmns-col/compliesWith,
                      :rdf/type       :owl/Restriction}
                     :cmns-cxtid/ContextualIdentifier],
   :skos/definition
   "unique string of four to twelve digits used to issue GS1 identification keys",
   :skos/note
   ["The first digits are a valid GS1 prefix and the length must be at least one longer than the length of the GS1 prefix."
    "A GS1 Company Prefix starting with a zero ('0') is used to generate GTIN-12s (as well as the other GS1 identification keys). A GS1 Company Prefix starting with a digit other than zero ('0') is used to generate GTIN-13s (as well as the other GS1 identification keys)."]})

(def GS1CompanyPrefixIssuer
  "service provider that is a GS1 member organization, or GS1 itself, that issues GS1 company prefixes based on a GS1 prefix allocated to that issuer, and allocates the prefix either to a GS1 user company or to itself (e.g., for issuing individual identification keys)"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 1.4.4; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :cmns-av/explanatoryNote
   "GS1 defines issuance in terms of the generation of a GS1 prefix, GS1 company prefix, or GS1 identification key in accordance with GS1 rules and policies by GS1 or a GS1 Member Organisation.",
   :db/ident :cmns-prd/GS1CompanyPrefixIssuer,
   :rdf/type :owl/Class,
   :rdfs/label "GS1 company prefix issuer",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/issues,
                      :owl/someValuesFrom :cmns-prd/GS1CompanyPrefix,
                      :rdf/type           :owl/Restriction}
                     {:owl/unionOf [{:owl/hasValue   :cmns-prd/GS1GlobalOffice,
                                     :owl/onProperty :cmns-pts/isPlayedBy,
                                     :rdf/type       :owl/Restriction}
                                    :cmns-prd/GS1Member],
                      :rdf/type    :owl/Class}
                     :cmns-prd/ServiceProvider],
   :skos/definition
   "service provider that is a GS1 member organization, or GS1 itself, that issues GS1 company prefixes based on a GS1 prefix allocated to that issuer, and allocates the prefix either to a GS1 user company or to itself (e.g., for issuing individual identification keys)"})

(def GS1GeneralSpecifications
  "reference specification and scheme that defines how identification keys, data attributes and barcodes must be formulated and used in business applications"
  {:cmns-doc/isAbout :cmns-prd/TradeItem,
   :db/ident :cmns-prd/GS1GeneralSpecifications,
   :rdf/type [:cmns-id/IdentificationScheme
              :cmns-doc/ReferenceDocument
              :cmns-cls/ClassificationScheme
              :owl/NamedIndividual],
   :rdfs/label "GS1 General Specifications",
   :rdfs/seeAlso
   "https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :skos/definition
   "reference specification and scheme that defines how identification keys, data attributes and barcodes must be formulated and used in business applications"})

(def GS1GlobalOffice
  "neutral, not-for-profit organisation that provides global standards for efficient business communication"
  {:cmns-av/abbreviation "GS1 GO",
   :cmns-av/adaptedFrom
   "https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :db/ident :cmns-prd/GS1GlobalOffice,
   :rdf/type [:cmns-org/LegalEntity :owl/NamedIndividual],
   :rdfs/label "GS1 Global Office",
   :rdfs/seeAlso "https://www.gs1.org/about/what-we-do",
   :skos/definition
   "neutral, not-for-profit organisation that provides global standards for efficient business communication",
   :skos/note
   "The Global Office, located in Brussels (Belgium) and Ewing, NJ (USA) is the guardian, and provides an open, user-driven, forum for ongoing maintenance and development, of the GS1 standards, guidelines and statues."})

(def GS1IdentificationKey
  "unique classifier for a class of objects that conforms with GS1 General Specifications"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 2.1; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :db/ident :cmns-prd/GS1IdentificationKey,
   :rdf/type :owl/Class,
   :rdfs/label "GS1 identification key",
   :rdfs/subClassOf [{:owl/hasValue   :cmns-prd/GS1GeneralSpecifications,
                      :owl/onProperty :cmns-dsg/isDefinedIn,
                      :rdf/type       :owl/Restriction}
                     :cmns-cxtdsg/ContextualDesignation
                     :cmns-cls/Classifier],
   :skos/definition
   "unique classifier for a class of objects that conforms with GS1 General Specifications",
   :skos/scopeNote
   "GS1 defines an identification key as a unique identifier for a class of objects (e.g., a trade item) or an instance of an object (e.g., a logistic unit). However, from an ontological perspective, a class of objects is quite different from an instance of an object. In the context of this ontology, a GS1 identification key identifies a class of objects."})

(def GS1Member
  "organization that is a member of GS1"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 1.4.4; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :db/ident :cmns-prd/GS1Member,
   :rdf/type :owl/Class,
   :rdfs/label "GS1 member",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom {:owl/hasValue
                                           :cmns-prd/GS1GlobalOffice,
                                           :owl/onProperty :cmns-col/isMemberOf,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :cmns-org/OrganizationMember],
   :skos/definition "organization that is a member of GS1"})

(def GS1User
  "legal entity that is a user of GS1 standards such as various keys, their definitions, and related data"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 1.4.4; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :cmns-av/explanatoryNote
   "Well-known GS1 standards include Global Trade Item Numbers (GTIN), Unique Product Codes (UPC), and extensions that support domain specific supply chain requirements.",
   :db/ident :cmns-prd/GS1User,
   :rdf/type :owl/Class,
   :rdfs/label "GS1 user",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom :cmns-org/LegalEntity,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/Actor],
   :skos/definition
   "legal entity that is a user of GS1 standards such as various keys, their definitions, and related data"})

(def GlobalTradeItemNumber
  "classifier for something that is traded in the supply chain that conforms with GS1 General Specifications"
  {:cmns-av/abbreviation "GTIN",
   :cmns-av/adaptedFrom
   ["GS1 General Specifications, Release 22.0, Jan 22, clause 2.1; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf"
    "ISO 11615:2017 Health informatics - Identification of medicinal products (IDMP) - Data elements and structures for the unique identification and exchange of regulated medicinal product information, clause 3.1.25"],
   :db/ident :cmns-prd/GlobalTradeItemNumber,
   :rdf/type :owl/Class,
   :rdfs/label "global trade item number",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/denotes,
                      :owl/someValuesFrom :cmns-prd/TradeItem,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :cmns-prd/GS1CompanyPrefix,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :cmns-prd/TradeItem,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:cmns-prd/GS1CompanyPrefixIssuer
                                        :cmns-prd/GS1User],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :cmns-prd/isIssuedBy,
                      :rdf/type       :owl/Restriction}
                     :cmns-prd/GS1IdentificationKey],
   :skos/definition
   "classifier for something that is traded in the supply chain that conforms with GS1 General Specifications",
   :skos/note
   "A GTIN is used to identify any item upon which there is a need to retrieve predefined information and that may be priced, ordered or invoiced at any point in any supply chain. GTINs may be 8, 12, 13 or 14 digits in length."})

(def Good
  "physical, produced item over which ownership rights can be established, whose ownership can be passed from one party to another by engaging in transactions, and that is not money or real estate"
  {:cmns-av/adaptedFrom ["https://www.law.cornell.edu/ucc/9/9-102#goods"
                         "https://data.oecd.org/trade/trade-in-goods.htm"],
   :cmns-av/explanatoryNote
   ["From the Universal Commercial Code (UCC) in the United States, the term 'good' includes (i) fixtures, (ii) standing timber that is to be cut and removed under a conveyance or contract for sale, (iii) the unborn young of animals, (iv) crops grown, growing, or to be grown, even if the crops are produced on trees, vines, or bushes, and (v) manufactured homes. The term also includes a computer program embedded in goods and any supporting information provided in connection with a transaction relating to the program if (i) the program is associated with the goods in such a manner that it customarily is considered part of the goods, or (ii) by becoming the owner of the goods, a person acquires a right to use the program in connection with the goods. The term does not include a computer program embedded in goods that consist solely of the medium in which the program is embedded. The term also does not include accounts, chattel paper, commercial tort claims, deposit accounts, documents, general intangibles, instruments, investment property, letter-of-credit rights, letters of credit, money, or oil, gas, or other minerals before extraction."
    "An inherently useful and relatively scarce tangible item produced from agricultural, construction, manufacturing, or mining activities. Off-the-shelf products, including off-the-shelf software products and customization of software products, are generally considered to be goods. Energy, such as electricity, is also considered to be a good from a legal perspective, and meets the criteria of being manufactured or produced via some process, including but not limited to a mining process. According to the UN Convention On Contract For The International Sale Of Goods, the term 'good' does not include (1) items bought for personal use, (2) items bought at an auction or foreclosure sale, (3) aircraft or ocean-going vessels."],
   :db/ident :cmns-prd/Good,
   :rdf/type :owl/Class,
   :rdfs/label "good",
   :skos/definition
   "physical, produced item over which ownership rights can be established, whose ownership can be passed from one party to another by engaging in transactions, and that is not money or real estate"})

(def Producer
  "grower, maker, fabricator, or manufacturer of some product or other good"
  {:db/ident :cmns-prd/Producer,
   :rdf/type :owl/Class,
   :rdfs/label "producer",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/produces,
                      :owl/someValuesFrom :cmns-prd/Good,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/FunctionalRole
                     :cmns-pts/Actor],
   :skos/definition
   "grower, maker, fabricator, or manufacturer of some product or other good"})

(def Product
  "something that is produced by, results from, or obtained as a consequence of some process or transformation"
  {:db/ident :cmns-prd/Product,
   :rdf/type :owl/Class,
   :rdfs/label "product",
   :skos/definition
   "something that is produced by, results from, or obtained as a consequence of some process or transformation"})

(def ProductIdentifier
  "sequence of characters uniquely identifying a product in some context"
  {:db/ident :cmns-prd/ProductIdentifier,
   :rdf/type :owl/Class,
   :rdfs/label "product identifier",
   :rdfs/subClassOf [{:owl/onClass    :cmns-prd/Product,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-cxtid/ContextualIdentifier],
   :skos/definition
   "sequence of characters uniquely identifying a product in some context"})

(def Right
  "entitlement (not) to perform certain actions, or (not) to be in certain states; or entitlement that others (not) perform certain actions or (not) be in certain states"
  {:cmns-av/explanatoryNote
   "Rights dominate modern understandings of what actions are permissible and which institutions are just. Rights structure the form of governments, the content of laws, and the shape of morality as many now see it. To accept a set of rights is to approve a distribution of freedom and authority, and so to endorse a certain view of what may, must, and must not be done. According to the Hohfeldian incidents (Wesley Hohfeld (1879-1918)), rights are complex and consist of four major components: privilege, claim, power, and immunity.",
   :db/ident :cmns-prd/Right,
   :rdf/type :owl/Class,
   :rdfs/label "right",
   :rdfs/seeAlso "https://plato.stanford.edu/entries/rights/",
   :skos/definition
   "entitlement (not) to perform certain actions, or (not) to be in certain states; or entitlement that others (not) perform certain actions or (not) be in certain states",
   :skos/example
   "Examples include contractual rights, legal rights, human rights, political rights, and so forth."})

(def Service
  "intangible activity performed by some party for the benefit of another party"
  {:cmns-av/explanatoryNote
   "Sometimes services are difficult to identify because they are closely associated with a good; such as the combination of a diagnosis with the administration of a medicine. No transfer of possession or ownership takes place when services are sold, and they (1) cannot be stored or transported, (2) are instantly perishable, and (3) come into existence at the time they are bought and consumed.",
   :db/ident :cmns-prd/Service,
   :rdf/type :owl/Class,
   :rdfs/label "service",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/isProvidedBy,
                      :owl/someValuesFrom :cmns-prd/ServiceProvider,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-prd/Capability,
                      :owl/onProperty :cmns-prd/provides,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "intangible activity performed by some party for the benefit of another party",
   :skos/example
   "Services include intangible products, such as accounting, banking, cleaning, consultancy, education, insurance, expertise, medical treatment, or transportation services."})

(def ServiceProvider
  "agent that provides professional services, such as consulting, financial, legal, real estate, education, communications, registration, regulatory, manufacturing, storage, processing, or other services"
  {:db/ident :cmns-prd/ServiceProvider,
   :rdf/type :owl/Class,
   :rdfs/label "service provider",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-prd/provides,
                      :owl/someValuesFrom :cmns-prd/Service,
                      :rdf/type           :owl/Restriction}
                     :cmns-pts/FunctionalRole
                     :cmns-pts/AgentRole],
   :skos/definition
   "agent that provides professional services, such as consulting, financial, legal, real estate, education, communications, registration, regulatory, manufacturing, storage, processing, or other services"})

(def Site
  "place, setting, or context in which something, such as a facility, is situated"
  {:cmns-av/explanatoryNote
   "A physical site has certain characteristics that contribute to the context it provides, including area, shape, accessibility, and in the case of a geographic site, landforms, soil and ground conditions, climate, and so forth.",
   :db/ident :cmns-prd/Site,
   :rdf/type :owl/Class,
   :rdfs/label "site",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-pts/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty :cmns-prd/situates,
                                           :owl/someValuesFrom :owl/Thing,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :lcc-cr/Location,
                      :owl/onProperty :cmns-loc/isLocatedAt,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-pts/Role],
   :skos/definition
   "place, setting, or context in which something, such as a facility, is situated",
   :skos/example
   "Examples include a structure or building, an archeological dig, the landing location for an aircraft or spacecraft, and the site of a wound. A given site may accommodate multiple facilities."})

(def StockKeepingUnit
  "unique classifier for a class of items for sale, purchased, and/or tracked in inventory, sometimes represented via a barcode for scanning and tracking, used within the context of an organization"
  {:cmns-av/abbreviation "SKU",
   :cmns-av/explanatoryNote
   "SKUs are not regulated or standardized. When a company receives items from a vendor, it has a choice of maintaining the vendor's SKU or creating its own. This makes them distinct from Global Trade Item Number (GTIN), which are standard, global, tracking units. Uniform Product Code (UPC), European Article Number (EAN), and Australian Product Number (APN) are special cases of GTINs.",
   :db/ident :cmns-prd/StockKeepingUnit,
   :rdf/type :owl/Class,
   :rdfs/label "stock keeping unit",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/denotes,
                      :owl/someValuesFrom :cmns-prd/TradeItem,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :cmns-prd/TradeItem,
                      :rdf/type           :owl/Restriction}
                     :cmns-cxtdsg/ContextualDesignation
                     :cmns-cls/Classifier],
   :skos/definition
   "unique classifier for a class of items for sale, purchased, and/or tracked in inventory, sometimes represented via a barcode for scanning and tracking, used within the context of an organization"})

(def Supplier
  "actor that produces, provides, or furnishes an item or service"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 1.4.4; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :db/ident :cmns-prd/Supplier,
   :rdf/type :owl/Class,
   :rdfs/label "supplier",
   :rdfs/subClassOf [:cmns-pts/FunctionalRole :cmns-pts/Actor],
   :skos/definition
   "actor that produces, provides, or furnishes an item or service"})

(def TradeItem
  "any item (product or service) upon which there is a need to retrieve predefined information and that may be priced, or ordered, or invoiced at any point in any supply chain"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 2.1",
   :cmns-av/explanatoryNote
   "Each trade item that is different from another in design and/or content is allocated a unique identification number, which remains the same as long as it is traded. The same identification number is given to all trade items sharing key characteristics. Such numbers must be treated in their entirety throughout the supply chain.",
   :db/ident :cmns-prd/TradeItem,
   :rdf/type :owl/Class,
   :rdfs/label "trade item",
   :rdfs/subClassOf {:owl/unionOf [:cmns-prd/Good
                                   :cmns-prd/Right
                                   :cmns-prd/Product
                                   :cmns-prd/Service],
                     :rdf/type    :owl/Class},
   :skos/definition
   "any item (product or service) upon which there is a need to retrieve predefined information and that may be priced, or ordered, or invoiced at any point in any supply chain",
   :skos/scopeNote
   "This definition covers services and products, from raw materials through to end user products, all of which may have predefined characteristics."})

(def UPCCompanyPrefix
  "unique string of digits derived from a GS1 company prefix that starts with a leading zero, constructed by removing that zero, that is used to construct 12-digit trade item identifiers"
  {:cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22, clause 1.4.6; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :db/ident :cmns-prd/UPCCompanyPrefix,
   :rdf/type :owl/Class,
   :rdfs/label "UPC company prefix",
   :rdfs/subClassOf [{:owl/onClass    :cmns-prd/GS1CompanyPrefix,
                      :owl/onProperty :cmns-col/isIncludedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-prd/GS1CompanyPrefix],
   :skos/definition
   "unique string of digits derived from a GS1 company prefix that starts with a leading zero, constructed by removing that zero, that is used to construct 12-digit trade item identifiers",
   :skos/example
   "For example, the 6-digit U.P.C. Company Prefix 614141 is derived from the 7-digit GS1 Company Prefix 0614141.",
   :skos/note
   "When a leading zero is added to a U.P.C. Company Prefix, it becomes a GS1 Company Prefix that may be used to issue all other GS1 identification keys."})

(def UniformProductCode
  "classifier expressed that is a 12-digit GTIN expressed using barcode symbology that conforms with GS1 General Specifications"
  {:cmns-av/abbreviation "UPC",
   :cmns-av/adaptedFrom
   "GS1 General Specifications, Release 22.0, Jan 22; available at https://www.gs1.org/docs/barcodes/GS1_General_Specifications.pdf",
   :cmns-av/explanatoryNote
   "Along with the related International Article Number (EAN) barcode, the UPC is the barcode mainly used for scanning of trade items at the point of sale, per the specifications of the international GS1 organization.",
   :db/ident :cmns-prd/UniformProductCode,
   :rdf/type :owl/Class,
   :rdfs/label "uniform product code",
   :rdfs/subClassOf [{:owl/onClass    :cmns-prd/UPCCompanyPrefix,
                      :owl/onProperty :cmns-col/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :cmns-prd/GlobalTradeItemNumber],
   :skos/definition
   "classifier expressed that is a 12-digit GTIN expressed using barcode symbology that conforms with GS1 General Specifications"})

(def Venue
  "site where something happens, described in the context of the event or activity that occurs there"
  {:db/ident :cmns-prd/Venue,
   :rdf/type :owl/Class,
   :rdfs/label "venue",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-cxtdsg/Context,
                      :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                      :rdf/type       :owl/Restriction}
                     :cmns-prd/Site],
   :skos/definition
   "site where something happens, described in the context of the event or activity that occurs there"})

(def isIssuedBy
  "indicates a role played by a functional entity or party responsible for circulating, distributing, or publishing something"
  {:db/ident :cmns-prd/isIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is issued by",
   :rdfs/range :cmns-pts/AgentRole,
   :rdfs/subPropertyOf :cmns-prd/isProvidedBy,
   :skos/definition
   "indicates a role played by a functional entity or party responsible for circulating, distributing, or publishing something"})

(def isProducedBy
  "is fabricated, manufactured or otherwise created by, through some production process"
  {:db/ident :cmns-prd/isProducedBy,
   :owl/inverseOf :cmns-prd/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is produced by",
   :rdfs/range :cmns-prd/Producer,
   :skos/definition
   "is fabricated, manufactured or otherwise created by, through some production process"})

(def isProvidedBy
  "is made available by"
  {:db/ident        :cmns-prd/isProvidedBy,
   :owl/inverseOf   :cmns-prd/provides,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is provided by",
   :skos/definition "is made available by"})

(def isSituatedAt
  "is placed at"
  {:cmns-av/explanatoryNote
   "Something may be situated at some site, or in some setting, situation, or context.",
   :db/ident        :cmns-prd/isSituatedAt,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is situated at",
   :skos/definition "is placed at"})

(def issues
  "officially makes something available"
  {:db/ident           :cmns-prd/issues,
   :owl/inverseOf      :cmns-prd/isIssuedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :cmns-pts/AgentRole,
   :rdfs/label         "issues",
   :rdfs/subPropertyOf :cmns-prd/provides,
   :skos/definition    "officially makes something available"})

(def produces
  "creates through a fabrication, manufacturing or production process"
  {:db/ident :cmns-prd/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-prd/Producer,
   :rdfs/label "produces",
   :skos/definition
   "creates through a fabrication, manufacturing or production process"})

(def provides
  "makes something available"
  {:db/ident        :cmns-prd/provides,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "provides",
   :skos/definition "makes something available"})

(def situates
  "indicates the place, setting, or context in which something is placed"
  {:db/ident :cmns-prd/situates,
   :owl/inverseOf :cmns-prd/isSituatedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "situates",
   :skos/definition
   "indicates the place, setting, or context in which something is placed"})