CREATE TABLE chairs (
    chair_id UUID PRIMARY KEY,
    creators_id UUID NOT NULL,
    material_id UUID NOT NULL,
    upholstery VARCHAR(255),
    adjustable_height BOOLEAN NOT NULL,
    armrests BOOLEAN NOT NULL,
    seat_rotation BOOLEAN NOT NULL,
    maximum_weight_support VARCHAR(50),
    leg_style VARCHAR(50),
    seat_and_frame_color VARCHAR(50),
    purpose VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);