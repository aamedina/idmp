(ns net.wikipunk.rdf.idmp-phdf
  "The regulated pharmaceutical dose forms ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated pharmaceutical dose forms information. It is derived from the ISO 11239:2012 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on pharmaceutical dose forms, units of presentation, routes of administration and packaging."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/ISO11239-PharmaceuticalDoseForms.rdf",
   :dcterms/abstract
   "The regulated pharmaceutical dose forms ontology provides a semantic model representing the definitions for exchanging basic concepts for the unique identification and exchange of regulated pharmaceutical dose forms information. It is derived from the ISO 11239:2012 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of regulated information on pharmaceutical dose forms, units of presentation, routes of administration and packaging.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Preliminary,
   :owl/imports
   ["https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11616-PharmaceuticalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11238-Substances/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20220801/ISO11239-PharmaceuticalDoseForms/",
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
    "idmp-phdf"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11239-PharmaceuticalDoseForms/",
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
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11239-PharmaceuticalDoseForms/",
   :rdfa/prefix "idmp-phdf",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11239-PharmaceuticalDoseForms/",
   :rdfs/label "ISO 11239 Regulated Pharmaceutical Dose Forms Ontology"})