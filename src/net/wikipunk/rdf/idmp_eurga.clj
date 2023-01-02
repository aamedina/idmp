(ns net.wikipunk.rdf.idmp-eurga
  "The European Regulatory Agencies ontology extends the Commons EU Government Entities and Jurisdictions ontology to define regulatory agencies involved in authorizing and/or regulating various aspects of the pharmaceutical domain with respect to substances, pharmaceutical and medicinal products."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies.rdf",
   :dcterms/abstract
   "The European Regulatory Agencies ontology extends the Commons EU Government Entities and Jurisdictions ontology to define regulatory agencies involved in authorizing and/or regulating various aspects of the pharmaceutical domain with respect to substances, pharmaceutical and medicinal products.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/20221101/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-ge" "https://www.omg.org/spec/Commons/GovernmentEntities/",
    "cmns-ge-euj"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "cmns-org" "https://www.omg.org/spec/Commons/Organizations/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rga" "https://www.omg.org/spec/Commons/RegulatoryAgencies/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-eurga"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
    "idmp-mprd"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11615-MedicinalProducts/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
   :rdfa/prefix "idmp-eurga",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/ISO/EuropeanJurisdiction/EuropeanRegulatoryAgencies/",
   :rdfs/label "European Regulatory Agencies Ontology"})

(def EuropeanChemicalsAgency
  "organizational subunit of the European Commission that implements the EU's chemicals legislation to protect health and the environment"
  {:cmns-av/abbreviation "ECHA",
   :cmns-col/isPartOf :cmns-ge-euj/EuropeanCommission,
   :db/ident :idmp-eurga/EuropeanChemicalsAgency,
   :rdf/type [:cmns-org/OrganizationalSubUnit :owl/NamedIndividual],
   :rdfs/label "European Chemicals Agency",
   :rdfs/seeAlso "https://echa.europa.eu/",
   :skos/definition
   "organizational subunit of the European Commission that implements the EU's chemicals legislation to protect health and the environment",
   :skos/note
   ["The mission of the European Chemicals Agency is to be the center of knowledge on the sustainable management of chemicals, serving a wide range of EU policies and global initiatives, for the benefit of citizens and the environment."
    "The Member State Committee (MSC) participates in several REACH processes such as evaluation and authorisation. The MSC is responsible for resolving divergences of opinions among Member States and on proposals for the identification of Substances of Very High Concern (SVHCs). The Committee provides opinions on ECHA's draft recommendation for the authorisation list (Annex XIV) and draft Community Rolling Action Plan (CoRAP) for the substance evaluation process. If an agreement is not reached within the MSC, the matter is referred to the European Commission for decision-making."]})

(def EuropeanCommissionScientificCommitteeOnConsumerSafety
  "committee of the European Commission that provides opinions on health and safety risks (chemical, biological, mechanical and other physical risks) of non-food consumer products (e.g. cosmetic products and their ingredients, toys, textiles, clothing, personal care and household products) and services (e.g. tattooing, artificial sun tanning)"
  {:cmns-av/abbreviation "SCCS",
   :cmns-av/directSource
   "https://ec.europa.eu/health/scientific-committees/scientific-committee-consumer-safety-sccs_en",
   :cmns-col/isPartOf :cmns-ge-euj/EuropeanCommission,
   :db/ident :idmp-eurga/EuropeanCommissionScientificCommitteeOnConsumerSafety,
   :rdf/type [:cmns-org/OrganizationalSubUnit :owl/NamedIndividual],
   :rdfs/label "European Commission Scientific Committee on Consumer Safety",
   :skos/definition
   "committee of the European Commission that provides opinions on health and safety risks (chemical, biological, mechanical and other physical risks) of non-food consumer products (e.g. cosmetic products and their ingredients, toys, textiles, clothing, personal care and household products) and services (e.g. tattooing, artificial sun tanning)"})

(def EuropeanDirectorateForTheQualityOfMedicinesAndHealthcare
  "organisational subunit of the Council of Europe that protects public health by enabling the development, supporting the implementation and monitoring the application of quality standards for safe medicines and their safe use which are recognised as a scientific benchmark and applied worldwide"
  {:cmns-av/abbreviation "EDQM",
   :cmns-av/directSource "https://www.edqm.eu/en/",
   :cmns-av/explanatoryNote
   ["The European Directorate for the Quality of Medicines and HealthCare (EDQM) is a Directorate of the Council of Europe that traces its origins and statutes to the Convention on the Elaboration of a European Pharmacopoeia (an international treaty adopted by the Council of Europe in 1964: ETS 50, Protocol). The signatories to the convention, – 39 member states and the European Union (EU) as of March 2020 – are committed to the harmonisation of quality standards for safe medicines throughout the European continent and beyond. In addition to the member states there are currently 30 observers, including the World Health Organization (WHO) and the Taiwan Food and Drug Administration (TFDA). The EDQM's quality standards for medicines are published in the European Pharmacopoeia (officially abbreviated to Ph. Eur.), which is recognised as a scientific benchmark worldwide and is legally binding in member states."
    "EDQM contributes to the basic human right of access to good quality medicines and healthcare, and promotes and protects human and animal health by:\n- establishing and providing official standards for the manufacture and quality control of medicines in all the signatory states of the Convention on the Elaboration of a European Pharmacopoeia and beyond;\n- granting Certificates of suitability which verify the compliance of pharmaceutical substances with European Pharmacopoeia standards and carrying out inspections of manufacturers of these substances;\n- co-ordinating a network of Official Medicines Control Laboratories (OMCL) to collaborate and pool expertise and to effectively use limited resources with the aim of achieving effective public quality control of medicines in Europe and beyond;\n- proposing ethical, safety and quality standards for blood transfusions (collection, preparation, storage, distribution and appropriate use of blood components) and organ, tissue and cell transplantation;\n- working with national, European and international organisations in efforts to combat falsification of medical products and similar crimes;\n- providing policies and model approaches for the safe use of medicines, including guidelines on pharmaceutical care;\n- establishing standards for cosmetics and food contact materials and coordinating the public control of cosmetics."],
   :cmns-col/isPartOf :cmns-ge-euj/CouncilOfEurope,
   :db/ident
   :idmp-eurga/EuropeanDirectorateForTheQualityOfMedicinesAndHealthcare,
   :rdf/type [:cmns-org/OrganizationalSubUnit :owl/NamedIndividual],
   :rdfs/label
   "European Directorate for the Quality of Medicines and Healthcare",
   :skos/definition
   "organisational subunit of the Council of Europe that protects public health by enabling the development, supporting the implementation and monitoring the application of quality standards for safe medicines and their safe use which are recognised as a scientific benchmark and applied worldwide"})

(def EuropeanMedicinesAgency
  "instrumentality and decentralised agency of the European Union (EU) responsible for the scientific evaluation, supervision and safety monitoring of medicines"
  {:cmns-av/abbreviation "EMA",
   :cmns-av/explanatoryNote
   "The mission of the European Medicines Agency (EMA) is to foster scientific excellence in the evaluation and supervision of medicines, for the benefit of public and animal health in the European Union (EU).",
   :cmns-org/isInstrumentOf :cmns-ge-euj/GovernmentOfTheEuropeanUnion,
   :db/ident :idmp-eurga/EuropeanMedicinesAgency,
   :rdf/type [:cmns-ge/Instrumentality :owl/NamedIndividual],
   :rdfs/label "European Medicines Agency",
   :rdfs/seeAlso "https://www.ema.europa.eu/en",
   :skos/definition
   "instrumentality and decentralised agency of the European Union (EU) responsible for the scientific evaluation, supervision and safety monitoring of medicines"})

(def EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency
  "European Medicines Agency in its role as a regulator of medicinal products"
  {:cmns-pts/isPlayedBy :idmp-eurga/EuropeanMedicinesAgency,
   :cmns-rga/hasJurisdiction :cmns-ge-euj/EuropeanEconomicArea,
   :db/ident :idmp-eurga/EuropeanMedicinesAgencyAsMedicinesRegulatoryAgency,
   :rdf/type [:idmp-mprd/MedicinesRegulatoryAgency :owl/NamedIndividual],
   :rdfs/label "European Medicines Agency as medicines regulatory agency",
   :skos/definition
   "European Medicines Agency in its role as a regulator of medicinal products"})