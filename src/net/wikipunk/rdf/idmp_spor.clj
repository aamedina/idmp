(ns net.wikipunk.rdf.idmp-spor
  "The Substances, Products, Organisations and Referentials (SPOR) ontology extends the core IDMP ontologies to define additional content required to support alignment with the European Medicines Agency data management services for substances, products, organisations and referentials."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials.rdf",
   :dcterms/abstract
   "The Substances, Products, Organisations and Referentials (SPOR) ontology extends the core IDMP ontologies to define additional content required to support alignment with the European Medicines Agency data management services for substances, products, organisations and referentials.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Classifiers/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221201/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-ra" "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-eura"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/",
    "idmp-eurga"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
    "idmp-spor"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/",
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/",
   :rdfa/prefix "idmp-spor",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/",
   :rdfs/label
   "Substances, Products, Organisations and Referentials (SPOR) Ontology"})

(def OrganisationManagementServices
  "services supporting a central dictionary of organisation data in multiple languages"
  {:cmns-av/abbreviation "OMS service",
   :cmns-av/directSource "https://spor.ema.europa.eu/",
   :cmns-col/isPartOf
   :idmp-spor/SubstancesProductsOrganisationsReferentialsDataManagementServices,
   :cmns-prd/isProvidedBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-spor/OrganisationManagementServices,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "Organisation Management Services (OMS)",
   :skos/definition
   "services supporting a central dictionary of organisation data in multiple languages"})

(def ProductManagementServices
  "services supporting a central dictionary of product data in multiple languages"
  {:cmns-av/abbreviation "PMS service",
   :cmns-av/adaptedFrom "https://spor.ema.europa.eu/sporwi/",
   :cmns-col/isPartOf
   :idmp-spor/SubstancesProductsOrganisationsReferentialsDataManagementServices,
   :cmns-prd/isProvidedBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-spor/ProductManagementServices,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "Product Management Services (PMS)",
   :skos/definition
   "services supporting a central dictionary of product data in multiple languages"})

(def ReferentialsManagementServices
  "services supporting a central dictionary of referentials data in multiple languages"
  {:cmns-av/abbreviation "RMS service",
   :cmns-av/directSource "https://spor.ema.europa.eu/",
   :cmns-col/isPartOf
   :idmp-spor/SubstancesProductsOrganisationsReferentialsDataManagementServices,
   :cmns-prd/isProvidedBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-spor/ReferentialsManagementServices,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "Referentials Management Services (RMS)",
   :skos/definition
   "services supporting a central dictionary of referentials data in multiple languages"})

(def ReferentialsManagementServicesClassificationScheme
  "classification scheme that includes the set of controlled vocabularies used to classify entities included in the Substances Products Organisations Referentials (SPOR) Referentials Management Services (RMS) related services and repositories"
  {:db/ident :idmp-spor/ReferentialsManagementServicesClassificationScheme,
   :rdf/type [:cmns-cls/ClassificationScheme :owl/NamedIndividual],
   :rdfs/label "Referentials Management Services (RMS) classification scheme",
   :skos/definition
   "classification scheme that includes the set of controlled vocabularies used to classify entities included in the Substances Products Organisations Referentials (SPOR) Referentials Management Services (RMS) related services and repositories"})

(def ReferentialsManagementServicesRegistry
  "central dictionary of referentials data in multiple languages available through the Substances Products Organisations Referentials (SPOR) Referentials Management Services (RMS)"
  {:cmns-av/abbreviation ["SPOR-RMS" "SPOR RMS"],
   :cmns-av/directSource "https://spor.ema.europa.eu/",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-spor/ReferentialsManagementServicesRegistry,
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Referentials Management Services (RMS) registry",
   :skos/definition
   "central dictionary of referentials data in multiple languages available through the Substances Products Organisations Referentials (SPOR) Referentials Management Services (RMS)"})

(def SPOR-SubstanceDomainClassifier
  "classifier that describes the domain in which a particular substance is used from a Substances Products Organisations Referentials (SPOR) Referentials Management Services (RMS) perspective"
  {:db/ident :idmp-spor/SPOR-SubstanceDomainClassifier,
   :rdf/type :owl/Class,
   :rdfs/label "SPOR substance domain classifier",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :idmp-sub/Substance,
                      :owl/onProperty :cmns-cls/classifies,
                      :rdf/type       :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "classifier that describes the domain in which a particular substance is used from a Substances Products Organisations Referentials (SPOR) Referentials Management Services (RMS) perspective"})

(def SubstanceManagementServices
  "services supporting a central dictionary of substance data in multiple languages"
  {:cmns-av/abbreviation "SMS service",
   :cmns-av/directSource "https://spor.ema.europa.eu/",
   :cmns-col/isPartOf
   :idmp-spor/SubstancesProductsOrganisationsReferentialsDataManagementServices,
   :cmns-prd/isProvidedBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-spor/SubstanceManagementServices,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label "Substance Management Services (SMS)",
   :skos/definition
   "services supporting a central dictionary of substance data in multiple languages"})

(def SubstancesManagementServicesRegistry
  "central dictionary of substance data in multiple languages available through the Substances Products Organisations Referentials (SPOR) Substances Management Services (SMS)"
  {:cmns-av/abbreviation ["SPOR-SMS" "SPOR SMS"],
   :cmns-av/directSource "https://spor.ema.europa.eu/",
   :cmns-av/explanatoryNote
   "SMS is currently live as an EMA internal system. Until it is onboarded in the SPOR portal, external users should use the following systems: view and search substance data in EUTCT or IRIS; submit substance change requests in the EMA Service Desk portal; Export of substance data are available at https://spor.ema.europa.eu/web-ui-data-backend/download/csv.",
   :cmns-ra/isManagedBy :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident :idmp-spor/SubstancesManagementServicesRegistry,
   :rdf/type [:cmns-ra/Registry :owl/NamedIndividual],
   :rdfs/label "Substances Management Services registry",
   :skos/definition
   "central dictionary of substance data in multiple languages available through the Substances Products Organisations Referentials (SPOR) Substances Management Services (SMS)"})

(def SubstancesProductsOrganisationsReferentialsDataManagementServices
  "data management services for substances, products, organisations and referentials (SPOR) designed to support regulatory activities in the European Union"
  {:cmns-av/abbreviation "SPOR data management services",
   :cmns-av/directSource "https://spor.ema.europa.eu/",
   :cmns-col/hasPart [:idmp-spor/ReferentialsManagementServices
                      :idmp-spor/ProductManagementServices
                      :idmp-spor/OrganisationManagementServices
                      :idmp-spor/SubstanceManagementServices],
   :cmns-prd/isProvidedBy
   :idmp-eura/EuropeanMedicinesAgencyRegistrationAuthority,
   :db/ident
   :idmp-spor/SubstancesProductsOrganisationsReferentialsDataManagementServices,
   :rdf/type [:cmns-ra/RegistrationService :owl/NamedIndividual],
   :rdfs/label
   "Substances Products Organisations Referentials (SPOR) data management services",
   :skos/definition
   "data management services for substances, products, organisations and referentials (SPOR) designed to support regulatory activities in the European Union"})