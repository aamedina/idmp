(ns net.wikipunk.rdf.idmp-iso-mod
  "The IDMP ISO Ontologies Library Module includes ontologies that correspond to the six primary ISO Identification of Medicinal Products (IDMP) standards. These ontologies have been developed for the Pistoia Alliance and their members, but will be made available as open source to anyone as the project matures. Reference individuals, such as for registries and registration authorities, are included in a separate ontology to enable testing without them as appropriate."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/MetadataISO.rdf",
   :dcterms/abstract
   "The IDMP ISO Ontologies Library Module includes ontologies that correspond to the six primary ISO Identification of Medicinal Products (IDMP) standards. These ontologies have been developed for the Pistoia Alliance and their members, but will be made available as open source to anyone as the project matures. Reference individuals, such as for registries and registration authorities, are included in a separate ontology to enable testing without them as appropriate.",
   :dcterms/issued #inst "2022-12-11T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11239-PharmaceuticalDoseForms/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221201/MetadataISO/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-iso-mod"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/MetadataISO/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.pistoiaalliance.org/idmp/ontology/ISO/MetadataISO/",
   :rdfa/prefix "idmp-iso-mod",
   :rdfa/uri "https://spec.pistoiaalliance.org/idmp/ontology/ISO/MetadataISO/",
   :rdfs/label "IDMP ISO Ontologies Library"})

(def ISOModule
  "The IDMP ISO Ontologies Library Module includes ontologies that correspond to the six primary ISO Identification of Medicinal Products (IDMP) standards, the related implementation guides, and regulatory agencies and registration authorities cited therein. The registration authorities and regulatory agencies are modularized by region, base on the divisions of the world specified in the United Nations M49 codes. This reference data can be loaded together with the main ontologies or not, depending on testing requirements. All of the ontologies provided in the IDMP ISO library and its jurisdiction-specific sub-libraries have been developed for the Pistoia Alliance and their members, but are also available as open source to anyone who chooses to use or extend them."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :db/ident :idmp-iso-mod/ISOModule,
   :dcterms/abstract
   "The IDMP ISO Ontologies Library Module includes ontologies that correspond to the six primary ISO Identification of Medicinal Products (IDMP) standards, the related implementation guides, and regulatory agencies and registration authorities cited therein. The registration authorities and regulatory agencies are modularized by region, base on the divisions of the world specified in the United Nations M49 codes. This reference data can be loaded together with the main ontologies or not, depending on testing requirements. All of the ontologies provided in the IDMP ISO library and its jurisdiction-specific sub-libraries have been developed for the Pistoia Alliance and their members, but are also available as open source to anyone who chooses to use or extend them.",
   :dcterms/hasPart
   ["https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-RegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/SubstancesProductsOrganisationsReferentials/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegistrationAuthorities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11239-PharmaceuticalDoseForms/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :idmp-chg/Module],
   :rdfs/label "IDMP ISO Ontologies Library"})