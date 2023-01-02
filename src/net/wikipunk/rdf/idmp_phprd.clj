(ns net.wikipunk.rdf.idmp-phprd
  "The regulated pharmaceutical product information ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated pharmaceutical product information. It is derived from the ISO 11616:2017 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated pharmaceutical product information."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11616-PharmaceuticalProducts.rdf",
   :dcterms/abstract
   "The regulated pharmaceutical product information ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated pharmaceutical product information. It is derived from the ISO 11616:2017 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated pharmaceutical product information.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Preliminary,
   :owl/imports
   ["https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221101/ISO11616-PharmaceuticalProducts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-prd" "https://www.omg.org/spec/Commons/ProductsAndServices/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-ra" "https://www.omg.org/spec/Commons/RegistrationAuthorities/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-mprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
    "idmp-phprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/",
    "idmp-sub"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/",
   :rdfa/prefix "idmp-phprd",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/",
   :rdfs/label
   "ISO 11616 Regulated Pharmaceutical Product Information Ontology",
   :skos/changeNote
   "The https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221001/ISO11616-PharmaceuticalProducts.rdf version of this ontology was modified to rename 'adjuvant role's to adjuvant for clarification per discussion at the Pistoia Alliance Conference Workshop on 3 November 2022 (IDMP-298)."})