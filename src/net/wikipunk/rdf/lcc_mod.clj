(ns net.wikipunk.rdf.lcc-mod
  "The Languages, Countries and Codes (LCC) Ontologies Module is provided for the convenience of IDMP users and includes ontologies that have been standardized by the Object Management Group (OMG). The latest OMG specification for LCC is available on the OMG web site as are the ontologies. The versions of the LCC ontologies included herein represent work in progress for an LCC 2.0 specification and have been updated from the LCC 1.2 version to include the Commons Ontology Library. We anticipate these changes will be incorporated into LCC in 2023."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/MetadataLCC.rdf",
   :dcterms/abstract
   "The Languages, Countries and Codes (LCC) Ontologies Module is provided for the convenience of IDMP users and includes ontologies that have been standardized by the Object Management Group (OMG). The latest OMG specification for LCC is available on the OMG web site as are the ontologies. The versions of the LCC ontologies included herein represent work in progress for an LCC 2.0 specification and have been updated from the LCC 1.2 version to include the Commons Ontology Library. We anticipate these changes will be incorporated into LCC in 2023.",
   :dcterms/issued #inst "2022-09-01T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"],
   :owl/versionIRI "https://www.omg.org/spec/LCC/20220901/MetadataLCC/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "lcc-mod" "https://www.omg.org/spec/LCC/MetadataLCC/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/MetadataLCC/",
   :rdfa/prefix "lcc-mod",
   :rdfa/uri "https://www.omg.org/spec/LCC/MetadataLCC/",
   :rdfs/label "Languages, Countries and Codes (LCC) Module"})

(def LCCModule
  "The Languages, Countries and Codes (LCC) Ontologies Module is provided for the convenience of IDMP users and includes ontologies that have been standardized by the Object Management Group (OMG). The latest OMG specification for LCC is available on the OMG web site as are the ontologies. The versions of the LCC ontologies included herein represent work in progress for an LCC 2.0 specification and have been updated from the LCC 1.2 version to include the Commons Ontology Library. We anticipate these changes will be incorporated into LCC in 2023."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :db/ident :lcc-mod/LCCModule,
   :dcterms/abstract
   "The Languages, Countries and Codes (LCC) Ontologies Module is provided for the convenience of IDMP users and includes ontologies that have been standardized by the Object Management Group (OMG). The latest OMG specification for LCC is available on the OMG web site as are the ontologies. The versions of the LCC ontologies included herein represent work in progress for an LCC 2.0 specification and have been updated from the LCC 1.2 version to include the Commons Ontology Library. We anticipate these changes will be incorporated into LCC in 2023.",
   :dcterms/hasPart
   ["https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :idmp-chg/Module],
   :rdfs/label "Languages, Countries and Codes (LCC) Module"})